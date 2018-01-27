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
@Table(name = "IES", catalog = "rematricula-db", schema = "ACD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findAll", query = "SELECT i FROM InstituicaoEnsinoSuperior i"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCodEmpr", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.codEmpr = :codEmpr"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByRzSocia", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.rzSocia = :rzSocia"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByNmFanta", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.nmFanta = :nmFanta"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByNReitor", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.nReitor = :nReitor"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByNmAbrev", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.nmAbrev = :nmAbrev"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByEmprRm", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.emprRm = :emprRm"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByDesReco", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.desReco = :desReco"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCodEnad", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.codEnad = :codEnad"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByNProrei", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.nProrei = :nProrei"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByRgProrei", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.rgProrei = :rgProrei"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByNrSeqrc", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.nrSeqrc = :nrSeqrc"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByWebSite", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.webSite = :webSite"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByAtivaRm", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.ativaRm = :ativaRm"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByNmAbrev5", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.nmAbrev5 = :nmAbrev5"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByDiasAvcto", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.diasAvcto = :diasAvcto"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByDirFoto", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.dirFoto = :dirFoto"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByPercIss", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.percIss = :percIss"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByPvlsemser", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.pvlsemser = :pvlsemser"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByRzAnt", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.rzAnt = :rzAnt"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findBySitCada", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.sitCada = :sitCada"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCnCodies", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.cnCodies = :cnCodies"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByTipoFat", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.tipoFat = :tipoFat"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByVctoMat", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.vctoMat = :vctoMat"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByTipoEns", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.tipoEns = :tipoEns"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByEnvRembco", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.envRembco = :envRembco"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByBolmatWeb", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.bolmatWeb = :bolmatWeb"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByNmAbrev10", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.nmAbrev10 = :nmAbrev10"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByPRecalPos", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.pRecalPos = :pRecalPos"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByGruSped", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.gruSped = :gruSped"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCodcoligadaRm", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.codcoligadaRm = :codcoligadaRm"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCodcfo", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.codcfo = :codcfo"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByArqLogo", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.arqLogo = :arqLogo"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCbFazAntec", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.cbFazAntec = :cbFazAntec"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCbFazFatur", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.cbFazFatur = :cbFazFatur"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCbFazBaixa", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.cbFazBaixa = :cbFazBaixa"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCbMesAnoFat", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.cbMesAnoFat = :cbMesAnoFat"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCbMesAnoAnt", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.cbMesAnoAnt = :cbMesAnoAnt"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCbMesAnoBai", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.cbMesAnoBai = :cbMesAnoBai"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCbDataAlt", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.cbDataAlt = :cbDataAlt"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByEmpGrup", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.empGrup = :empGrup"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByNomeEmpCv", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.nomeEmpCv = :nomeEmpCv"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByTamAbb", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.tamAbb = :tamAbb"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByDiscTt", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.discTt = :discTt"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByDtIniCtb", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.dtIniCtb = :dtIniCtb"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByIdPprof", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.idPprof = :idPprof"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByIdPcoord", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.idPcoord = :idPcoord"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByGerDismat", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.gerDismat = :gerDismat"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCalValmat", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.calValmat = :calValmat"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCtaCtbFat", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.ctaCtbFat = :ctaCtbFat"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCtaCtbFatDesc1", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.ctaCtbFatDesc1 = :ctaCtbFatDesc1"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCtaCtbFatDesc2", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.ctaCtbFatDesc2 = :ctaCtbFatDesc2"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCtaCtbCar", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.ctaCtbCar = :ctaCtbCar"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByDiscNolp", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.discNolp = :discNolp"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCtaCtbAnt1sem", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.ctaCtbAnt1sem = :ctaCtbAnt1sem"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCtaCtbAnt2sem", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.ctaCtbAnt2sem = :ctaCtbAnt2sem"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByQtdAluOfer", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.qtdAluOfer = :qtdAluOfer"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCtaCtbCr", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.ctaCtbCr = :ctaCtbCr"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByCtaCtbCan", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.ctaCtbCan = :ctaCtbCan"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByPercPis", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.percPis = :percPis"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByPercCofins", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.percCofins = :percCofins"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByUsaPoeb", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.usaPoeb = :usaPoeb"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByLojCreden", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.lojCreden = :lojCreden"),
    @NamedQuery(name = "InstituicaoEnsinoSuperior.findByGinfes", query = "SELECT i FROM InstituicaoEnsinoSuperior i WHERE i.ginfes = :ginfes")})
