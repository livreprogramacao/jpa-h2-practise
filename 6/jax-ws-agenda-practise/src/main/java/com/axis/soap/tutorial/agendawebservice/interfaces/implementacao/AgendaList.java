/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axis.soap.tutorial.agendawebservice.interfaces.implementacao;

import com.axis.soap.tutorial.agendawebservice.entidade.Contato;
import com.axis.soap.tutorial.agendawebservice.interfaces.IAgenda;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class AgendaList implements IAgenda {
	private List listaContato = new ArrayList();

	private int localizaContatoI(String t) {
		Contato c = new Contato();
		c.setTelefone(t);
		return this.listaContato.indexOf(c);
	}

	public void adicionaContato(Contato c) throws Exception {
		if ((localizaContatoI(c.getTelefone()) == -1)) {
			this.listaContato.add(c);
		} else {
			throw new Exception("Contato já cadastrado!");
		}
	}

	public Contato localizaContato(String t) throws Exception {
		Contato c = (Contato) this.listaContato.get(this.localizaContatoI(t));
		if (c instanceof Contato) {
			return c;
		} else {
			throw new Exception("Contato não cadastrado!");
		}
	}

	public void removeContato(String t) throws Exception {
		if (!(this.localizaContatoI(t) == -1)) {
			this.listaContato.remove(this.localizaContatoI(t));
		} else {
			throw new Exception("Contato não cadastrado!");
		}
	}

	public Collection listaContato() throws Exception {
		if (this.listaContato.size() > 0) {
			return this.listaContato;
		} else {
			throw new Exception("Não existem contatos cadastrados");
		}
	}
}