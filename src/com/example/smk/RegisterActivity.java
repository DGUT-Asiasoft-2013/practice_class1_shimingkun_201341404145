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
		
		fragInputCellAccount.setLabelText("�˻���");
		fragInputCellAccount.setHintText("�������û���");
		fragInputCellPassword.setLabelText("����");
		fragInputCellPassword.setHintText("����������");
		fragInputCellPassword.setIsPassword(true);
		fragInputCellPasswordRepeat.setLabelText("�ظ�����");
		fragInputCellPasswordRepeat.setHintText("���ظ���������");
		fragInputCellPasswordRepeat.setIsPassword(true);
		
	}

}
