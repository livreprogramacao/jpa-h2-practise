package br.com.livreprogramacao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class RecursosHumanos extends Departamento implements Serializable {

    private static final long serialVersionUID = 43512508460061537L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Basic
    String departamento;

    public RecursosHumanos() {
    }

    RecursosHumanos(long l, String departamento1) {
        this.id = l;
        this.departamento = departamento1;
    }

    @Override
    public void calcularDespesasDoMes() {
        // realiza os cálculos
    }

    @Override
    public String toString() {
        return "RecursosHumanos{" + "id=" + id + ", departamento=" + departamento + '}';
    }

    
    /**
     *
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     *
     * @param _departamento
     */
    public void setDepartamento(final String _departamento) {
        this.departamento = _departamento;
    }

}
