package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Groupe implements Serializable {
	
		       @Id
		       @GeneratedValue(strategy=GenerationType.IDENTITY)
			   private int id;
		       
		       @NotEmpty
			   private String nom;
		       
		       @NotEmpty
			   private String statut;
		       
			   private String type;
			   private String description;
			   
			   @ManyToOne
			   @JoinColumn(name="id_groupe")
			   private Groupe groupe_parent;
		   
		public Groupe() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Groupe(String nom, String statut, String type, String description) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.type = type;
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

		public String getStatut() {
			return statut;
		}

		public void setStatut(String statut) {
			this.statut = statut;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Groupe getGroupe_parent() {
			return groupe_parent;
		}

		public void setGroupe_parent(Groupe groupe_parent) {
			this.groupe_parent = groupe_parent;
		}
		   
   
   
   

}