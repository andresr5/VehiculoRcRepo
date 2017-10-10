package com.vehiculorc.ws;

import java.util.*;

import javax.ws.rs.FormParam;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.vehiculorc.controller.*;
import com.vehiculorc.entidades.Via;

@Path("vehiculoRC")
public class VehiculoRCRestful {

	MovimientoController movController = new MovimientoController();

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/desplazar")
	public Response desplazarVehiculo(@FormParam("desplazamiento") String desplazamiento,
			@FormParam("dimension") String dimension) throws Exception {
		movController.inicializarJuegoVehiculoRC(dimension);
		 
		
		return Response.ok(movController.desplazarVehiculo(desplazamiento),MediaType.TEXT_PLAIN ).build();

	}

}
