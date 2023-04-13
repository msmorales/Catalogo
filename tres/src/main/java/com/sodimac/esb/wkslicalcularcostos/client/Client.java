package com.sodimac.esb.wkslicalcularcostos.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Body;

import com.sodimac.esb.wkslicalcularcostos.model.RequestRest;
/**
 * 
 * 
 *
 */
@Path("/")
public interface Client {

	@POST
	@Path("/crearIngreso")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void crearIngreso(@Body RequestRest body);
	
	@GET
	@Path("/nombreProyecta")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void nombreProyecto();

}