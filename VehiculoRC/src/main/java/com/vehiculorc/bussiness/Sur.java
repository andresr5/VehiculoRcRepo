package com.vehiculorc.bussiness;

import com.vehiculorc.services.Desplazamiento;

public class Sur implements Desplazamiento {

	public Sur() {

	}

	@Override
	public String ejecutar(int i, int j, int desplazamiento) {
		return ((i + desplazamiento)) + " " + j;
	}

}
