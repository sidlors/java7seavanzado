package com.mitocode.tema4;

public class Clase<K> {

	private K objeto;
	
	public Clase (K objeto){
		this.objeto = objeto;
	}
	
	public void mostrarTipo(){
		System.out.println("K es un: " + objeto.getClass().getName());
	}
	
}
