package br.ufc.ws.bandas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	private static ThreadLocal<EntityManager> ems = new ThreadLocal<EntityManager>();

	/**
	 * Obtém o EntityManager vinculado à  Thread atual. Se ele ainda não
	 * existir, é criado e depois, vinculado à Thread atual.
	 */
	public static EntityManager getEntityManager() {
		System.out.println("entrou no metodo getEntityManager - JPAUtil");
		EntityManager em = ems.get();
		if (em == null) {
			System.out.println("entrou no if");
			em = emf.createEntityManager();
			System.out.println("executou o emf");
			ems.set(em);
			System.out.println("executou o ems");
		}
		return em;
	}

	/**
	 *  Fecha o EntityManager atrelado à  Thread atual e retira-o da ThreadLocal.
	 */
	public static void closeEntityManager() {
		EntityManager em = ems.get();
		if (em != null) {
			EntityTransaction tx = em.getTransaction();
			if (tx.isActive()) {
				tx.commit();
			}
			em.close();
			ems.set(null);
		}
	}

}
