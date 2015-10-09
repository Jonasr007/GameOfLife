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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public void nextIteration(int numberOfLiveCells) {
		if(state.equals("Alive") && numberOfLiveCells<2) {
			state ="Dead";
		}
		else
			state ="Alive";
	}

	public String getState() {
		return state;
	}
	
	public String toString() {
		return "X= " +x + "  Y= " + y + "  state: " + state;
	}
	
	
	
	
}
