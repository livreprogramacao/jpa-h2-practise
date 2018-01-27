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
    @NamedQuery(name = "Oferta.findAll", query = "SELECT o FROM Oferta o"),
    @NamedQuery(name = "Oferta.findByIdOfert", query = "SELECT o FROM Oferta o WHERE o.idOfert = :idOfert"),
    @NamedQuery(name = "Oferta.findByCodEmpr", query = "SELECT o FROM Oferta o WHERE o.codEmpr = :codEmpr"),
    @NamedQuery(name = "Oferta.findByCodDisc", query = "SELECT o FROM Oferta o WHERE o.codDisc = :codDisc"),
    @NamedQuery(name = "Oferta.findByAnoLeti", query = "SELECT o FROM Oferta o WHERE o.anoLeti = :anoLeti"),
    @NamedQuery(name = "Oferta.findBySemLeti", query = "SELECT o FROM Oferta o WHERE o.semLeti = :semLeti"),
    @NamedQuery(name = "Oferta.findByCodInst", query = "SELECT o FROM Oferta o WHERE o.codInst = :codInst"),
    @NamedQuery(name = "Oferta.findByNrSala", query = "SELECT o FROM Oferta o WHERE o.nrSala = :nrSala"),
    @NamedQuery(name = "Oferta.findByPeriodo", query = "SELECT o FROM Oferta o WHERE o.periodo = :periodo"),
    @NamedQuery(name = "Oferta.findByHorOfer", query = "SELECT o FROM Oferta o WHERE o.horOfer = :horOfer"),
    @NamedQuery(name = "Oferta.findByGruDisc", query = "SELECT o FROM Oferta o WHERE o.gruDisc = :gruDisc"),
    @NamedQuery(name = "Oferta.findByParPres", query = "SELECT o FROM Oferta o WHERE o.parPres = :parPres"),
    @NamedQuery(name = "Oferta.findByDesOfer", query = "SELECT o FROM Oferta o WHERE o.desOfer = :desOfer"),
    @NamedQuery(name = "Oferta.findByTotVaga", query = "SELECT o FROM Oferta o WHERE o.totVaga = :totVaga"),
    @NamedQuery(name = "Oferta.findByCargHor", query = "SELECT o FROM Oferta o WHERE o.cargHor = :cargHor"),
    @NamedQuery(name = "Oferta.findBySitOfer", query = "SELECT o FROM Oferta o WHERE o.sitOfer = :sitOfer"),
    @NamedQuery(name = "Oferta.findByDiscCte", query = "SELECT o FROM Oferta o WHERE o.discCte = :discCte"),
    @NamedQuery(name = "Oferta.findByDtImport", query = "SELECT o FROM Oferta o WHERE o.dtImport = :dtImport"),
    @NamedQuery(name = "Oferta.findByCh", query = "SELECT o FROM Oferta o WHERE o.ch = :ch"),
    @NamedQuery(name = "Oferta.findByTipOfer", query = "SELECT o FROM Oferta o WHERE o.tipOfer = :tipOfer"),
    @NamedQuery(name = "Oferta.findByCodHora", query = "SELECT o FROM Oferta o WHERE o.codHora = :codHora"),
    @NamedQuery(name = "Oferta.findByObservac", query = "SELECT o FROM Oferta o WHERE o.observac = :observac"),
    @NamedQuery(name = "Oferta.findBySitPgl", query = "SELECT o FROM Oferta o WHERE o.sitPgl = :sitPgl"),
    @NamedQuery(name = "Oferta.findByVagaOpt", query = "SELECT o FROM Oferta o WHERE o.vagaOpt = :vagaOpt"),
    @NamedQuery(name = "Oferta.findByTriLeti", query = "SELECT o FROM Oferta o WHERE o.triLeti = :triLeti"),
    @NamedQuery(name = "Oferta.findByTipoMet", query = "SELECT o FROM Oferta o WHERE o.tipoMet = :tipoMet"),
    @NamedQuery(name = "Oferta.findByVagaCre", query = "SELECT o FROM Oferta o WHERE o.vagaCre = :vagaCre"),
    @NamedQuery(name = "Oferta.findByOfeObri", query = "SELECT o FROM Oferta o WHERE o.ofeObri = :ofeObri"),
    @NamedQuery(name = "Oferta.findBySeqOfem", query = "SELECT o FROM Oferta o WHERE o.seqOfem = :seqOfem"),
    @NamedQuery(name = "Oferta.findBySitMig", query = "SELECT o FROM Oferta o WHERE o.sitMig = :sitMig"),
    @NamedQuery(name = "Oferta.findByDataCad", query = "SELECT o FROM Oferta o WHERE o.dataCad = :dataCad")})
