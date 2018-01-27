/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rematricula;

import java.io.Serializable;
import java.math.BigDecimal;
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
    @NamedQuery(name = "Cursos.findAll", query = "SELECT c FROM Cursos c"),
    @NamedQuery(name = "Cursos.findByCodEmpr", query = "SELECT c FROM Cursos c WHERE c.codEmpr = :codEmpr"),
    @NamedQuery(name = "Cursos.findByCodCurs", query = "SELECT c FROM Cursos c WHERE c.codCurs = :codCurs"),
    @NamedQuery(name = "Cursos.findByDesCurs", query = "SELECT c FROM Cursos c WHERE c.desCurs = :desCurs"),
    @NamedQuery(name = "Cursos.findByDesCur2", query = "SELECT c FROM Cursos c WHERE c.desCur2 = :desCur2"),
    @NamedQuery(name = "Cursos.findByAbrCurs", query = "SELECT c FROM Cursos c WHERE c.abrCurs = :abrCurs"),
    @NamedQuery(name = "Cursos.findBySitCurs", query = "SELECT c FROM Cursos c WHERE c.sitCurs = :sitCurs"),
    @NamedQuery(name = "Cursos.findByCodCent", query = "SELECT c FROM Cursos c WHERE c.codCent = :codCent"),
    @NamedQuery(name = "Cursos.findByDesCur3", query = "SELECT c FROM Cursos c WHERE c.desCur3 = :desCur3"),
    @NamedQuery(name = "Cursos.findByDesCur4", query = "SELECT c FROM Cursos c WHERE c.desCur4 = :desCur4"),
    @NamedQuery(name = "Cursos.findByPerceSp", query = "SELECT c FROM Cursos c WHERE c.perceSp = :perceSp"),
    @NamedQuery(name = "Cursos.findByTipoCur", query = "SELECT c FROM Cursos c WHERE c.tipoCur = :tipoCur"),
    @NamedQuery(name = "Cursos.findByCentCus", query = "SELECT c FROM Cursos c WHERE c.centCus = :centCus"),
    @NamedQuery(name = "Cursos.findByTipoReg", query = "SELECT c FROM Cursos c WHERE c.tipoReg = :tipoReg"),
    @NamedQuery(name = "Cursos.findByAreaCur", query = "SELECT c FROM Cursos c WHERE c.areaCur = :areaCur"),
    @NamedQuery(name = "Cursos.findByCursAnt", query = "SELECT c FROM Cursos c WHERE c.cursAnt = :cursAnt"),
    @NamedQuery(name = "Cursos.findByCursEad", query = "SELECT c FROM Cursos c WHERE c.cursEad = :cursEad"),
    @NamedQuery(name = "Cursos.findByObjEad", query = "SELECT c FROM Cursos c WHERE c.objEad = :objEad"),
    @NamedQuery(name = "Cursos.findByPubEad", query = "SELECT c FROM Cursos c WHERE c.pubEad = :pubEad"),
    @NamedQuery(name = "Cursos.findByDocNesc", query = "SELECT c FROM Cursos c WHERE c.docNesc = :docNesc"),
    @NamedQuery(name = "Cursos.findByPreReq", query = "SELECT c FROM Cursos c WHERE c.preReq = :preReq"),
    @NamedQuery(name = "Cursos.findByDiscAmb", query = "SELECT c FROM Cursos c WHERE c.discAmb = :discAmb"),
    @NamedQuery(name = "Cursos.findByCodCurUnf", query = "SELECT c FROM Cursos c WHERE c.codCurUnf = :codCurUnf"),
    @NamedQuery(name = "Cursos.findByDtiAula", query = "SELECT c FROM Cursos c WHERE c.dtiAula = :dtiAula"),
    @NamedQuery(name = "Cursos.findByDtfAula", query = "SELECT c FROM Cursos c WHERE c.dtfAula = :dtfAula"),
    @NamedQuery(name = "Cursos.findByCursUnf2", query = "SELECT c FROM Cursos c WHERE c.cursUnf2 = :cursUnf2"),
    @NamedQuery(name = "Cursos.findByCursUnf3", query = "SELECT c FROM Cursos c WHERE c.cursUnf3 = :cursUnf3"),
    @NamedQuery(name = "Cursos.findBySobrCur", query = "SELECT c FROM Cursos c WHERE c.sobrCur = :sobrCur"),
    @NamedQuery(name = "Cursos.findByMercTra", query = "SELECT c FROM Cursos c WHERE c.mercTra = :mercTra"),
    @NamedQuery(name = "Cursos.findByCodPlanVes", query = "SELECT c FROM Cursos c WHERE c.codPlanVes = :codPlanVes"),
    @NamedQuery(name = "Cursos.findByInfComp", query = "SELECT c FROM Cursos c WHERE c.infComp = :infComp"),
    @NamedQuery(name = "Cursos.findByCursR2", query = "SELECT c FROM Cursos c WHERE c.cursR2 = :cursR2"),
    @NamedQuery(name = "Cursos.findByCcurPron", query = "SELECT c FROM Cursos c WHERE c.ccurPron = :ccurPron"),
    @NamedQuery(name = "Cursos.findByDescMkt", query = "SELECT c FROM Cursos c WHERE c.descMkt = :descMkt"),
    @NamedQuery(name = "Cursos.findByOferPbl", query = "SELECT c FROM Cursos c WHERE c.oferPbl = :oferPbl"),
    @NamedQuery(name = "Cursos.findByIdSetor", query = "SELECT c FROM Cursos c WHERE c.idSetor = :idSetor"),
    @NamedQuery(name = "Cursos.findByCodMigr", query = "SELECT c FROM Cursos c WHERE c.codMigr = :codMigr"),
    @NamedQuery(name = "Cursos.findByAtLegal", query = "SELECT c FROM Cursos c WHERE c.atLegal = :atLegal"),
    @NamedQuery(name = "Cursos.findByDuraCurMkt", query = "SELECT c FROM Cursos c WHERE c.duraCurMkt = :duraCurMkt")})
