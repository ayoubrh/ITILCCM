package com.cosumar.itilccm.entities;

import java.util.*;

public class Fibre extends IntefaceReseau {
   private String nom;
   private String vittesse;
   private String topologie;
   private String wwn;
   
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVittesse() {
		return vittesse;
	}
	public void setVittesse(String vittesse) {
		this.vittesse = vittesse;
	}
	public String getTopologie() {
		return topologie;
	}
	public void setTopologie(String topologie) {
		this.topologie = topologie;
	}
	public String getWwn() {
		return wwn;
	}
	public void setWwn(String wwn) {
		this.wwn = wwn;
	}
   
   

}