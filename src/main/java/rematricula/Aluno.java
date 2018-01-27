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
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a"),
    @NamedQuery(name = "Aluno.findByCodAlun", query = "SELECT a FROM Aluno a WHERE a.codAlun = :codAlun"),
    @NamedQuery(name = "Aluno.findByNome", query = "SELECT a FROM Aluno a WHERE a.nome = :nome"),
    @NamedQuery(name = "Aluno.findBySexo", query = "SELECT a FROM Aluno a WHERE a.sexo = :sexo"),
    @NamedQuery(name = "Aluno.findByDtaNasc", query = "SELECT a FROM Aluno a WHERE a.dtaNasc = :dtaNasc"),
    @NamedQuery(name = "Aluno.findByEsCivil", query = "SELECT a FROM Aluno a WHERE a.esCivil = :esCivil"),
    @NamedQuery(name = "Aluno.findByNacional", query = "SELECT a FROM Aluno a WHERE a.nacional = :nacional"),
    @NamedQuery(name = "Aluno.findByNatCida", query = "SELECT a FROM Aluno a WHERE a.natCida = :natCida"),
    @NamedQuery(name = "Aluno.findByNatUf", query = "SELECT a FROM Aluno a WHERE a.natUf = :natUf"),
    @NamedQuery(name = "Aluno.findByPaiAlun", query = "SELECT a FROM Aluno a WHERE a.paiAlun = :paiAlun"),
    @NamedQuery(name = "Aluno.findByMaeAlun", query = "SELECT a FROM Aluno a WHERE a.maeAlun = :maeAlun"),
    @NamedQuery(name = "Aluno.findByFoneRes", query = "SELECT a FROM Aluno a WHERE a.foneRes = :foneRes"),
    @NamedQuery(name = "Aluno.findByFoneCom", query = "SELECT a FROM Aluno a WHERE a.foneCom = :foneCom"),
    @NamedQuery(name = "Aluno.findByFoneCel", query = "SELECT a FROM Aluno a WHERE a.foneCel = :foneCel"),
    @NamedQuery(name = "Aluno.findByCpfAlun", query = "SELECT a FROM Aluno a WHERE a.cpfAlun = :cpfAlun"),
    @NamedQuery(name = "Aluno.findByRgNr", query = "SELECT a FROM Aluno a WHERE a.rgNr = :rgNr"),
    @NamedQuery(name = "Aluno.findByRgUfemi", query = "SELECT a FROM Aluno a WHERE a.rgUfemi = :rgUfemi"),
    @NamedQuery(name = "Aluno.findByDataRg", query = "SELECT a FROM Aluno a WHERE a.dataRg = :dataRg"),
    @NamedQuery(name = "Aluno.findByEleitNr", query = "SELECT a FROM Aluno a WHERE a.eleitNr = :eleitNr"),
    @NamedQuery(name = "Aluno.findByEleitZn", query = "SELECT a FROM Aluno a WHERE a.eleitZn = :eleitZn"),
    @NamedQuery(name = "Aluno.findByEleitSc", query = "SELECT a FROM Aluno a WHERE a.eleitSc = :eleitSc"),
    @NamedQuery(name = "Aluno.findByReserNr", query = "SELECT a FROM Aluno a WHERE a.reserNr = :reserNr"),
    @NamedQuery(name = "Aluno.findByReserTp", query = "SELECT a FROM Aluno a WHERE a.reserTp = :reserTp"),
    @NamedQuery(name = "Aluno.findByRgEscol", query = "SELECT a FROM Aluno a WHERE a.rgEscol = :rgEscol"),
    @NamedQuery(name = "Aluno.findByUfRgesc", query = "SELECT a FROM Aluno a WHERE a.ufRgesc = :ufRgesc"),
    @NamedQuery(name = "Aluno.findByEMail", query = "SELECT a FROM Aluno a WHERE a.eMail = :eMail"),
    @NamedQuery(name = "Aluno.findBySenha", query = "SELECT a FROM Aluno a WHERE a.senha = :senha"),
    @NamedQuery(name = "Aluno.findByAnoCon2g", query = "SELECT a FROM Aluno a WHERE a.anoCon2g = :anoCon2g"),
    @NamedQuery(name = "Aluno.findByCodRaca", query = "SELECT a FROM Aluno a WHERE a.codRaca = :codRaca"),
    @NamedQuery(name = "Aluno.findByCodCond", query = "SELECT a FROM Aluno a WHERE a.codCond = :codCond"),
    @NamedQuery(name = "Aluno.findByMunCnas", query = "SELECT a FROM Aluno a WHERE a.munCnas = :munCnas"),
    @NamedQuery(name = "Aluno.findByDisCnas", query = "SELECT a FROM Aluno a WHERE a.disCnas = :disCnas"),
    @NamedQuery(name = "Aluno.findByRgNrAux", query = "SELECT a FROM Aluno a WHERE a.rgNrAux = :rgNrAux"),
    @NamedQuery(name = "Aluno.findByRmCodcli", query = "SELECT a FROM Aluno a WHERE a.rmCodcli = :rmCodcli"),
    @NamedQuery(name = "Aluno.findByWSenha", query = "SELECT a FROM Aluno a WHERE a.wSenha = :wSenha"),
    @NamedQuery(name = "Aluno.findBySitSenha", query = "SELECT a FROM Aluno a WHERE a.sitSenha = :sitSenha"),
    @NamedQuery(name = "Aluno.findByKeyPearson", query = "SELECT a FROM Aluno a WHERE a.keyPearson = :keyPearson"),
    @NamedQuery(name = "Aluno.findByOperCel", query = "SELECT a FROM Aluno a WHERE a.operCel = :operCel"),
    @NamedQuery(name = "Aluno.findByContaut", query = "SELECT a FROM Aluno a WHERE a.contaut = :contaut"),
    @NamedQuery(name = "Aluno.findByDddFres", query = "SELECT a FROM Aluno a WHERE a.dddFres = :dddFres"),
    @NamedQuery(name = "Aluno.findByDddFcom", query = "SELECT a FROM Aluno a WHERE a.dddFcom = :dddFcom"),
    @NamedQuery(name = "Aluno.findByDddFcel", query = "SELECT a FROM Aluno a WHERE a.dddFcel = :dddFcel"),
    @NamedQuery(name = "Aluno.findByRamFcom", query = "SELECT a FROM Aluno a WHERE a.ramFcom = :ramFcom"),
    @NamedQuery(name = "Aluno.findByPais", query = "SELECT a FROM Aluno a WHERE a.pais = :pais"),
    @NamedQuery(name = "Aluno.findByAtoCote", query = "SELECT a FROM Aluno a WHERE a.atoCote = :atoCote"),
    @NamedQuery(name = "Aluno.findByNomeFonet", query = "SELECT a FROM Aluno a WHERE a.nomeFonet = :nomeFonet"),
    @NamedQuery(name = "Aluno.findByBloAcsPa", query = "SELECT a FROM Aluno a WHERE a.bloAcsPa = :bloAcsPa"),
    @NamedQuery(name = "Aluno.findByIdIesde", query = "SELECT a FROM Aluno a WHERE a.idIesde = :idIesde"),
    @NamedQuery(name = "Aluno.findBySenhaC", query = "SELECT a FROM Aluno a WHERE a.senhaC = :senhaC"),
    @NamedQuery(name = "Aluno.findByEscEnsm", query = "SELECT a FROM Aluno a WHERE a.escEnsm = :escEnsm"),
    @NamedQuery(name = "Aluno.findByIesdeUnid", query = "SELECT a FROM Aluno a WHERE a.iesdeUnid = :iesdeUnid"),
    @NamedQuery(name = "Aluno.findByRgOrgao", query = "SELECT a FROM Aluno a WHERE a.rgOrgao = :rgOrgao"),
    @NamedQuery(name = "Aluno.findByEMailInst", query = "SELECT a FROM Aluno a WHERE a.eMailInst = :eMailInst"),
    @NamedQuery(name = "Aluno.findByCeluMae", query = "SELECT a FROM Aluno a WHERE a.celuMae = :celuMae"),
    @NamedQuery(name = "Aluno.findByCeluPai", query = "SELECT a FROM Aluno a WHERE a.celuPai = :celuPai"),
    @NamedQuery(name = "Aluno.findByCeluOut", query = "SELECT a FROM Aluno a WHERE a.celuOut = :celuOut"),
    @NamedQuery(name = "Aluno.findByGenRgorgao", query = "SELECT a FROM Aluno a WHERE a.genRgorgao = :genRgorgao"),
    @NamedQuery(name = "Aluno.findByTipEsco", query = "SELECT a FROM Aluno a WHERE a.tipEsco = :tipEsco"),
    @NamedQuery(name = "Aluno.findByNomeReg", query = "SELECT a FROM Aluno a WHERE a.nomeReg = :nomeReg"),
    @NamedQuery(name = "Aluno.findByCodPais", query = "SELECT a FROM Aluno a WHERE a.codPais = :codPais"),
    @NamedQuery(name = "Aluno.findByDocRne", query = "SELECT a FROM Aluno a WHERE a.docRne = :docRne"),
    @NamedQuery(name = "Aluno.findByNpassaporte", query = "SELECT a FROM Aluno a WHERE a.npassaporte = :npassaporte")})
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "COD_ALUN")
    private Long codAlun;
    @Size(max = 80)
    @Column(length = 80)
    private String nome;
    private Short sexo;
    @Column(name = "DTA_NASC")
    @Temporal(TemporalType.DATE)
    private Date dtaNasc;
    @Column(name = "ES_CIVIL")
    private Short esCivil;
    @Size(max = 150)
    @Column(length = 150)
    private String nacional;
    @Size(max = 30)
    @Column(name = "NAT_CIDA", length = 30)
    private String natCida;
    @Size(max = 200)
    @Column(name = "NAT_UF", length = 200)
    private String natUf;
    @Size(max = 50)
    @Column(name = "PAI_ALUN", length = 50)
    private String paiAlun;
    @Size(max = 50)
    @Column(name = "MAE_ALUN", length = 50)
    private String maeAlun;
    @Size(max = 30)
    @Column(name = "FONE_RES", length = 30)
    private String foneRes;
    @Size(max = 30)
    @Column(name = "FONE_COM", length = 30)
    private String foneCom;
    @Size(max = 30)
    @Column(name = "FONE_CEL", length = 30)
    private String foneCel;
    @Column(name = "CPF_ALUN")
    private Long cpfAlun;
    @Size(max = 20)
    @Column(name = "RG_NR", length = 20)
    private String rgNr;
    @Size(max = 200)
    @Column(name = "RG_UFEMI", length = 200)
    private String rgUfemi;
    @Column(name = "DATA_RG")
    @Temporal(TemporalType.DATE)
    private Date dataRg;
    @Column(name = "ELEIT_NR")
    private Long eleitNr;
    @Column(name = "ELEIT_ZN")
    private Short eleitZn;
    @Column(name = "ELEIT_SC")
    private Short eleitSc;
    @Size(max = 30)
    @Column(name = "RESER_NR", length = 30)
    private String reserNr;
    @Size(max = 30)
    @Column(name = "RESER_TP", length = 30)
    private String reserTp;
    @Size(max = 20)
    @Column(name = "RG_ESCOL", length = 20)
    private String rgEscol;
    @Size(max = 200)
    @Column(name = "UF_RGESC", length = 200)
    private String ufRgesc;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "E_MAIL", length = 100)
    private String eMail;
    @Size(max = 50)
    @Column(length = 50)
    private String senha;
    @Column(name = "ANO_CON2G")
    private Short anoCon2g;
    @Column(name = "COD_RACA")
    private Short codRaca;
    @Column(name = "COD_COND")
    private Short codCond;
    @Size(max = 30)
    @Column(name = "MUN_CNAS", length = 30)
    private String munCnas;
    @Size(max = 30)
    @Column(name = "DIS_CNAS", length = 30)
    private String disCnas;
    @Size(max = 160)
    @Column(name = "RG_NR_AUX", length = 160)
    private String rgNrAux;
    @Column(name = "RM_CODCLI")
    private Integer rmCodcli;
    @Size(max = 50)
    @Column(name = "W_SENHA", length = 50)
    private String wSenha;
    @Column(name = "SIT_SENHA")
    private Short sitSenha;
    @Size(max = 80)
    @Column(name = "KEY_PEARSON", length = 80)
    private String keyPearson;
    @Column(name = "OPER_CEL")
    private Short operCel;
    private Short contaut;
    @Column(name = "DDD_FRES")
    private Short dddFres;
    @Column(name = "DDD_FCOM")
    private Short dddFcom;
    @Column(name = "DDD_FCEL")
    private Short dddFcel;
    @Column(name = "RAM_FCOM")
    private Short ramFcom;
    @Size(max = 30)
    @Column(length = 30)
    private String pais;
    @Column(name = "ATO_COTE")
    private Short atoCote;
    @Size(max = 100)
    @Column(name = "NOME_FONET", length = 100)
    private String nomeFonet;
    @Column(name = "BLO_ACS_PA")
    private Short bloAcsPa;
    @Column(name = "ID_IESDE")
    private Integer idIesde;
    @Size(max = 50)
    @Column(name = "SENHA_C", length = 50)
    private String senhaC;
    @Size(max = 200)
    @Column(name = "ESC_ENSM", length = 200)
    private String escEnsm;
    @Column(name = "IESDE_UNID")
    private Short iesdeUnid;
    @Size(max = 150)
    @Column(name = "RG_ORGAO", length = 150)
    private String rgOrgao;
    @Size(max = 100)
    @Column(name = "E_MAIL_INST", length = 100)
    private String eMailInst;
    @Size(max = 30)
    @Column(name = "CELU_MAE", length = 30)
    private String celuMae;
    @Size(max = 30)
    @Column(name = "CELU_PAI", length = 30)
    private String celuPai;
    @Size(max = 30)
    @Column(name = "CELU_OUT", length = 30)
    private String celuOut;
    @Column(name = "GEN_RGORGAO")
    private Short genRgorgao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TIP_ESCO", precision = 65535, scale = 32767)
    private BigDecimal tipEsco;
    @Size(max = 100)
    @Column(name = "NOME_REG", length = 100)
    private String nomeReg;
    @Column(name = "COD_PAIS")
    private Short codPais;
    @Size(max = 20)
    @Column(name = "DOC_RNE", length = 20)
    private String docRne;
    @Size(max = 20)
    @Column(length = 20)
    private String npassaporte;

    public Aluno() {
    }

    public Aluno(byte[] id) {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Short getSexo() {
        return sexo;
    }

    public void setSexo(Short sexo) {
        this.sexo = sexo;
    }

    public Date getDtaNasc() {
        return dtaNasc;
    }

    public void setDtaNasc(Date dtaNasc) {
        this.dtaNasc = dtaNasc;
    }

    public Short getEsCivil() {
        return esCivil;
    }

    public void setEsCivil(Short esCivil) {
        this.esCivil = esCivil;
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }

    public String getNatCida() {
        return natCida;
    }

    public void setNatCida(String natCida) {
        this.natCida = natCida;
    }

    public String getNatUf() {
        return natUf;
    }

    public void setNatUf(String natUf) {
        this.natUf = natUf;
    }

    public String getPaiAlun() {
        return paiAlun;
    }

    public void setPaiAlun(String paiAlun) {
        this.paiAlun = paiAlun;
    }

    public String getMaeAlun() {
        return maeAlun;
    }

    public void setMaeAlun(String maeAlun) {
        this.maeAlun = maeAlun;
    }

    public String getFoneRes() {
        return foneRes;
    }

    public void setFoneRes(String foneRes) {
        this.foneRes = foneRes;
    }

    public String getFoneCom() {
        return foneCom;
    }

    public void setFoneCom(String foneCom) {
        this.foneCom = foneCom;
    }

    public String getFoneCel() {
        return foneCel;
    }

    public void setFoneCel(String foneCel) {
        this.foneCel = foneCel;
    }

    public Long getCpfAlun() {
        return cpfAlun;
    }

    public void setCpfAlun(Long cpfAlun) {
        this.cpfAlun = cpfAlun;
    }

    public String getRgNr() {
        return rgNr;
    }

    public void setRgNr(String rgNr) {
        this.rgNr = rgNr;
    }

    public String getRgUfemi() {
        return rgUfemi;
    }

    public void setRgUfemi(String rgUfemi) {
        this.rgUfemi = rgUfemi;
    }

    public Date getDataRg() {
        return dataRg;
    }

    public void setDataRg(Date dataRg) {
        this.dataRg = dataRg;
    }

    public Long getEleitNr() {
        return eleitNr;
    }

    public void setEleitNr(Long eleitNr) {
        this.eleitNr = eleitNr;
    }

    public Short getEleitZn() {
        return eleitZn;
    }

    public void setEleitZn(Short eleitZn) {
        this.eleitZn = eleitZn;
    }

    public Short getEleitSc() {
        return eleitSc;
    }

    public void setEleitSc(Short eleitSc) {
        this.eleitSc = eleitSc;
    }

    public String getReserNr() {
        return reserNr;
    }

    public void setReserNr(String reserNr) {
        this.reserNr = reserNr;
    }

    public String getReserTp() {
        return reserTp;
    }

    public void setReserTp(String reserTp) {
        this.reserTp = reserTp;
    }

    public String getRgEscol() {
        return rgEscol;
    }

    public void setRgEscol(String rgEscol) {
        this.rgEscol = rgEscol;
    }

    public String getUfRgesc() {
        return ufRgesc;
    }

    public void setUfRgesc(String ufRgesc) {
        this.ufRgesc = ufRgesc;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Short getAnoCon2g() {
        return anoCon2g;
    }

    public void setAnoCon2g(Short anoCon2g) {
        this.anoCon2g = anoCon2g;
    }

    public Short getCodRaca() {
        return codRaca;
    }

    public void setCodRaca(Short codRaca) {
        this.codRaca = codRaca;
    }

    public Short getCodCond() {
        return codCond;
    }

    public void setCodCond(Short codCond) {
        this.codCond = codCond;
    }

    public String getMunCnas() {
        return munCnas;
    }

    public void setMunCnas(String munCnas) {
        this.munCnas = munCnas;
    }

    public String getDisCnas() {
        return disCnas;
    }

    public void setDisCnas(String disCnas) {
        this.disCnas = disCnas;
    }

    public String getRgNrAux() {
        return rgNrAux;
    }

    public void setRgNrAux(String rgNrAux) {
        this.rgNrAux = rgNrAux;
    }

    public Integer getRmCodcli() {
        return rmCodcli;
    }

    public void setRmCodcli(Integer rmCodcli) {
        this.rmCodcli = rmCodcli;
    }

    public String getWSenha() {
        return wSenha;
    }

    public void setWSenha(String wSenha) {
        this.wSenha = wSenha;
    }

    public Short getSitSenha() {
        return sitSenha;
    }

    public void setSitSenha(Short sitSenha) {
        this.sitSenha = sitSenha;
    }

    public String getKeyPearson() {
        return keyPearson;
    }

    public void setKeyPearson(String keyPearson) {
        this.keyPearson = keyPearson;
    }

    public Short getOperCel() {
        return operCel;
    }

    public void setOperCel(Short operCel) {
        this.operCel = operCel;
    }

    public Short getContaut() {
        return contaut;
    }

    public void setContaut(Short contaut) {
        this.contaut = contaut;
    }

    public Short getDddFres() {
        return dddFres;
    }

    public void setDddFres(Short dddFres) {
        this.dddFres = dddFres;
    }

    public Short getDddFcom() {
        return dddFcom;
    }

    public void setDddFcom(Short dddFcom) {
        this.dddFcom = dddFcom;
    }

    public Short getDddFcel() {
        return dddFcel;
    }

    public void setDddFcel(Short dddFcel) {
        this.dddFcel = dddFcel;
    }

    public Short getRamFcom() {
        return ramFcom;
    }

    public void setRamFcom(Short ramFcom) {
        this.ramFcom = ramFcom;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Short getAtoCote() {
        return atoCote;
    }

    public void setAtoCote(Short atoCote) {
        this.atoCote = atoCote;
    }

    public String getNomeFonet() {
        return nomeFonet;
    }

    public void setNomeFonet(String nomeFonet) {
        this.nomeFonet = nomeFonet;
    }

    public Short getBloAcsPa() {
        return bloAcsPa;
    }

    public void setBloAcsPa(Short bloAcsPa) {
        this.bloAcsPa = bloAcsPa;
    }

    public Integer getIdIesde() {
        return idIesde;
    }

    public void setIdIesde(Integer idIesde) {
        this.idIesde = idIesde;
    }

    public String getSenhaC() {
        return senhaC;
    }

    public void setSenhaC(String senhaC) {
        this.senhaC = senhaC;
    }

    public String getEscEnsm() {
        return escEnsm;
    }

    public void setEscEnsm(String escEnsm) {
        this.escEnsm = escEnsm;
    }

    public Short getIesdeUnid() {
        return iesdeUnid;
    }

    public void setIesdeUnid(Short iesdeUnid) {
        this.iesdeUnid = iesdeUnid;
    }

    public String getRgOrgao() {
        return rgOrgao;
    }

    public void setRgOrgao(String rgOrgao) {
        this.rgOrgao = rgOrgao;
    }

    public String getEMailInst() {
        return eMailInst;
    }

    public void setEMailInst(String eMailInst) {
        this.eMailInst = eMailInst;
    }

    public String getCeluMae() {
        return celuMae;
    }

    public void setCeluMae(String celuMae) {
        this.celuMae = celuMae;
    }

    public String getCeluPai() {
        return celuPai;
    }

    public void setCeluPai(String celuPai) {
        this.celuPai = celuPai;
    }

    public String getCeluOut() {
        return celuOut;
    }

    public void setCeluOut(String celuOut) {
        this.celuOut = celuOut;
    }

    public Short getGenRgorgao() {
        return genRgorgao;
    }

    public void setGenRgorgao(Short genRgorgao) {
        this.genRgorgao = genRgorgao;
    }

    public BigDecimal getTipEsco() {
        return tipEsco;
    }

    public void setTipEsco(BigDecimal tipEsco) {
        this.tipEsco = tipEsco;
    }

    public String getNomeReg() {
        return nomeReg;
    }

    public void setNomeReg(String nomeReg) {
        this.nomeReg = nomeReg;
    }

    public Short getCodPais() {
        return codPais;
    }

    public void setCodPais(Short codPais) {
        this.codPais = codPais;
    }

    public String getDocRne() {
        return docRne;
    }

    public void setDocRne(String docRne) {
        this.docRne = docRne;
    }

    public String getNpassaporte() {
        return npassaporte;
    }

    public void setNpassaporte(String npassaporte) {
        this.npassaporte = npassaporte;
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
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Aluno[ id=" + id + " ]";
    }

}
