/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ferris.mavenintegrationtestingwithderby;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author Michael
 */
@Entity
@Table(name = "app_sometable")
public class SomeTable implements Serializable {

    private static final long serialVersionUID = 987369876876987L;

    @Id
    @Column(name = "some_varchar")
    private String someVarchar;

    @Column(name = "some_numeric")
    private Long someNumeric;

    @Column(name = "some_timestamp")
    private Timestamp someTimestamp;

    @Lob
    @Column(name = "some_blob")
    private byte[] someBlob;

    public String getSomeVarchar() {
        return someVarchar;
    }

    public void setSomeVarchar(String someVarchar) {
        this.someVarchar = someVarchar;
    }

    public Long getSomeNumeric() {
        return someNumeric;
    }

    public void setSomeNumeric(Long someNumeric) {
        this.someNumeric = someNumeric;
    }

    public Timestamp getSomeTimestamp() {
        return someTimestamp;
    }

    public void setSomeTimestamp(Timestamp someTimestamp) {
        this.someTimestamp = someTimestamp;
    }

    public byte[] getSomeBlob() {
        return someBlob;
    }

    public void setSomeBlob(byte[] someBlob) {
        this.someBlob = someBlob;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.someVarchar != null ? this.someVarchar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SomeTable other = (SomeTable) obj;
        if ((this.someVarchar == null) ? (other.someVarchar != null) : !this.someVarchar.equals(other.someVarchar)) {
            return false;
        }
        return true;
    }

}
