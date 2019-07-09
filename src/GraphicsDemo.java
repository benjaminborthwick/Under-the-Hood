import java.awt.Color;

import breadboards.Breadboard;
import breadboards.GLabel;
import breadboards.GLine;
import breadboards.GOval;
import breadboards.GRect;
import breadboards.GSpaceship;
import java.util.Random;

public class GraphicsDemo extends Breadboard {

	GRect myRect;
	GOval myOval;
	GLine myLine;
	GLabel myLabel;
	GSpaceship mySpaceship;
	GSpaceship mySpaceship1;
	GSpaceship mySpaceship2;
	GSpaceship mySpaceship3;
	GSpaceship mySpaceship4;
	GSpaceship mySpaceship5;
	GSpaceship mySpaceship6;
	GSpaceship mySpaceship7;
	GSpaceship mySpaceship8;
	GSpaceship mySpaceship9;
	GSpaceship mySpaceship10;
	GSpaceship mySpaceship11;
	GSpaceship mySpaceship12;
	

	public static void main(String[] args) {

		GraphicsDemo bb = new GraphicsDemo();
	}

	public void onButton1Click() {

		myRect = new GRect(10, 10, 50, 100); // x, y, w, h
		myRect.setColor(Color.GREEN);
		this.add(myRect);

		myOval = new GOval(75, 25, 50, 50);
		myOval.setFilled(true);
		myOval.setFillColor(Color.CYAN);
		this.add(myOval);

		mySpaceship = new GSpaceship(200, 200);
		this.add(mySpaceship);
		mySpaceship1 = new GSpaceship(200, 200);
		this.add(mySpaceship1);
		mySpaceship2 = new GSpaceship(200, 200);
		this.add(mySpaceship2);
		mySpaceship3 = new GSpaceship(200, 200);
		this.add(mySpaceship3);
		mySpaceship4 = new GSpaceship(200, 200);
		this.add(mySpaceship4);
		mySpaceship5 = new GSpaceship(200, 200);
		this.add(mySpaceship5);
		mySpaceship6 = new GSpaceship(200, 200);
		this.add(mySpaceship6);
		mySpaceship7 = new GSpaceship(200, 200);
		this.add(mySpaceship7);
		mySpaceship8 = new GSpaceship(200, 200);
		this.add(mySpaceship8);
		mySpaceship9 = new GSpaceship(200, 200);
		this.add(mySpaceship9);
		mySpaceship10 = new GSpaceship(200, 200);
		this.add(mySpaceship10);
		mySpaceship11 = new GSpaceship(200, 200);
		this.add(mySpaceship11);
		mySpaceship12 = new GSpaceship(200, 200);
		this.add(mySpaceship12);
		
		
		this.getTimer().setDelay(30);
		this.getTimer().start();
	}
	
	public void onButton2Click() {
		this.getTimer().stop();
	}

	public void onTimerTick() {
		Random numGen = new Random();
		int dx = numGen.nextInt(120)-60;
		int dy = numGen.nextInt(120)-60;
		int dx1 = numGen.nextInt(120)-60;
		int dy1 = numGen.nextInt(120)-60;
		int dx2 = numGen.nextInt(120)-60;
		int dy2 = numGen.nextInt(120)-60;
		int dx3 = numGen.nextInt(120)-60;
		int dy3 = numGen.nextInt(120)-60;
		int dx4 = numGen.nextInt(120)-60;
		int dy4 = numGen.nextInt(120)-60;
		int dx5 = numGen.nextInt(120)-60;
		int dy5 = numGen.nextInt(120)-60;
		int dx6 = numGen.nextInt(120)-60;
		int dy6 = numGen.nextInt(120)-60;
		int dx7 = numGen.nextInt(100)-50;
		int dy7 = numGen.nextInt(100)-50;
		int dx8 = numGen.nextInt(100)-50;
		int dy8 = numGen.nextInt(100)-50;
		int dx9 = numGen.nextInt(100)-50;
		int dy9 = numGen.nextInt(100)-50;
		int dx10 = numGen.nextInt(100)-50;
		int dy10 = numGen.nextInt(100)-50;
		int dx11 = numGen.nextInt(100)-50;
		int dy11 = numGen.nextInt(100)-50;
		int dx12 = numGen.nextInt(100)-50;
		int dy12 = numGen.nextInt(100)-50;
		
		this.mySpaceship.move(dx, dy);
		this.mySpaceship1.move(dx1, dy1);
		this.mySpaceship2.move(dx2, dy2);
		this.mySpaceship3.move(dx3, dy3);
		this.mySpaceship4.move(dx4, dy4);
		this.mySpaceship5.move(dx5, dy5);
		this.mySpaceship6.move(dx6, dy6);
		this.mySpaceship7.move(dx7, dy7);
		this.mySpaceship8.move(dx8, dy8);
		this.mySpaceship9.move(dx9, dy9);
		this.mySpaceship10.move(dx10, dy10);
		this.mySpaceship11.move(dx11, dy11);
		this.mySpaceship12.move(dx12, dy12);
	}
}
