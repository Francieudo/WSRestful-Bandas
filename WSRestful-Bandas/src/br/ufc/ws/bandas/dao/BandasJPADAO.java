package br.ufc.ws.bandas.dao;

import br.ufc.ws.bandas.model.Banda;

public class BandasJPADAO extends GenericJPADAO<Banda> implements BandasDAO{
	public BandasJPADAO(){
		this.persistentClass = Banda.class; 
	}
}
