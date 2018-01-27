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
    @NamedQuery(name = "Campus.findAll", query = "SELECT c FROM Campus c"),
    @NamedQuery(name = "Campus.findByCodEmpr", query = "SELECT c FROM Campus c WHERE c.codEmpr = :codEmpr"),
    @NamedQuery(name = "Campus.findByCodFili", query = "SELECT c FROM Campus c WHERE c.codFili = :codFili"),
    @NamedQuery(name = "Campus.findByNomFili", query = "SELECT c FROM Campus c WHERE c.nomFili = :nomFili"),
    @NamedQuery(name = "Campus.findByCgcMf", query = "SELECT c FROM Campus c WHERE c.cgcMf = :cgcMf"),
    @NamedQuery(name = "Campus.findByInscEst", query = "SELECT c FROM Campus c WHERE c.inscEst = :inscEst"),
    @NamedQuery(name = "Campus.findByEndereco", query = "SELECT c FROM Campus c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Campus.findByBairro", query = "SELECT c FROM Campus c WHERE c.bairro = :bairro"),
    @NamedQuery(name = "Campus.findByCidade", query = "SELECT c FROM Campus c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Campus.findByEstado", query = "SELECT c FROM Campus c WHERE c.estado = :estado"),
    @NamedQuery(name = "Campus.findByCep", query = "SELECT c FROM Campus c WHERE c.cep = :cep"),
    @NamedQuery(name = "Campus.findByFone", query = "SELECT c FROM Campus c WHERE c.fone = :fone"),
    @NamedQuery(name = "Campus.findByDiretor", query = "SELECT c FROM Campus c WHERE c.diretor = :diretor"),
    @NamedQuery(name = "Campus.findByRgDir", query = "SELECT c FROM Campus c WHERE c.rgDir = :rgDir"),
    @NamedQuery(name = "Campus.findByNmSecre", query = "SELECT c FROM Campus c WHERE c.nmSecre = :nmSecre"),
    @NamedQuery(name = "Campus.findByRgSecre", query = "SELECT c FROM Campus c WHERE c.rgSecre = :rgSecre"),
    @NamedQuery(name = "Campus.findByFecLivr", query = "SELECT c FROM Campus c WHERE c.fecLivr = :fecLivr"),
    @NamedQuery(name = "Campus.findByPagLivr", query = "SELECT c FROM Campus c WHERE c.pagLivr = :pagLivr"),
    @NamedQuery(name = "Campus.findBySeqLivr", query = "SELECT c FROM Campus c WHERE c.seqLivr = :seqLivr"),
    @NamedQuery(name = "Campus.findByCodInst", query = "SELECT c FROM Campus c WHERE c.codInst = :codInst"),
    @NamedQuery(name = "Campus.findByCampus", query = "SELECT c FROM Campus c WHERE c.campus = :campus"),
    @NamedQuery(name = "Campus.findByAbrInst", query = "SELECT c FROM Campus c WHERE c.abrInst = :abrInst"),
    @NamedQuery(name = "Campus.findBySenhPdv", query = "SELECT c FROM Campus c WHERE c.senhPdv = :senhPdv"),
    @NamedQuery(name = "Campus.findBySitPdvs", query = "SELECT c FROM Campus c WHERE c.sitPdvs = :sitPdvs"),
    @NamedQuery(name = "Campus.findByDtaMovi", query = "SELECT c FROM Campus c WHERE c.dtaMovi = :dtaMovi"),
    @NamedQuery(name = "Campus.findByCodAcsp", query = "SELECT c FROM Campus c WHERE c.codAcsp = :codAcsp"),
    @NamedQuery(name = "Campus.findByFiliRm", query = "SELECT c FROM Campus c WHERE c.filiRm = :filiRm"),
    @NamedQuery(name = "Campus.findByDiasCbp", query = "SELECT c FROM Campus c WHERE c.diasCbp = :diasCbp"),
    @NamedQuery(name = "Campus.findByColiRm", query = "SELECT c FROM Campus c WHERE c.coliRm = :coliRm"),
    @NamedQuery(name = "Campus.findByNroEnd", query = "SELECT c FROM Campus c WHERE c.nroEnd = :nroEnd"),
    @NamedQuery(name = "Campus.findByCodInep", query = "SELECT c FROM Campus c WHERE c.codInep = :codInep"),
    @NamedQuery(name = "Campus.findByCgcAnt", query = "SELECT c FROM Campus c WHERE c.cgcAnt = :cgcAnt"),
    @NamedQuery(name = "Campus.findByDtaCgc", query = "SELECT c FROM Campus c WHERE c.dtaCgc = :dtaCgc"),
    @NamedQuery(name = "Campus.findByAbrInstBi", query = "SELECT c FROM Campus c WHERE c.abrInstBi = :abrInstBi"),
    @NamedQuery(name = "Campus.findBySitCada", query = "SELECT c FROM Campus c WHERE c.sitCada = :sitCada"),
    @NamedQuery(name = "Campus.findByCodMuni", query = "SELECT c FROM Campus c WHERE c.codMuni = :codMuni"),
    @NamedQuery(name = "Campus.findByCodigoUf", query = "SELECT c FROM Campus c WHERE c.codigoUf = :codigoUf"),
    @NamedQuery(name = "Campus.findByTituSecre", query = "SELECT c FROM Campus c WHERE c.tituSecre = :tituSecre"),
    @NamedQuery(name = "Campus.findByCuePron", query = "SELECT c FROM Campus c WHERE c.cuePron = :cuePron"),
    @NamedQuery(name = "Campus.findByCxaExist", query = "SELECT c FROM Campus c WHERE c.cxaExist = :cxaExist"),
    @NamedQuery(name = "Campus.findByFundLegal", query = "SELECT c FROM Campus c WHERE c.fundLegal = :fundLegal"),
    @NamedQuery(name = "Campus.findByArqLogo", query = "SELECT c FROM Campus c WHERE c.arqLogo = :arqLogo"),
    @NamedQuery(name = "Campus.findByDesMant", query = "SELECT c FROM Campus c WHERE c.desMant = :desMant"),
    @NamedQuery(name = "Campus.findByDesReco", query = "SELECT c FROM Campus c WHERE c.desReco = :desReco"),
    @NamedQuery(name = "Campus.findByNomeIns", query = "SELECT c FROM Campus c WHERE c.nomeIns = :nomeIns"),
    @NamedQuery(name = "Campus.findByGrpCont", query = "SELECT c FROM Campus c WHERE c.grpCont = :grpCont"),
    @NamedQuery(name = "Campus.findByCodEnad", query = "SELECT c FROM Campus c WHERE c.codEnad = :codEnad"),
    @NamedQuery(name = "Campus.findByLojCreden", query = "SELECT c FROM Campus c WHERE c.lojCreden = :lojCreden"),
    @NamedQuery(name = "Campus.findByInscNum", query = "SELECT c FROM Campus c WHERE c.inscNum = :inscNum"),
    @NamedQuery(name = "Campus.findByGeraRemBol", query = "SELECT c FROM Campus c WHERE c.geraRemBol = :geraRemBol"),
    @NamedQuery(name = "Campus.findByDiasVctoBol", query = "SELECT c FROM Campus c WHERE c.diasVctoBol = :diasVctoBol")})
