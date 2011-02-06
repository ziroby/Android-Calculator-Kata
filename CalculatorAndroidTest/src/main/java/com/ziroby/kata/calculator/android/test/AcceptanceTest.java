package com.ziroby.kata.calculator.android.test;

import com.ziroby.kata.calculator.android.CalculatorMainActivity;
import com.ziroby.kata.calculator.android.R;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

public class AcceptanceTest extends
		ActivityInstrumentationTestCase2<CalculatorMainActivity> {

	private Button button1;
	private TextView display;
	private CalculatorMainActivity activity;

	public AcceptanceTest() {
		super("com.ziroby.kata.calculator.android", CalculatorMainActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		activity = getActivity();
		
		display = (TextView) activity.findViewById(R.id.display);
		
		button1 = (Button) activity.findViewById(R.id.button1);
	}

	public void testWhenIPress1TheDisplayShows1() throws Exception {
		
		final Button button = button1;
		
		activity.runOnUiThread(new Runnable() {
			
			public void run() {
				button.performClick();

				CharSequence displayText = display.getText();
				
				assertEquals("1", displayText);
			}
		});
	}

}
