package com.concretepage;

import javax.persistence.EntityManager;

public class JPAListenerDemo {
	public static void main(String[] args) {
		EntityManager entityManager = JPAUtility.getEntityManager();	
		entityManager.getTransaction().begin();
		//persist user
		User user = new User(1, "Mahesh");
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		//refresh user
		entityManager.refresh(user);
		//update user
		entityManager.getTransaction().begin();				
		user.setName("Krishna");
		entityManager.getTransaction().commit();
		//remove user
		entityManager.getTransaction().begin();				
		entityManager.remove(user);
		entityManager.getTransaction().commit();		
		entityManager.close();
		JPAUtility.close();		
	}
}

