package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Lieu implements Serializable {
	
			   @Id
			   @GeneratedValue(strategy=GenerationType.IDENTITY)
			   private Long id;
			   
			   @NotEmpty
			   private String nom;
			   private String statut;
			   
			   @NotEmpty
			   @Size(min=4,max=30)
			   private String organisme;
			   
			   private String adresse;
			   
			   @Column(nullable=true)
			   @Size(max=5)
			   @Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
			   private String codePostale;
			   
			   private String ville;
			   private String pays;
			   
			   @Column(nullable=true)
			   @OneToMany(mappedBy="lieu")
			   private Collection<Contact> contacts;
	
		public Lieu() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	   

		public String getNom() {
			return nom;
		}



		public void setNom(String nom) {
			this.nom = nom;
		}



		public Lieu(String nom, String statut, String organisme, String adresse, String codePostale, String ville,
				String pays) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.organisme = organisme;
			this.adresse = adresse;
			this.codePostale = codePostale;
			this.ville = ville;
			this.pays = pays;
		}



		public Long getId() {
			return id;
		}
		
		
		public void setId(Long id) {
			this.id = id;
		}
		
		
		public String getStatut() {
			return statut;
		}
		
		
		public void setStatut(String statut) {
			this.statut = statut;
		}
		
		
		public String getOrganisme() {
			return organisme;
		}
		
		
		public void setOrganisme(String organisme) {
			this.organisme = organisme;
		}
		
		
		public String getAdresse() {
			return adresse;
		}
		
		
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		
		
		public String getCodePostale() {
			return codePostale;
		}
		
		
		public void setCodePostale(String codePostale) {
			this.codePostale = codePostale;
		}
		
		
		public String getVille() {
			return ville;
		}
		
		
		public void setVille(String ville) {
			this.ville = ville;
		}
		
		
		public String getPays() {
			return pays;
		}
		
		
		public void setPays(String pays) {
			this.pays = pays;
		}
		
		
		public Collection<Contact> getContact() {
			return contacts;
		}
		
		
		public void setContact(Collection<Contact> contact) {
			this.contacts = contact;
		}
		


   

}