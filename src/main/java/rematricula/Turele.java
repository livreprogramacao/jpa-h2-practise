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
    @NamedQuery(name = "Turele.findAll", query = "SELECT t FROM Turele t"),
    @NamedQuery(name = "Turele.findByCodElet", query = "SELECT t FROM Turele t WHERE t.codElet = :codElet"),
    @NamedQuery(name = "Turele.findByCodInst", query = "SELECT t FROM Turele t WHERE t.codInst = :codInst"),
    @NamedQuery(name = "Turele.findByCodTurm", query = "SELECT t FROM Turele t WHERE t.codTurm = :codTurm"),
    @NamedQuery(name = "Turele.findByCodDisc", query = "SELECT t FROM Turele t WHERE t.codDisc = :codDisc"),
    @NamedQuery(name = "Turele.findByDiaSema", query = "SELECT t FROM Turele t WHERE t.diaSema = :diaSema"),
    @NamedQuery(name = "Turele.findBySeqAula", query = "SELECT t FROM Turele t WHERE t.seqAula = :seqAula"),
    @NamedQuery(name = "Turele.findByAnoLeti", query = "SELECT t FROM Turele t WHERE t.anoLeti = :anoLeti"),
    @NamedQuery(name = "Turele.findBySemLeti", query = "SELECT t FROM Turele t WHERE t.semLeti = :semLeti"),
    @NamedQuery(name = "Turele.findByCodCurs", query = "SELECT t FROM Turele t WHERE t.codCurs = :codCurs"),
    @NamedQuery(name = "Turele.findByCodHabi", query = "SELECT t FROM Turele t WHERE t.codHabi = :codHabi"),
    @NamedQuery(name = "Turele.findBySerie", query = "SELECT t FROM Turele t WHERE t.serie = :serie"),
    @NamedQuery(name = "Turele.findByPeriodo", query = "SELECT t FROM Turele t WHERE t.periodo = :periodo"),
    @NamedQuery(name = "Turele.findByHoraIni", query = "SELECT t FROM Turele t WHERE t.horaIni = :horaIni"),
    @NamedQuery(name = "Turele.findByCargHor", query = "SELECT t FROM Turele t WHERE t.cargHor = :cargHor"),
    @NamedQuery(name = "Turele.findByQtdCred", query = "SELECT t FROM Turele t WHERE t.qtdCred = :qtdCred"),
    @NamedQuery(name = "Turele.findByTipoTur", query = "SELECT t FROM Turele t WHERE t.tipoTur = :tipoTur")})
public class Turele implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "COD_ELET")
    private Integer codElet;
    @Column(name = "COD_INST")
    private Short codInst;
    @Column(name = "COD_TURM")
    private Integer codTurm;
    @Column(name = "COD_DISC")
    private Short codDisc;
    @Column(name = "DIA_SEMA")
    private Short diaSema;
    @Column(name = "SEQ_AULA")
    private Short seqAula;
    @Column(name = "ANO_LETI")
    private Short anoLeti;
    @Column(name = "SEM_LETI")
    private Short semLeti;
    @Column(name = "COD_CURS")
    private Short codCurs;
    @Column(name = "COD_HABI")
    private Short codHabi;
    private Short serie;
    private Short periodo;
    @Column(name = "HORA_INI")
    private Short horaIni;
    @Column(name = "CARG_HOR")
    private Short cargHor;
    @Column(name = "QTD_CRED")
    private Short qtdCred;
    @Column(name = "TIPO_TUR")
    private Short tipoTur;

    public Turele() {
    }

    public Turele(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public Integer getCodElet() {
        return codElet;
    }

    public void setCodElet(Integer codElet) {
        this.codElet = codElet;
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

    public Short getDiaSema() {
        return diaSema;
    }

    public void setDiaSema(Short diaSema) {
        this.diaSema = diaSema;
    }

    public Short getSeqAula() {
        return seqAula;
    }

    public void setSeqAula(Short seqAula) {
        this.seqAula = seqAula;
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

    public Short getSerie() {
        return serie;
    }

    public void setSerie(Short serie) {
        this.serie = serie;
    }

    public Short getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Short periodo) {
        this.periodo = periodo;
    }

    public Short getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(Short horaIni) {
        this.horaIni = horaIni;
    }

    public Short getCargHor() {
        return cargHor;
    }

    public void setCargHor(Short cargHor) {
        this.cargHor = cargHor;
    }

    public Short getQtdCred() {
        return qtdCred;
    }

    public void setQtdCred(Short qtdCred) {
        this.qtdCred = qtdCred;
    }

    public Short getTipoTur() {
        return tipoTur;
    }

    public void setTipoTur(Short tipoTur) {
        this.tipoTur = tipoTur;
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
        if (!(object instanceof Turele)) {
            return false;
        }
        Turele other = (Turele) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Turele[ id=" + id + " ]";
    }

}
