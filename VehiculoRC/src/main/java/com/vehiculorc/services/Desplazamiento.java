package com.vehiculorc.services;

public interface Desplazamiento {
	
	/**
     * OfreceElServicio para mover la posicion actual del automovil segun
	 * el desplazamiento recibido como parametro
	 * @param i posicion en el eje y en la que se encuentra el automovil.
	 * @param j posicion en el eje y en la que se encuentra el automovil.
     * @param desplazamiento El desplazamiento que se va a realizar.
     * @return String La posicion final despues del desplazamiento.
	 **/
	public String ejecutar(int i, int j, int desplazamiento);
	
}