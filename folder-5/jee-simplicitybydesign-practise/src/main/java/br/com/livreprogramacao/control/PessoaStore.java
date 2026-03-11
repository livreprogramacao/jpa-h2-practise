/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livreprogramacao.control;

import br.com.livreprogramacao.pessoa.entity.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class PessoaStore {

    @PersistenceContext
    EntityManager em;

    public void store(Pessoa pessoa) {
        System.out.format("\n=== Debug ===\nPessoaStore.store() : Pessoa %s", pessoa);
        em.persist(pessoa);
        em.flush();
        System.out.format("\n=== Debug ===\nPessoaStore.store() : Pessoa id %s", pessoa.getId());

        for (Pessoa p : this.getFormularios()) {
            System.out.println("pessoa: " + p.getNome());

        }
    }

    public List<Pessoa> getFormularios() {
        return em.createQuery("SELECT P FROM Pessoa p").getResultList();
    }

}
