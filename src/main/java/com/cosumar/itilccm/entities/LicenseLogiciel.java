package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class LicenseLogiciel implements Serializable {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   @NotEmpty
	   private String nom;
	   
	   private String limiteD_utilisation;
	   private String description;
	   
	   @NotEmpty
	   private String perpetuelle;
	   
	   private Date dateDeFinDeValiite;
	   private Date dateDeDebutDeValidite;
	   private String cle;
	   
	   @OneToOne
	   private LogicielEtApplication logicielEtApplications;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   private Collection<Document> documents;
        
		public LicenseLogiciel() {
			super();
			// TODO Auto-generated constructor stub
		}

		public LicenseLogiciel(String nom, String limiteD_utilisation, String description, String perpetuelle,
				Date dateDeFinDeValiite, Date dateDeDebutDeValidite, String cle) {
			super();
			this.nom = nom;
			this.limiteD_utilisation = limiteD_utilisation;
			this.description = description;
			this.perpetuelle = perpetuelle;
			this.dateDeFinDeValiite = dateDeFinDeValiite;
			this.dateDeDebutDeValidite = dateDeDebutDeValidite;
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

		public Date getDateDeFinDeValiite() {
			return dateDeFinDeValiite;
		}

		public void setDateDeFinDeValiite(Date dateDeFinDeValiite) {
			this.dateDeFinDeValiite = dateDeFinDeValiite;
		}

		public Date getDateDeDebutDeValidite() {
			return dateDeDebutDeValidite;
		}

		public void setDateDeDebutDeValidite(Date dateDeDebutDeValidite) {
			this.dateDeDebutDeValidite = dateDeDebutDeValidite;
		}

		public String getCle() {
			return cle;
		}

		public void setCle(String cle) {
			this.cle = cle;
		}

		public LogicielEtApplication getLogicielEtApplications() {
			return logicielEtApplications;
		}

		public void setLogicielEtApplications(LogicielEtApplication logicielEtApplications) {
			this.logicielEtApplications = logicielEtApplications;
		}

		public Collection<Document> getDocuments() {
			return documents;
		}

		public void setDocuments(Collection<Document> documents) {
			this.documents = documents;
		}

		
		   
		   

}