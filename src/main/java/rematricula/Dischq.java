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
    @NamedQuery(name = "Dischq.findAll", query = "SELECT d FROM Dischq d"),
    @NamedQuery(name = "Dischq.findByCodInst", query = "SELECT d FROM Dischq d WHERE d.codInst = :codInst"),
    @NamedQuery(name = "Dischq.findByRgmAlun", query = "SELECT d FROM Dischq d WHERE d.rgmAlun = :rgmAlun"),
    @NamedQuery(name = "Dischq.findBySeqDisc", query = "SELECT d FROM Dischq d WHERE d.seqDisc = :seqDisc"),
    @NamedQuery(name = "Dischq.findBySeqDchq", query = "SELECT d FROM Dischq d WHERE d.seqDchq = :seqDchq")})
public class Dischq implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "COD_INST")
    private Short codInst;
    @Column(name = "RGM_ALUN")
    private Integer rgmAlun;
    @Column(name = "SEQ_DISC")
    private Short seqDisc;
    @Column(name = "SEQ_DCHQ")
    private Short seqDchq;

    public Dischq() {
    }

    public Dischq(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public Short getCodInst() {
        return codInst;
    }

    public void setCodInst(Short codInst) {
        this.codInst = codInst;
    }

    public Integer getRgmAlun() {
        return rgmAlun;
    }

    public void setRgmAlun(Integer rgmAlun) {
        this.rgmAlun = rgmAlun;
    }

    public Short getSeqDisc() {
        return seqDisc;
    }

    public void setSeqDisc(Short seqDisc) {
        this.seqDisc = seqDisc;
    }

    public Short getSeqDchq() {
        return seqDchq;
    }

    public void setSeqDchq(Short seqDchq) {
        this.seqDchq = seqDchq;
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
        if (!(object instanceof Dischq)) {
            return false;
        }
        Dischq other = (Dischq) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Dischq[ id=" + id + " ]";
    }

}
