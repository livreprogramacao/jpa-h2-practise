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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fabio Santos Almeida <livre.programacao at gmail.com>
 */
@Entity
@Table(catalog = "rematricula-db", schema = "ACD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Discdpunf.findAll", query = "SELECT d FROM Discdpunf d"),
    @NamedQuery(name = "Discdpunf.findByCodEmpr", query = "SELECT d FROM Discdpunf d WHERE d.codEmpr = :codEmpr"),
    @NamedQuery(name = "Discdpunf.findByCodCurs", query = "SELECT d FROM Discdpunf d WHERE d.codCurs = :codCurs"),
    @NamedQuery(name = "Discdpunf.findByCodDisc", query = "SELECT d FROM Discdpunf d WHERE d.codDisc = :codDisc"),
    @NamedQuery(name = "Discdpunf.findByAnoLeti", query = "SELECT d FROM Discdpunf d WHERE d.anoLeti = :anoLeti"),
    @NamedQuery(name = "Discdpunf.findBySemLeti", query = "SELECT d FROM Discdpunf d WHERE d.semLeti = :semLeti"),
    @NamedQuery(name = "Discdpunf.findByQtdAlun", query = "SELECT d FROM Discdpunf d WHERE d.qtdAlun = :qtdAlun")})
public class Discdpunf implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "COD_EMPR")
    private Short codEmpr;
    @Column(name = "COD_CURS")
    private Short codCurs;
    @Column(name = "COD_DISC")
    private Integer codDisc;
    @Column(name = "ANO_LETI")
    private Short anoLeti;
    @Column(name = "SEM_LETI")
    private Short semLeti;
    @Column(name = "QTD_ALUN")
    private Short qtdAlun;

    public Discdpunf() {
    }

    public Discdpunf(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public Short getCodEmpr() {
        return codEmpr;
    }

    public void setCodEmpr(Short codEmpr) {
        this.codEmpr = codEmpr;
    }

    public Short getCodCurs() {
        return codCurs;
    }

    public void setCodCurs(Short codCurs) {
        this.codCurs = codCurs;
    }

    public Integer getCodDisc() {
        return codDisc;
    }

    public void setCodDisc(Integer codDisc) {
        this.codDisc = codDisc;
    }

    public Short getAnoLeti() {
        return anoLeti;
    }

    public void setAnoLeti(Short anoLeti) {
        this.anoLeti = anoLeti;
    }

    public Short getSemLeti() {
        return semLeti;
    }

    public void setSemLeti(Short semLeti) {
        this.semLeti = semLeti;
    }

    public Short getQtdAlun() {
        return qtdAlun;
    }

    public void setQtdAlun(Short qtdAlun) {
        this.qtdAlun = qtdAlun;
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
        if (!(object instanceof Discdpunf)) {
            return false;
        }
        Discdpunf other = (Discdpunf) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Discdpunf[ id=" + id + " ]";
    }

}
