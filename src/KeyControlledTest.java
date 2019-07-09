import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

public class KeyControlledTest {

	static int keyCode;
	public static void main(String[] args) {
		System.out.println("start");
		// TODO Auto-generated method stub
		KeyListener keyListener;
		keyListener = new KeyListener() {
			public void keyPressed(KeyEvent e) {
				keyCode = e.getKeyCode();
				System.out.println(e.getKeyCode() + " pressed");
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
			
		};
		Timer timer = new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(keyCode + " pressed");
			}});
	}

}
