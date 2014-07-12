package com.premize.clase.android;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActividadPrincipal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

       
    }


   public void registrarPersona(View view){
	  Intent intent=new Intent(this.getApplicationContext(), IngresarPersona.class);
	  startActivity(intent);
   }
   
   public void verRegistros(View view){
	
	   Intent intent=new Intent(this.getApplicationContext(), VerResultados.class);
	
		startActivity(intent);
	   
	  
   }

  

}
