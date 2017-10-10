package com.vehiculorc.entidades;

public class Via {

	private static Via via;

	private int numeroColumnas;
	private int numeroFilas;
	private String[][] matriz = null;

	private Via(int i, int j) {
		matriz = new String[i][j];
		for (int j2 = 0; j2 < i; j2++) {
			for (int k = 0; k < j; k++) {
				matriz[j2][k] = "0";
			}
		}
		numeroFilas = i;
		numeroColumnas = j;
	}

	private synchronized static void crearVia(int i, int j) {
		if (via == null) {
			via = new Via(i, j);
		}
	}

	public static Via crearInstancia(int i, int j) {
		if (via == null)
			crearVia(i, j);
		return via;
	}

	public int getNumeroColumnas() {
		return numeroColumnas;
	}

	public void setNumeroColumnas(int numeroColumnas) {
		this.numeroColumnas = numeroColumnas;
	}

	public int getNumeroFilas() {
		return numeroFilas;
	}

	public void setNumeroFilas(int numeroFilas) {
		this.numeroFilas = numeroFilas;
	}

	public String[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}

}
