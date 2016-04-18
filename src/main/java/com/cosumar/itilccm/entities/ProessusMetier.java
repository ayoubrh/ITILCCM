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
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<SolutionApplicative> getSolutionApplicative() {
      if (solutionApplicative == null)
         solutionApplicative = new java.util.HashSet<SolutionApplicative>();
      return solutionApplicative;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSolutionApplicative() {
      if (solutionApplicative == null)
         solutionApplicative = new java.util.HashSet<SolutionApplicative>();
      return solutionApplicative.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSolutionApplicative */
   public void setSolutionApplicative(java.util.Collection<SolutionApplicative> newSolutionApplicative) {
      removeAllSolutionApplicative();
      for (java.util.Iterator iter = newSolutionApplicative.iterator(); iter.hasNext();)
         addSolutionApplicative((SolutionApplicative)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSolutionApplicative */
   public void addSolutionApplicative(SolutionApplicative newSolutionApplicative) {
      if (newSolutionApplicative == null)
         return;
      if (this.solutionApplicative == null)
         this.solutionApplicative = new java.util.HashSet<SolutionApplicative>();
      if (!this.solutionApplicative.contains(newSolutionApplicative))
         this.solutionApplicative.add(newSolutionApplicative);
   }
   
   /** @pdGenerated default remove
     * @param oldSolutionApplicative */
   public void removeSolutionApplicative(SolutionApplicative oldSolutionApplicative) {
      if (oldSolutionApplicative == null)
         return;
      if (this.solutionApplicative != null)
         if (this.solutionApplicative.contains(oldSolutionApplicative))
            this.solutionApplicative.remove(oldSolutionApplicative);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSolutionApplicative() {
      if (solutionApplicative != null)
         solutionApplicative.clear();
   }

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
   
   
   

}