package com.example.smk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class BootActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_boot);
			
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		
		Handler handler = new Handler();
		handler.postDelayed(new Runnable(){
			private int abcd= 0;

			
			public void run(){
				startLoginActivity();			
			}
		}, 1000);
		
	}
	
	void startLoginActivity(){
		Intent itnt= new Intent(this , LoginActivity.class);
		startActivity(itnt);
		finish();
		
	}
}
