package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class InstanceDeBasseDeDonnes implements Serializable {
			
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   @NotEmpty
	   private String nom;
	   
	   private String criticite;
	   private Date dateDeMiseEnProduction;
	   private String description;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private java.util.Collection<SolutionApplicative> solutionApplicative;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Contact> contacts;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Contrat> contrats;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Document> documents;
	   
	   //@NotEmpty
	   @ManyToOne(cascade = CascadeType.ALL)
	   @JoinColumn(name="id_serBD")
	   private ServeurDeBasseDeDonnees serveurDeBasseDeDonnees;
		   
		public InstanceDeBasseDeDonnes() {
			super();
			// TODO Auto-generated constructor stub
		}
		public InstanceDeBasseDeDonnes(String nom, String criticite, Date dateDeMiseEnProduction,
				String description) {
			super();
			this.nom = nom;
			this.criticite = criticite;
			this.dateDeMiseEnProduction = dateDeMiseEnProduction;
			this.description = description;
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
		public String getCriticite() {
			return criticite;
		}
		public void setCriticite(String criticite) {
			this.criticite = criticite;
		}
		public Date getDateDeMiseEnProduction() {
			return dateDeMiseEnProduction;
		}
		public void setDateDeMiseEnProduction(Date dateDeMiseEnProduction) {
			this.dateDeMiseEnProduction = dateDeMiseEnProduction;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public java.util.Collection<SolutionApplicative> getSolutionApplicative() {
			return solutionApplicative;
		}
		public void setSolutionApplicative(java.util.Collection<SolutionApplicative> solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}
		public ServeurDeBasseDeDonnees getServeurDeBasseDeDonnees() {
			return serveurDeBasseDeDonnees;
		}
		public void setServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees serveurDeBasseDeDonnees) {
			this.serveurDeBasseDeDonnees = serveurDeBasseDeDonnees;
		}
		public Collection<Contact> getContacts() {
			return contacts;
		}
		public void setContacts(Collection<Contact> contacts) {
			this.contacts = contacts;
		}
		public Collection<Contrat> getContrats() {
			return contrats;
		}
		public void setContrats(Collection<Contrat> contrats) {
			this.contrats = contrats;
		}
		public Collection<Document> getDocuments() {
			return documents;
		}
		public void setDocuments(Collection<Document> documents) {
			this.documents = documents;
		}
		   
   
   
   

}