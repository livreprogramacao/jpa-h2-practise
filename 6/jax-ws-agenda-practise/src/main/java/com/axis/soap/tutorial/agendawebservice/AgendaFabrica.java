/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axis.soap.tutorial.agendawebservice;

import com.axis.soap.tutorial.agendawebservice.interfaces.implementacao.AgendaList;
import com.axis.soap.tutorial.agendawebservice.interfaces.implementacao.AgendaMap;
import com.axis.soap.tutorial.agendawebservice.interfaces.IAgenda;
import com.axis.soap.tutorial.agendawebservice.interfaces.implementacao.AgendaList;
import com.axis.soap.tutorial.agendawebservice.interfaces.implementacao.AgendaMap;

public class AgendaFabrica {
	public static final int AGENDAMAP = 1;

	public static final int AGENDALIST = 2;

	private static IAgenda ifa;

	private AgendaFabrica(int tipo) {
		switch (tipo) {
		case AgendaFabrica.AGENDAMAP:
			ifa = new AgendaMap();
		case AgendaFabrica.AGENDALIST:
			ifa = new AgendaList();
		}
	}

	public static IAgenda getInstance(int tipo) {
		if (ifa == null)
			new AgendaFabrica(tipo);
		return ifa;
	}
}