package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	@Test
	public void test() {
		Grid grid = new Grid();
		Cell cell = new Cell(1,1);
			
		int numNeighbours=grid.getNeighbours(cell);
		
		assertEquals(0, numNeighbours);
		
		//fail("Not yet implemented");
	}

}
