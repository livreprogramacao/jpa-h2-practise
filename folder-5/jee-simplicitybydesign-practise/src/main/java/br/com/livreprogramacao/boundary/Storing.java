/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livreprogramacao.boundary;

import br.com.livreprogramacao.control.PessoaStore;
import br.com.livreprogramacao.pessoa.entity.Pessoa;
import java.util.List;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author user
 */
@Stateless
public class Storing {

    @Inject
    PessoaStore pessoaStore;

    @Asynchronous
    public void store(Pessoa formulario) {
        System.out.format("\n=== Debug ===\nStoring.store() : Pessoa %s", formulario);
        pessoaStore.store(formulario);
    }

    public List<Pessoa> getFormularios() {
        return pessoaStore.getFormularios();
    }

}