public class Oferta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] id;
    @Column(name = "ID_OFERT")
    private Integer idOfert;
    @Column(name = "COD_EMPR")
    private Short codEmpr;
    @Column(name = "COD_DISC")
    private Integer codDisc;
    @Column(name = "ANO_LETI")
    private Short anoLeti;
    @Column(name = "SEM_LETI")
    private Short semLeti;
    @Column(name = "COD_INST")
    private Short codInst;
    @Size(max = 150)
    @Column(name = "NR_SALA", length = 150)
    private String nrSala;
    private Short periodo;
    @Column(name = "HOR_OFER")
    private Short horOfer;
    @Column(name = "GRU_DISC")
    private Short gruDisc;
    @Column(name = "PAR_PRES")
    private Short parPres;
    @Size(max = 50)
    @Column(name = "DES_OFER", length = 50)
    private String desOfer;
    @Column(name = "TOT_VAGA")
    private Integer totVaga;
    @Column(name = "CARG_HOR")
    private Short cargHor;
    @Column(name = "SIT_OFER")
    private Short sitOfer;
    @Size(max = 100)
    @Column(name = "DISC_CTE", length = 100)
    private String discCte;
    @Column(name = "DT_IMPORT")
    @Temporal(TemporalType.DATE)
    private Date dtImport;
    @Size(max = 20)
    @Column(length = 20)
    private String ch;
    @Column(name = "TIP_OFER")
    private Short tipOfer;
    @Column(name = "COD_HORA")
    private Short codHora;
    @Size(max = 100)
    @Column(length = 100)
    private String observac;
    @Column(name = "SIT_PGL")
    private Short sitPgl;
    @Column(name = "VAGA_OPT")
    private Short vagaOpt;
    @Column(name = "TRI_LETI")
    private Short triLeti;
    @Column(name = "TIPO_MET")
    private Short tipoMet;
    @Column(name = "VAGA_CRE")
    private Short vagaCre;
    @Column(name = "OFE_OBRI")
    private Short ofeObri;
    @Column(name = "SEQ_OFEM")
    private Short seqOfem;
    @Column(name = "SIT_MIG")
    private Short sitMig;
    @Column(name = "DATA_CAD")
    @Temporal(TemporalType.DATE)
    private Date dataCad;

    public Oferta() {
    }

    public Oferta(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public Integer getIdOfert() {
        return idOfert;
    }

    public void setIdOfert(Integer idOfert) {
        this.idOfert = idOfert;
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

    public Short getCodInst() {
        return codInst;
    }

    public void setCodInst(Short codInst) {
        this.codInst = codInst;
    }

    public String getNrSala() {
        return nrSala;
    }

    public void setNrSala(String nrSala) {
        this.nrSala = nrSala;
    }

    public Short getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Short periodo) {
        this.periodo = periodo;
    }

    public Short getHorOfer() {
        return horOfer;
    }

    public void setHorOfer(Short horOfer) {
        this.horOfer = horOfer;
    }

    public Short getGruDisc() {
        return gruDisc;
    }

    public void setGruDisc(Short gruDisc) {
        this.gruDisc = gruDisc;
    }

    public Short getParPres() {
        return parPres;
    }

    public void setParPres(Short parPres) {
        this.parPres = parPres;
    }

    public String getDesOfer() {
        return desOfer;
    }

    public void setDesOfer(String desOfer) {
        this.desOfer = desOfer;
    }

    public Integer getTotVaga() {
        return totVaga;
    }

    public void setTotVaga(Integer totVaga) {
        this.totVaga = totVaga;
    }

    public Short getCargHor() {
        return cargHor;
    }

    public void setCargHor(Short cargHor) {
        this.cargHor = cargHor;
    }

    public Short getSitOfer() {
        return sitOfer;
    }

    public void setSitOfer(Short sitOfer) {
        this.sitOfer = sitOfer;
    }

    public String getDiscCte() {
        return discCte;
    }

    public void setDiscCte(String discCte) {
        this.discCte = discCte;
    }

    public Date getDtImport() {
        return dtImport;
    }

    public void setDtImport(Date dtImport) {
        this.dtImport = dtImport;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public Short getTipOfer() {
        return tipOfer;
    }

    public void setTipOfer(Short tipOfer) {
        this.tipOfer = tipOfer;
    }

    public Short getCodHora() {
        return codHora;
    }

    public void setCodHora(Short codHora) {
        this.codHora = codHora;
    }

    public String getObservac() {
        return observac;
    }

    public void setObservac(String observac) {
        this.observac = observac;
    }

    public Short getSitPgl() {
        return sitPgl;
    }

    public void setSitPgl(Short sitPgl) {
        this.sitPgl = sitPgl;
    }

    public Short getVagaOpt() {
        return vagaOpt;
    }

    public void setVagaOpt(Short vagaOpt) {
        this.vagaOpt = vagaOpt;
    }

    public Short getTriLeti() {
        return triLeti;
    }

    public void setTriLeti(Short triLeti) {
        this.triLeti = triLeti;
    }

    public Short getTipoMet() {
        return tipoMet;
    }

    public void setTipoMet(Short tipoMet) {
        this.tipoMet = tipoMet;
    }

    public Short getVagaCre() {
        return vagaCre;
    }

    public void setVagaCre(Short vagaCre) {
        this.vagaCre = vagaCre;
    }

    public Short getOfeObri() {
        return ofeObri;
    }

    public void setOfeObri(Short ofeObri) {
        this.ofeObri = ofeObri;
    }

    public Short getSeqOfem() {
        return seqOfem;
    }

    public void setSeqOfem(Short seqOfem) {
        this.seqOfem = seqOfem;
    }

    public Short getSitMig() {
        return sitMig;
    }

    public void setSitMig(Short sitMig) {
        this.sitMig = sitMig;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
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
        if (!(object instanceof Oferta)) {
            return false;
        }
        Oferta other = (Oferta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rematricula.Oferta[ id=" + id + " ]";
    }

}
