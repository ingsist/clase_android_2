package com.premize.clase.android;

import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.premize.clase.android.dataaccess.PersonaDao;
import com.premize.clase.android.modelo.Persona;

public class VerResultados extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ver_resultados);
		
		 PersonaDao persona=new PersonaDao(this.getApplicationContext());
		 persona.open();
			final List<Persona> listaPersonas= persona.getAllPersonas();
			if(listaPersonas==null || listaPersonas.isEmpty()){
				Toast.makeText(this.getApplicationContext(), "La lista no tuvo resultados", Toast.LENGTH_LONG).show();
				finish();
			}else{
				
				try{
				 ListView lista=(ListView) findViewById(R.id.resultados);
				 ArrayAdapter<Persona> adapter=new ArrayAdapter<Persona>(this.getApplicationContext(), R.layout.list_black_test,R.id.list_content,listaPersonas);
				 lista.setAdapter(adapter);
				 
				 lista.setOnItemClickListener(new OnItemClickListener()
				 {
				     @Override 
				     public void onItemClick(AdapterView<?> arg0, View arg1,int position, long arg3)
				     { 
				    	 
				    	 Persona seleccionada=listaPersonas.get(position);
				    	 
				    	 Intent intento=new Intent(VerResultados.this.getApplicationContext(),DetallePeesona.class);
				    	 intento.putExtra("personaSeleccionada", seleccionada);
				    	
				         startActivity(intento);
				     }
				 });
				 
				}catch(Exception e){
					Toast.makeText(this.getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
				}
			}

		
	}

	

}
