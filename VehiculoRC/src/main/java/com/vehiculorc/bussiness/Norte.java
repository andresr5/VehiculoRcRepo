package com.vehiculorc.bussiness;

import com.vehiculorc.services.Desplazamiento;

public class Norte implements Desplazamiento {

	public Norte() {
	}

	/**
	 * @param int i 
	 * Resta el desplazamiento a la posición actual en la
	 * fila i  
	 * 
	 **/
	@Override
	public String ejecutar(int i, int j, int desplazamiento) {
		return ((i - desplazamiento)) + " " + (j);
	}

}
