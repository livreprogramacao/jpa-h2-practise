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
@Table(name = "DISALU", catalog = "rematricula-db", schema = "ACD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlunoDisciplina.findAll", query = "SELECT a FROM AlunoDisciplina a"),
    @NamedQuery(name = "AlunoDisciplina.findByCodInst", query = "SELECT a FROM AlunoDisciplina a WHERE a.codInst = :codInst"),
    @NamedQuery(name = "AlunoDisciplina.findByRgmAlun", query = "SELECT a FROM AlunoDisciplina a WHERE a.rgmAlun = :rgmAlun"),
    @NamedQuery(name = "AlunoDisciplina.findBySeqDisc", query = "SELECT a FROM AlunoDisciplina a WHERE a.seqDisc = :seqDisc"),
    @NamedQuery(name = "AlunoDisciplina.findByInsCurs", query = "SELECT a FROM AlunoDisciplina a WHERE a.insCurs = :insCurs"),
    @NamedQuery(name = "AlunoDisciplina.findByTurCurs", query = "SELECT a FROM AlunoDisciplina a WHERE a.turCurs = :turCurs"),
    @NamedQuery(name = "AlunoDisciplina.findByCodDisc", query = "SELECT a FROM AlunoDisciplina a WHERE a.codDisc = :codDisc"),
    @NamedQuery(name = "AlunoDisciplina.findByDisEqui", query = "SELECT a FROM AlunoDisciplina a WHERE a.disEqui = :disEqui"),
    @NamedQuery(name = "AlunoDisciplina.findByDiaSema", query = "SELECT a FROM AlunoDisciplina a WHERE a.diaSema = :diaSema"),
    @NamedQuery(name = "AlunoDisciplina.findBySeqAula", query = "SELECT a FROM AlunoDisciplina a WHERE a.seqAula = :seqAula"),
    @NamedQuery(name = "AlunoDisciplina.findByHorario", query = "SELECT a FROM AlunoDisciplina a WHERE a.horario = :horario"),
    @NamedQuery(name = "AlunoDisciplina.findBySerie", query = "SELECT a FROM AlunoDisciplina a WHERE a.serie = :serie"),
    @NamedQuery(name = "AlunoDisciplina.findByCargHor", query = "SELECT a FROM AlunoDisciplina a WHERE a.cargHor = :cargHor"),
    @NamedQuery(name = "AlunoDisciplina.findByQtdCred", query = "SELECT a FROM AlunoDisciplina a WHERE a.qtdCred = :qtdCred"),
    @NamedQuery(name = "AlunoDisciplina.findByGrupEqu", query = "SELECT a FROM AlunoDisciplina a WHERE a.grupEqu = :grupEqu"),
    @NamedQuery(name = "AlunoDisciplina.findByDiscGra", query = "SELECT a FROM AlunoDisciplina a WHERE a.discGra = :discGra"),
    @NamedQuery(name = "AlunoDisciplina.findByPreRequ", query = "SELECT a FROM AlunoDisciplina a WHERE a.preRequ = :preRequ"),
    @NamedQuery(name = "AlunoDisciplina.findByTipoDis", query = "SELECT a FROM AlunoDisciplina a WHERE a.tipoDis = :tipoDis"),
    @NamedQuery(name = "AlunoDisciplina.findByGruDisc", query = "SELECT a FROM AlunoDisciplina a WHERE a.gruDisc = :gruDisc"),
    @NamedQuery(name = "AlunoDisciplina.findByDataCad", query = "SELECT a FROM AlunoDisciplina a WHERE a.dataCad = :dataCad"),
    @NamedQuery(name = "AlunoDisciplina.findByCodElet", query = "SELECT a FROM AlunoDisciplina a WHERE a.codElet = :codElet"),
    @NamedQuery(name = "AlunoDisciplina.findByTipPres", query = "SELECT a FROM AlunoDisciplina a WHERE a.tipPres = :tipPres"),
    @NamedQuery(name = "AlunoDisciplina.findByDiscOpt", query = "SELECT a FROM AlunoDisciplina a WHERE a.discOpt = :discOpt")})
