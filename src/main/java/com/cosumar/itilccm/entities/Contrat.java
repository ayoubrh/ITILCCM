package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Contrat implements Serializable {
	
			       @Id
			       @GeneratedValue(strategy=GenerationType.IDENTITY)
				   private Long id;
			       
			       @NotEmpty
				   private String nom;
			       
			       @NotEmpty
				   private String client;
			       
				   private String description;
				   private Date dateDeDebut;
				   private Date dateDeFin;
				   private double cout;
				   private String monnaie;
				   private String periodiciteDeFacturation;
				   private String uniteDeCout;
				   
				   @NotEmpty
				   private String fournisseur;
				   
				   private String niveauDeService;
				   private String statut;
				   private String typeDeContrat;
				   
				   @Column(nullable=true)
				   @ManyToMany(mappedBy="contrats")
				   private Collection<Contact> contacts;
				   
				   @Column(nullable=true)
				   @ManyToMany
				   @JoinTable(name="Contrat_Docum",joinColumns=
				   @JoinColumn(name="id_Contrat"),
				   inverseJoinColumns=@JoinColumn(name="id_Document"))
				   private Collection<Document> documents;
		   
			public Contrat() {
				super();
				// TODO Auto-generated constructor stub
			}
			
			public Contrat(String nom, String client, String description, Date dateDeDebut, Date dateDeFin, double cout,
					String monnaie, String periodiciteDeFacturation, String uniteDeCout, String fournisseur,
					String niveauDeService, String statut, String typeDeContrat) {
				super();
				this.nom = nom;
				this.client = client;
				this.description = description;
				this.dateDeDebut = dateDeDebut;
				this.dateDeFin = dateDeFin;
				this.cout = cout;
				this.monnaie = monnaie;
				this.periodiciteDeFacturation = periodiciteDeFacturation;
				this.uniteDeCout = uniteDeCout;
				this.fournisseur = fournisseur;
				this.niveauDeService = niveauDeService;
				this.statut = statut;
				this.typeDeContrat = typeDeContrat;
			}
	
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getNom() {
				return nom;
			}
			public void setNom(String nom) {
				this.nom = nom;
			}
			public String getClient() {
				return client;
			}
			public void setClient(String client) {
				this.client = client;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public Date getDateDeDebut() {
				return dateDeDebut;
			}
			public void setDateDeDebut(Date dateDeDebut) {
				this.dateDeDebut = dateDeDebut;
			}
			public Date getDateDeFin() {
				return dateDeFin;
			}
			public void setDateDeFin(Date dateDeFin) {
				this.dateDeFin = dateDeFin;
			}
			
			public double getCout() {
				return cout;
			}
			public void setCout(double cout) {
				this.cout = cout;
			}
			public String getMonnaie() {
				return monnaie;
			}
			public void setMonnaie(String monnaie) {
				this.monnaie = monnaie;
			}
			public String getPeriodiciteDeFacturation() {
				return periodiciteDeFacturation;
			}
			public void setPeriodiciteDeFacturation(String periodiciteDeFacturation) {
				this.periodiciteDeFacturation = periodiciteDeFacturation;
			}
			public String getUniteDeCout() {
				return uniteDeCout;
			}
			public void setUniteDeCout(String uniteDeCout) {
				this.uniteDeCout = uniteDeCout;
			}
			public String getFournisseur() {
				return fournisseur;
			}
			public void setFournisseur(String fournisseur) {
				this.fournisseur = fournisseur;
			}
			public String getNiveauDeService() {
				return niveauDeService;
			}
			public void setNiveauDeService(String niveauDeService) {
				this.niveauDeService = niveauDeService;
			}
			public String getStatut() {
				return statut;
			}
			public void setStatut(String statut) {
				this.statut = statut;
			}
			public String getTypeDeContrat() {
				return typeDeContrat;
			}
			public void setTypeDeContrat(String typeDeContrat) {
				this.typeDeContrat = typeDeContrat;
			}
			public Collection<Contact> getContact() {
				return contacts;
			}
			public void setContact(Collection<Contact> contact) {
				this.contacts = contact;
			}
			public Collection<Document> getDocument() {
				return documents;
			}
			public void setDocument(Collection<Document> document) {
				this.documents = document;
			}
		   
   
   
   

}