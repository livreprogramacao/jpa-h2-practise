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
    @NamedQuery(name = "Grade.findAll", query = "SELECT g FROM Grade g"),
    @NamedQuery(name = "Grade.findByCodEmpr", query = "SELECT g FROM Grade g WHERE g.codEmpr = :codEmpr"),
    @NamedQuery(name = "Grade.findByCodCurs", query = "SELECT g FROM Grade g WHERE g.codCurs = :codCurs"),
    @NamedQuery(name = "Grade.findByCodHabi", query = "SELECT g FROM Grade g WHERE g.codHabi = :codHabi"),
    @NamedQuery(name = "Grade.findBySeqGrad", query = "SELECT g FROM Grade g WHERE g.seqGrad = :seqGrad"),
    @NamedQuery(name = "Grade.findBySerie", query = "SELECT g FROM Grade g WHERE g.serie = :serie"),
    @NamedQuery(name = "Grade.findByAnoInic", query = "SELECT g FROM Grade g WHERE g.anoInic = :anoInic"),
    @NamedQuery(name = "Grade.findBySemInic", query = "SELECT g FROM Grade g WHERE g.semInic = :semInic"),
    @NamedQuery(name = "Grade.findByTipGrad", query = "SELECT g FROM Grade g WHERE g.tipGrad = :tipGrad")})
public class Grade implements Serializable {

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
    @Column(name = "COD_HABI")
    private Short codHabi;
    @Column(name = "SEQ_GRAD")
    private Integer seqGrad;
    private Short serie;
    @Column(name = "ANO_INIC")
    private Short anoInic;
    @Column(name = "SEM_INIC")
    private Short semInic;
    @Column(name = "TIP_GRAD")
    private Short tipGrad;

    public Grade() {
    }

    public Grade(byte[] id) {
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

    public Short getCodHabi() {
        return codHabi;
    }

    public void setCodHabi(Short codHabi) {
        this.codHabi = codHabi;
    }

    public Integer getSeqGrad() {
        return seqGrad;
    }

    public void setSeqGrad(Integer seqGrad) {
        this.seqGrad = seqGrad;
    }

    public Short getSerie() {
        return serie;
    }

    public void setSerie(Short serie) {
        this.serie = serie;
    }

    public Short getAnoInic() {
        return anoInic;
    }

    public void setAnoInic(Short anoInic) {
        this.anoInic = anoInic;
    }

    public Short getSemInic() {
        return semInic;
    }

    public void setSemInic(Short semInic) {
        this.semInic = semInic;
    }

    public Short getTipGrad() {
        return tipGrad;
    }

    public void setTipGrad(Short tipGrad) {
        this.tipGrad = tipGrad;
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
        if (!(object instanceof Grade)) {
            return false;
        }
        Grade other = (Grade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Grade[ id=" + id + " ]";
    }

}
