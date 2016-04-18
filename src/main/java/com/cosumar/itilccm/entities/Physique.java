package com.cosumar.itilccm.entities;

import java.util.*;

public class Physique extends IntefaceReseau {
      private String nom;
      private String materiel;
      private String adresseIp;
      private String adresseMac;
      private String commentaire;
      private String passerelle;
      private String masqueDeSousReseau;
      private String vitesse;
   
   /** @pdRoleInfo migr=no name=Vlan assc=association16 mult=0..* side=A */
      private Vlan[] vlan;

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getMateriel() {
		return materiel;
	}
	
	public void setMateriel(String materiel) {
		this.materiel = materiel;
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
	
	public Vlan[] getVlan() {
		return vlan;
	}
	
	public void setVlan(Vlan[] vlan) {
		this.vlan = vlan;
	}
   
   

}