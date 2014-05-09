package br.ufc.ws.bandas.controller;

import java.util.List;

import br.ufc.ws.bandas.dao.BandasJPADAO;
import br.ufc.ws.bandas.model.Banda;

public class BandasController {
	private BandasJPADAO bandasDAO = new BandasJPADAO();
	
	public List<Banda> listAll(){
		List<Banda> bandas = bandasDAO.find();
		return bandas;
	}
}
