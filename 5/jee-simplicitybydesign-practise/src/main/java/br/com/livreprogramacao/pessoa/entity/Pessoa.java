/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livreprogramacao.pessoa.entity;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class Pessoa {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PESSOA_ID", nullable = false)
    private Long id;
    
    private String nome = "Nome teste";
    private String endereco;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String cpf;// JPA specification
    private String rg;
    private String hobby1;
    private String hobby2;
    private String hobby3;
    private String hobby4;
    private String hobby5;
    private String esporte1;
    private String esporte2;
    private String esporte3;
    private String esporte4;
    private String esporte5;
    private String alimento1;
    private String alimento2;
    private String alimento3;
    private String alimento4;
    private String alimento5;

    public Pessoa() {
        // JPA specification
    }

    /**
     *
     * @param _nome
     */
    public Pessoa(final String _nome) {
        this.nome = _nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", complemento=" + complemento + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", telefone=" + telefone + ", cpf=" + cpf + ", rg=" + rg + ", hobby1=" + hobby1 + ", hobby2=" + hobby2 + ", hobby3=" + hobby3 + ", hobby4=" + hobby4 + ", hobby5=" + hobby5 + ", esporte1=" + esporte1 + ", esporte2=" + esporte2 + ", esporte3=" + esporte3 + ", esporte4=" + esporte4 + ", esporte5=" + esporte5 + ", alimento1=" + alimento1 + ", alimento2=" + alimento2 + ", alimento3=" + alimento3 + ", alimento4=" + alimento4 + ", alimento5=" + alimento5 + '}';
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getHobby1() {
        return hobby1;
    }

    public void setHobby1(String hobby1) {
        this.hobby1 = hobby1;
    }

    public String getHobby2() {
        return hobby2;
    }

    public void setHobby2(String hobby2) {
        this.hobby2 = hobby2;
    }

    public String getHobby3() {
        return hobby3;
    }

    public void setHobby3(String hobby3) {
        this.hobby3 = hobby3;
    }

    public String getHobby4() {
        return hobby4;
    }

    public void setHobby4(String hobby4) {
        this.hobby4 = hobby4;
    }

    public String getHobby5() {
        return hobby5;
    }

    public void setHobby5(String hobby5) {
        this.hobby5 = hobby5;
    }

    public String getEsporte1() {
        return esporte1;
    }

    public void setEsporte1(String esporte1) {
        this.esporte1 = esporte1;
    }

    public String getEsporte2() {
        return esporte2;
    }

    public void setEsporte2(String esporte2) {
        this.esporte2 = esporte2;
    }

    public String getEsporte3() {
        return esporte3;
    }

    public void setEsporte3(String esporte3) {
        this.esporte3 = esporte3;
    }

    public String getEsporte4() {
        return esporte4;
    }

    public void setEsporte4(String esporte4) {
        this.esporte4 = esporte4;
    }

    public String getEsporte5() {
        return esporte5;
    }

    public void setEsporte5(String esporte5) {
        this.esporte5 = esporte5;
    }

    public String getAlimento1() {
        return alimento1;
    }

    public void setAlimento1(String alimento1) {
        this.alimento1 = alimento1;
    }

    public String getAlimento2() {
        return alimento2;
    }

    public void setAlimento2(String alimento2) {
        this.alimento2 = alimento2;
    }

    public String getAlimento3() {
        return alimento3;
    }

    public void setAlimento3(String alimento3) {
        this.alimento3 = alimento3;
    }

    public String getAlimento4() {
        return alimento4;
    }

    public void setAlimento4(String alimento4) {
        this.alimento4 = alimento4;
    }

    public String getAlimento5() {
        return alimento5;
    }

    public void setAlimento5(String alimento5) {
        this.alimento5 = alimento5;
    }

}
