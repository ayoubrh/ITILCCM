package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("ArriveeElectrique")
public class ArriveeElectrique extends ConnexionElectrique implements Serializable{
	
	 @OneToMany(mappedBy="arriveeElectrique")
  	 @Column(nullable = true)
	private Collection<PduElectrique> pduElectrique;

	public Collection<PduElectrique> getPduElectrique() {
		return pduElectrique;
	}

	public void setPduElectrique(Collection<PduElectrique> pduElectrique) {
		this.pduElectrique = pduElectrique;
	}
	 
	 

}