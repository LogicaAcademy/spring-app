package com.exampleProject.scuola.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Serve a dire che questa classe sarà mappata su di una tabella
public class Alunno {
	
	@Id //indentifica la nostra chiave primaria
	
	private int id;
	private String nome;
	private String cognome;
	private int anni;
	
	
	public Alunno() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getAnni() {
		return anni;
	}
	public void setAnni(int anni) {
		this.anni = anni;
	}
	
	
}
