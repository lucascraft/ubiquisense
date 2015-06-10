package example.humatic.de;

import de.humatic.nmj.NMJConfig;
import de.humatic.nmj.NMJSystemListener;
import de.humatic.nmj.NetworkMidiInput;
import de.humatic.nmj.NetworkMidiListener;
import de.humatic.nmj.NetworkMidiOutput;
import de.humatic.nmj.NetworkMidiSystem;
import de.humatic.nmj.NetworkMidiClient;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

/**
 * Basic nmj sample application for Android.
 * This shows how to initialize the system, create input
 * and output ports, read and write MIDI etc.
 * Please refer to the main readMe file to learn about general concepts behind nmj.
 *
 * You will need to make sure that the nmj.jar file is accessible. In Eclipse see Project / Properties / Java Build Path / Libraries.
 */

public class nmjSample extends Activity implements NetworkMidiListener, NMJSystemListener {

	private NetworkMidiInput midiIn;
	private NetworkMidiOutput midiOut;

	private byte[] myNote = new byte[]{(byte)0x90, (byte)0x24, 0};

	private MidiLogger midiLogger;

	private NetworkMidiSystem nmjs;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try{

        	nmjs = NetworkMidiSystem.get(this);

        } catch (Exception e) {

        	/**
        	 * This would happen if no network permissions were given.
        	 * See AndroidManifest.xml
        	 **/

        	e.printStackTrace();

        	return;

        }

        NMJConfig.addSystemListener(this);

        /** can't use "this" in the below event handler **/
        final NetworkMidiClient nmc = (NetworkMidiClient)this;

        setContentView(R.layout.main);

        final Button button = (Button) findViewById(R.id.Button01);

        final NetworkMidiListener ml = this;

        Spinner spinner = (Spinner) findViewById(example.humatic.de.R.id.Spinner01);
	    String[] channelArray = new String[NMJConfig.getNumChannels()];
	    for (int i = 0; i < NMJConfig.getNumChannels(); i++) channelArray[i] = NMJConfig.getName(i);
	    ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, channelArray);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    spinner.setAdapter(adapter);
	    spinner.setOnItemSelectedListener(
		    new OnItemSelectedListener() {
		        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		        	try{ midiIn.close(nmc); } catch (NullPointerException ne){}
		        	try{ midiOut.close(nmc); } catch (NullPointerException ne){}
		        	try{
		        		midiIn = nmjs.openInput(position, nmc);
		        		midiIn.addMidiListener(ml);
		        	} catch (Exception e){}
		        	button.setEnabled(true);
			        try{
		        		midiOut = nmjs.openOutput(position, nmc);
		        	} catch (Exception e){
		        		e.printStackTrace();
		        		button.setEnabled(false);}
		        }

		        public void onNothingSelected(AdapterView<?> parent) {}
		    });

	    button.setOnTouchListener(new View.OnTouchListener() {
           public boolean onTouch(View v, MotionEvent me) {
            	try{
               		if (me.getAction() == MotionEvent.ACTION_DOWN) {
               			myNote[2] = (byte)100;
                		midiOut.sendMidi(myNote);
                    } else if (me.getAction() == MotionEvent.ACTION_UP) {
                    	myNote[2] = 0;
                		midiOut.sendMidi(myNote);
                    }
                } catch (Exception ex){}
            	return true;
           	}
         });


	    final TextView tv = (TextView) findViewById(R.id.TextView01);

        midiLogger = new MidiLogger(tv);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu, menu);
    	return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    		case R.id.item01:
    			/** Starts nmj's control panel. Do not expect it to return anything.
    			 * NMJConfig will reflect the changes made.
    			 */
    			final Intent si = new Intent((Context)this, de.humatic.nmj.NMJConfigDialog.class);
    			startActivity(si);
    			return true;
    		default:
    			return super.onOptionsItemSelected(item);
		}
    }



	@Override
	public void midiReceived(int channel, int ssrc, byte[] data, long timestamp) {

		/**
		 * As MIDI does not arrive on the GUI thread, it needs to be offloaded in
		 * order to be displayed. Android's Handler class is one way to do this.
		 */
		Message msg = Message.obtain();
    	Bundle b = new Bundle();
    	b.putByteArray("MIDI", data);
    	b.putInt("CH", channel);
    	msg.setData(b);

    	midiLogger.sendMessage(msg);

	}

	private class MidiLogger extends android.os.Handler {

    	private StringBuffer sb = new StringBuffer();
    	private TextView tv;

    	private MidiLogger(TextView tv) {
    		super();
    		this.tv = tv;
    	}

    	public void handleMessage(android.os.Message msg) {

    		Bundle b = msg.getData();
    		sb.setLength(0);
    		byte[] data = b.getByteArray("MIDI");
    		sb.append("MIDI received: ");
    		for (int i = 0; i < data.length; i++) sb.append((data[i] & 0xFF)+" ");
    		sb.append("\n");
    		tv.setText(sb.toString());

    	}
    }

	@Override
	public void systemChanged(int channel, int property, int value) {

		System.out.println(" System changed "+channel+" "+property+" "+value);

		if (property == NMJConfig.RTPA_EVENT && value == NMJConfig.RTPA_CH_DISCOVERED) {
			/**
			 * Given multicast works then DNS might uncover more
			 * channels and call this for notification. Time to update the spinner.
			 */
		}

	}

	@Override
	public void systemError(int channel, int err, String description) {
		// TODO Auto-generated method stub

	}
}