public class Cursos implements Serializable {

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
    @Size(max = 60)
    @Column(name = "DES_CURS", length = 60)
    private String desCurs;
    @Size(max = 100)
    @Column(name = "DES_CUR2", length = 100)
    private String desCur2;
    @Size(max = 10)
    @Column(name = "ABR_CURS", length = 10)
    private String abrCurs;
    @Column(name = "SIT_CURS")
    private Short sitCurs;
    @Column(name = "COD_CENT")
    private Short codCent;
    @Size(max = 100)
    @Column(name = "DES_CUR3", length = 100)
    private String desCur3;
    @Size(max = 350)
    @Column(name = "DES_CUR4", length = 350)
    private String desCur4;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PERCE_SP", precision = 4, scale = 2)
    private BigDecimal perceSp;
    @Column(name = "TIPO_CUR")
    private Short tipoCur;
    @Size(max = 150)
    @Column(name = "CENT_CUS", length = 150)
    private String centCus;
    @Column(name = "TIPO_REG")
    private Short tipoReg;
    @Size(max = 100)
    @Column(name = "AREA_CUR", length = 100)
    private String areaCur;
    @Column(name = "CURS_ANT")
    private Short cursAnt;
    @Lob
    @Column(name = "CONT_EAD")
    private String contEad;
    @Column(name = "CURS_EAD")
    private Short cursEad;
    @Size(max = 4000)
    @Column(name = "OBJ_EAD", length = 4000)
    private String objEad;
    @Size(max = 1000)
    @Column(name = "PUB_EAD", length = 1000)
    private String pubEad;
    @Size(max = 1000)
    @Column(name = "DOC_NESC", length = 1000)
    private String docNesc;
    @Size(max = 3000)
    @Column(name = "PRE_REQ", length = 3000)
    private String preReq;
    @Column(name = "DISC_AMB")
    private Integer discAmb;
    @Column(name = "COD_CUR_UNF")
    private Short codCurUnf;
    @Column(name = "DTI_AULA")
    @Temporal(TemporalType.DATE)
    private Date dtiAula;
    @Column(name = "DTF_AULA")
    @Temporal(TemporalType.DATE)
    private Date dtfAula;
    @Column(name = "CURS_UNF2")
    private Short cursUnf2;
    @Column(name = "CURS_UNF3")
    private Short cursUnf3;
    @Size(max = 3000)
    @Column(name = "SOBR_CUR", length = 3000)
    private String sobrCur;
    @Size(max = 3000)
    @Column(name = "MERC_TRA", length = 3000)
    private String mercTra;
    @Column(name = "COD_PLAN_VES")
    private Short codPlanVes;
    @Size(max = 3000)
    @Column(name = "INF_COMP", length = 3000)
    private String infComp;
    @Column(name = "CURS_R2")
    private Short cursR2;
    @Column(name = "CCUR_PRON")
    private Integer ccurPron;
    @Size(max = 100)
    @Column(name = "DESC_MKT", length = 100)
    private String descMkt;
    @Column(name = "OFER_PBL")
    private Short oferPbl;
    @Column(name = "ID_SETOR")
    private Short idSetor;
    @Size(max = 30)
    @Column(name = "COD_MIGR", length = 30)
    private String codMigr;
    @Size(max = 500)
    @Column(name = "AT_LEGAL", length = 500)
    private String atLegal;
    @Column(name = "DURA_CUR_MKT")
    private Short duraCurMkt;

    public Cursos() {
    }

