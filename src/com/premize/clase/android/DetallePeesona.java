package com.premize.clase.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.premize.clase.android.modelo.Persona;

public class DetallePeesona extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalle_peesona);
		Intent intento=getIntent();
		Object persona=intento.getSerializableExtra("personaSeleccionada");
		if(persona!=null){
			TextView text=(TextView)findViewById(R.id.lbl_out_persona);
			text.setText(((Persona)persona).getNombre());
		}else{
			Toast.makeText(this.getApplicationContext(), "No llego nada....", Toast.LENGTH_LONG).show();
			finish();
		}
	}

	

}
