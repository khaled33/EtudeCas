package com.bezkoder.spring.datajpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.Livre;





public interface LivreRepository extends JpaRepository<Livre, Long>  {

}
