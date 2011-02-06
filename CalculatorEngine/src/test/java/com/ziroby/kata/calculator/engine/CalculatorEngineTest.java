package com.ziroby.kata.calculator.engine;

import junit.framework.TestCase;

public class CalculatorEngineTest extends TestCase {

	public void testWhenIPress1TheDisplayShows1() throws Exception {
		CalculatorEngine engine = new CalculatorEngine();
		
		engine.buttonPressed("1");
		
		assertEquals("1", engine.getDisplay());
	}
	
	public void testDisplayIsEmptyBeforeIPressAnyButtons() throws Exception {
		CalculatorEngine engine = new CalculatorEngine();

		assertEquals("", engine.getDisplay());		
	}
	public void testWhenIPress2TheDisplayShows2() throws Exception {
		CalculatorEngine engine = new CalculatorEngine();
		
		engine.buttonPressed("2");
		
		assertEquals("2", engine.getDisplay());
	}
}
