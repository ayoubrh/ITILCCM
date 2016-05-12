package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class LicenseOs implements Serializable {
	
		   @Id
		   @GeneratedValue(strategy=GenerationType.IDENTITY)
		   private Long id;
		   
		   @NotEmpty
		   private String nom;
		   
		   private String limiteD_utilisation;
		   private String description;
		   
		   @NotEmpty
		   private String perpetuelle;
		   
		   private Date dateDeDebutDeValidite;
		   private Date dateDeFinDeValiite;
		   private String cle;
		   
		   @OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
		   private VersionOs versionOs;
		   
		   @Column(nullable=true)
		   @OneToMany(mappedBy="licenseOs")
		   private Collection<Ordinateur> ordinateur;
		   
		   @Column(nullable=true)
		   @OneToMany(mappedBy="licenseOs")
		   private Collection<Serveur> serveur;
		   
		   @Column(nullable=true)
		   @OneToMany(mappedBy="licenseOs")
		   private Collection<MachineVirtuelle> machineVirtuelle;
		   
		   @Column(nullable=true)
		   @ManyToMany
		   private Collection<Document> documents;
	        

			public LicenseOs() {
				super();
				// TODO Auto-generated constructor stub
			}

			public LicenseOs(String nom, String limiteD_utilisation, String description, String perpetuelle,
					Date dateDeDebutDeValidite, Date dateDeFinDeValiite, String cle) {
				super();
				this.nom = nom;
				this.limiteD_utilisation = limiteD_utilisation;
				this.description = description;
				this.perpetuelle = perpetuelle;
				this.dateDeDebutDeValidite = dateDeDebutDeValidite;
				this.dateDeFinDeValiite = dateDeFinDeValiite;
				this.cle = cle;
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

			public String getLimiteD_utilisation() {
				return limiteD_utilisation;
			}

			public void setLimiteD_utilisation(String limiteD_utilisation) {
				this.limiteD_utilisation = limiteD_utilisation;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getPerpetuelle() {
				return perpetuelle;
			}

			public void setPerpetuelle(String perpetuelle) {
				this.perpetuelle = perpetuelle;
			}

			public Date getDateDeDebutDeValidite() {
				return dateDeDebutDeValidite;
			}

			public void setDateDeDebutDeValidite(Date dateDeDebutDeValidite) {
				this.dateDeDebutDeValidite = dateDeDebutDeValidite;
			}

			public Date getDateDeFinDeValiite() {
				return dateDeFinDeValiite;
			}

			public void setDateDeFinDeValiite(Date dateDeFinDeValiite) {
				this.dateDeFinDeValiite = dateDeFinDeValiite;
			}

			public String getCle() {
				return cle;
			}

			public void setCle(String cle) {
				this.cle = cle;
			}

			public VersionOs getVersionOs() {
				return versionOs;
			}

			public void setVersionOs(VersionOs versionOs) {
				this.versionOs = versionOs;
			}

			public Collection<Ordinateur> getOrdinateur() {
				return ordinateur;
			}

			public void setOrdinateur(Collection<Ordinateur> ordinateur) {
				this.ordinateur = ordinateur;
			}

			public Collection<Serveur> getServeur() {
				return serveur;
			}

			public void setServeur(Collection<Serveur> serveur) {
				this.serveur = serveur;
			}

			public Collection<MachineVirtuelle> getMachineVirtuelle() {
				return machineVirtuelle;
			}

			public void setMachineVirtuelle(Collection<MachineVirtuelle> machineVirtuelle) {
				this.machineVirtuelle = machineVirtuelle;
			}

			public Collection<Document> getDocuments() {
				return documents;
			}

			public void setDocuments(Collection<Document> documents) {
				this.documents = documents;
			}
			   
			   

}