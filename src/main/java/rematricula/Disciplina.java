/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rematricula;

import java.io.Serializable;
import java.math.BigDecimal;
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
    @NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d"),
    @NamedQuery(name = "Disciplina.findByCodEmpr", query = "SELECT d FROM Disciplina d WHERE d.codEmpr = :codEmpr"),
    @NamedQuery(name = "Disciplina.findByCodDisc", query = "SELECT d FROM Disciplina d WHERE d.codDisc = :codDisc"),
    @NamedQuery(name = "Disciplina.findByDesDisc", query = "SELECT d FROM Disciplina d WHERE d.desDisc = :desDisc"),
    @NamedQuery(name = "Disciplina.findByAbrDisc", query = "SELECT d FROM Disciplina d WHERE d.abrDisc = :abrDisc"),
    @NamedQuery(name = "Disciplina.findByCodHist", query = "SELECT d FROM Disciplina d WHERE d.codHist = :codHist"),
    @NamedQuery(name = "Disciplina.findByCodLeci", query = "SELECT d FROM Disciplina d WHERE d.codLeci = :codLeci"),
    @NamedQuery(name = "Disciplina.findByCurResp", query = "SELECT d FROM Disciplina d WHERE d.curResp = :curResp"),
    @NamedQuery(name = "Disciplina.findByCargHor", query = "SELECT d FROM Disciplina d WHERE d.cargHor = :cargHor"),
    @NamedQuery(name = "Disciplina.findByTipDisc", query = "SELECT d FROM Disciplina d WHERE d.tipDisc = :tipDisc"),
    @NamedQuery(name = "Disciplina.findByContFal", query = "SELECT d FROM Disciplina d WHERE d.contFal = :contFal"),
    @NamedQuery(name = "Disciplina.findByTipoAva", query = "SELECT d FROM Disciplina d WHERE d.tipoAva = :tipoAva"),
    @NamedQuery(name = "Disciplina.findByParceOl", query = "SELECT d FROM Disciplina d WHERE d.parceOl = :parceOl"),
    @NamedQuery(name = "Disciplina.findByTipCarg", query = "SELECT d FROM Disciplina d WHERE d.tipCarg = :tipCarg"),
    @NamedQuery(name = "Disciplina.findByQtdAula", query = "SELECT d FROM Disciplina d WHERE d.qtdAula = :qtdAula"),
    @NamedQuery(name = "Disciplina.findByQtdCred", query = "SELECT d FROM Disciplina d WHERE d.qtdCred = :qtdCred"),
    @NamedQuery(name = "Disciplina.findBySitDisc", query = "SELECT d FROM Disciplina d WHERE d.sitDisc = :sitDisc"),
    @NamedQuery(name = "Disciplina.findByFonetica", query = "SELECT d FROM Disciplina d WHERE d.fonetica = :fonetica"),
    @NamedQuery(name = "Disciplina.findByTipUncd", query = "SELECT d FROM Disciplina d WHERE d.tipUncd = :tipUncd"),
    @NamedQuery(name = "Disciplina.findByTipoCv", query = "SELECT d FROM Disciplina d WHERE d.tipoCv = :tipoCv"),
    @NamedQuery(name = "Disciplina.findByWebEstg", query = "SELECT d FROM Disciplina d WHERE d.webEstg = :webEstg"),
    @NamedQuery(name = "Disciplina.findByCodMigr", query = "SELECT d FROM Disciplina d WHERE d.codMigr = :codMigr"),
    @NamedQuery(name = "Disciplina.findByNomeComp", query = "SELECT d FROM Disciplina d WHERE d.nomeComp = :nomeComp"),
    @NamedQuery(name = "Disciplina.findByProfRes", query = "SELECT d FROM Disciplina d WHERE d.profRes = :profRes"),
    @NamedQuery(name = "Disciplina.findByProfRpe", query = "SELECT d FROM Disciplina d WHERE d.profRpe = :profRpe"),
    @NamedQuery(name = "Disciplina.findByProfRqp", query = "SELECT d FROM Disciplina d WHERE d.profRqp = :profRqp"),
    @NamedQuery(name = "Disciplina.findByProfRro", query = "SELECT d FROM Disciplina d WHERE d.profRro = :profRro"),
    @NamedQuery(name = "Disciplina.findByDiscPri", query = "SELECT d FROM Disciplina d WHERE d.discPri = :discPri"),
    @NamedQuery(name = "Disciplina.findByProfRrt", query = "SELECT d FROM Disciplina d WHERE d.profRrt = :profRrt"),
    @NamedQuery(name = "Disciplina.findByDiscSbb", query = "SELECT d FROM Disciplina d WHERE d.discSbb = :discSbb"),
    @NamedQuery(name = "Disciplina.findByTipPbl", query = "SELECT d FROM Disciplina d WHERE d.tipPbl = :tipPbl"),
    @NamedQuery(name = "Disciplina.findByOrdhist", query = "SELECT d FROM Disciplina d WHERE d.ordhist = :ordhist")})
