package com.bezkoder.spring.datajpa.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bezkoder.spring.datajpa.dto.ResponseLivreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.spring.datajpa.model.Livre;
import com.bezkoder.spring.datajpa.repository.LivreRepository;


@RestController
@RequestMapping("livres")
public class LivreController {

    @Autowired
    LivreRepository livreRepository;

    @GetMapping()
    public Iterable<ResponseLivreDto> allLivres() {

        List<ResponseLivreDto> livreDto =
                livreRepository.findAll().stream()
                        .map(livre -> {
                            return ResponseLivreDto.LivreToResponseLivreDto(livre);
                        })
                        .collect(Collectors.toList());

        return livreDto;
    }


    @GetMapping("/{IdLivre}")
    public Livre getLivreById(@PathVariable Long IdLivre) {
        return livreRepository.getById(IdLivre);
    }

    @PostMapping("")
    //@PreAuthorize("hasRole('USER')")
    public Livre save(@RequestBody Livre livre) {
        return livreRepository.save(livre);
    }

    @PutMapping("")
    public Livre Update(@RequestBody Livre livre) {
        return livreRepository.save(livre);
    }

    @DeleteMapping("/{idLivre}")
    public void deleteConge(@PathVariable Long idLivre) {
        livreRepository.deleteById(idLivre);
    }


}
