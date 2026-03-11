/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axis.soap.tutorial.agendawebservice.interfaces;


import com.axis.soap.tutorial.agendawebservice.entidade.Contato;
import java.util.*;

public interface IAgenda {
	public void adicionaContato(Contato c) throws Exception;

	public void removeContato(String t) throws Exception;

	public Contato localizaContato(String t) throws Exception;

	public Collection listaContato() throws Exception;
}
