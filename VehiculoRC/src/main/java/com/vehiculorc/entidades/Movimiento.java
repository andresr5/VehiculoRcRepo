package com.vehiculorc.entidades;

import java.util.HashMap;

import com.vehiculorc.bussiness.Norte;
import com.vehiculorc.bussiness.Occidente;
import com.vehiculorc.bussiness.Oriente;
import com.vehiculorc.bussiness.Sur;
import com.vehiculorc.services.Desplazamiento;

public class Movimiento {
	
	HashMap<String,Desplazamiento> mov;
	
	public Movimiento(){
		mov = new HashMap<String,Desplazamiento>();
		mov.put("N", new Norte());
		mov.put("E", new Oriente());
		mov.put("O", new Occidente());
		mov.put("S", new Sur());
	}
	
	
	public Desplazamiento buscarMovimiento(String direccion) {
		return mov.get(direccion);
	}


}
