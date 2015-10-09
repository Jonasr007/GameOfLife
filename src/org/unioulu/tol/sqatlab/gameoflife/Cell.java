package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	private String state;
	int x;
	int y;
	public Cell(int x, int y) {
		this.x=x;
		this.y=y;
		state ="Alive"; // add later
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void nextIteration(int numberOfLiveCells) {
		if(state.equals("alive") && numberOfLiveCells<2) {
			state ="Dead";
		}
		else
			state ="Alive";
	}

	public String getState() {
		return state;
	}
	
	public String toString() {
		return "X= " +x + "Y= " + y + "state: " + state;
	}
	
	
	
}
