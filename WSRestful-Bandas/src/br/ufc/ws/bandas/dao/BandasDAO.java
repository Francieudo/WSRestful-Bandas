package br.ufc.ws.bandas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.ufc.ws.bandas.model.Banda;
import br.ufc.ws.bandas.util.JPAUtil;

public class BandasDAO {
	protected EntityManager em = JPAUtil.getEntityManager();
	
	public List<Banda> listAll(){
		CriteriaQuery<Banda> cq = em.getCriteriaBuilder().createQuery(Banda.class);
		cq.from(Banda.class);
		return em.createQuery(cq).getResultList();	
	}
	
	public void beginTransaction() {
		em.getTransaction().begin();
	}

	public void commit() {
		em.getTransaction().commit();
	}

	public void rollback() {
		em.getTransaction().rollback();
	}

	public void close() {
		JPAUtil.closeEntityManager();
	}
}
