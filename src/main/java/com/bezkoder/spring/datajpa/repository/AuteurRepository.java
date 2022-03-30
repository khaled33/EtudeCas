package com.bezkoder.spring.datajpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.Auteur;






public interface AuteurRepository extends JpaRepository<Auteur, Long>{
	

	
//@Query(" select c from Auteur as c , livre_auteur as u1  where c.idAuteur = u1.auteur.id and u1.livre.id = 2")
//Iterable<Auteur>findByLivre();	

}
