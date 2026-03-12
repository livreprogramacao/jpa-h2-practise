package br.com.livreprogramacao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author user
 */
public class MarcaRepositoryTest {
    
    @Test
    public void marcaCreateNewResourceTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hsqldb");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(new Marca(1L, "Marca1"));
        em.persist(new Marca(2L, "Marca2"));
        em.persist(new Marca(3L, "Marca3"));
        em.persist(new Marca(4L, "Marca4"));
        em.persist(new Marca(5L, "Marca5"));
        List<Marca> l = em.createQuery("SELECT m FROM Marca m").getResultList();
        
        l.forEach(System.out::println);

        tx.commit();
    }
    
}
