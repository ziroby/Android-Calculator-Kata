package com.ziroby.kata.calculator.android;

import com.ziroby.kata.calculator.engine.CalculatorEngine;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorMainActivity extends Activity {
    private CalculatorEngine calculatorEngine = 
    	new CalculatorEngine();

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final TextView display = (TextView) 
        	findViewById(R.id.display);
        
        Button button1 = (Button) 
        	findViewById(R.id.button1);
        
        button1.setOnClickListener(
        		new OnClickListener() {
			
			public void onClick(View v) {
				calculatorEngine.buttonPressed("1");
				
				display.setText(
						calculatorEngine.getDisplay());
			}
		});
    }
}