public class Campus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "COD_EMPR")
    private Short codEmpr;
    @Column(name = "COD_FILI")
    private Short codFili;
    @Size(max = 350)
    @Column(name = "NOM_FILI", length = 350)
    private String nomFili;
    @Column(name = "CGC_MF")
    private Long cgcMf;
    @Size(max = 1200)
    @Column(name = "INSC_EST", length = 1200)
    private String inscEst;
    @Size(max = 350)
    @Column(length = 350)
    private String endereco;
    @Size(max = 20)
    @Column(length = 20)
    private String bairro;
    @Size(max = 20)
    @Column(length = 20)
    private String cidade;
    @Size(max = 200)
    @Column(length = 200)
    private String estado;
    private Integer cep;
    @Size(max = 140)
    @Column(length = 140)
    private String fone;
    @Size(max = 350)
    @Column(length = 350)
    private String diretor;
    @Size(max = 90)
    @Column(name = "RG_DIR", length = 90)
    private String rgDir;
    @Size(max = 350)
    @Column(name = "NM_SECRE", length = 350)
    private String nmSecre;
    @Size(max = 150)
    @Column(name = "RG_SECRE", length = 150)
    private String rgSecre;
    @Column(name = "FEC_LIVR")
    private Short fecLivr;
    @Column(name = "PAG_LIVR")
    private Short pagLivr;
    @Column(name = "SEQ_LIVR")
    private Integer seqLivr;
    @Column(name = "COD_INST")
    private Short codInst;
    @Size(max = 40)
    @Column(length = 40)
    private String campus;
    @Size(max = 60)
    @Column(name = "ABR_INST", length = 60)
    private String abrInst;
    @Column(name = "SENH_PDV")
    private Short senhPdv;
    @Column(name = "SIT_PDVS")
    private Short sitPdvs;
    @Column(name = "DTA_MOVI")
    @Temporal(TemporalType.DATE)
    private Date dtaMovi;
    @Column(name = "COD_ACSP")
    private Integer codAcsp;
    @Column(name = "FILI_RM")
    private Short filiRm;
    @Column(name = "DIAS_CBP")
    private Short diasCbp;
    @Column(name = "COLI_RM")
    private Short coliRm;
    @Size(max = 60)
    @Column(name = "NRO_END", length = 60)
    private String nroEnd;
    @Column(name = "COD_INEP")
    private Long codInep;
    @Column(name = "CGC_ANT")
    private Long cgcAnt;
    @Column(name = "DTA_CGC")
    @Temporal(TemporalType.DATE)
    private Date dtaCgc;
    @Size(max = 40)
    @Column(name = "ABR_INST_BI", length = 40)
    private String abrInstBi;
    @Column(name = "SIT_CADA")
    private Short sitCada;
    @Size(max = 10)
    @Column(name = "COD_MUNI", length = 10)
    private String codMuni;
    @Column(name = "CODIGO_UF")
    private Short codigoUf;
    @Size(max = 20)
    @Column(name = "TITU_SECRE", length = 20)
    private String tituSecre;
    @Column(name = "CUE_PRON")
    private Integer cuePron;
    @Column(name = "CXA_EXIST")
    private Short cxaExist;
    @Size(max = 300)
    @Column(name = "FUND_LEGAL", length = 300)
    private String fundLegal;
    @Size(max = 50)
    @Column(name = "ARQ_LOGO", length = 50)
    private String arqLogo;
    @Size(max = 100)
    @Column(name = "DES_MANT", length = 100)
    private String desMant;
    @Size(max = 100)
    @Column(name = "DES_RECO", length = 100)
    private String desReco;
    @Size(max = 100)
    @Column(name = "NOME_INS", length = 100)
    private String nomeIns;
    @Column(name = "GRP_CONT")
    private Short grpCont;
    @Column(name = "COD_ENAD")
    private Integer codEnad;
    @Column(name = "LOJ_CREDEN")
    private Long lojCreden;
    @Size(max = 150)
    @Column(name = "INSC_NUM", length = 150)
    private String inscNum;
    @Column(name = "GERA_REM_BOL")
    private Short geraRemBol;
    @Column(name = "DIAS_VCTO_BOL")
    private Short diasVctoBol;

    public Campus() {
    }

    public Campus(byte[] id) {
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

    public Short getCodFili() {
        return codFili;
    }

    public void setCodFili(Short codFili) {
        this.codFili = codFili;
    }

    public String getNomFili() {
        return nomFili;
    }

    public void setNomFili(String nomFili) {
        this.nomFili = nomFili;
    }

    public Long getCgcMf() {
        return cgcMf;
    }

    public void setCgcMf(Long cgcMf) {
        this.cgcMf = cgcMf;
    }

    public String getInscEst() {
        return inscEst;
    }

    public void setInscEst(String inscEst) {
        this.inscEst = inscEst;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getRgDir() {
        return rgDir;
    }

    public void setRgDir(String rgDir) {
        this.rgDir = rgDir;
    }

    public String getNmSecre() {
        return nmSecre;
    }

    public void setNmSecre(String nmSecre) {
        this.nmSecre = nmSecre;
    }

    public String getRgSecre() {
        return rgSecre;
    }

    public void setRgSecre(String rgSecre) {
        this.rgSecre = rgSecre;
    }

    public Short getFecLivr() {
        return fecLivr;
    }

    public void setFecLivr(Short fecLivr) {
        this.fecLivr = fecLivr;
    }

    public Short getPagLivr() {
        return pagLivr;
    }

    public void setPagLivr(Short pagLivr) {
        this.pagLivr = pagLivr;
    }

    public Integer getSeqLivr() {
        return seqLivr;
    }

    public void setSeqLivr(Integer seqLivr) {
        this.seqLivr = seqLivr;
    }

    public Short getCodInst() {
        return codInst;
    }

    public void setCodInst(Short codInst) {
        this.codInst = codInst;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getAbrInst() {
        return abrInst;
    }

    public void setAbrInst(String abrInst) {
        this.abrInst = abrInst;
    }

    public Short getSenhPdv() {
        return senhPdv;
    }

    public void setSenhPdv(Short senhPdv) {
        this.senhPdv = senhPdv;
    }

    public Short getSitPdvs() {
        return sitPdvs;
    }

    public void setSitPdvs(Short sitPdvs) {
        this.sitPdvs = sitPdvs;
    }

    public Date getDtaMovi() {
        return dtaMovi;
    }

    public void setDtaMovi(Date dtaMovi) {
        this.dtaMovi = dtaMovi;
    }

    public Integer getCodAcsp() {
        return codAcsp;
    }

    public void setCodAcsp(Integer codAcsp) {
        this.codAcsp = codAcsp;
    }

    public Short getFiliRm() {
        return filiRm;
    }

    public void setFiliRm(Short filiRm) {
        this.filiRm = filiRm;
    }

    public Short getDiasCbp() {
        return diasCbp;
    }

    public void setDiasCbp(Short diasCbp) {
        this.diasCbp = diasCbp;
    }

    public Short getColiRm() {
        return coliRm;
    }

    public void setColiRm(Short coliRm) {
        this.coliRm = coliRm;
    }

    public String getNroEnd() {
        return nroEnd;
    }

    public void setNroEnd(String nroEnd) {
        this.nroEnd = nroEnd;
    }

    public Long getCodInep() {
        return codInep;
    }

    public void setCodInep(Long codInep) {
        this.codInep = codInep;
    }

    public Long getCgcAnt() {
        return cgcAnt;
    }

    public void setCgcAnt(Long cgcAnt) {
        this.cgcAnt = cgcAnt;
    }

    public Date getDtaCgc() {
        return dtaCgc;
    }

    public void setDtaCgc(Date dtaCgc) {
        this.dtaCgc = dtaCgc;
    }

    public String getAbrInstBi() {
        return abrInstBi;
    }

    public void setAbrInstBi(String abrInstBi) {
        this.abrInstBi = abrInstBi;
    }

    public Short getSitCada() {
        return sitCada;
    }

    public void setSitCada(Short sitCada) {
        this.sitCada = sitCada;
    }

    public String getCodMuni() {
        return codMuni;
    }

    public void setCodMuni(String codMuni) {
        this.codMuni = codMuni;
    }

    public Short getCodigoUf() {
        return codigoUf;
    }

    public void setCodigoUf(Short codigoUf) {
        this.codigoUf = codigoUf;
    }

    public String getTituSecre() {
        return tituSecre;
    }

    public void setTituSecre(String tituSecre) {
        this.tituSecre = tituSecre;
    }

    public Integer getCuePron() {
        return cuePron;
    }

    public void setCuePron(Integer cuePron) {
        this.cuePron = cuePron;
    }

    public Short getCxaExist() {
        return cxaExist;
    }

    public void setCxaExist(Short cxaExist) {
        this.cxaExist = cxaExist;
    }

    public String getFundLegal() {
        return fundLegal;
    }

    public void setFundLegal(String fundLegal) {
        this.fundLegal = fundLegal;
    }

    public String getArqLogo() {
        return arqLogo;
    }

    public void setArqLogo(String arqLogo) {
        this.arqLogo = arqLogo;
    }

    public String getDesMant() {
        return desMant;
    }

    public void setDesMant(String desMant) {
        this.desMant = desMant;
    }

    public String getDesReco() {
        return desReco;
    }

    public void setDesReco(String desReco) {
        this.desReco = desReco;
    }

    public String getNomeIns() {
        return nomeIns;
    }

    public void setNomeIns(String nomeIns) {
        this.nomeIns = nomeIns;
    }

    public Short getGrpCont() {
        return grpCont;
    }

    public void setGrpCont(Short grpCont) {
        this.grpCont = grpCont;
    }

    public Integer getCodEnad() {
        return codEnad;
    }

    public void setCodEnad(Integer codEnad) {
        this.codEnad = codEnad;
    }

    public Long getLojCreden() {
        return lojCreden;
    }

    public void setLojCreden(Long lojCreden) {
        this.lojCreden = lojCreden;
    }

    public String getInscNum() {
        return inscNum;
    }

    public void setInscNum(String inscNum) {
        this.inscNum = inscNum;
    }

    public Short getGeraRemBol() {
        return geraRemBol;
    }

    public void setGeraRemBol(Short geraRemBol) {
        this.geraRemBol = geraRemBol;
    }

    public Short getDiasVctoBol() {
        return diasVctoBol;
    }

    public void setDiasVctoBol(Short diasVctoBol) {
        this.diasVctoBol = diasVctoBol;
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
        if (!(object instanceof Campus)) {
            return false;
        }
        Campus other = (Campus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Campus[ id=" + id + " ]";
    }

}
