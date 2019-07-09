package listeners;

import java.util.ArrayList;
public class Publicizer {

	ArrayList<CoolEventListener> listeners;
	
	public Publicizer() {
		listeners = new ArrayList<CoolEventListener>();
	}
	
	public void addListener(CoolEventListener listener) {
		listeners.add(listener);
	}
	
	public void publicizeIfCool(int x, int y, String whatHappened) {
		if(whatHappened.contains("cool")) {
			CoolEvent e = new CoolEvent(x,y,whatHappened);
			for (CoolEventListener listener: listeners) {
				listener.react(e);
			}
		}
	}
}
