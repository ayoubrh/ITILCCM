package com.cosumar.itilccm.entities;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TicketIncident {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   private String demandeur;
	   private String impact;
	   private String priorite;
	   private String statut;
	   private String urgence;
	   private Boolean validation;
	   private Boolean resolution;
	   private String titre;
	   private String description;
	   private Date dateDeDebut;
	   private Date dateDeFermeture;
	   private Date dateDeResolution;
	   private Date dateD_affectation;
	   private Date dateDeValidation;
	   private boolean notificationAdmininstration;
	   private boolean notificationUtilisateur;
	   private boolean notificationEquipeIt;
		   
		public TicketIncident() {
			super();
			// TODO Auto-generated constructor stub
		}
		public TicketIncident(String demandeur, String impact, String priorite, String statut, String urgence, Boolean resolution,
				Boolean validation, String titre, String description, Date dateDeDebut, Date dateDeFermeture,
				Date dateDeResolution, Date dateD_affectation, Date dateDeValidation, boolean notificationAdmininstration,
				boolean notificationUtilisateur, boolean notificationEquipeIt) {
			super();
			this.demandeur = demandeur;
			this.impact = impact;
			this.priorite = priorite;
			this.statut = statut;
			this.urgence = urgence;
			this.resolution = resolution;
			this.validation = validation;
			this.titre = titre;
			this.description = description;
			this.dateDeDebut = dateDeDebut;
			this.dateDeFermeture = dateDeFermeture;
			this.dateDeResolution = dateDeResolution;
			this.dateD_affectation = dateD_affectation;
			this.dateDeValidation = dateDeValidation;
			this.notificationAdmininstration = notificationAdmininstration;
			this.notificationUtilisateur = notificationUtilisateur;
			this.notificationEquipeIt = notificationEquipeIt;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDemandeur() {
			return demandeur;
		}
		public void setDemandeur(String demandeur) {
			this.demandeur = demandeur;
		}
		public String getImpact() {
			return impact;
		}
		public void setImpact(String impact) {
			this.impact = impact;
		}
		public String getPriorite() {
			return priorite;
		}
		public void setPriorite(String priorite) {
			this.priorite = priorite;
		}
		public String getStatut() {
			return statut;
		}
		public void setStatut(String statut) {
			this.statut = statut;
		}
		public String getUrgence() {
			return urgence;
		}
		public void setUrgence(String urgence) {
			this.urgence = urgence;
		}
		
		public Boolean getValidation() {
			return validation;
		}
		public void setValidation(Boolean validation) {
			this.validation = validation;
		}
		
		public Boolean getResolution() {
			return resolution;
		}
		public void setResolution(Boolean resolution) {
			this.resolution = resolution;
		}
		public String getTitre() {
			return titre;
		}
		public void setTitre(String titre) {
			this.titre = titre;
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
		public Date getDateDeFermeture() {
			return dateDeFermeture;
		}
		public void setDateDeFermeture(Date dateDeFermeture) {
			this.dateDeFermeture = dateDeFermeture;
		}
		public Date getDateDeResolution() {
			return dateDeResolution;
		}
		public void setDateDeResolution(Date dateDeResolution) {
			this.dateDeResolution = dateDeResolution;
		}
		public Date getDateD_affectation() {
			return dateD_affectation;
		}
		public void setDateD_affectation(Date dateD_affectation) {
			this.dateD_affectation = dateD_affectation;
		}
		public Date getDateDeValidation() {
			return dateDeValidation;
		}
		public void setDateDeValidation(Date dateDeValidation) {
			this.dateDeValidation = dateDeValidation;
		}
		public boolean isNotificationAdmininstration() {
			return notificationAdmininstration;
		}
		public void setNotificationAdmininstration(boolean notificationAdmininstration) {
			this.notificationAdmininstration = notificationAdmininstration;
		}
		public boolean isNotificationUtilisateur() {
			return notificationUtilisateur;
		}
		public void setNotificationUtilisateur(boolean notificationUtilisateur) {
			this.notificationUtilisateur = notificationUtilisateur;
		}
		public boolean isNotificationEquipeIt() {
			return notificationEquipeIt;
		}
		public void setNotificationEquipeIt(boolean notificationEquipeIt) {
			this.notificationEquipeIt = notificationEquipeIt;
		}
   
   
   

}