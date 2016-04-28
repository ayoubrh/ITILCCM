package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Fibre extends IntefaceReseau implements Serializable{
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String vitesse;
   private String topologie;
   private String wwn;
   
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVitesse() {
		return vitesse;
	}
	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
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
	public Fibre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fibre(String nom) {
		super();
		this.nom = nom;
	}
	
	
	   
	   

}