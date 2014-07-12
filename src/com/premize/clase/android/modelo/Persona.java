package com.premize.clase.android.modelo;

import java.io.Serializable;

public class Persona implements Serializable{
	
	private int id;
	
	private String nombre;
	
	

	public Persona() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return id+"-" + nombre; 
	}

}
