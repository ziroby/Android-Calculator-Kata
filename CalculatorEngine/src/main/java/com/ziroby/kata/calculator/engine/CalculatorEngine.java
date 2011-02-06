package com.ziroby.kata.calculator.engine;

public class CalculatorEngine {

	private String display = "";

	public void buttonPressed(String button) {
		display = button;
	}

	public String getDisplay() {
		return display;
	}
}