public class InstituicaoEnsinoSuperior implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "COD_EMPR")
    private Short codEmpr;
    @Size(max = 550)
    @Column(name = "RZ_SOCIA", length = 550)
    private String rzSocia;
    @Size(max = 350)
    @Column(name = "NM_FANTA", length = 350)
    private String nmFanta;
    @Size(max = 350)
    @Column(name = "N_REITOR", length = 350)
    private String nReitor;
    @Size(max = 20)
    @Column(name = "NM_ABREV", length = 20)
    private String nmAbrev;
    @Column(name = "EMPR_RM")
    private Short emprRm;
    @Size(max = 100)
    @Column(name = "DES_RECO", length = 100)
    private String desReco;
    @Column(name = "COD_ENAD")
    private Integer codEnad;
    @Size(max = 50)
    @Column(name = "N_PROREI", length = 50)
    private String nProrei;
    @Size(max = 20)
    @Column(name = "RG_PROREI", length = 20)
    private String rgProrei;
    @Column(name = "NR_SEQRC")
    private Integer nrSeqrc;
    @Size(max = 60)
    @Column(name = "WEB_SITE", length = 60)
    private String webSite;
    @Column(name = "ATIVA_RM")
    private Short ativaRm;
    @Size(max = 50)
    @Column(name = "NM_ABREV5", length = 50)
    private String nmAbrev5;
    @Column(name = "DIAS_AVCTO")
    private Short diasAvcto;
    @Size(max = 30)
    @Column(name = "DIR_FOTO", length = 30)
    private String dirFoto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PERC_ISS", precision = 4, scale = 2)
    private BigDecimal percIss;
    private Short pvlsemser;
    @Size(max = 550)
    @Column(name = "RZ_ANT", length = 550)
    private String rzAnt;
    @Column(name = "SIT_CADA")
    private Short sitCada;
    @Column(name = "CN_CODIES")
    private Integer cnCodies;
    @Column(name = "TIPO_FAT")
    private Short tipoFat;
    @Column(name = "VCTO_MAT")
    private Short vctoMat;
    @Column(name = "TIPO_ENS")
    private Short tipoEns;
    @Column(name = "ENV_REMBCO")
    private Short envRembco;
    @Column(name = "BOLMAT_WEB")
    private Short bolmatWeb;
    @Size(max = 10)
    @Column(name = "NM_ABREV10", length = 10)
    private String nmAbrev10;
    @Column(name = "P_RECAL_POS")
    private Short pRecalPos;
    @Column(name = "GRU_SPED")
    private Short gruSped;
    @Column(name = "CODCOLIGADA_RM")
    private Integer codcoligadaRm;
    @Size(max = 250)
    @Column(length = 250)
    private String codcfo;
    @Size(max = 50)
    @Column(name = "ARQ_LOGO", length = 50)
    private String arqLogo;
    @Size(max = 100)
    @Column(name = "CB_FAZ_ANTEC", length = 100)
    private String cbFazAntec;
    @Size(max = 100)
    @Column(name = "CB_FAZ_FATUR", length = 100)
    private String cbFazFatur;
    @Size(max = 100)
    @Column(name = "CB_FAZ_BAIXA", length = 100)
    private String cbFazBaixa;
    @Column(name = "CB_MES_ANO_FAT")
    @Temporal(TemporalType.DATE)
    private Date cbMesAnoFat;
    @Column(name = "CB_MES_ANO_ANT")
    @Temporal(TemporalType.DATE)
    private Date cbMesAnoAnt;
    @Column(name = "CB_MES_ANO_BAI")
    @Temporal(TemporalType.DATE)
    private Date cbMesAnoBai;
    @Column(name = "CB_DATA_ALT")
    @Temporal(TemporalType.DATE)
    private Date cbDataAlt;
    @Column(name = "EMP_GRUP")
    private Short empGrup;
    @Size(max = 20)
    @Column(name = "NOME_EMP_CV", length = 20)
    private String nomeEmpCv;
    @Column(name = "TAM_ABB")
    private Short tamAbb;
    @Column(name = "DISC_TT")
    private Integer discTt;
    @Column(name = "DT_INI_CTB")
    @Temporal(TemporalType.DATE)
    private Date dtIniCtb;
    @Column(name = "ID_PPROF")
    private Integer idPprof;
    @Column(name = "ID_PCOORD")
    private Integer idPcoord;
    @Column(name = "GER_DISMAT")
    private Short gerDismat;
    @Column(name = "CAL_VALMAT")
    private Short calValmat;
    @Size(max = 20)
    @Column(name = "CTA_CTB_FAT", length = 20)
    private String ctaCtbFat;
    @Size(max = 20)
    @Column(name = "CTA_CTB_FAT_DESC1", length = 20)
    private String ctaCtbFatDesc1;
    @Size(max = 20)
    @Column(name = "CTA_CTB_FAT_DESC2", length = 20)
    private String ctaCtbFatDesc2;
    @Size(max = 20)
    @Column(name = "CTA_CTB_CAR", length = 20)
    private String ctaCtbCar;
    @Column(name = "DISC_NOLP")
    private Integer discNolp;
    @Size(max = 20)
    @Column(name = "CTA_CTB_ANT_1SEM", length = 20)
    private String ctaCtbAnt1sem;
    @Size(max = 20)
    @Column(name = "CTA_CTB_ANT_2SEM", length = 20)
    private String ctaCtbAnt2sem;
    @Column(name = "QTD_ALU_OFER")
    private Short qtdAluOfer;
    @Size(max = 20)
    @Column(name = "CTA_CTB_CR", length = 20)
    private String ctaCtbCr;
    @Size(max = 20)
    @Column(name = "CTA_CTB_CAN", length = 20)
    private String ctaCtbCan;
    @Column(name = "PERC_PIS", precision = 4, scale = 2)
    private BigDecimal percPis;
    @Column(name = "PERC_COFINS", precision = 4, scale = 2)
    private BigDecimal percCofins;
    @Size(max = 100)
    @Column(name = "USA_POEB", length = 100)
    private String usaPoeb;
    @Column(name = "LOJ_CREDEN")
    private Long lojCreden;
    private Short ginfes;

    public InstituicaoEnsinoSuperior() {
    }

    public InstituicaoEnsinoSuperior(byte[] id) {
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

    public String getRzSocia() {
        return rzSocia;
    }

    public void setRzSocia(String rzSocia) {
        this.rzSocia = rzSocia;
    }

    public String getNmFanta() {
        return nmFanta;
    }

    public void setNmFanta(String nmFanta) {
        this.nmFanta = nmFanta;
    }

    public String getNReitor() {
        return nReitor;
    }

    public void setNReitor(String nReitor) {
        this.nReitor = nReitor;
    }

    public String getNmAbrev() {
        return nmAbrev;
    }

    public void setNmAbrev(String nmAbrev) {
        this.nmAbrev = nmAbrev;
    }

    public Short getEmprRm() {
        return emprRm;
    }

    public void setEmprRm(Short emprRm) {
        this.emprRm = emprRm;
    }

    public String getDesReco() {
        return desReco;
    }

    public void setDesReco(String desReco) {
        this.desReco = desReco;
    }

    public Integer getCodEnad() {
        return codEnad;
    }

    public void setCodEnad(Integer codEnad) {
        this.codEnad = codEnad;
    }

    public String getNProrei() {
        return nProrei;
    }

    public void setNProrei(String nProrei) {
        this.nProrei = nProrei;
    }

    public String getRgProrei() {
        return rgProrei;
    }

    public void setRgProrei(String rgProrei) {
        this.rgProrei = rgProrei;
    }

    public Integer getNrSeqrc() {
        return nrSeqrc;
    }

    public void setNrSeqrc(Integer nrSeqrc) {
        this.nrSeqrc = nrSeqrc;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Short getAtivaRm() {
        return ativaRm;
    }

    public void setAtivaRm(Short ativaRm) {
        this.ativaRm = ativaRm;
    }

    public String getNmAbrev5() {
        return nmAbrev5;
    }

    public void setNmAbrev5(String nmAbrev5) {
        this.nmAbrev5 = nmAbrev5;
    }

    public Short getDiasAvcto() {
        return diasAvcto;
    }

    public void setDiasAvcto(Short diasAvcto) {
        this.diasAvcto = diasAvcto;
    }

    public String getDirFoto() {
        return dirFoto;
    }

    public void setDirFoto(String dirFoto) {
        this.dirFoto = dirFoto;
    }

    public BigDecimal getPercIss() {
        return percIss;
    }

    public void setPercIss(BigDecimal percIss) {
        this.percIss = percIss;
    }

    public Short getPvlsemser() {
        return pvlsemser;
    }

    public void setPvlsemser(Short pvlsemser) {
        this.pvlsemser = pvlsemser;
    }

    public String getRzAnt() {
        return rzAnt;
    }

    public void setRzAnt(String rzAnt) {
        this.rzAnt = rzAnt;
    }

    public Short getSitCada() {
        return sitCada;
    }

    public void setSitCada(Short sitCada) {
        this.sitCada = sitCada;
    }

    public Integer getCnCodies() {
        return cnCodies;
    }

    public void setCnCodies(Integer cnCodies) {
        this.cnCodies = cnCodies;
    }

    public Short getTipoFat() {
        return tipoFat;
    }

    public void setTipoFat(Short tipoFat) {
        this.tipoFat = tipoFat;
    }

    public Short getVctoMat() {
        return vctoMat;
    }

    public void setVctoMat(Short vctoMat) {
        this.vctoMat = vctoMat;
    }

    public Short getTipoEns() {
        return tipoEns;
    }

    public void setTipoEns(Short tipoEns) {
        this.tipoEns = tipoEns;
    }

    public Short getEnvRembco() {
        return envRembco;
    }

    public void setEnvRembco(Short envRembco) {
        this.envRembco = envRembco;
    }

    public Short getBolmatWeb() {
        return bolmatWeb;
    }

    public void setBolmatWeb(Short bolmatWeb) {
        this.bolmatWeb = bolmatWeb;
    }

    public String getNmAbrev10() {
        return nmAbrev10;
    }

    public void setNmAbrev10(String nmAbrev10) {
        this.nmAbrev10 = nmAbrev10;
    }

    public Short getPRecalPos() {
        return pRecalPos;
    }

    public void setPRecalPos(Short pRecalPos) {
        this.pRecalPos = pRecalPos;
    }

    public Short getGruSped() {
        return gruSped;
    }

    public void setGruSped(Short gruSped) {
        this.gruSped = gruSped;
    }

    public Integer getCodcoligadaRm() {
        return codcoligadaRm;
    }

    public void setCodcoligadaRm(Integer codcoligadaRm) {
        this.codcoligadaRm = codcoligadaRm;
    }

    public String getCodcfo() {
        return codcfo;
    }

    public void setCodcfo(String codcfo) {
        this.codcfo = codcfo;
    }

    public String getArqLogo() {
        return arqLogo;
    }

    public void setArqLogo(String arqLogo) {
        this.arqLogo = arqLogo;
    }

    public String getCbFazAntec() {
        return cbFazAntec;
    }

    public void setCbFazAntec(String cbFazAntec) {
        this.cbFazAntec = cbFazAntec;
    }

    public String getCbFazFatur() {
        return cbFazFatur;
    }

    public void setCbFazFatur(String cbFazFatur) {
        this.cbFazFatur = cbFazFatur;
    }

    public String getCbFazBaixa() {
        return cbFazBaixa;
    }

    public void setCbFazBaixa(String cbFazBaixa) {
        this.cbFazBaixa = cbFazBaixa;
    }

    public Date getCbMesAnoFat() {
        return cbMesAnoFat;
    }

    public void setCbMesAnoFat(Date cbMesAnoFat) {
        this.cbMesAnoFat = cbMesAnoFat;
    }

    public Date getCbMesAnoAnt() {
        return cbMesAnoAnt;
    }

    public void setCbMesAnoAnt(Date cbMesAnoAnt) {
        this.cbMesAnoAnt = cbMesAnoAnt;
    }

    public Date getCbMesAnoBai() {
        return cbMesAnoBai;
    }

    public void setCbMesAnoBai(Date cbMesAnoBai) {
        this.cbMesAnoBai = cbMesAnoBai;
    }

    public Date getCbDataAlt() {
        return cbDataAlt;
    }

    public void setCbDataAlt(Date cbDataAlt) {
        this.cbDataAlt = cbDataAlt;
    }

    public Short getEmpGrup() {
        return empGrup;
    }

    public void setEmpGrup(Short empGrup) {
        this.empGrup = empGrup;
    }

    public String getNomeEmpCv() {
        return nomeEmpCv;
    }

    public void setNomeEmpCv(String nomeEmpCv) {
        this.nomeEmpCv = nomeEmpCv;
    }

    public Short getTamAbb() {
        return tamAbb;
    }

    public void setTamAbb(Short tamAbb) {
        this.tamAbb = tamAbb;
    }

    public Integer getDiscTt() {
        return discTt;
    }

    public void setDiscTt(Integer discTt) {
        this.discTt = discTt;
    }

    public Date getDtIniCtb() {
        return dtIniCtb;
    }

    public void setDtIniCtb(Date dtIniCtb) {
        this.dtIniCtb = dtIniCtb;
    }

    public Integer getIdPprof() {
        return idPprof;
    }

    public void setIdPprof(Integer idPprof) {
        this.idPprof = idPprof;
    }

    public Integer getIdPcoord() {
        return idPcoord;
    }

    public void setIdPcoord(Integer idPcoord) {
        this.idPcoord = idPcoord;
    }

    public Short getGerDismat() {
        return gerDismat;
    }

    public void setGerDismat(Short gerDismat) {
        this.gerDismat = gerDismat;
    }

    public Short getCalValmat() {
        return calValmat;
    }

    public void setCalValmat(Short calValmat) {
        this.calValmat = calValmat;
    }

    public String getCtaCtbFat() {
        return ctaCtbFat;
    }

    public void setCtaCtbFat(String ctaCtbFat) {
        this.ctaCtbFat = ctaCtbFat;
    }

    public String getCtaCtbFatDesc1() {
        return ctaCtbFatDesc1;
    }

    public void setCtaCtbFatDesc1(String ctaCtbFatDesc1) {
        this.ctaCtbFatDesc1 = ctaCtbFatDesc1;
    }

    public String getCtaCtbFatDesc2() {
        return ctaCtbFatDesc2;
    }

    public void setCtaCtbFatDesc2(String ctaCtbFatDesc2) {
        this.ctaCtbFatDesc2 = ctaCtbFatDesc2;
    }

    public String getCtaCtbCar() {
        return ctaCtbCar;
    }

    public void setCtaCtbCar(String ctaCtbCar) {
        this.ctaCtbCar = ctaCtbCar;
    }

    public Integer getDiscNolp() {
        return discNolp;
    }

    public void setDiscNolp(Integer discNolp) {
        this.discNolp = discNolp;
    }

    public String getCtaCtbAnt1sem() {
        return ctaCtbAnt1sem;
    }

    public void setCtaCtbAnt1sem(String ctaCtbAnt1sem) {
        this.ctaCtbAnt1sem = ctaCtbAnt1sem;
    }

    public String getCtaCtbAnt2sem() {
        return ctaCtbAnt2sem;
    }

    public void setCtaCtbAnt2sem(String ctaCtbAnt2sem) {
        this.ctaCtbAnt2sem = ctaCtbAnt2sem;
    }

    public Short getQtdAluOfer() {
        return qtdAluOfer;
    }

    public void setQtdAluOfer(Short qtdAluOfer) {
        this.qtdAluOfer = qtdAluOfer;
    }

    public String getCtaCtbCr() {
        return ctaCtbCr;
    }

    public void setCtaCtbCr(String ctaCtbCr) {
        this.ctaCtbCr = ctaCtbCr;
    }

    public String getCtaCtbCan() {
        return ctaCtbCan;
    }

    public void setCtaCtbCan(String ctaCtbCan) {
        this.ctaCtbCan = ctaCtbCan;
    }

    public BigDecimal getPercPis() {
        return percPis;
    }

    public void setPercPis(BigDecimal percPis) {
        this.percPis = percPis;
    }

    public BigDecimal getPercCofins() {
        return percCofins;
    }

    public void setPercCofins(BigDecimal percCofins) {
        this.percCofins = percCofins;
    }

    public String getUsaPoeb() {
        return usaPoeb;
    }

    public void setUsaPoeb(String usaPoeb) {
        this.usaPoeb = usaPoeb;
    }

    public Long getLojCreden() {
        return lojCreden;
    }

    public void setLojCreden(Long lojCreden) {
        this.lojCreden = lojCreden;
    }

    public Short getGinfes() {
        return ginfes;
    }

    public void setGinfes(Short ginfes) {
        this.ginfes = ginfes;
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
        if (!(object instanceof InstituicaoEnsinoSuperior)) {
            return false;
        }
        InstituicaoEnsinoSuperior other = (InstituicaoEnsinoSuperior) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.InstituicaoEnsinoSuperior[ id=" + id + " ]";
    }

}
