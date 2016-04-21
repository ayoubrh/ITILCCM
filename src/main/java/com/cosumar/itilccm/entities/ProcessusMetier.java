package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class ProcessusMetier implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String statut;
   private String criticite;
   private Date dateDeMiseDeProduction;
   private String description;
   
   	@ManyToMany
   	@Column(nullable=true)
   private Collection<SolutionApplicative> solutionApplicative;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Date getDateDeMiseDeProduction() {
		return dateDeMiseDeProduction;
	}

	public void setDateDeMiseDeProduction(Date dateDeMiseDeProduction) {
		this.dateDeMiseDeProduction = dateDeMiseDeProduction;
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
   
   	
   

}