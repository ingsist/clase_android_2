package com.premize.clase.android.dataaccess;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ClaseDataBaseHelper extends SQLiteOpenHelper{
	
	public static final String DATABASE_NAME="persona.db";
	public static final String TABLE_NAME="personas";
	
	public static final String DATABASE_CREATE = "create table "
		      + TABLE_NAME + "(id" 
		      + " integer primary key autoincrement, nombre"
		      + " text not null);";
	
	public ClaseDataBaseHelper(Context contexto){
		super(contexto,DATABASE_NAME ,null,1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DATABASE_CREATE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		  db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
		  onCreate(db);
		
	}

}
