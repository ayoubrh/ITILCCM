package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_Logiciel")
public class LogicielEtApplication implements Serializable {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   @NotEmpty
	   private String nom;
	   
	   private String statut;
	   private String criticite;
	   private String cheminD_installation;
	   private Date dateDeMiseEnProduction;
	   private String description;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="logicielEtApplication")
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Ordinateur> ordinateur;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<SolutionApplicative> solutionApplicative;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Contact> contacts;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Contrat> contrats;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Document> documents;
	   
	  
	   @ManyToOne
	   @JoinColumn(name="id_serveur")
	   private Serveur serveur;
	   
	  
	   @ManyToOne
	   @JoinColumn(name="id_machineVirtuelle")
	   private MachineVirtuelle machineVirtuelle;
	  
	   @ManyToOne
	   @JoinColumn(name="id_licenseLogiciel")
	   private LicenseLogiciel licenseLogiciel;
		   
		public LogicielEtApplication() {
			super();
			// TODO Auto-generated constructor stub
		}

		public LogicielEtApplication(String nom, String statut, String criticite, String cheminD_installation,
				Date dateDeMiseEnProduction, String description) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.criticite = criticite;
			this.cheminD_installation = cheminD_installation;
			this.dateDeMiseEnProduction = dateDeMiseEnProduction;
			this.description = description;
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

		public String getStatut() {
			return statut;
		}

		public void setStatut(String statut) {
			this.statut = statut;
		}

		public String getCriticite() {
			return criticite;
		}

		public void setCriticite(String criticite) {
			this.criticite = criticite;
		}

		public String getCheminD_installation() {
			return cheminD_installation;
		}

		public void setCheminD_installation(String cheminD_installation) {
			this.cheminD_installation = cheminD_installation;
		}

		public Date getDateDeMiseEnProduction() {
			return dateDeMiseEnProduction;
		}

		public void setDateDeMiseEnProduction(Date dateDeMiseEnProduction) {
			this.dateDeMiseEnProduction = dateDeMiseEnProduction;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Collection<Ordinateur> getOrdinateur() {
			return ordinateur;
		}

		public void setOrdinateur(Collection<Ordinateur> ordinateur) {
			this.ordinateur = ordinateur;
		}

		public Collection<SolutionApplicative> getSolutionApplicative() {
			return solutionApplicative;
		}

		public void setSolutionApplicative(Collection<SolutionApplicative> solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}
        
		public Serveur getServeur() {
			return serveur;
		}

		public void setServeur(Serveur serveur) {
			this.serveur = serveur;
		}

		public MachineVirtuelle getMachineVirtuelle() {
			return machineVirtuelle;
		}

		public void setMachineVirtuelle(MachineVirtuelle machineVirtuelle) {
			this.machineVirtuelle = machineVirtuelle;
		}

		public LicenseLogiciel getLicenseLogiciel() {
			return licenseLogiciel;
		}

		public void setLicenseLogiciel(LicenseLogiciel licenseLogiciel) {
			this.licenseLogiciel = licenseLogiciel;
		}

		public Collection<Contact> getContacts() {
			return contacts;
		}

		public void setContacts(Collection<Contact> contacts) {
			this.contacts = contacts;
		}

		public Collection<Contrat> getContrats() {
			return contrats;
		}

		public void setContrats(Collection<Contrat> contrats) {
			this.contrats = contrats;
		}

		public Collection<Document> getDocuments() {
			return documents;
		}

		public void setDocuments(Collection<Document> documents) {
			this.documents = documents;
		}
	

}