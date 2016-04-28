package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Document implements Serializable {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   @NotEmpty
	   private String nom;
	   
	   private String statut;
	   private String version;
	   private String type;
	   private String description;
	   private String fichier;
	   
	   @Lob
	   private byte[] bfichier;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<Contrat> contrats;

		public Document() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Document(String nom, String statut, String version, String type, String description, String fichier, byte[] bfichier) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.version = version;
			this.type = type;
			this.description = description;
			this.fichier = fichier;
			this.bfichier = bfichier;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getStatut() {
			return statut;
		}

		public void setStatut(String statut) {
			this.statut = statut;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		

		public String getFichier() {
			return fichier;
		}

		public void setFichier(String fichier) {
			this.fichier = fichier;
		}

		public byte[] getBfichier() {
			return bfichier;
		}

		public void setBfichier(byte[] bfichier) {
			this.bfichier = bfichier;
		}

		public Collection<Contrat> getContrats() {
			return contrats;
		}

		public void setContrats(Collection<Contrat> contrats) {
			this.contrats = contrats;
		}
		   
		   
   
   

}