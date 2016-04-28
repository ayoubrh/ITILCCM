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
public class InstanceDeBasseDeDonnes implements Serializable {
			
			   @Id
			   @GeneratedValue(strategy=GenerationType.IDENTITY)
			   private Long id;
			   
			   @NotEmpty
			   private String nom;
			   
			   private String critiicite;
			   private Date dateDeMiseEnnProduction;
			   private String description;
			   
			   @Column(nullable=true)
			   @ManyToMany
			   @JoinTable(name="InstBD_sltApp",joinColumns=
			   @JoinColumn(name="id_InstBD"),
			   inverseJoinColumns=@JoinColumn(name="id_sltApp"))
			   private java.util.Collection<SolutionApplicative> solutionApplicative;
			   
			   //@NotEmpty
			   @ManyToOne
			   @JoinColumn(name="id_serBD")
			   private ServeurDeBasseDeDonnees serveurDeBasseDeDonnees;
		   
		public InstanceDeBasseDeDonnes() {
			super();
			// TODO Auto-generated constructor stub
		}
		public InstanceDeBasseDeDonnes(String nom, String critiicite, Date dateDeMiseEnnProduction,
				String description) {
			super();
			this.nom = nom;
			this.critiicite = critiicite;
			this.dateDeMiseEnnProduction = dateDeMiseEnnProduction;
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
		public String getCritiicite() {
			return critiicite;
		}
		public void setCritiicite(String critiicite) {
			this.critiicite = critiicite;
		}
		public Date getDateDeMiseEnnProduction() {
			return dateDeMiseEnnProduction;
		}
		public void setDateDeMiseEnnProduction(Date dateDeMiseEnnProduction) {
			this.dateDeMiseEnnProduction = dateDeMiseEnnProduction;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public java.util.Collection<SolutionApplicative> getSolutionApplicative() {
			return solutionApplicative;
		}
		public void setSolutionApplicative(java.util.Collection<SolutionApplicative> solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}
		public ServeurDeBasseDeDonnees getServeurDeBasseDeDonnees() {
			return serveurDeBasseDeDonnees;
		}
		public void setServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees serveurDeBasseDeDonnees) {
			this.serveurDeBasseDeDonnees = serveurDeBasseDeDonnees;
		}
		   
   
   
   

}