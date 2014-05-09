package br.ufc.ws.bandas.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.ufc.ws.bandas.controller.BandasController;
import br.ufc.ws.bandas.model.Banda;

@Path("/bandas")
public class BandasResource {
	
	@GET
	@Path("/listarTodos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Banda> listAll(){
		return new BandasController().listAll();
	}
}
