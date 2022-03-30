    package com.bezkoder.spring.datajpa.model;
	import java.io.Serializable;
    import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import javax.xml.bind.annotation.XmlRootElement;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


 	@Entity
	@Table(name="auteur")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	public class Auteur implements Serializable{
		private static final long serialVersionUID = 1L;
		@Id
		@Column(name="idAuteur")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long idAuteur;
		
		@Column(name = "cin")
		private String   cin;
  
		@Column(name = "nom")
		private String   nom;
		
		@Column(name = "prenom")
		private String  prenom;
		
		@Column(name = "domaine")
		private String  domaine;
		
		@Column(name = "datenaissance")
		private Date  datenaissance;


  
		public Auteur() {
			super();
		
		}

		public Auteur(Long idAuteur, String cin, String nom, String prenom, String domaine, Date datenaissance) {
			super();
			this.idAuteur = idAuteur;
			this.cin = cin;
			this.nom = nom;
			this.prenom = prenom;
			this.domaine = domaine;
			this.datenaissance = datenaissance;
			
		}

		public Long getIdAuteur() {
			return idAuteur;
		}


		public void setIdAuteur(Long idAuteur) {
			this.idAuteur = idAuteur;
		}


		public String getCin() {
			return cin;
		}


		public void setCin(String cin) {
			this.cin = cin;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenom() {
			return prenom;
		}


		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		public String getDomaine() {
			return domaine;
		}


		public void setDomaine(String domaine) {
			this.domaine = domaine;
		}


		public Date getDatenaissance() {
			return datenaissance;
		}


		public void setDatenaissance(Date datenaissance) {
			this.datenaissance = datenaissance;
		}



		
		
	}