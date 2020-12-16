package com.exampleProject.scuola.Repository;

import java.util.List;

import com.exampleProject.scuola.Entity.Alunno;

public interface alunnoRepository {

	
	List<Alunno> alunnoList();
	
	Alunno inserisciAlunno(Alunno alunno);
	
	Alunno modificaAlunno(Alunno alunno);
	
	Alunno cancellaAlunno(Alunno alunno);
}
