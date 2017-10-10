package com.vehiculorc.servicesImpl;

import com.vehiculorc.entidades.Via;

public class ViaServicesImpl {

	
	
	public static Via crearVia(int i,int j) {
		return Via.crearInstancia(i, j);
	}
	
	public static Via configurarSuperficieDesplazamiento(int i,int j){
		return crearVia(i, j);
		
	}
	
	
	public static  void  limpiarMatriz(Via via){
		
		for (int j2 = 0; j2 < via.getNumeroFilas(); j2++) {
			for (int k = 0; k < via.getNumeroColumnas(); k++) {
				via.getMatriz()[j2][k] = "0";
			}

		}
	}
	
	
	
}
