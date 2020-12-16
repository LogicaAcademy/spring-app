package com.exampleProject.scuola.Service;

import java.util.List;

import com.exampleProject.scuola.Entity.Alunno;

public interface alunnoService {

	List<Alunno> alunnoList();
	
	Alunno inserisciAlunno(Alunno alunno);
	
	Alunno modificaAlunno(Alunno alunno);
	
	Alunno cancellaAlunno(Alunno alunno);
	
	
}
