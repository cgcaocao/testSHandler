package com.example.testshandler;

import android.os.Handler;
import android.widget.Toast;

public class Common {
	
	public static Handler sHandler;
	
	public static void showMessage() {
		if(sHandler != null) {
			sHandler.post(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Toast.makeText(CApp.Instance.getApplicationContext(), "����Ϣ��", 1000).show();
				}
			});
		}
	}

}