public class Disciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "COD_EMPR")
    private Short codEmpr;
    @Column(name = "COD_DISC")
    private Integer codDisc;
    @Size(max = 80)
    @Column(name = "DES_DISC", length = 80)
    private String desDisc;
    @Size(max = 20)
    @Column(name = "ABR_DISC", length = 20)
    private String abrDisc;
    @Column(name = "COD_HIST")
    private Short codHist;
    @Column(name = "COD_LECI")
    private Short codLeci;
    @Column(name = "CUR_RESP")
    private Short curResp;
    @Column(name = "CARG_HOR")
    private Short cargHor;
    @Column(name = "TIP_DISC")
    private Short tipDisc;
    @Column(name = "CONT_FAL")
    private Short contFal;
    @Column(name = "TIPO_AVA")
    private Short tipoAva;
    @Column(name = "PARCE_OL")
    private Short parceOl;
    @Column(name = "TIP_CARG")
    private Short tipCarg;
    @Column(name = "QTD_AULA")
    private Short qtdAula;
    @Column(name = "QTD_CRED")
    private Short qtdCred;
    @Column(name = "SIT_DISC")
    private Short sitDisc;
    @Size(max = 100)
    @Column(length = 100)
    private String fonetica;
    @Column(name = "TIP_UNCD")
    private Short tipUncd;
    @Column(name = "TIPO_CV")
    private Short tipoCv;
    @Column(name = "WEB_ESTG")
    private Short webEstg;
    @Size(max = 10)
    @Column(name = "COD_MIGR", length = 10)
    private String codMigr;
    @Size(max = 200)
    @Column(name = "NOME_COMP", length = 200)
    private String nomeComp;
    @Size(max = 20)
    @Column(name = "PROF_RES", length = 20)
    private String profRes;
    @Size(max = 20)
    @Column(name = "PROF_RPE", length = 20)
    private String profRpe;
    @Size(max = 20)
    @Column(name = "PROF_RQP", length = 20)
    private String profRqp;
    @Size(max = 20)
    @Column(name = "PROF_RRO", length = 20)
    private String profRro;
    @Column(name = "DISC_PRI")
    private Short discPri;
    @Size(max = 20)
    @Column(name = "PROF_RRT", length = 20)
    private String profRrt;
    @Column(name = "DISC_SBB")
    private Short discSbb;
    @Column(name = "TIP_PBL")
    private Short tipPbl;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 65535, scale = 32767)
    private BigDecimal ordhist;

    public Disciplina() {
    }

    public Disciplina(byte[] id) {
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

    public Integer getCodDisc() {
        return codDisc;
    }

    public void setCodDisc(Integer codDisc) {
        this.codDisc = codDisc;
    }

    public String getDesDisc() {
        return desDisc;
    }

    public void setDesDisc(String desDisc) {
        this.desDisc = desDisc;
    }

    public String getAbrDisc() {
        return abrDisc;
    }

    public void setAbrDisc(String abrDisc) {
        this.abrDisc = abrDisc;
    }

    public Short getCodHist() {
        return codHist;
    }

    public void setCodHist(Short codHist) {
        this.codHist = codHist;
    }

    public Short getCodLeci() {
        return codLeci;
    }

    public void setCodLeci(Short codLeci) {
        this.codLeci = codLeci;
    }

    public Short getCurResp() {
        return curResp;
    }

    public void setCurResp(Short curResp) {
        this.curResp = curResp;
    }

    public Short getCargHor() {
        return cargHor;
    }

    public void setCargHor(Short cargHor) {
        this.cargHor = cargHor;
    }

    public Short getTipDisc() {
        return tipDisc;
    }

    public void setTipDisc(Short tipDisc) {
        this.tipDisc = tipDisc;
    }

    public Short getContFal() {
        return contFal;
    }

    public void setContFal(Short contFal) {
        this.contFal = contFal;
    }

    public Short getTipoAva() {
        return tipoAva;
    }

    public void setTipoAva(Short tipoAva) {
        this.tipoAva = tipoAva;
    }

    public Short getParceOl() {
        return parceOl;
    }

    public void setParceOl(Short parceOl) {
        this.parceOl = parceOl;
    }

    public Short getTipCarg() {
        return tipCarg;
    }

    public void setTipCarg(Short tipCarg) {
        this.tipCarg = tipCarg;
    }

    public Short getQtdAula() {
        return qtdAula;
    }

    public void setQtdAula(Short qtdAula) {
        this.qtdAula = qtdAula;
    }

    public Short getQtdCred() {
        return qtdCred;
    }

    public void setQtdCred(Short qtdCred) {
        this.qtdCred = qtdCred;
    }

    public Short getSitDisc() {
        return sitDisc;
    }

    public void setSitDisc(Short sitDisc) {
        this.sitDisc = sitDisc;
    }

    public String getFonetica() {
        return fonetica;
    }

    public void setFonetica(String fonetica) {
        this.fonetica = fonetica;
    }

    public Short getTipUncd() {
        return tipUncd;
    }

    public void setTipUncd(Short tipUncd) {
        this.tipUncd = tipUncd;
    }

    public Short getTipoCv() {
        return tipoCv;
    }

    public void setTipoCv(Short tipoCv) {
        this.tipoCv = tipoCv;
    }

    public Short getWebEstg() {
        return webEstg;
    }

    public void setWebEstg(Short webEstg) {
        this.webEstg = webEstg;
    }

    public String getCodMigr() {
        return codMigr;
    }

    public void setCodMigr(String codMigr) {
        this.codMigr = codMigr;
    }

    public String getNomeComp() {
        return nomeComp;
    }

    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    public String getProfRes() {
        return profRes;
    }

    public void setProfRes(String profRes) {
        this.profRes = profRes;
    }

    public String getProfRpe() {
        return profRpe;
    }

    public void setProfRpe(String profRpe) {
        this.profRpe = profRpe;
    }

    public String getProfRqp() {
        return profRqp;
    }

    public void setProfRqp(String profRqp) {
        this.profRqp = profRqp;
    }

    public String getProfRro() {
        return profRro;
    }

    public void setProfRro(String profRro) {
        this.profRro = profRro;
    }

    public Short getDiscPri() {
        return discPri;
    }

    public void setDiscPri(Short discPri) {
        this.discPri = discPri;
    }

    public String getProfRrt() {
        return profRrt;
    }

    public void setProfRrt(String profRrt) {
        this.profRrt = profRrt;
    }

    public Short getDiscSbb() {
        return discSbb;
    }

    public void setDiscSbb(Short discSbb) {
        this.discSbb = discSbb;
    }

    public Short getTipPbl() {
        return tipPbl;
    }

    public void setTipPbl(Short tipPbl) {
        this.tipPbl = tipPbl;
    }

    public BigDecimal getOrdhist() {
        return ordhist;
    }

    public void setOrdhist(BigDecimal ordhist) {
        this.ordhist = ordhist;
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
        if (!(object instanceof Disciplina)) {
            return false;
        }
        Disciplina other = (Disciplina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Disciplina[ id=" + id + " ]";
    }

}
