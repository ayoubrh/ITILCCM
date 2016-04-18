package com.cosumar.itilccm.entities;

import java.util.*;

public class Logique extends IntefaceReseau {
      private String nom;
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
      
      
      

}