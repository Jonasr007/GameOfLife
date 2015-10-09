package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	private String state;
	int x;
	int y;
	public Cell(int x, int y) {
		this.x=x;
		this.y=y;
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
	
	
	
	
}
