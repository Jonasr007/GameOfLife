package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void test() {
		// arange
		Cell cell = new Cell("Alive");
		
		cell.nextIteration();
		
		// assert
		assertequals("Dead", cell.getState());
		
		//fail("Not yet implemented");
	}

}
