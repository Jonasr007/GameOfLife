package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void TestLiveCellWithNeighboursShouldLive() {
		// arange
		Cell cell = new Cell(1,1);
		
		cell.nextIteration(2);
		
		// assert
		assertEquals("Alive", cell.getState());
		
		//fail("Not yet implemented");
	}

}
