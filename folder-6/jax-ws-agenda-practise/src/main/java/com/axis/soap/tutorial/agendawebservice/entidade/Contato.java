package com.axis.soap.tutorial.agendawebservice.entidade;

public class Contato {
	private String nome;

	private String telefone;

	public Contato() {
	}

	public Contato(String n, String t) {
		setNome(n);
		setTelefone(t);
	}

	public String getNome() {
		return this.nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public void setTelefone(String t) {
		this.telefone = t;
	}

	public String toString() {
		return "Nome: " + getNome() + "\tTelefone: " + getTelefone();
	}

	public boolean equals(Object o) {
		Contato c = (Contato) o;
		return this.telefone.equals(c.getTelefone());
	}
}