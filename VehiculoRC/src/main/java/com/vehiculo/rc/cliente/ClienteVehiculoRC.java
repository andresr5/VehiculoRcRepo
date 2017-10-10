package com.vehiculo.rc.cliente;

import java.util.Scanner;

import com.vehiculorc.controller.MovimientoController;

public class ClienteVehiculoRC {

	public static void main(String[] args) {

		MovimientoController movController = new MovimientoController();
		boolean inicializar = true;

		while (true) {

			try {
				Scanner teclado = new Scanner(System.in);
				System.out.println("--------VEHICULORC----------");
				if (inicializar) {

					System.out.println(" 1. Ingresar Tamaño Autopista en el formato[n,m]");
					String tamanioMatriz = teclado.nextLine();

					movController.inicializarJuegoVehiculoRC(tamanioMatriz);
					inicializar = false;
				}
				System.out.println(" 2. Ingrese un Desplazamiento en el siguiente formato [Pasos][Cardinalidad]. ");
				String pDesplazamiento = teclado.nextLine();

				String desplazamientoFinal = movController.desplazarVehiculo(pDesplazamiento);
				System.out.println("La posicion Final del Elemento es : ["+ desplazamientoFinal+"]");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
