package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Logique extends IntefaceReseau implements Serializable{
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
	
	@Pattern(regexp="^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$",message="Entrez une Adress IP")
	@Column(nullable = true)
   private String adresseIp;
   private String adresseMac;
   private String commentaire;
   private String passerelle;
   private String masqueDeSousReseau;
   private String vitesse;
   
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresseIp() {
		return adresseIp;
	}
	public void setAdresseIp(String adresseIp) {
		this.adresseIp = adresseIp;
	}
	public String getAdresseMac() {
		return adresseMac;
	}
	public void setAdresseMac(String adresseMac) {
		this.adresseMac = adresseMac;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getPasserelle() {
		return passerelle;
	}
	public void setPasserelle(String passerelle) {
		this.passerelle = passerelle;
	}
	public String getMasqueDeSousReseau() {
		return masqueDeSousReseau;
	}
	public void setMasqueDeSousReseau(String masqueDeSousReseau) {
		this.masqueDeSousReseau = masqueDeSousReseau;
	}
	public String getVitesse() {
		return vitesse;
	}
	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
	}
	public Logique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Logique(String nom) {
		super();
		this.nom = nom;
	}
   
   	

}