    public Cursos(byte[] id) {
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

    public String getDesCurs() {
        return desCurs;
    }

    public void setDesCurs(String desCurs) {
        this.desCurs = desCurs;
    }

    public String getDesCur2() {
        return desCur2;
    }

    public void setDesCur2(String desCur2) {
        this.desCur2 = desCur2;
    }

    public String getAbrCurs() {
        return abrCurs;
    }

    public void setAbrCurs(String abrCurs) {
        this.abrCurs = abrCurs;
    }

    public Short getSitCurs() {
        return sitCurs;
    }

    public void setSitCurs(Short sitCurs) {
        this.sitCurs = sitCurs;
    }

    public Short getCodCent() {
        return codCent;
    }

    public void setCodCent(Short codCent) {
        this.codCent = codCent;
    }

    public String getDesCur3() {
        return desCur3;
    }

    public void setDesCur3(String desCur3) {
        this.desCur3 = desCur3;
    }

    public String getDesCur4() {
        return desCur4;
    }

    public void setDesCur4(String desCur4) {
        this.desCur4 = desCur4;
    }

    public BigDecimal getPerceSp() {
        return perceSp;
    }

    public void setPerceSp(BigDecimal perceSp) {
        this.perceSp = perceSp;
    }

    public Short getTipoCur() {
        return tipoCur;
    }

    public void setTipoCur(Short tipoCur) {
        this.tipoCur = tipoCur;
    }

    public String getCentCus() {
        return centCus;
    }

    public void setCentCus(String centCus) {
        this.centCus = centCus;
    }

    public Short getTipoReg() {
        return tipoReg;
    }

    public void setTipoReg(Short tipoReg) {
        this.tipoReg = tipoReg;
    }

    public String getAreaCur() {
        return areaCur;
    }

    public void setAreaCur(String areaCur) {
        this.areaCur = areaCur;
    }

    public Short getCursAnt() {
        return cursAnt;
    }

    public void setCursAnt(Short cursAnt) {
        this.cursAnt = cursAnt;
    }

    public String getContEad() {
        return contEad;
    }

    public void setContEad(String contEad) {
        this.contEad = contEad;
    }

    public Short getCursEad() {
        return cursEad;
    }

    public void setCursEad(Short cursEad) {
        this.cursEad = cursEad;
    }

    public String getObjEad() {
        return objEad;
    }

    public void setObjEad(String objEad) {
        this.objEad = objEad;
    }

    public String getPubEad() {
        return pubEad;
    }

    public void setPubEad(String pubEad) {
        this.pubEad = pubEad;
    }

    public String getDocNesc() {
        return docNesc;
    }

    public void setDocNesc(String docNesc) {
        this.docNesc = docNesc;
    }

    public String getPreReq() {
        return preReq;
    }

    public void setPreReq(String preReq) {
        this.preReq = preReq;
    }

    public Integer getDiscAmb() {
        return discAmb;
    }

    public void setDiscAmb(Integer discAmb) {
        this.discAmb = discAmb;
    }

    public Short getCodCurUnf() {
        return codCurUnf;
    }

    public void setCodCurUnf(Short codCurUnf) {
        this.codCurUnf = codCurUnf;
    }

    public Date getDtiAula() {
        return dtiAula;
    }

    public void setDtiAula(Date dtiAula) {
        this.dtiAula = dtiAula;
    }

    public Date getDtfAula() {
        return dtfAula;
    }

    public void setDtfAula(Date dtfAula) {
        this.dtfAula = dtfAula;
    }

    public Short getCursUnf2() {
        return cursUnf2;
    }

    public void setCursUnf2(Short cursUnf2) {
        this.cursUnf2 = cursUnf2;
    }

    public Short getCursUnf3() {
        return cursUnf3;
    }

    public void setCursUnf3(Short cursUnf3) {
        this.cursUnf3 = cursUnf3;
    }

    public String getSobrCur() {
        return sobrCur;
    }

    public void setSobrCur(String sobrCur) {
        this.sobrCur = sobrCur;
    }

    public String getMercTra() {
        return mercTra;
    }

    public void setMercTra(String mercTra) {
        this.mercTra = mercTra;
    }

    public Short getCodPlanVes() {
        return codPlanVes;
    }

    public void setCodPlanVes(Short codPlanVes) {
        this.codPlanVes = codPlanVes;
    }

    public String getInfComp() {
        return infComp;
    }

    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }

    public Short getCursR2() {
        return cursR2;
    }

    public void setCursR2(Short cursR2) {
        this.cursR2 = cursR2;
    }

    public Integer getCcurPron() {
        return ccurPron;
    }

    public void setCcurPron(Integer ccurPron) {
        this.ccurPron = ccurPron;
    }

    public String getDescMkt() {
        return descMkt;
    }

    public void setDescMkt(String descMkt) {
        this.descMkt = descMkt;
    }

    public Short getOferPbl() {
        return oferPbl;
    }

    public void setOferPbl(Short oferPbl) {
        this.oferPbl = oferPbl;
    }

    public Short getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(Short idSetor) {
        this.idSetor = idSetor;
    }

    public String getCodMigr() {
        return codMigr;
    }

    public void setCodMigr(String codMigr) {
        this.codMigr = codMigr;
    }

    public String getAtLegal() {
        return atLegal;
    }

    public void setAtLegal(String atLegal) {
        this.atLegal = atLegal;
    }

    public Short getDuraCurMkt() {
        return duraCurMkt;
    }

    public void setDuraCurMkt(Short duraCurMkt) {
        this.duraCurMkt = duraCurMkt;
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
        if (!(object instanceof Cursos)) {
            return false;
        }
        Cursos other = (Cursos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Cursos[ id=" + id + " ]";
    }

}
