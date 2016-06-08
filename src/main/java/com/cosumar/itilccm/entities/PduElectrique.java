package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("PduElectrique")
public class PduElectrique extends ConnexionElectrique implements Serializable{
	
	 @ManyToOne
 	 @JoinColumn(name="arriveeElectrique_id")
	private ArriveeElectrique arriveeElectrique;
	
	 @ManyToOne
  	 @JoinColumn(name="rack_id")
	private Rack rack;
	 
	 @Column(nullable=true)
	 @ManyToMany(mappedBy="pduElectrique",cascade = CascadeType.ALL)
	 private Collection<Groupe> groupe;
	 

	public PduElectrique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PduElectrique(String nom, String statut, String criticite, String marque, String modele, String nbUnite,
			String numeroDeSerie, String numeroAsset, Date dateDeMiseEnProduction, Date dateD_achat,
			Date dateDeFinDeGarantie, String description) {
		super(nom, statut, criticite, marque, modele, nbUnite, numeroDeSerie, numeroAsset, dateDeMiseEnProduction, dateD_achat,
				dateDeFinDeGarantie, description);
		// TODO Auto-generated constructor stub
	}

	public PduElectrique(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public ArriveeElectrique getArriveeElectrique() {
		return arriveeElectrique;
	}

	public void setArriveeElectrique(ArriveeElectrique arriveeElectrique) {
		this.arriveeElectrique = arriveeElectrique;
	}

	public Rack getRack() {
		return rack;
	}

	public void setRack(Rack rack) {
		this.rack = rack;
	}

	public Collection<Groupe> getGroupe() {
		return groupe;
	}

	public void setGroupe(Collection<Groupe> groupe) {
		this.groupe = groupe;
	}
	 
	 

}