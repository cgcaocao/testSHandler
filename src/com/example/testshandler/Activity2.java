package com.example.testshandler;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
//		if(Common.sHandler == null) {
//        	Common.sHandler = new Handler();
//        }
		
		Button btn = (Button) findViewById(R.id.btn);
		
		findViewById(R.id.btn).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Common.showMessage();
			}
		});
	}

	
	
}
