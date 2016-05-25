package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Physique extends IntefaceReseau implements Serializable{
	
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
   
   	@ManyToMany
   	@LazyCollection(LazyCollectionOption.FALSE)
   	@Column(nullable = true)
   private Collection<Vlan> vlan;

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

	public Collection<Vlan> getVlan() {
		return vlan;
	}

	public void setVlan(Collection<Vlan> vlan) {
		this.vlan = vlan;
	}

	public Physique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Physique(String nom) {
		super();
		this.nom = nom;
	}
   	
   	

}