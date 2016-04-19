package com.cosumar.itilccm.entities;

import java.util.*;

public class InstanceDeBasseDeDonnes {
      private int id;
      private String nom;
      private String criticite;
      private Date dateDeMiseEnProduction;
      private String decription;
   
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association56 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<SolutionApplicative> solutionApplicative;
   /** @pdRoleInfo migr=no name=ServeurWeb assc=association44 mult=0..* side=A */
      private ServeurWeb[] serveurWeb;
   
   
   

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
	
	public String getDecription() {
		return decription;
	}
	
	public void setDecription(String decription) {
		this.decription = decription;
	}
	
	public ServeurWeb[] getServeurWeb() {
		return serveurWeb;
	}
	
	public void setServeurWeb(ServeurWeb[] serveurWeb) {
		this.serveurWeb = serveurWeb;
	}

	public java.util.Collection<SolutionApplicative> getSolutionApplicative() {
		return solutionApplicative;
	}

	public void setSolutionApplicative(java.util.Collection<SolutionApplicative> solutionApplicative) {
		this.solutionApplicative = solutionApplicative;
	}
	
	
	
	   
   

}