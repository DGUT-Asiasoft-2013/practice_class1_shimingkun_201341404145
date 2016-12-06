package com.example.smk;

import com.example.helloworld.inputcell.SimpleTextInputcCellFragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class LoginActivity extends Activity {
    SimpleTextInputcCellFragment fragmentAccount,fragmentpassword;
    
	protected void onCreate(Bundle saveInstanceState) {
		super.onCreate(saveInstanceState);
		setContentView(R.layout.activity_login);
		
		fragmentAccount = (SimpleTextInputcCellFragment)getFragmentManager().findFragmentById(R.id.input_account1);
		fragmentpassword = (SimpleTextInputcCellFragment)getFragmentManager().findFragmentById(R.id.input_password);
		
		findViewById(R.id.btn_register).setOnClickListener(new OnClickListener() {
			
	
			public void onClick(View v) {
				goRegister();
			}
		});
		
	}
	
	protected void onResume() {
		super.onResume();
		
		fragmentAccount.setLabelText("’Àªß√˚");
		fragmentpassword.setLabelText("√‹¬Î");
		
	}
	
	void goRegister(){
		Intent itnt = new Intent(this,RegisterActivity.class);
		startActivity(itnt);
	}
}