public class AlunoDisciplina implements Serializable {

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
    @Column(name = "INS_CURS")
    private Short insCurs;
    @Column(name = "TUR_CURS")
    private Integer turCurs;
    @Column(name = "COD_DISC")
    private Short codDisc;
    @Column(name = "DIS_EQUI")
    private Short disEqui;
    @Column(name = "DIA_SEMA")
    private Short diaSema;
    @Column(name = "SEQ_AULA")
    private Short seqAula;
    private Short horario;
    private Short serie;
    @Column(name = "CARG_HOR")
    private Short cargHor;
    @Column(name = "QTD_CRED")
    private Short qtdCred;
    @Column(name = "GRUP_EQU")
    private Short grupEqu;
    @Column(name = "DISC_GRA")
    private Short discGra;
    @Size(max = 100)
    @Column(name = "PRE_REQU", length = 100)
    private String preRequ;
    @Column(name = "TIPO_DIS")
    private Short tipoDis;
    @Column(name = "GRU_DISC")
    private Short gruDisc;
    @Column(name = "DATA_CAD")
    @Temporal(TemporalType.DATE)
    private Date dataCad;
    @Column(name = "COD_ELET")
    private Integer codElet;
    @Column(name = "TIP_PRES")
    private Short tipPres;
    @Size(max = 100)
    @Column(name = "DISC_OPT", length = 100)
    private String discOpt;

    public AlunoDisciplina() {
    }

    public AlunoDisciplina(byte[] id) {
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

    public Short getInsCurs() {
        return insCurs;
    }

    public void setInsCurs(Short insCurs) {
        this.insCurs = insCurs;
    }

    public Integer getTurCurs() {
        return turCurs;
    }

    public void setTurCurs(Integer turCurs) {
        this.turCurs = turCurs;
    }

    public Short getCodDisc() {
        return codDisc;
    }

    public void setCodDisc(Short codDisc) {
        this.codDisc = codDisc;
    }

    public Short getDisEqui() {
        return disEqui;
    }

    public void setDisEqui(Short disEqui) {
        this.disEqui = disEqui;
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

    public Short getHorario() {
        return horario;
    }

    public void setHorario(Short horario) {
        this.horario = horario;
    }

    public Short getSerie() {
        return serie;
    }

    public void setSerie(Short serie) {
        this.serie = serie;
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

    public Short getGrupEqu() {
        return grupEqu;
    }

    public void setGrupEqu(Short grupEqu) {
        this.grupEqu = grupEqu;
    }

    public Short getDiscGra() {
        return discGra;
    }

    public void setDiscGra(Short discGra) {
        this.discGra = discGra;
    }

    public String getPreRequ() {
        return preRequ;
    }

    public void setPreRequ(String preRequ) {
        this.preRequ = preRequ;
    }

    public Short getTipoDis() {
        return tipoDis;
    }

    public void setTipoDis(Short tipoDis) {
        this.tipoDis = tipoDis;
    }

    public Short getGruDisc() {
        return gruDisc;
    }

    public void setGruDisc(Short gruDisc) {
        this.gruDisc = gruDisc;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public Integer getCodElet() {
        return codElet;
    }

    public void setCodElet(Integer codElet) {
        this.codElet = codElet;
    }

    public Short getTipPres() {
        return tipPres;
    }

    public void setTipPres(Short tipPres) {
        this.tipPres = tipPres;
    }

    public String getDiscOpt() {
        return discOpt;
    }

    public void setDiscOpt(String discOpt) {
        this.discOpt = discOpt;
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
        if (!(object instanceof AlunoDisciplina)) {
            return false;
        }
        AlunoDisciplina other = (AlunoDisciplina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.AlunoDisciplina[ id=" + id + " ]";
    }

}
