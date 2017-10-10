package com.vehiculorc.unitarias;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vehiculorc.entidades.Vehiculo;
import com.vehiculorc.servicesImpl.MovimientoServicesImpl;


public class PruebaMovimiento {
	
	/**
	 * Con esta prueba se busca validar el desplazamiento en direccion Norte del vehiculo
	 * sin tener en cuenta la matriz solo la posicion del vehiculo en cualquier superficie, 
	 * para este caso el vehiculo se encontraria originalmente en la posicion [2,0]
	 *  
	 *  00
	 *  00
	 *  v0
	 *  
	 *  Cuando el vehiculo se desplaza 2 posiciones con cardinalidad Norte el vehiculo queda
	 *  en la posicion [0,0]
	 *  
	 *  v0
	 *  00
	 *  00
	 *  
	 * */
	  @Test
	  public void pruebaDesplazamientoNorte() {
		  MovimientoServicesImpl movimientoServicesImpl = new MovimientoServicesImpl();
		  Vehiculo vehiculo =  Vehiculo.crearInstancia(1);
		  vehiculo.setCoordenadaX(0);
		  vehiculo.setCoordenadaY(2);
		  System.out.println("Coordenada X"+vehiculo.getCoordenadaX()+" Coordenada Y "+vehiculo.getCoordenadaY());
		  String ResultadoMovimiento = movimientoServicesImpl.calcularMovimiento(vehiculo,"N",2);
		  System.out.println(ResultadoMovimiento);
		  Assert.assertEquals(ResultadoMovimiento,"0 0");
	  }
	  
	  
	  /**
		 * Con esta prueba se busca validar el desplazamiento en direccion sur del vehiculo
		 * sin tener en cuenta la matriz solo la posicion del vehiculo en cualquier superficie, 
		 * para este caso el vehiculo se encontraria originalmente en la posicion [2,0]
		 *
		 *  00
		 *  00
		 *  v0
		 *  
		 *  Cuando el vehiculo se desplaza 2 posiciones con cardinalidad Sur, el vehiculo queda
		 *  en la posicion [4,0]
		 *  00
		 *  00
		 *  00
		 *  00
		 *  v0
		 *  
		 *  
		 * */
	
		  @Test
		  public void pruebaDesplazamientoSur() {
			  MovimientoServicesImpl movimientoServicesImpl = new MovimientoServicesImpl();
			  Vehiculo vehiculo =  Vehiculo.crearInstancia(1);
			  vehiculo.setCoordenadaX(0);
			  vehiculo.setCoordenadaY(2);
			  System.out.println("Coordenada X"+vehiculo.getCoordenadaX()+" Coordenada Y "+vehiculo.getCoordenadaY());
			  String ResultadoMovimiento = movimientoServicesImpl.calcularMovimiento(vehiculo,"S",2);
			  System.out.println(ResultadoMovimiento);
			  Assert.assertEquals(ResultadoMovimiento,"4 0");
		  }
		  
		  
		  
		  /**
			 * Con esta prueba se busca validar el desplazamiento en direccion Este  del vehiculo
			 * sin tener en cuenta la matriz solo la posicion del vehiculo en cualquier superficie, 
			 * para este caso el vehiculo se encontraria originalmente en la posicion [2,0]
			 * 
			 *  00
			 *  00
			 *  v0
			 *  
			 *  Cuando el vehiculo se desplaza 2 posiciones con cardinalidad Este, el vehiculo queda
			 *  en la posicion [2,2]
			 * 
			 *  000
			 *  000
			 *  00v
			 *  
			 *  
			 * */
			  @Test
			  public void pruebaDesplazamientoEste() {
				  MovimientoServicesImpl movimientoServicesImpl = new MovimientoServicesImpl();
				  Vehiculo vehiculo =  Vehiculo.crearInstancia(1);
				  vehiculo.setCoordenadaX(0);
				  vehiculo.setCoordenadaY(2);
				  System.out.println("Coordenada X"+vehiculo.getCoordenadaX()+" Coordenada Y "+vehiculo.getCoordenadaY());
				  String ResultadoMovimiento = movimientoServicesImpl.calcularMovimiento(vehiculo,"E",2);
				  System.out.println(ResultadoMovimiento);
				  Assert.assertEquals(ResultadoMovimiento,"2 2");
			  }
			  
			  
			  
			  
			  /**
				 * Con esta prueba se busca validar el desplazamiento en direccion Oeste del vehiculo
				 * sin tener en cuenta la matriz solo la posicion del vehiculo en cualquier superficie, 
				 * para este caso el vehiculo se encontraria originalmente en la posicion [2,0]
				 *  
				 *  00
				 *  00
				 *  v0
				 *  
				 *  Cuando el vehiculo se desplaza 2 posiciones con cardinalidad sur el vehiculo quedaria
				 *  en la posicion [2,-2] lo cual es valido en cuanto a desplazamiento. Pero a la hora
				 *  de ubicarlo en la matriz se hace una validación que no permite dimensiones negativas
				 *  
				 *  0000
				 *  0000
				 *  v000
				 *  
				 *  
				 * 
				 * */
				  @Test
				  public void pruebaDesplazamientoOeste() {
					  MovimientoServicesImpl movimientoServicesImpl = new MovimientoServicesImpl();
					  Vehiculo vehiculo =  Vehiculo.crearInstancia(1);
					  vehiculo.setCoordenadaX(0);
					  vehiculo.setCoordenadaY(2);
					  System.out.println("Coordenada X"+vehiculo.getCoordenadaX()+" Coordenada Y "+vehiculo.getCoordenadaY());
					  String ResultadoMovimiento = movimientoServicesImpl.calcularMovimiento(vehiculo,"O",2);
					  System.out.println(ResultadoMovimiento);
					  Assert.assertEquals(ResultadoMovimiento,"2 -2");
				  }


}
