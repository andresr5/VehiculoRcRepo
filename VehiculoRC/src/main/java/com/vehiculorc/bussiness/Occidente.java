package com.vehiculorc.bussiness;

import com.vehiculorc.services.Desplazamiento;

public class Occidente implements Desplazamiento {

	public Occidente() {

	}

	@Override
	public String ejecutar(int i, int j, int desplazamiento) {
		return (i) + " " + ((j - desplazamiento));
	}

}
