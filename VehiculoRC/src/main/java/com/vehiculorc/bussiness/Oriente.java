package com.vehiculorc.bussiness;

import com.vehiculorc.services.Desplazamiento;

public class Oriente implements Desplazamiento {

	public Oriente() {

	}

	@Override
	public String ejecutar(int i, int j, int desplazamiento) {
		return (i) + " " + ((j + desplazamiento));

	}
}
