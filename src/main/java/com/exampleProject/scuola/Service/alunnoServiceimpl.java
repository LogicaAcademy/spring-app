package com.exampleProject.scuola.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleProject.scuola.Entity.Alunno;
import com.exampleProject.scuola.Repository.alunnoRepository;

@Service
public class alunnoServiceimpl implements alunnoService {

	@Autowired
	alunnoRepository ar;
	
	@Override
	public List<Alunno> alunnoList() {
		return ar.alunnoList();
	}

	@Override
	public Alunno inserisciAlunno(Alunno alunno) {
		
		return ar.inserisciAlunno(alunno);
	}

	@Override
	public Alunno modificaAlunno(Alunno alunno) {
		
		return ar.modificaAlunno(alunno);
	}

	@Override
	public Alunno cancellaAlunno(Alunno alunno) {

		return ar.cancellaAlunno(alunno);
	}


}
