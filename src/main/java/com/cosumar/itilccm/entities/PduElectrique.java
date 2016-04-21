package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PduElectrique extends ConnexionElectrique implements Serializable{
	
	 @ManyToOne
 	 @JoinColumn(name="arriveeElectrique_id")
	private ArriveeElectrique arriveeElectrique;
	
	 @ManyToOne
  	 @JoinColumn(name="rack_id")
	private Rack rack;

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
	 
	 

}