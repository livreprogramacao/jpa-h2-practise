/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rematricula;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fabio Santos Almeida <livre.programacao at gmail.com>
 */
@Entity
@Table(catalog = "rematricula-db", schema = "ACD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turest.findAll", query = "SELECT t FROM Turest t"),
    @NamedQuery(name = "Turest.findByInstCur", query = "SELECT t FROM Turest t WHERE t.instCur = :instCur"),
    @NamedQuery(name = "Turest.findByCodCurs", query = "SELECT t FROM Turest t WHERE t.codCurs = :codCurs"),
    @NamedQuery(name = "Turest.findByCodDisc", query = "SELECT t FROM Turest t WHERE t.codDisc = :codDisc"),
    @NamedQuery(name = "Turest.findByTurma", query = "SELECT t FROM Turest t WHERE t.turma = :turma"),
    @NamedQuery(name = "Turest.findByCodProf", query = "SELECT t FROM Turest t WHERE t.codProf = :codProf"),
    @NamedQuery(name = "Turest.findBySerie", query = "SELECT t FROM Turest t WHERE t.serie = :serie")})
public class Turest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "INST_CUR")
    private Short instCur;
    @Column(name = "COD_CURS")
    private Short codCurs;
    @Column(name = "COD_DISC")
    private Short codDisc;
    @Size(max = 200)
    @Column(length = 200)
    private String turma;
    @Column(name = "COD_PROF")
    private Integer codProf;
    private Short serie;

    public Turest() {
    }

    public Turest(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public Short getInstCur() {
        return instCur;
    }

    public void setInstCur(Short instCur) {
        this.instCur = instCur;
    }

    public Short getCodCurs() {
        return codCurs;
    }

    public void setCodCurs(Short codCurs) {
        this.codCurs = codCurs;
    }

    public Short getCodDisc() {
        return codDisc;
    }

    public void setCodDisc(Short codDisc) {
        this.codDisc = codDisc;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Integer getCodProf() {
        return codProf;
    }

    public void setCodProf(Integer codProf) {
        this.codProf = codProf;
    }

    public Short getSerie() {
        return serie;
    }

    public void setSerie(Short serie) {
        this.serie = serie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turest)) {
            return false;
        }
        Turest other = (Turest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Turest[ id=" + id + " ]";
    }

}
