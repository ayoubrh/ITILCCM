package com.cosumar.itilccm.entities;

import java.util.*;

public class ApplicationWeb {
   private int id;
   private String nom;
   private String url;
   private String critiicite;
   private Date dateDeMiseEnnProduction;
   private String description;
   
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association54 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<SolutionApplicative> solutionApplicative;
   /** @pdRoleInfo migr=no name=ServeurDeBasseDeDonnees assc=association42 mult=0..* side=A */
   private ServeurDeBasseDeDonnees[] serveurDeBasseDeDonnees;
   
   
	
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
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getCritiicite() {
		return critiicite;
	}
	
	public void setCritiicite(String critiicite) {
		this.critiicite = critiicite;
	}
	
	public Date getDateDeMiseEnnProduction() {
		return dateDeMiseEnnProduction;
	}
	
	public void setDateDeMiseEnnProduction(Date dateDeMiseEnnProduction) {
		this.dateDeMiseEnnProduction = dateDeMiseEnnProduction;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ServeurDeBasseDeDonnees[] getServeurDeBasseDeDonnees() {
		return serveurDeBasseDeDonnees;
	}
	
	public void setServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees[] serveurDeBasseDeDonnees) {
		this.serveurDeBasseDeDonnees = serveurDeBasseDeDonnees;
	}

	public java.util.Collection<SolutionApplicative> getSolutionApplicative() {
		return solutionApplicative;
	}

	public void setSolutionApplicative(java.util.Collection<SolutionApplicative> solutionApplicative) {
		this.solutionApplicative = solutionApplicative;
	}
	
	
	
	   
   
   
   

}