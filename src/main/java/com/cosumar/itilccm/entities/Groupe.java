package com.cosumar.itilccm.entities;

import java.util.*;

public class Groupe {
   private int id;
   private String nom;
   private String statut;
   private String type;
   private String description;
   
   /** @pdRoleInfo migr=no name=Groupe assc=association57 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Groupe> groupeB;
   /** @pdRoleInfo migr=no name=Groupe assc=association57 mult=0..1 side=A */
   private Groupe groupeA;
   
   
   

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

	public java.util.Collection<Groupe> getGroupeB() {
		return groupeB;
	}

	public void setGroupeB(java.util.Collection<Groupe> groupeB) {
		this.groupeB = groupeB;
	}

	public Groupe getGroupeA() {
		return groupeA;
	}

	public void setGroupeA(Groupe groupeA) {
		this.groupeA = groupeA;
	}
	
	
	
	
	   
   
   

}