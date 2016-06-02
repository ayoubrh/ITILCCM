package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class ProcessusMetier implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String statut;
   private String criticite;
   private Date dateDeMiseEnProduction;
   private String description;
   
   	@Column(nullable=true)
   	@ManyToMany(cascade = CascadeType.ALL)
   	@LazyCollection(LazyCollectionOption.FALSE)
    private Collection<SolutionApplicative> solutionApplicative;
   	
   	@Column(nullable=true)
	@ManyToMany(cascade = CascadeType.ALL)
   	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Contact> contacts;
	
	@Column(nullable=true)
	@ManyToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Document> documents;
	
	@Column(nullable=true)
	@ManyToMany(mappedBy="processusMetier",cascade = CascadeType.ALL)
	private Collection<Groupe> groupe;
   	
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

	public Collection<SolutionApplicative> getSolutionApplicative() {
		return solutionApplicative;
	}

	public void setSolutionApplicative(Collection<SolutionApplicative> solutionApplicative) {
		this.solutionApplicative = solutionApplicative;
	}

	public ProcessusMetier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProcessusMetier(String nom, String statut, String criticite, Date dateDeMiseEnProduction,
			String description) {
		super();
		this.nom = nom;
		this.statut = statut;
		this.criticite = criticite;
		this.dateDeMiseEnProduction = dateDeMiseEnProduction;
		this.description = description;
	}

	public ProcessusMetier(String nom) {
		super();
		this.nom = nom;
	}

	public Collection<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Collection<Contact> contacts) {
		this.contacts = contacts;
	}

	public Collection<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Collection<Document> documents) {
		this.documents = documents;
	}

	public Collection<Groupe> getGroupe() {
		return groupe;
	}

	public void setGroupe(Collection<Groupe> groupe) {
		this.groupe = groupe;
	}
	
 
}