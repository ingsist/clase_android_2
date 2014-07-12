package com.premize.clase.android;

import java.lang.reflect.Method;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TimePicker;

import com.premize.clase.android.dataaccess.PersonaDao;

public class IngresarPersona extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ingresar_persona);
		DatePicker date=(DatePicker) findViewById(R.id.datePicker1);
		
		int currentapiVersion = android.os.Build.VERSION.SDK_INT;
		if (currentapiVersion >= 11) {
		  try {
		    Method m = date.getClass().getMethod("setCalendarViewShown", boolean.class);
		    m.invoke(date, false);
		  }
		  catch (Exception e) {} 
		}
		
		
	}
	
	public void guardar(View view){
		
		Spinner spinner=(Spinner)findViewById(R.id.spinner1);
		spinner.getSelectedItem();
		
		DatePicker date=(DatePicker)findViewById(R.id.datePicker1);
		date.getYear();
		

		
	}
	
	

	

}
