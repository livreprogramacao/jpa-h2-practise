package com.axis.soap.tutorial.agendawebservice;

import com.axis.soap.tutorial.agendawebservice.entidade.Contato;
import com.axis.soap.tutorial.agendawebservice.interfaces.IAgenda;
import java.util.Collection;

public class AgendaWeb {

	private static final IAgenda AGENDA = inicialize();

	private static IAgenda inicialize() {
		return AgendaFabrica.getInstance(AgendaFabrica.AGENDALIST);
	}

	public void adicionaContato(Contato c) throws Exception {
		AGENDA.adicionaContato(c);
	}

	public void removeContato(String t) throws Exception {
		AGENDA.removeContato(t);
	}

	public Contato localizaContato(String t) throws Exception {
		return AGENDA.localizaContato(t);
	}

	public Collection listaContato() throws Exception {
		return AGENDA.listaContato();
	}
}