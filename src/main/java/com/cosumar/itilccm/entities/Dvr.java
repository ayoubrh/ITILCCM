package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Dvr extends Infrastructure implements Serializable{
	
	@Column(nullable=true)
	@Size(max=2)
   	@Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
   private String nbrCaneaux;
   
	@OneToMany(mappedBy="dvr")
	@LazyCollection(LazyCollectionOption.FALSE)
   	@Column(nullable = true)
   private Collection<Camera> camera;
	
	@Column(nullable=true)
	@ManyToMany(mappedBy="dvr",cascade = CascadeType.ALL)
	private Collection<Groupe> groupe;


	

	public String getNbrCaneaux() {
		return nbrCaneaux;
	}

	public void setNbrCaneaux(String nbrCaneaux) {
		this.nbrCaneaux = nbrCaneaux;
	}

	public Collection<Camera> getCamera() {
		return camera;
	}

	public void setCamera(Collection<Camera> camera) {
		this.camera = camera;
	}

	public Dvr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dvr(String nbrCaneaux) {
		super();
		this.nbrCaneaux = nbrCaneaux;
	}
	
	
	public Dvr(String nom, String nbrCaneaux) {
		super(nom);
		//setNom(nom);
		this.nbrCaneaux = nbrCaneaux;
	}

	public Collection<Groupe> getGroupe() {
		return groupe;
	}

	public void setGroupe(Collection<Groupe> groupe) {
		this.groupe = groupe;
	}
	
	
	

}