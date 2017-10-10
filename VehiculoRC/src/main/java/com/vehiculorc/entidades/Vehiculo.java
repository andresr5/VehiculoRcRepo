package com.vehiculorc.entidades;

public class Vehiculo {
	
	
	private static Vehiculo vehiculo = null;
	
	private int coordenadaX;
	private int coordenadaY;
	
	
	private  synchronized static void crearVehiculo(int i) {
		if(vehiculo == null) {
			vehiculo = new Vehiculo((i==0)?0:i-1);
		}
	}
	
	public static Vehiculo crearInstancia(int i){
		if(vehiculo == null)
			crearVehiculo(i);
		return vehiculo;
	}
	
	
	private Vehiculo(int maximaPosY) {
		coordenadaY = maximaPosY;
		coordenadaX = 0;
	}


	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

}
