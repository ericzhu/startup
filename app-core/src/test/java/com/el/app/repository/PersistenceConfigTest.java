package com.el.app.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.Assert;
import org.junit.Test;

import com.el.app.BaseIntegrationTest;
import com.el.app.model.Notification;

public class PersistenceConfigTest extends BaseIntegrationTest {
	
	@Inject
	EntityManagerFactory entityManagerFactory;
	
	@Test
	public void testSetupJap() {
		Assert.assertNotNull(entityManagerFactory);
	}
	
	@Test
	public void testSave() {
		EntityManager em = entityManagerFactory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(new Notification());
		em.getTransaction().commit();
	}
	
	
}
