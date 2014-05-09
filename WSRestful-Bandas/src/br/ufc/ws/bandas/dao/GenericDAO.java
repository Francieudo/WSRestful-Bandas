package br.ufc.ws.bandas.dao;

import java.util.List;

public interface GenericDAO<T> {

	public List<T> find();
	
	public void beginTransaction();
	public void commit();
	public void rollback();
	public void close();
}
