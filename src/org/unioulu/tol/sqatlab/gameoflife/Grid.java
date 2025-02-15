package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {
	private Set<Cell> cells = new HashSet<>(); 
	int aliveCounter;
	int deadCounter;
	
	public Grid() {
		aliveCounter=0;
		deadCounter=0;
	}
	
	public int getNeighbours(Cell cell) {
		int numNeighbours=0;
		Set<Cell> neighbourhood = new HashSet<Cell>();

		for (int dx=-1; dx<=1; dx++) {
			for (int dy=-1; dy<=1; dy++) {
	
				Cell neighbour = new Cell(cell.x+dx, cell.y+dy);
			//	System.out.println(neighbour);
			//	System.out.println(cells.toString());

				if(cells.contains(neighbour)) {
					numNeighbours++;
				}
			}
		}
		return numNeighbours-1;
	}

	public void addCell(Cell cell) {
		int r = (int)(Math.random()*2);
		if(r==0) {
			cell.setState("Alive");
			aliveCounter++;
		}
		else {
			cell.setState("Dead");
			deadCounter++;			
		}		
		cells.add(cell);

		int dif = deadCounter-aliveCounter;
		if(dif>5)
			cell.setState("Alive");
		if(dif<-5)
			cell.setState("Dead");			
	}
}