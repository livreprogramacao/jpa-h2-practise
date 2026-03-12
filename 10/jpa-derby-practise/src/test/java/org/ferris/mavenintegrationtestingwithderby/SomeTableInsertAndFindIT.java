package org.ferris.mavenintegrationtestingwithderby;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SomeTableInsertAndFindIT {

    private static Logger log = Logger.getLogger(SomeTableInsertAndFindIT.class);

    private EntityManager em;
    private String someVarchar;
    private Long someNumeric;
    private Timestamp someTimestamp;
    private byte[] someBlob;

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

    @Before
    public void setSomeTableValues() throws Exception {
        someVarchar = "unit_test_insert";
        someNumeric = new Long(789);
        someTimestamp = new Timestamp(new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss.SSS").parse("1988-12-22-13.45.56.766").getTime());
        someBlob = getSomeBlob();
    }

    @Test
    public void insertThenFindTheData() throws Exception {
        insert();
        find();
    }

    private void find() throws Exception {
        SomeTable bean = em.find(SomeTable.class, someVarchar);
        assertNotNull(
                String.format("Not found! someVarchar=\"%s\"", someVarchar), bean
        );
        assertEquals(someVarchar, bean.getSomeVarchar());
        assertEquals(someNumeric, bean.getSomeNumeric());
        assertEquals(someTimestamp, bean.getSomeTimestamp());
        assertEquals(someBlob, bean.getSomeBlob());
    }

    private void insert() throws Exception {
        SomeTable someTable = new SomeTable();
        someTable.setSomeBlob(someBlob);
        someTable.setSomeNumeric(someNumeric);
        someTable.setSomeTimestamp(someTimestamp);
        someTable.setSomeVarchar(someVarchar);

        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(someTable);
        t.commit();
    }

    private byte[] getSomeBlob() throws Exception {
        String resource = "/blob/someBlob.jpg";
        InputStream is = this.getClass().getResourceAsStream(resource);
        assertNotNull(String.format("Not found! \"%s\"", resource), is);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(147456);
        for (int read = is.read(); read != -1; read = is.read()) {
            baos.write(read);
        }
        baos.flush();
        is.close();
        return baos.toByteArray();
    }
}
