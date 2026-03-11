/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axis.soap.tutorial.agendawebservice.interfaces.implementacao;

import com.axis.soap.tutorial.agendawebservice.entidade.Contato;
import com.axis.soap.tutorial.agendawebservice.interfaces.IAgenda;
import java.util.Collection;
import java.util.HashMap;


public class AgendaMap implements IAgenda {
	private HashMap listaContato = new HashMap();

	public void adicionaContato(Contato c) throws Exception {
		if (!(this.listaContato.containsKey(c.getTelefone()))) {
			this.listaContato.put(c.getTelefone(), (Contato) c);
		} else {
			throw new Exception("Contato já cadastrado!");
		}
	}

	public Contato localizaContato(String t) throws Exception {
		Contato c = (Contato) this.listaContato.get(t);
		if (c instanceof Contato) {
			return c;
		} else {
			throw new Exception("Contato não cadastrado!");
		}
	}

	public void removeContato(String t) throws Exception {
		if (this.listaContato.containsKey(t)) {
			this.listaContato.remove(t);
		} else {
			throw new Exception("Contato não cadastrado!");
		}
	}

	public Collection listaContato() throws Exception {
		if (this.listaContato.size() > 0) {
			return this.listaContato.values();
		} else {
			throw new Exception("Não existem contatos cadastrados");
		}
	}
}