package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class SwitchSan extends Infrastructure implements Serializable{
	
	 @ManyToMany(mappedBy="switchSan",cascade = CascadeType.ALL)
	 @LazyCollection(LazyCollectionOption.FALSE)
	 @Column(nullable = true)
	private Collection<Serveur> serveur;
	
	 @ManyToMany(mappedBy="switchSan",cascade = CascadeType.ALL)
	 @LazyCollection(LazyCollectionOption.FALSE)
	 @Column(nullable = true)
	private Collection<SystemeDeStockage> systemeDeStockage;
	

	public Collection<Serveur> getServeur() {
		return serveur;
	}

	public void setServeur(Collection<Serveur> serveur) {
		this.serveur = serveur;
	}

	public Collection<SystemeDeStockage> getSystemeDeStockage() {
		return systemeDeStockage;
	}

	public void setSystemeDeStockage(Collection<SystemeDeStockage> systemeDeStockage) {
		this.systemeDeStockage = systemeDeStockage;
	}

	public SwitchSan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SwitchSan(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	 

}