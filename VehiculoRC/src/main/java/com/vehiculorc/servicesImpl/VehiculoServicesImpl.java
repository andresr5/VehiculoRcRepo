package com.vehiculorc.servicesImpl;

import com.vehiculorc.entidades.Vehiculo;

public class VehiculoServicesImpl {

	public static Vehiculo crearNuevoVehiculo(int i) {
		return Vehiculo.crearInstancia(i);
	}

	public String obtenerPosicionActual(Vehiculo vehiculo) {
		return vehiculo.getCoordenadaY() + " " + vehiculo.getCoordenadaX();
	}
	
	
	public void actualizarPosicionVehiculo(Vehiculo vehiculo,int i,int j ){
		vehiculo.setCoordenadaY(i);
		vehiculo.setCoordenadaX(j);
	}
}
