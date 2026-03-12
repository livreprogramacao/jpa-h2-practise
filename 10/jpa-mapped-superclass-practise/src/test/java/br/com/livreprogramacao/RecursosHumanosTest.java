/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livreprogramacao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user
 */
public class RecursosHumanosTest {

    private EntityManagerFactory emf;

    private EntityManager em;

    public RecursosHumanosTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void marcaCreateNewResourceTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hsqldb");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(new RecursosHumanos(1L, "Departamento1"));
        em.persist(new RecursosHumanos(2L, "Departamento2"));
        em.persist(new RecursosHumanos(3L, "Departamento3"));
        em.persist(new RecursosHumanos(4L, "Departamento4"));
        em.persist(new RecursosHumanos(5L, "Departamento5"));
        List<RecursosHumanos> l = em.createQuery("SELECT rh FROM RecursosHumanos rh").getResultList();
        
        l.forEach(System.out::println);

        tx.commit();
    }
    
}
