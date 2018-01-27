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
@Table(catalog = "rematricula-db", schema = "ACD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t"),
    @NamedQuery(name = "Turma.findByCodInst", query = "SELECT t FROM Turma t WHERE t.codInst = :codInst"),
    @NamedQuery(name = "Turma.findByCodTurm", query = "SELECT t FROM Turma t WHERE t.codTurm = :codTurm"),
    @NamedQuery(name = "Turma.findByAnoTurm", query = "SELECT t FROM Turma t WHERE t.anoTurm = :anoTurm"),
    @NamedQuery(name = "Turma.findBySemTurm", query = "SELECT t FROM Turma t WHERE t.semTurm = :semTurm"),
    @NamedQuery(name = "Turma.findByCodCurs", query = "SELECT t FROM Turma t WHERE t.codCurs = :codCurs"),
    @NamedQuery(name = "Turma.findByCodHabi", query = "SELECT t FROM Turma t WHERE t.codHabi = :codHabi"),
    @NamedQuery(name = "Turma.findBySerie", query = "SELECT t FROM Turma t WHERE t.serie = :serie"),
    @NamedQuery(name = "Turma.findByTurma", query = "SELECT t FROM Turma t WHERE t.turma = :turma"),
    @NamedQuery(name = "Turma.findByPeriodo", query = "SELECT t FROM Turma t WHERE t.periodo = :periodo"),
    @NamedQuery(name = "Turma.findByNumVaga", query = "SELECT t FROM Turma t WHERE t.numVaga = :numVaga"),
    @NamedQuery(name = "Turma.findByTipoTur", query = "SELECT t FROM Turma t WHERE t.tipoTur = :tipoTur"),
    @NamedQuery(name = "Turma.findByNrSala", query = "SELECT t FROM Turma t WHERE t.nrSala = :nrSala"),
    @NamedQuery(name = "Turma.findByNrClass", query = "SELECT t FROM Turma t WHERE t.nrClass = :nrClass"),
    @NamedQuery(name = "Turma.findByUnidade", query = "SELECT t FROM Turma t WHERE t.unidade = :unidade"),
    @NamedQuery(name = "Turma.findByCargDop", query = "SELECT t FROM Turma t WHERE t.cargDop = :cargDop"),
    @NamedQuery(name = "Turma.findByTurTran", query = "SELECT t FROM Turma t WHERE t.turTran = :turTran"),
    @NamedQuery(name = "Turma.findByTriIngr", query = "SELECT t FROM Turma t WHERE t.triIngr = :triIngr"),
    @NamedQuery(name = "Turma.findBySeqGrad", query = "SELECT t FROM Turma t WHERE t.seqGrad = :seqGrad"),
    @NamedQuery(name = "Turma.findByTurPost", query = "SELECT t FROM Turma t WHERE t.turPost = :turPost"),
    @NamedQuery(name = "Turma.findByBloMatr", query = "SELECT t FROM Turma t WHERE t.bloMatr = :bloMatr"),
    @NamedQuery(name = "Turma.findByDatInic", query = "SELECT t FROM Turma t WHERE t.datInic = :datInic"),
    @NamedQuery(name = "Turma.findByDatFina", query = "SELECT t FROM Turma t WHERE t.datFina = :datFina"),
    @NamedQuery(name = "Turma.findByIdEditpro", query = "SELECT t FROM Turma t WHERE t.idEditpro = :idEditpro")})
public class Turma implements Serializable {

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
    @Column(name = "ANO_TURM")
    private Short anoTurm;
    @Column(name = "SEM_TURM")
    private Short semTurm;
    @Column(name = "COD_CURS")
    private Short codCurs;
    @Column(name = "COD_HABI")
    private Short codHabi;
    private Short serie;
    @Size(max = 30)
    @Column(length = 30)
    private String turma;
    private Short periodo;
    @Column(name = "NUM_VAGA")
    private Short numVaga;
    @Column(name = "TIPO_TUR")
    private Short tipoTur;
    @Size(max = 150)
    @Column(name = "NR_SALA", length = 150)
    private String nrSala;
    @Column(name = "NR_CLASS")
    private Integer nrClass;
    private Short unidade;
    @Column(name = "CARG_DOP")
    private Short cargDop;
    @Column(name = "TUR_TRAN")
    private Short turTran;
    @Column(name = "TRI_INGR")
    private Short triIngr;
    @Column(name = "SEQ_GRAD")
    private Integer seqGrad;
    @Column(name = "TUR_POST")
    private Integer turPost;
    @Column(name = "BLO_MATR")
    private Short bloMatr;
    @Column(name = "DAT_INIC")
    @Temporal(TemporalType.DATE)
    private Date datInic;
    @Column(name = "DAT_FINA")
    @Temporal(TemporalType.DATE)
    private Date datFina;
    @Column(name = "ID_EDITPRO")
    private Short idEditpro;

    public Turma() {
    }

    public Turma(byte[] id) {
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

    public Short getAnoTurm() {
        return anoTurm;
    }

    public void setAnoTurm(Short anoTurm) {
        this.anoTurm = anoTurm;
    }

    public Short getSemTurm() {
        return semTurm;
    }

    public void setSemTurm(Short semTurm) {
        this.semTurm = semTurm;
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

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Short getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Short periodo) {
        this.periodo = periodo;
    }

    public Short getNumVaga() {
        return numVaga;
    }

    public void setNumVaga(Short numVaga) {
        this.numVaga = numVaga;
    }

    public Short getTipoTur() {
        return tipoTur;
    }

    public void setTipoTur(Short tipoTur) {
        this.tipoTur = tipoTur;
    }

    public String getNrSala() {
        return nrSala;
    }

    public void setNrSala(String nrSala) {
        this.nrSala = nrSala;
    }

    public Integer getNrClass() {
        return nrClass;
    }

    public void setNrClass(Integer nrClass) {
        this.nrClass = nrClass;
    }

    public Short getUnidade() {
        return unidade;
    }

    public void setUnidade(Short unidade) {
        this.unidade = unidade;
    }

    public Short getCargDop() {
        return cargDop;
    }

    public void setCargDop(Short cargDop) {
        this.cargDop = cargDop;
    }

    public Short getTurTran() {
        return turTran;
    }

    public void setTurTran(Short turTran) {
        this.turTran = turTran;
    }

    public Short getTriIngr() {
        return triIngr;
    }

    public void setTriIngr(Short triIngr) {
        this.triIngr = triIngr;
    }

    public Integer getSeqGrad() {
        return seqGrad;
    }

    public void setSeqGrad(Integer seqGrad) {
        this.seqGrad = seqGrad;
    }

    public Integer getTurPost() {
        return turPost;
    }

    public void setTurPost(Integer turPost) {
        this.turPost = turPost;
    }

    public Short getBloMatr() {
        return bloMatr;
    }

    public void setBloMatr(Short bloMatr) {
        this.bloMatr = bloMatr;
    }

    public Date getDatInic() {
        return datInic;
    }

    public void setDatInic(Date datInic) {
        this.datInic = datInic;
    }

    public Date getDatFina() {
        return datFina;
    }

    public void setDatFina(Date datFina) {
        this.datFina = datFina;
    }

    public Short getIdEditpro() {
        return idEditpro;
    }

    public void setIdEditpro(Short idEditpro) {
        this.idEditpro = idEditpro;
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
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Turma[ id=" + id + " ]";
    }

}
