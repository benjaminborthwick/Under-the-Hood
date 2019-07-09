package keycontrolled;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import breadboards.GCompound;

public class KeyControlledGCompound extends GCompound {
	public static final int UP = 1;
	public static final int RIGHT = 2;
	public static final int DOWN = 3;
	public static final int LEFT = 4;
	public static final int STOPPED = 5;
	
	private int direction;
	private KeyListener keyListener;
	private Timer timer;
	private int delay = 10;
	private int step = 1;
	private Rectangle bounds;
	
	public KeyControlledGCompound(Rectangle bounds) {
		this.bounds = bounds;
	
		keyListener = new KeyListener() {
			public void keyPressed(KeyEvent e) {
				direction = e.getKeyCode();
				KeyControlledGCompound.this.timer.start();
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}};
			
			timer  = new Timer(delay, new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					switch(direction) {
					case LEFT:
						KeyControlledGCompound.this.move(-step,0);
						//if(!inBounds()) {}
						break;
					case RIGHT:
						KeyControlledGCompound.this.move(step, 0);
						break;
					case UP:
						KeyControlledGCompound.this.move(0, -step);
						break;
					case DOWN:
						KeyControlledGCompound.this.move(0, step);
					}
				}});
	}
}
