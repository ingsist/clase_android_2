package com.premize.clase.android.dataaccess;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.premize.clase.android.modelo.Persona;

public class PersonaDao {
	
	private SQLiteDatabase database;
	private ClaseDataBaseHelper baseHelper;
	
	public PersonaDao(Context contexto){
		baseHelper=new ClaseDataBaseHelper(contexto);
	}
	
	public void open() throws SQLException {
	    database = baseHelper.getWritableDatabase();
	  }
	
	public void close() {
		baseHelper.close();
	  }
	
	public void crearPersona(String nombre) {
	    ContentValues values = new ContentValues();
	    values.put("id", "123");
	    values.put("nombre", nombre);
	    values.put("genero", "daniel");
	    database.insert(ClaseDataBaseHelper.TABLE_NAME, null, values);
	    
	  }
	
	 public List<Persona> getAllPersonas() {
		    List<Persona> comments = new ArrayList<Persona>();

		    Cursor cursor = database.query(ClaseDataBaseHelper.TABLE_NAME,
		        new String[]{"id","nombre"}, null, null, null, null, null);

		    cursor.moveToFirst();
		    while (!cursor.isAfterLast()) {
		      Persona comment = cursorAPersona(cursor);
		      comments.add(comment);
		      cursor.moveToNext();
		    }
		    // make sure to close the cursor
		    cursor.close();
		    return comments;
		  }
	 
	 private Persona cursorAPersona(Cursor cursor) {
		    Persona persona = new Persona();
		    persona.setId(cursor.getInt(0));
		    persona.setNombre(cursor.getString(1));
		    return persona;
		  }
	

}
