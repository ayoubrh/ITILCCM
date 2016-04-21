package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SystemeDeFicherNas implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String niveauRaid;
   private String taille;
   private String description;
   
   	@OneToMany(mappedBy="systemeDeFicherNas")
	@Column(nullable = true)
   private Collection<Nas> nas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
   	
   	

}