package keycontrolled;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Timer;

import breadboards.GCompound;
import breadboards.GLine;
import breadboards.GOval;

public class PacMan extends GCompound {

	GOval body;
	GOval eye;
	GLine mouth;

	public static final int UP = 1;
	public static final int RIGHT = 2;
	public static final int DOWN = 3;
	public static final int LEFT = 4;
	public static final int STOPPED = 5;

	KeyControlledGCompound PacMan;

	KeyListener keyListener;

	Timer timer;

	private int direction;
	private int step = 1;
	private int delay = 10;

	Boolean isRandomMovement;

	public PacMan(Boolean isRandomMovement) {
		Random random = new Random();
		int size = random.nextInt(80);
		body = new GOval(-size/2, -size/2, size, size);
		mouth = new GLine(0, 0, size/2, 0);
		eye = new GOval(size/8, -size/5, 3*size/40, 3*size/40);
		eye.setFilled(true);
		eye.setFillColor(Color.BLACK);
		body.setFilled(true);
		Color pacmanColor = Color.YELLOW;
		switch(random.nextInt(8)) {
		case 0:
			pacmanColor = Color.YELLOW;
			break;
		case 1:
			pacmanColor = Color.BLUE;
			break;
		case 2:
			pacmanColor = Color.CYAN;
			break;
		case 3:
			pacmanColor = Color.GREEN;
			break;
		case 4:
			pacmanColor = Color.MAGENTA;
			break;
		case 5:
			pacmanColor = Color.ORANGE;
			break;
		case 6:
			pacmanColor = Color.PINK;
			break;
		case 7:
			pacmanColor = Color.RED;
		}
		body.setFillColor(pacmanColor);

		this.add(body);
		this.add(eye);
		this.add(mouth);

		this.isRandomMovement = isRandomMovement;

		//if (isRandomMovement) {
			timer = new Timer(30, new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					Random numGen = new Random();
					int dx = numGen.nextInt(120) - 60;
					int dy = numGen.nextInt(120) - 60;
					PacMan.this.move(dx, dy);
				}
			});
		//}
//		if (!isRandomMovement) {
//		keyListener = new KeyListener() {
//
//			public void keyPressed(KeyEvent e) {
//				direction = e.getKeyCode();
//				System.out.println(direction);
//				timer.start();
//			}
//
//			public void keyReleased(KeyEvent e) {
//			}
//
//			public void keyTyped(KeyEvent e) {}
//		};
//		}
//
//		timer = new Timer(delay, new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				switch (direction) {
//				case LEFT:
//					PacMan.this.move(-step, 0);
//					// if(!inBounds()) {}
//					break;
//				case RIGHT:
//					PacMan.this.move(step, 0);
//					break;
//				case UP:
//					PacMan.this.move(0, -step);
//					break;
//				case DOWN:
//					PacMan.this.move(0, step);
//				}
//			}
//		});
		// }
		timer.start();
	}
}
