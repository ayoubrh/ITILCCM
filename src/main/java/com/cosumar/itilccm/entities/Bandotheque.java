package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Bandotheque extends Infrastructure implements Serializable{
	
	 @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	 @JoinColumn(name="bande_id")
	private Bande bande;
	 
	 @Column(nullable=true)
	 @ManyToMany(mappedBy="bandotheque",cascade = CascadeType.ALL)
	 private Collection<Groupe> groupe;

	public Bandotheque(String nom) {
		super(nom);
		//new Infrastructure(nom);
	}
	
	public Bandotheque() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Bande getBande() {
		return bande;
	}

	public void setBande(Bande bande) {
		this.bande = bande;
	}

	public Collection<Groupe> getGroupe() {
		return groupe;
	}

	public void setGroupe(Collection<Groupe> groupe) {
		this.groupe = groupe;
	}
	 
	 

}