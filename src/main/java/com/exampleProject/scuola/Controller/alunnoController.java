package com.exampleProject.scuola.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exampleProject.scuola.Entity.Alunno;
import com.exampleProject.scuola.Service.alunnoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/alunno")
public class alunnoController {

	@Autowired
	alunnoService as;
	
	
	//GET
	@GetMapping("/lista-alunni")
	public ResponseEntity<List<Alunno>> alunnoList(){
		List listaAlunni = as.alunnoList();
		return new ResponseEntity<List<Alunno>>(listaAlunni, HttpStatus.OK);
	}

	//POST
	@PostMapping("/inserisci-alunno")
	public ResponseEntity<Alunno> inserisciAlunno(@RequestBody Alunno alunno) {
		Alunno alunnoResult = as.inserisciAlunno(alunno);
		return new ResponseEntity<Alunno>(alunnoResult, HttpStatus.CREATED);
	}
	
	//PUT
	@PutMapping("/modifica-alunno")
	public ResponseEntity<Alunno> modificaAlunno(@RequestBody Alunno alunno) {
		Alunno alunnoResult = as.modificaAlunno(alunno);
		return new ResponseEntity<Alunno>(alunnoResult, HttpStatus.OK);
	}
	
	//DELETE
	@DeleteMapping("/cancella-alunno")
	public ResponseEntity<Alunno> cancellaAlunno(@RequestBody Alunno alunno) {
		Alunno alunnoResult = as.cancellaAlunno(alunno);
		return new ResponseEntity<Alunno>(alunnoResult, HttpStatus.OK);
	}
}
