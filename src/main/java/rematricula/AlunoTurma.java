/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rematricula;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fabio Santos Almeida <livre.programacao at gmail.com>
 */
@Entity
@Table(name = "TURALU", catalog = "rematricula-db", schema = "ACD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlunoTurma.findAll", query = "SELECT a FROM AlunoTurma a"),
    @NamedQuery(name = "AlunoTurma.findByCodAlun", query = "SELECT a FROM AlunoTurma a WHERE a.codAlun = :codAlun"),
    @NamedQuery(name = "AlunoTurma.findByCodInst", query = "SELECT a FROM AlunoTurma a WHERE a.codInst = :codInst"),
    @NamedQuery(name = "AlunoTurma.findByCodTurm", query = "SELECT a FROM AlunoTurma a WHERE a.codTurm = :codTurm"),
    @NamedQuery(name = "AlunoTurma.findByDatMatr", query = "SELECT a FROM AlunoTurma a WHERE a.datMatr = :datMatr"),
    @NamedQuery(name = "AlunoTurma.findBySitMatr", query = "SELECT a FROM AlunoTurma a WHERE a.sitMatr = :sitMatr"),
    @NamedQuery(name = "AlunoTurma.findByDtaSitu", query = "SELECT a FROM AlunoTurma a WHERE a.dtaSitu = :dtaSitu"),
    @NamedQuery(name = "AlunoTurma.findByDtaFreq", query = "SELECT a FROM AlunoTurma a WHERE a.dtaFreq = :dtaFreq"),
    @NamedQuery(name = "AlunoTurma.findByObservac", query = "SELECT a FROM AlunoTurma a WHERE a.observac = :observac"),
    @NamedQuery(name = "AlunoTurma.findByRgmAlun", query = "SELECT a FROM AlunoTurma a WHERE a.rgmAlun = :rgmAlun"),
    @NamedQuery(name = "AlunoTurma.findBySeqGrad", query = "SELECT a FROM AlunoTurma a WHERE a.seqGrad = :seqGrad"),
    @NamedQuery(name = "AlunoTurma.findByIdPolo", query = "SELECT a FROM AlunoTurma a WHERE a.idPolo = :idPolo"),
    @NamedQuery(name = "AlunoTurma.findByIdPolocap", query = "SELECT a FROM AlunoTurma a WHERE a.idPolocap = :idPolocap"),
    @NamedQuery(name = "AlunoTurma.findByIdTuralu", query = "SELECT a FROM AlunoTurma a WHERE a.idTuralu = :idTuralu")})
public class AlunoTurma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "COD_ALUN")
    private Long codAlun;
    @Column(name = "COD_INST")
    private Short codInst;
    @Column(name = "COD_TURM")
    private Integer codTurm;
    @Column(name = "DAT_MATR")
    @Temporal(TemporalType.DATE)
    private Date datMatr;
    @Column(name = "SIT_MATR")
    private Short sitMatr;
    @Column(name = "DTA_SITU")
    @Temporal(TemporalType.DATE)
    private Date dtaSitu;
    @Column(name = "DTA_FREQ")
    @Temporal(TemporalType.DATE)
    private Date dtaFreq;
    @Size(max = 1000)
    @Column(length = 1000)
    private String observac;
    @Column(name = "RGM_ALUN")
    private Integer rgmAlun;
    @Column(name = "SEQ_GRAD")
    private Integer seqGrad;
    @Column(name = "ID_POLO")
    private Short idPolo;
    @Column(name = "ID_POLOCAP")
    private Short idPolocap;
    @Column(name = "ID_TURALU")
    private Long idTuralu;

    public AlunoTurma() {
    }

    public AlunoTurma(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public Long getCodAlun() {
        return codAlun;
    }

    public void setCodAlun(Long codAlun) {
        this.codAlun = codAlun;
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

    public Date getDatMatr() {
        return datMatr;
    }

    public void setDatMatr(Date datMatr) {
        this.datMatr = datMatr;
    }

    public Short getSitMatr() {
        return sitMatr;
    }

    public void setSitMatr(Short sitMatr) {
        this.sitMatr = sitMatr;
    }

    public Date getDtaSitu() {
        return dtaSitu;
    }

    public void setDtaSitu(Date dtaSitu) {
        this.dtaSitu = dtaSitu;
    }

    public Date getDtaFreq() {
        return dtaFreq;
    }

    public void setDtaFreq(Date dtaFreq) {
        this.dtaFreq = dtaFreq;
    }

    public String getObservac() {
        return observac;
    }

    public void setObservac(String observac) {
        this.observac = observac;
    }

    public Integer getRgmAlun() {
        return rgmAlun;
    }

    public void setRgmAlun(Integer rgmAlun) {
        this.rgmAlun = rgmAlun;
    }

    public Integer getSeqGrad() {
        return seqGrad;
    }

    public void setSeqGrad(Integer seqGrad) {
        this.seqGrad = seqGrad;
    }

    public Short getIdPolo() {
        return idPolo;
    }

    public void setIdPolo(Short idPolo) {
        this.idPolo = idPolo;
    }

    public Short getIdPolocap() {
        return idPolocap;
    }

    public void setIdPolocap(Short idPolocap) {
        this.idPolocap = idPolocap;
    }

    public Long getIdTuralu() {
        return idTuralu;
    }

    public void setIdTuralu(Long idTuralu) {
        this.idTuralu = idTuralu;
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
        if (!(object instanceof AlunoTurma)) {
            return false;
        }
        AlunoTurma other = (AlunoTurma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.AlunoTurma[ id=" + id + " ]";
    }

}
