package com.vehiculorc.servicesImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vehiculorc.entidades.Movimiento;
import com.vehiculorc.entidades.Vehiculo;
import com.vehiculorc.entidades.Via;
import com.vehiculorc.services.Desplazamiento;

public class MovimientoServicesImpl {

	static Vehiculo vehiculo;
	static Via via;
	static Movimiento movimiento;

	// MovimientoServicesImpl movimientoServicesImpl = new MovimientoServicesImpl();
	VehiculoServicesImpl vehiculoServicesimplementation = new VehiculoServicesImpl();

	/**
	 * permite realizar movimientos de un vehiculo hacia un punto cardinal, con un
	 * desplazamiento dentro de una matriz que se pasa como via. Retorna la posición
	 * en que quedara el vehiculo dentro de la via.
	 * 
	 * @param i
	 *            la posicion actual (fila) en que se encuentra el vehiculo
	 * @param j
	 *            la posicion actual (columna) en que se encuentra el vehiculo
	 * @param puntoCardinal
	 *            hacia donde se dirige el vehiculo (Norte, Sur, Oriente, Occidente)
	 * @param via
	 *            La via en la cual se esta desplazando el vehiculo
	 * @param desplazamiento
	 *            la cantidad de pasos o el desplazamiento que va realizar el
	 *            vehiculo
	 * @return la posiscion en la que quedara ubicado el vehiculo
	 * 
	 */

	public String calcularMovimiento(Vehiculo pVehiculo, String puntoCardinal, int desplazamiento) {

		int i = pVehiculo.getCoordenadaY();
		int j = pVehiculo.getCoordenadaX();
		Desplazamiento command;

		if (movimiento == null)
			movimiento = new Movimiento();

		command = movimiento.buscarMovimiento(puntoCardinal);
		return command.ejecutar(i, j, desplazamiento);

	}

	/**
	 * permite ubicar en la posición inicial de un vehiculo en la via
	 */
	public void ubicarVehiculoInicio(Via via, Vehiculo vehiculo) {
		via.getMatriz()[vehiculo.getCoordenadaY()][0] = "V";

	}

	public void inicializarJuegoVehiculoRC(Via pVia, Vehiculo pVehiculo) {
		ubicarVehiculoInicio(pVia, pVehiculo);
	}

	public void actualizarPosicionMatriz(Via via, int posicionI, int posicionJ) {
		via.getMatriz()[posicionI][posicionJ] = "V";
	}

	public String dezplazarVehiculo(Vehiculo pVehiculo, Via pVia, String puntoCardinal, int desplazamiento)
			throws Exception {
		String posicionDespuesMovimiento = calcularMovimiento(pVehiculo, puntoCardinal, desplazamiento);
		String[] ejesFinales = posicionDespuesMovimiento.split(" ");
		int ejey = Integer.parseInt(ejesFinales[0]);
		int ejex = Integer.parseInt(ejesFinales[1]);
		ViaServicesImpl.limpiarMatriz(pVia);
		vehiculoServicesimplementation.actualizarPosicionVehiculo(pVehiculo, ejey, ejex);
		actualizarPosicionMatriz(pVia, ejey, ejex);

		for (int i = 0; i < pVia.getNumeroFilas(); i++) {
			for (int j = 0; j < pVia.getNumeroColumnas(); j++) {
				System.out.print(pVia.getMatriz()[i][j]);
			}
			System.out.println();
		}

		return ejey + " " + ejex;
	}

}
