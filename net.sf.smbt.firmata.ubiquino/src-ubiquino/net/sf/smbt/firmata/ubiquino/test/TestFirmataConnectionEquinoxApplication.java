package net.sf.smbt.firmata.ubiquino.test;

import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.core.IFirmataInitDoneListener;
import net.sf.smbt.firmata.ubiquino.core.UbiquinoUtils;
import net.sf.smbt.i2c.thingm.firmata.utils.ThingM4FirmataCmdUtils;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE;
import net.sf.smbt.protocol.ezfirmata.FirmataSysexMessage;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.engine.utils.ITTLJob;
import net.sf.xqz.engine.utils.TTL;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class TestFirmataConnectionEquinoxApplication implements IApplication {
	private CmdPipe arduinoPipe;
	@Override
	public Object start(IApplicationContext context) throws Exception {
		Ubiquino ubiquino = UbiquinoUtils.INSTANCE.createArduinoBoard(ARDUINO_BOARD_UID.UNO_ATMEGA328, ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23);
		arduinoPipe = QuanticMojo.INSTANCE.openUsbPipe("firmata", "/dev/tty.usbmodem411", 57600);
		if (arduinoPipe != null) {
			UbiquinoUtils.INSTANCE.initFirmata(
				ubiquino, 
				arduinoPipe, 
				new IFirmataInitDoneListener() {
				@Override
					public void handleInitFirmataDone(Ubiquino ubiquino, final CmdPipe pipe) {
						System.out.println("Arduino Firmata connection established !");
						new Job("later") {
							@Override
							protected IStatus run(IProgressMonitor monitor) {
								for (int i=0;i<10;i++) {
									Cmd cmd = ThingM4FirmataCmdUtils.INSTANCE.createThingM4FimataFadeToRGBCmd("0x00", 255, 0, 0);
									if (cmd instanceof FirmataSysexMessage){
										System.out.println(CmdUtil.INSTANCE.getFrameHexInfo(((FirmataSysexMessage)cmd).getMessage()));
										pipe.send(cmd);
										try {
											Thread.sleep(100);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}	
									}
								}
								return Status.OK_STATUS;
							}
						}.schedule(5200);	
					}
				}
			);
		}
		
		ITTLJob ttl = TTL.INSTANCE.createTTLJob(
			3 * 60 * 60 * 1000 // 3 minutes
		);
			
		ttl.schedule();
		
		while(ttl.isRunning());
			
		return new Object();
	}

	@Override
	public void stop() {
		QuanticMojo.INSTANCE.closePipe(true, arduinoPipe);
	}
}
