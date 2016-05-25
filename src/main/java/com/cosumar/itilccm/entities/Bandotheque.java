package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Bandotheque extends Infrastructure implements Serializable{
	
	
	 
	    @OneToMany(mappedBy="bandotheque")
	   	@LazyCollection(LazyCollectionOption.FALSE)
	 	@Column(nullable = true)
	   private Collection<Bande> bande;

	public Bandotheque(String nom) {
		super(nom);
		//new Infrastructure(nom);
	}
	
	public Bandotheque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection<Bande> getBande() {
		return bande;
	}

	public void setBande(Collection<Bande> bande) {
		this.bande = bande;
	}


	
	 

}