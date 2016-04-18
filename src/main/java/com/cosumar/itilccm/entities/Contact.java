package com.cosumar.itilccm.entities;

import java.util.*;

public class Contact {
   private int id;
   private String nom;
   private String prenom;
   private String organisme;
   private String statut;
   private String fonction;
   private String numeroD_employe;
   private String email;
   private String telephoneFixe;
   private String telephoneMobile;
   
   /** @pdRoleInfo migr=no name=Lieu assc=association58 mult=0..* side=A */
   private Lieu[] lieu;
   /** @pdRoleInfo migr=no name=Contrat assc=association59 mult=0..* side=A */
   private Contrat[] contrat;
   
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getOrganisme() {
		return organisme;
	}
	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getNumeroD_employe() {
		return numeroD_employe;
	}
	public void setNumeroD_employe(String numeroD_employe) {
		this.numeroD_employe = numeroD_employe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephoneFixe() {
		return telephoneFixe;
	}
	public void setTelephoneFixe(String telephoneFixe) {
		this.telephoneFixe = telephoneFixe;
	}
	public String getTelephoneMobile() {
		return telephoneMobile;
	}
	public void setTelephoneMobile(String telephoneMobile) {
		this.telephoneMobile = telephoneMobile;
	}
	public Lieu[] getLieu() {
		return lieu;
	}
	public void setLieu(Lieu[] lieu) {
		this.lieu = lieu;
	}
	public Contrat[] getContrat() {
		return contrat;
	}
	public void setContrat(Contrat[] contrat) {
		this.contrat = contrat;
	}
   
   

}