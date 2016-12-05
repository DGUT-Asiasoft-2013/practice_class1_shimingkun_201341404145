package com.example.smk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class LoginActivity extends Activity {

	protected void onCreate(Bundle saveInstanceState) {
		super.onCreate(saveInstanceState);
		setContentView(R.layout.activity_login);
		
		findViewById(R.id.btn_register).setOnClickListener(new OnClickListener() {
			
	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				goRegister();
			}
		});
		
	}
	
	void goRegister(){
		Intent itnt = new Intent(this,RegisterActivity.class);
		startActivity(itnt);
	}
}
