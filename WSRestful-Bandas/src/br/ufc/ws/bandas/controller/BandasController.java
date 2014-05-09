package br.ufc.ws.bandas.controller;

import java.util.List;

import br.ufc.ws.bandas.dao.BandasDAO;
import br.ufc.ws.bandas.model.Banda;

public class BandasController {
	public List<Banda> listAll(){
		return new BandasDAO().listAll(); 
	}
}
