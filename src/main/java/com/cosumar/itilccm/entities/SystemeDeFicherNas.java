package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class SystemeDeFicherNas implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String niveauRaid;
   private String taille;
   private String description;
   
   	@OneToMany(mappedBy="systemeDeFicherNas")
   	@LazyCollection(LazyCollectionOption.FALSE)
	@Column(nullable = true)
   private Collection<Nas> nas;

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

	public String getNiveauRaid() {
		return niveauRaid;
	}

	public void setNiveauRaid(String niveauRaid) {
		this.niveauRaid = niveauRaid;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Nas> getNas() {
		return nas;
	}

	public void setNas(Collection<Nas> nas) {
		this.nas = nas;
	}

	public SystemeDeFicherNas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SystemeDeFicherNas(String nom, String taille) {
		super();
		this.nom = nom;
		this.taille = taille;
	}
   	
	
   	

}