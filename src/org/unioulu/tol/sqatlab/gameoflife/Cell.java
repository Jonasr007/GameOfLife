package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	private String state;
	public Cell(String state) {
		this.state=state;
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
