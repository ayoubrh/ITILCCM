package com.cosumar.itilccm.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Vcluster")
public class Vcluster extends Virtualisation {
	
		@Column(nullable=true)
		@OneToMany(mappedBy="vcluster")
		private Collection<Hyperviseur> hyperviseur;
	
	

	public Vcluster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vcluster(String nom, String statut, String criticite, Date dateDeMiseEnProduction, String description) {
		super(nom, statut, criticite, dateDeMiseEnProduction, description);
		// TODO Auto-generated constructor stub
	}

	public Collection<Hyperviseur> getHyperviseur() {
		return hyperviseur;
	}

	public void setHyperviseur(Collection<Hyperviseur> hyperviseur) {
		this.hyperviseur = hyperviseur;
	}
	

}