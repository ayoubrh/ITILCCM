package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Document implements Serializable {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   @NotEmpty
	   private String nom;
	   
	   private String statut;
	   private String version;
	   private String description;
	  
	  
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<Contrat> contrats;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<LogicielEtApplication> logicielEtApplication;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<LicenseLogiciel> licenseLogiciel;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<LicenseOs> licenseOs;

		public Document() {
			super();
			// TODO Auto-generated constructor stub
		}
   
		public Document(String nom, String statut, String version, String description) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.version = version;
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

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Collection<Contrat> getContrats() {
			return contrats;
		}

		public void setContrats(Collection<Contrat> contrats) {
			this.contrats = contrats;
		}

		public Collection<LogicielEtApplication> getLogicielEtApplication() {
			return logicielEtApplication;
		}

		public void setLogicielEtApplication(Collection<LogicielEtApplication> logicielEtApplication) {
			this.logicielEtApplication = logicielEtApplication;
		}

		public Collection<LicenseLogiciel> getLicenseLogiciel() {
			return licenseLogiciel;
		}

		public void setLicenseLogiciel(Collection<LicenseLogiciel> licenseLogiciel) {
			this.licenseLogiciel = licenseLogiciel;
		}

		public Collection<LicenseOs> getLicenseOs() {
			return licenseOs;
		}

		public void setLicenseOs(Collection<LicenseOs> licenseOs) {
			this.licenseOs = licenseOs;
		}
		

}