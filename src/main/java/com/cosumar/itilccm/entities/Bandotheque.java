package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bandotheque extends Infrastructure implements Serializable{
	
	 @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	 @JoinColumn(name="bande_id")
 	 @Column(nullable = true)
	private Bande bande;

	public Bande getBande() {
		return bande;
	}

	public void setBande(Bande bande) {
		this.bande = bande;
	}
	 
	 

}