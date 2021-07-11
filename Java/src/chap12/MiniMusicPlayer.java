package chap12;
import javax.sound.midi.*;

// this one plays random music with it, but only because there is a listener.

public class MiniMusicPlayer implements ControllerEventListener{

	public static void main(String[] args) {
		MiniMusicPlayer mini = new MiniMusicPlayer();
        mini.go();
	}

	private void go() {
		try {

			// make (and open) a sequencer, make a sequence and track

			Sequencer sequencer = MidiSystem.getSequencer();         
			sequencer.open();

			int[] eventsIWant = {127};
			sequencer.addControllerEventListener(this, eventsIWant);
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();     

			// now make two midi events (containing a midi message)

			for (int i = 5; i < 61; i+= 4) {

				track.add(makeEvent(144,1,i,100,i));
				
				track.add(makeEvent(176,1,127,0,i));
				
				track.add(makeEvent(128,1,i,100,i + 2));
			} // end loop

			// add the events to the track            
			// add the sequence to the sequencer, set timing, and start

			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex) {ex.printStackTrace();}
	}

	private static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		}catch(Exception e) { }
		return event;
	}

	@Override
	public void controlChange(ShortMessage event) {
		System.out.println("la");
	}

} // close class