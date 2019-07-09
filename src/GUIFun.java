import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.Timer;

import breadboards.Breadboard;

public class GUIFun extends Breadboard {

	static int keyCode;
	
	JButton button1;
	JButton button2;
	JButton button3;
	public static void main(String[] args) {
		System.out.println("start");
		new GUIFun();
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

	public GUIFun() {
		this.getPanel(this.NORTH).remove(this.getTextArea());
		this.getPanel(this.SOUTH).remove(this.getTextField());
		this.getPanel(this.SOUTH).remove(this.getButton1());
		this.getPanel(this.SOUTH).remove(this.getButton2());
		this.getPanel(this.SOUTH).remove(this.getLabel());
	}

	public void init() {
		
		this.setSize(500, 500);
		this.button1 = new JButton("btn 1");
		Button1ActionListener button1ActionListener = new Button1ActionListener();
		this.button1.addActionListener(button1ActionListener);
		this.getPanel(SOUTH).add(button1);
		
		this.button2 = new JButton("btn 2");
		Button2ActionListener button2ActionListener = new Button2ActionListener();
		this.button2.addActionListener(button2ActionListener);
		this.getPanel(SOUTH).add(button2);
		
		this.button3 = new JButton("btn 3");
		this.button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 3 was pressed");
				GUIFun.this.getPanel(SOUTH).setBackground(Color.RED);
			}});
		this.getPanel(SOUTH).add(button3);
	}
	
	public class Button2ActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			button2.setText("ouch");
			System.out.println("Button 2 was pressed");
		}
		
	}

}
