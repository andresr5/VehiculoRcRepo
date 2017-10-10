package com.vehiculorc.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vehiculorc.entidades.Movimiento;
import com.vehiculorc.entidades.Vehiculo;
import com.vehiculorc.entidades.Via;
import com.vehiculorc.servicesImpl.MovimientoServicesImpl;
import com.vehiculorc.servicesImpl.VehiculoServicesImpl;
import com.vehiculorc.servicesImpl.ViaServicesImpl;

public class MovimientoController {

	static Vehiculo vehiculo;
	public Via via;
	public List<Via> viaList = null;
	public List<Vehiculo> vehiculoList = null;
	static Movimiento movimiento;
	MovimientoServicesImpl movimientoServicesImpl = new MovimientoServicesImpl();

	public void inicializarJuegoVehiculoRC(String tamanioVia) throws Exception {
		if (via == null) {
			viaList = new ArrayList<Via>();
			vehiculoList = new ArrayList<Vehiculo>();
			validarFormatoEntradaTamanioVia(tamanioVia);
			String[] a = tamanioVia.split(",");
			int i = Integer.parseInt(a[0]);
			int j = Integer.parseInt(a[1]);
			vehiculo = VehiculoServicesImpl.crearNuevoVehiculo(i);
			via = ViaServicesImpl.crearVia(i, j);
			movimientoServicesImpl.inicializarJuegoVehiculoRC(via, vehiculo);
			viaList.add(via);
			vehiculoList.add(vehiculo);

			for (int j2 = 0; j2 < via.getNumeroFilas(); j2++) {
				for (int k = 0; k < via.getNumeroColumnas(); k++) {
					System.out.print(via.getMatriz()[j2][k]);
				}
				System.out.println();
			}

		}
	}

	public String desplazarVehiculo(String pDesplazamiento) throws Exception {

		if (viaList == null || viaList.size() == 0 || viaList.get(0) == null) {
			System.out.println("Debe Inicializar la superficie primreo. ");
		}

		if (vehiculoList == null || vehiculoList.size() == 0 || vehiculoList.get(0) == null) {
			System.out.println("Debe Inicializar la superficie primero. ");
		}

		validarFormatoEntradaDesplazamiento(pDesplazamiento);
		String[] infoMovimiento = pDesplazamiento.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		int desplazamiento = Integer.parseInt(infoMovimiento[0]);
		String puntoCardinal = infoMovimiento[1];
		movimientoServicesImpl.dezplazarVehiculo(vehiculoList.get(0), viaList.get(0), puntoCardinal, desplazamiento);
		return vehiculoList.get(0).getCoordenadaY() + "," + vehiculoList.get(0).getCoordenadaX();

	}

	public void validarDireccionDesplazamiento(Via via, String[] desplazamiento) throws Exception {
		int ejey = Integer.parseInt(desplazamiento[0]);
		int ejex = Integer.parseInt(desplazamiento[1]);

		if (ejey < 0 || ejey > via.getNumeroFilas()) {
			throw new Exception("Se ha detenido el avance por salir de los límites");
		}

		if (ejex < 0 || ejex > via.getNumeroColumnas()) {
			throw new Exception("Se ha detenido el avance por salir de los límites");
		}

	}

	public void validarFormatoEntradaDesplazamiento(String entrada) throws Exception {

		Pattern pattern = Pattern.compile("^[0-9]{1,5}[a-zA-Z]$");
		Matcher matcher = pattern.matcher(entrada);

		if (!matcher.matches()) {
			throw new Exception("Error en formato de comando");

		}

	}

	public void validarFormatoEntradaTamanioVia(String tamanioVia) throws Exception {

		Pattern pattern = Pattern.compile("^[0-9]{1,5},[0-9]{1,5}$");
		Matcher matcher = pattern.matcher(tamanioVia);
		if (!matcher.matches()) {
			throw new Exception("Error en formato de comando”.");
		}

	}

}
