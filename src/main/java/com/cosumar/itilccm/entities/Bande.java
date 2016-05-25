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
public class Bande implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String taille;
   private String description;
   
   	@OneToMany(mappedBy="bande")
   	@LazyCollection(LazyCollectionOption.FALSE)
 	@Column(nullable = true)
   private Collection<Bandotheque> bandotheque;

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

	public Collection<Bandotheque> getBandotheque() {
		return bandotheque;
	}

	public void setBandotheque(Collection<Bandotheque> bandotheque) {
		this.bandotheque = bandotheque;
	}

	public Bande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bande(String nom) {
		super();
		this.nom = nom;
	}
   	
	
   	

}