package com.exampleProject.scuola.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.exampleProject.scuola.Entity.Alunno;

@Repository
public class alunnoRepositoryImpl implements alunnoRepository{

	@PersistenceContext
	EntityManager entityManager; 
	
	
	@Override
	public List<Alunno> alunnoList() {
		javax.persistence.Query q= entityManager.createQuery("Select u From Alunno u");
		return q.getResultList();
	}


	@Override
	@Transactional
	public Alunno inserisciAlunno(Alunno alunno) {
		entityManager.persist(alunno);
		return alunno;
	}


	@Override
	@Transactional
	public Alunno modificaAlunno(Alunno alunno) {
		return entityManager.merge(alunno);
	}


	@Override
	@Transactional
	public Alunno cancellaAlunno(Alunno alunno) {
		Alunno a =  entityManager.find(Alunno.class, alunno.getId());
	entityManager.remove(a);
		return alunno;
	}

	
	
}
