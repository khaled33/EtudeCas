package com.bezkoder.spring.datajpa.controller;
import java.security.Principal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.datajpa.model.Auteur;
import com.bezkoder.spring.datajpa.repository.AuteurRepository;


@RestController
@RequestMapping("auteurs")
public class AuteurController {

	@Autowired
	AuteurRepository auteurRepository;
	
	@GetMapping("/all")
	public Iterable<Auteur>allLivres() {
		return auteurRepository.findAll();
	}

	@PostMapping("/save")
	//@PreAuthorize("hasRole('USER')")
	public Auteur  save(@RequestBody Auteur auteur  ) {	
		return auteurRepository.save(auteur);
	}
	
	@DeleteMapping("/{idLivre}")
	public void deleteConge(@PathVariable Long idLivre) {
		auteurRepository.deleteById(idLivre);	
	}
	
//	@GetMapping("/auteur/{idLivre}")
//	public Iterable<Auteur>allByLivre() {
//			return auteurRepository.findByLivre();
//	}
//	
}
