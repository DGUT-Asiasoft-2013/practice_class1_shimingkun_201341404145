package com.example.helloworld.inputcell;

import com.example.smk.R;

import android.R.string;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleTextInputcCellFragment extends Fragment {

	TextView label;
	EditText edit;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInst) {

		View view = inflater.inflate(R.layout.fragment_inputcell_simpletext, container);
		label = (TextView) view.findViewById(R.id.label);
		edit = (EditText) view.findViewById(R.id.edit);
		return view;
	}

	public void setLabelText(String labelText) {
		label.setText(labelText);
	}

	public void setHintText(String hintText) {
		edit.setHint(hintText);

	}

	public void setIsPassword(boolean isPassWord) {

		if (isPassWord) {
			edit.setInputType(EditorInfo.TYPE_CLASS_TEXT | EditorInfo.TYPE_TEXT_VARIATION_PASSWORD);

		} else {
			edit.setRawInputType(EditorInfo.TYPE_CLASS_TEXT);
		}
	}
}
