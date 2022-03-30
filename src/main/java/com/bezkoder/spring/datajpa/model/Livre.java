    package com.bezkoder.spring.datajpa.model;
	import java.io.Serializable;
    import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import javax.xml.bind.annotation.XmlRootElement;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


 	@Entity
	@Table(name="livre")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	public class Livre implements Serializable{
		/**
		 * 
		 */	
		private static final long serialVersionUID = 1L;
		@Id
		@Column(name="idLivre")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long idLivre;
		
		

		@Column(name = "titre")
		private String   titre;
  
		@Column(name = "ISBN")
		private String   isbn;

		@Column(name = "dateedition")
		private Date  anneedition;
		
		
		@Column(name = "nombrepages")
		private int  pages;
		
		
		
		@Column(name = "prix")
		private double  prix;
				
		//image 
		@Column(name = "UrlImage")
		private String  image;
		//resumé
		@Column(name = "resume")
		private String  resume;
		@ManyToMany()
		Set<Auteur> auteurs;
	
		
		public Livre() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Livre(Long idLivre, String titre, String isbn, Date anneedition, int pages, double prix) {
			super();
			this.idLivre = idLivre;
			this.titre = titre;
			this.isbn = isbn;
			this.anneedition = anneedition;
			this.pages = pages;
			this.prix = prix;
		}

		public String getResume() {
			return resume;
		}

		public void setResume(String resume) {
			this.resume = resume;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public Long getIdLivre() {
			return idLivre;
		}




		public void setIdLivre(Long idLivre) {
			this.idLivre = idLivre;
		}




		public String getTitre() {
			return titre;
		}




		public void setTitre(String titre) {
			this.titre = titre;
		}




		public String getIsbn() {
			return isbn;
		}




		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}




		public Date getAnneedition() {
			return anneedition;
		}




		public void setAnneedition(Date anneedition) {
			this.anneedition = anneedition;
		}




		public int getPages() {
			return pages;
		}




		public void setPages(int pages) {
			this.pages = pages;
		}




		public double getPrix() {
			return prix;
		}




		public void setPrix(double prix) {
			this.prix = prix;
		}

		public Set<Auteur> getAuteurs() {
			return auteurs;
		}

		public void setAuteurs(Set<Auteur> auteurs) {
			this.auteurs = auteurs;
		}
	}
