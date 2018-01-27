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
@Table(name = "TURDIS", catalog = "rematricula-db", schema = "ACD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TurmaDisciplina.findAll", query = "SELECT t FROM TurmaDisciplina t"),
    @NamedQuery(name = "TurmaDisciplina.findByCodInst", query = "SELECT t FROM TurmaDisciplina t WHERE t.codInst = :codInst"),
    @NamedQuery(name = "TurmaDisciplina.findByCodTurm", query = "SELECT t FROM TurmaDisciplina t WHERE t.codTurm = :codTurm"),
    @NamedQuery(name = "TurmaDisciplina.findByCodDisc", query = "SELECT t FROM TurmaDisciplina t WHERE t.codDisc = :codDisc"),
    @NamedQuery(name = "TurmaDisciplina.findByTipDisc", query = "SELECT t FROM TurmaDisciplina t WHERE t.tipDisc = :tipDisc"),
    @NamedQuery(name = "TurmaDisciplina.findByGruDisc", query = "SELECT t FROM TurmaDisciplina t WHERE t.gruDisc = :gruDisc"),
    @NamedQuery(name = "TurmaDisciplina.findByNrSala", query = "SELECT t FROM TurmaDisciplina t WHERE t.nrSala = :nrSala"),
    @NamedQuery(name = "TurmaDisciplina.findByLibNead", query = "SELECT t FROM TurmaDisciplina t WHERE t.libNead = :libNead"),
    @NamedQuery(name = "TurmaDisciplina.findByTipPres", query = "SELECT t FROM TurmaDisciplina t WHERE t.tipPres = :tipPres"),
    @NamedQuery(name = "TurmaDisciplina.findByTriLeti", query = "SELECT t FROM TurmaDisciplina t WHERE t.triLeti = :triLeti"),
    @NamedQuery(name = "TurmaDisciplina.findBySeqOfem", query = "SELECT t FROM TurmaDisciplina t WHERE t.seqOfem = :seqOfem"),
    @NamedQuery(name = "TurmaDisciplina.findByDiscAnt", query = "SELECT t FROM TurmaDisciplina t WHERE t.discAnt = :discAnt")})
public class TurmaDisciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "COD_INST")
    private Short codInst;
    @Column(name = "COD_TURM")
    private Integer codTurm;
    @Column(name = "COD_DISC")
    private Short codDisc;
    @Column(name = "TIP_DISC")
    private Short tipDisc;
    @Column(name = "GRU_DISC")
    private Short gruDisc;
    @Size(max = 60)
    @Column(name = "NR_SALA", length = 60)
    private String nrSala;
    @Column(name = "LIB_NEAD")
    private Short libNead;
    @Column(name = "TIP_PRES")
    private Short tipPres;
    @Column(name = "TRI_LETI")
    private Short triLeti;
    @Column(name = "SEQ_OFEM")
    private Short seqOfem;
    @Column(name = "DISC_ANT")
    private Integer discAnt;

    public TurmaDisciplina() {
    }

    public TurmaDisciplina(byte[] id) {
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

    public Integer getCodTurm() {
        return codTurm;
    }

    public void setCodTurm(Integer codTurm) {
        this.codTurm = codTurm;
    }

    public Short getCodDisc() {
        return codDisc;
    }

    public void setCodDisc(Short codDisc) {
        this.codDisc = codDisc;
    }

    public Short getTipDisc() {
        return tipDisc;
    }

    public void setTipDisc(Short tipDisc) {
        this.tipDisc = tipDisc;
    }

    public Short getGruDisc() {
        return gruDisc;
    }

    public void setGruDisc(Short gruDisc) {
        this.gruDisc = gruDisc;
    }

    public String getNrSala() {
        return nrSala;
    }

    public void setNrSala(String nrSala) {
        this.nrSala = nrSala;
    }

    public Short getLibNead() {
        return libNead;
    }

    public void setLibNead(Short libNead) {
        this.libNead = libNead;
    }

    public Short getTipPres() {
        return tipPres;
    }

    public void setTipPres(Short tipPres) {
        this.tipPres = tipPres;
    }

    public Short getTriLeti() {
        return triLeti;
    }

    public void setTriLeti(Short triLeti) {
        this.triLeti = triLeti;
    }

    public Short getSeqOfem() {
        return seqOfem;
    }

    public void setSeqOfem(Short seqOfem) {
        this.seqOfem = seqOfem;
    }

    public Integer getDiscAnt() {
        return discAnt;
    }

    public void setDiscAnt(Integer discAnt) {
        this.discAnt = discAnt;
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
        if (!(object instanceof TurmaDisciplina)) {
            return false;
        }
        TurmaDisciplina other = (TurmaDisciplina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.TurmaDisciplina[ id=" + id + " ]";
    }

}
