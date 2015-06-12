package net.sf.smbt.firmata.ubiquino.test;

import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.core.IFirmataInitDoneListener;
import net.sf.smbt.firmata.ubiquino.core.UbiquinoUtils;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.engine.utils.ITTLJob;
import net.sf.xqz.engine.utils.TTL;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class TestFirmataConnectionEquinoxApplication implements IApplication {
	CmdPipe arduinoPipe;
	@Override
	public Object start(IApplicationContext context) throws Exception {
		
		Ubiquino ubiquino = UbiquinoUtils.INSTANCE.createArduinoBoard(ARDUINO_BOARD_UID.UNO_ATMEGA328, ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23);
		arduinoPipe = QuanticMojo.INSTANCE.openUsbPipe("firmata", "/dev/tty.usbmodem621", 57600);
		if (arduinoPipe != null) {
			//CmdPipe pipe = XCPAddressUtils.INSTANCE.getCmdPipe(addr, true);
			UbiquinoUtils.INSTANCE.initFirmata(
				ubiquino, 
				arduinoPipe, 
				new IFirmataInitDoneListener() {
				@Override
					public void handleInitFirmataDone(Ubiquino ubiquino, CmdPipe arduinoPipe) {
						System.out.println("Arduino Firmata connection established !");
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
