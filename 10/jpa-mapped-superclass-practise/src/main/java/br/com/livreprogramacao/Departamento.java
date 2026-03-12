package br.com.livreprogramacao;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author user
 */
@MappedSuperclass
public abstract class Departamento {

    private String nome;

    public abstract void calcularDespesasDoMes();

    // get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
