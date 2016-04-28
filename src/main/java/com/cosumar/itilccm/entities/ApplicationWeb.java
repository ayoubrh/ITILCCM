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
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class ApplicationWeb implements Serializable {
	
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
       
       @NotEmpty
	   private String nom;
       
	   private String url;
	   private String criticite;
	   private Date dateDeMiseEnProduction;
	   private String decription;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   private java.util.Collection<SolutionApplicative> solutionApplicative;
	   
	   @ManyToOne
	   @JoinColumn(name="id_serveurWeb")
	   private ServeurWeb serveurWeb;
		   
		public ApplicationWeb() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ApplicationWeb(String nom, String url, String criticite, Date dateDeMiseEnProduction, String decription) {
			super();
			this.nom = nom;
			this.url = url;
			this.criticite = criticite;
			this.dateDeMiseEnProduction = dateDeMiseEnProduction;
			this.decription = decription;
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
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getCriticite() {
			return criticite;
		}
		public void setCriticite(String criticite) {
			this.criticite = criticite;
		}
		public Date getDateDeMiseEnProduction() {
			return dateDeMiseEnProduction;
		}
		public void setDateDeMiseEnProduction(Date dateDeMiseEnProduction) {
			this.dateDeMiseEnProduction = dateDeMiseEnProduction;
		}
		public String getDecription() {
			return decription;
		}
		public void setDecription(String decription) {
			this.decription = decription;
		}
		public java.util.Collection<SolutionApplicative> getSolutionApplicative() {
			return solutionApplicative;
		}
		public void setSolutionApplicative(java.util.Collection<SolutionApplicative> solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}
		public ServeurWeb getServeurWeb() {
			return serveurWeb;
		}
		public void setServeurWeb(ServeurWeb serveurWeb) {
			this.serveurWeb = serveurWeb;
		}
		   
		      
}