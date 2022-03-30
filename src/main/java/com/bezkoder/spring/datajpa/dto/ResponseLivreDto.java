package com.bezkoder.spring.datajpa.dto;

import com.bezkoder.spring.datajpa.model.Auteur;
import com.bezkoder.spring.datajpa.model.Livre;

import java.util.Set;

public class ResponseLivreDto {

    private Long id;
    private String titre;
    private String urlimage;
    private String resume;
    Set<Auteur> auteurs;

    public static ResponseLivreDto LivreToResponseLivreDto(Livre livre){
        ResponseLivreDto livreDto=new ResponseLivreDto();
        livreDto.setId(livre.getIdLivre());
        livreDto.setTitre(livre.getTitre());
        livreDto.setUrlimage(livre.getImage());
        livreDto.setResume(livre.getResume());
        livreDto.setAuteurs(livre.getAuteurs());
        return livreDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getUrlimage() {
        return urlimage;
    }

    public void setUrlimage(String urlimage) {
        this.urlimage = urlimage;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Set<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(Set<Auteur> auteurs) {
        this.auteurs = auteurs;
    }
}
