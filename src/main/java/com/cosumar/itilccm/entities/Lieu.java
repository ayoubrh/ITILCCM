package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Lieu implements Serializable {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   @NotEmpty
	   private String nom;
	   private String statut;
	   
	   @NotEmpty
	   @Size(min=4,max=30)
	   private String organisme;
	   
	   private String adresse;
	   
	   @Column(nullable=true)
	   @Size(max=5)
	   @Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
	   private String codePostale;
	   
	   private String ville;
	   private String pays;
	   
	   @Column(nullable=true)
	   @OneToMany(mappedBy="lieu")
	   private Collection<Contact> contacts;
	   
	   	@OneToMany(mappedBy="lieu")
		private Collection<Ordinateur> ordinateur;
	   	
	   	@OneToMany(mappedBy="lieu")
		private Collection<Rack> rack;
	   	
	   	@OneToMany(mappedBy="lieu")
		private Collection<Chassis> chassis;
	   
	   	@OneToMany(mappedBy="lieu")
		private Collection<Imprimante> imprimante;
	   	
	   	@OneToMany(mappedBy="lieu")
		private Collection<TelephneMobile> telephonemobile;
	   	
		@OneToMany(mappedBy="lieu")
		private Collection<Peripherique> peripherique;
		
		@OneToMany(mappedBy="lieu")
		private Collection<TelephoneFixe> telephonefixe;
		
		@OneToMany(mappedBy="lieu")
		private Collection<Tablette> tablette;
		
		
	   @Column(nullable=true)
	   @OneToMany(mappedBy="lieu")
	   private Collection<ConnexionElectrique> connexionElectrique;
	
		public Lieu() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	   

		public String getNom() {
			return nom;
		}



		public void setNom(String nom) {
			this.nom = nom;
		}



		public Lieu(String nom, String statut, String organisme, String adresse, String codePostale, String ville,
				String pays) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.organisme = organisme;
			this.adresse = adresse;
			this.codePostale = codePostale;
			this.ville = ville;
			this.pays = pays;
		}



		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public String getStatut() {
			return statut;
		}



		public void setStatut(String statut) {
			this.statut = statut;
		}



		public String getOrganisme() {
			return organisme;
		}



		public void setOrganisme(String organisme) {
			this.organisme = organisme;
		}



		public String getAdresse() {
			return adresse;
		}



		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}



		public String getCodePostale() {
			return codePostale;
		}



		public void setCodePostale(String codePostale) {
			this.codePostale = codePostale;
		}



		public String getVille() {
			return ville;
		}



		public void setVille(String ville) {
			this.ville = ville;
		}



		public String getPays() {
			return pays;
		}



		public void setPays(String pays) {
			this.pays = pays;
		}



		public Collection<Contact> getContacts() {
			return contacts;
		}



		public void setContacts(Collection<Contact> contacts) {
			this.contacts = contacts;
		}



		public Collection<Ordinateur> getOrdinateur() {
			return ordinateur;
		}



		public void setOrdinateur(Collection<Ordinateur> ordinateur) {
			this.ordinateur = ordinateur;
		}



		public Collection<Rack> getRack() {
			return rack;
		}



		public void setRack(Collection<Rack> rack) {
			this.rack = rack;
		}



		public Collection<Chassis> getChassis() {
			return chassis;
		}



		public void setChassis(Collection<Chassis> chassis) {
			this.chassis = chassis;
		}



		public Collection<Imprimante> getImprimante() {
			return imprimante;
		}



		public void setImprimante(Collection<Imprimante> imprimante) {
			this.imprimante = imprimante;
		}



		public Collection<TelephneMobile> getTelephonemobile() {
			return telephonemobile;
		}



		public void setTelephonemobile(Collection<TelephneMobile> telephonemobile) {
			this.telephonemobile = telephonemobile;
		}



		public Collection<Peripherique> getPeripherique() {
			return peripherique;
		}



		public void setPeripherique(Collection<Peripherique> peripherique) {
			this.peripherique = peripherique;
		}



		public Collection<TelephoneFixe> getTelephonefixe() {
			return telephonefixe;
		}



		public void setTelephonefixe(Collection<TelephoneFixe> telephonefixe) {
			this.telephonefixe = telephonefixe;
		}



		public Collection<Tablette> getTablette() {
			return tablette;
		}



		public void setTablette(Collection<Tablette> tablette) {
			this.tablette = tablette;
		}



		public Collection<ConnexionElectrique> getConnexionElectrique() {
			return connexionElectrique;
		}



		public void setConnexionElectrique(Collection<ConnexionElectrique> connexionElectrique) {
			this.connexionElectrique = connexionElectrique;
		}

		


   

}