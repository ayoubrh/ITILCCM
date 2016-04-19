package com.cosumar.itilccm.entities;

import java.util.*;

public class ProessusMetier {
      private int id;
      private String nom;
      private String statut;
      private String criticite;
      private Date dateDeMiseDeProduction;
      private String description;
   
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association18 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<SolutionApplicative> solutionApplicative;
   
   
   

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

	public java.util.Collection<SolutionApplicative> getSolutionApplicative() {
		return solutionApplicative;
	}

	public void setSolutionApplicative(java.util.Collection<SolutionApplicative> solutionApplicative) {
		this.solutionApplicative = solutionApplicative;
	}
	
	
	
   
   
   

}