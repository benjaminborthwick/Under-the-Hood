package listeners;

public class ConfusedListener implements CoolEventListener {

	public void react(CoolEvent e) {
		System.out.println("You said " + e.whatHappened() + "...\nI better wear my jacket");
		
	}
}
