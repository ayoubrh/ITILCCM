package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@DiscriminatorValue("ArriveeElectrique")
public class ArriveeElectrique extends ConnexionElectrique implements Serializable{
	
	 @OneToMany(mappedBy="arriveeElectrique",cascade = CascadeType.ALL)
	 @LazyCollection(LazyCollectionOption.FALSE)
  	 @Column(nullable = true)
	private Collection<PduElectrique> pduElectrique;
	 


	public ArriveeElectrique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArriveeElectrique(String nom, String statut, String criticite, String marque, String modele, String nbUnite,
			String numeroDeSerie, String numeroAsset, Date dateDeMiseEnProduction, Date dateD_achat,
			Date dateDeFinDeGarantie, String description) {
		super(nom, statut, criticite, marque, modele, nbUnite, numeroDeSerie, numeroAsset, dateDeMiseEnProduction, dateD_achat,
				dateDeFinDeGarantie, description);
		// TODO Auto-generated constructor stub
	}

	public ArriveeElectrique(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public Collection<PduElectrique> getPduElectrique() {
		return pduElectrique;
	}

	public void setPduElectrique(Collection<PduElectrique> pduElectrique) {
		this.pduElectrique = pduElectrique;
	}
	 
	 

}