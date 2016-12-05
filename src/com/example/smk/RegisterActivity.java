package com.example.smk;

import com.example.helloworld.inputcell.SimpleTextInputcCellFragment;

import android.app.Activity;
import android.os.Bundle;

public class RegisterActivity extends Activity {
	SimpleTextInputcCellFragment fragInputCellAccount;
	SimpleTextInputcCellFragment fragInputCellPassword;
	SimpleTextInputcCellFragment fragInputCellPasswordRepeat;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_register);
		
		fragInputCellAccount = (SimpleTextInputcCellFragment) getFragmentManager().findFragmentById(R.id.input_account);
		fragInputCellPassword= (SimpleTextInputcCellFragment) getFragmentManager().findFragmentById(R.id.input_password);
		fragInputCellPasswordRepeat =  (SimpleTextInputcCellFragment) getFragmentManager().findFragmentById(R.id.input_passoword_repeate);
		
	}
	
	protected void onResume(){
		super.onResume();
		
		fragInputCellAccount.setLabelText("账户名");
		fragInputCellAccount.setHintText("请输入用户名");
		fragInputCellPassword.setLabelText("密码");
		fragInputCellPassword.setHintText("请输入密码");
		fragInputCellPassword.setIsPassword(true);
		fragInputCellPasswordRepeat.setLabelText("重复密码");
		fragInputCellPasswordRepeat.setHintText("请重复输入密码");
		fragInputCellPasswordRepeat.setIsPassword(true);
		
	}

}
