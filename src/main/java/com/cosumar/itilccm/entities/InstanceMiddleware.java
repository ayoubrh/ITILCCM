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
public class InstanceMiddleware implements Serializable {
	
				   @Id
				   @GeneratedValue(strategy=GenerationType.IDENTITY)
				   private int id;
				   
				   @NotEmpty
				   private String nom;
				   
				   private String criticite;
				   private Date dateDeMiseEnProduction;
				   private String description;
				   
				   @Column(nullable=true)
				   @ManyToMany
				   @JoinTable(name="InstMidd_sltApp",joinColumns=
				   @JoinColumn(name="id_InstMidd"),
				   inverseJoinColumns=@JoinColumn(name="id_sltApp"))
				   private Collection<SolutionApplicative> solutionApplicative;
				   
				   @NotEmpty
				   @ManyToOne
				   @JoinColumn(name="id_middleware")
				   private Middleware middleware;
		   
		public InstanceMiddleware() {
			super();
			// TODO Auto-generated constructor stub
		}
		public InstanceMiddleware(String nom, String criticite, Date dateDeMiseEnProduction, String description) {
			super();
			this.nom = nom;
			this.criticite = criticite;
			this.dateDeMiseEnProduction = dateDeMiseEnProduction;
			this.description = description;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
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
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Collection<SolutionApplicative> getSolutionApplicative() {
			return solutionApplicative;
		}
		public void setSolutionApplicative(Collection<SolutionApplicative> solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}
		public Middleware getMiddleware() {
			return middleware;
		}
		public void setMiddleware(Middleware middleware) {
			this.middleware = middleware;
		}
		   
		   
		   
   
   

}