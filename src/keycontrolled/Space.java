package keycontrolled;

import breadboards.Breadboard;

public class Space extends Breadboard{
	
	boolean isRandomMovement = true;

	public static void main(String[] args) {
		Space space = new Space();
		
	}
	
	
	
	public void onButton1Click() {
		this.getTimer().setDelay(1);
		this.getTimer().start();
		if(!isRandomMovement) {
			PacMan pacMan = new PacMan(isRandomMovement);
			pacMan.setLocation(200, 200);
			this.add(pacMan);
		}
	}
	
	public void onButton2Click() {
		this.getTimer().stop();
	}
	
	public void onTimerTick() {
		if(isRandomMovement) {
			PacMan pacMan = new PacMan(isRandomMovement);
			pacMan.setLocation(200, 200);
			this.add(pacMan);
			PacMan pacMan1 = new PacMan(isRandomMovement);
			pacMan1.setLocation(1200, 200);
			this.add(pacMan1);
			PacMan pacMan2 = new PacMan(isRandomMovement);
			pacMan2.setLocation(200, 600);
			this.add(pacMan2);
			PacMan pacMan3 = new PacMan(isRandomMovement);
			pacMan3.setLocation(1200, 600);
			this.add(pacMan3);
			PacMan pacMan4 = new PacMan(isRandomMovement);
			pacMan4.setLocation(700, 400);
			this.add(pacMan4);
			PacMan pacMan5 = new PacMan(isRandomMovement);
			pacMan5.setLocation(200, 200);
			this.add(pacMan5);
			PacMan pacMan6 = new PacMan(isRandomMovement);
			pacMan6.setLocation(200, 200);
			this.add(pacMan6);
			
		}
	}

}
