package org.ferris.mavenintegrationtestingwithderby;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SomeTableFindExistingIT {

    private static Logger log = Logger.getLogger(SomeTableFindExistingIT.class);

    private EntityManager em;

    @Before
    public void setEntityManager() throws Exception {
        try {
            EntityManagerFactory emf
                    = Persistence.createEntityManagerFactory("MavenIntegrationTestingWithDerbyPU");
            em = emf.createEntityManager();
        } catch (Exception e) {
            log.fatal("Cannot create EntityManager", e);
            throw e;
        }
    }

    @Test
    public void findSomeTableData() throws Exception {
        String someVarchar = "unit_test_varchar";
        Long someNumeric = new Long(123);
        Timestamp someTimestamp = new Timestamp(new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss.SSS").parse("1977-01-30-10.11.30.766").getTime());

        SomeTable bean = em.find(SomeTable.class, someVarchar);
        assertNotNull(
                String.format("Not found! someVarchar=\"%s\"", someVarchar), bean
        );
        assertEquals(someVarchar, bean.getSomeVarchar());
        assertEquals(someNumeric, bean.getSomeNumeric());
        assertEquals(someTimestamp, bean.getSomeTimestamp());
    }
}
