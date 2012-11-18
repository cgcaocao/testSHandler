package com.example.testshandler;

import android.app.Application;
import android.os.Handler;

public class CApp extends Application {
	
	public static CApp Instance;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Instance = this;
      if(Common.sHandler == null) {
    	Common.sHandler = new Handler();
    }
	}
	
	
	
}
