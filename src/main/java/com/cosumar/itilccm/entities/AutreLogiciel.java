package com.cosumar.itilccm.entities;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("AutreLogiciel")
public class AutreLogiciel extends LogicielEtApplication {

	public AutreLogiciel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AutreLogiciel(String nom, String statut, String criticite, String cheminD_installation,
			Date dateDeMiseEnProduction, String description) {
		super(nom, statut, criticite, cheminD_installation, dateDeMiseEnProduction, description);
		// TODO Auto-generated constructor stub
	}
	
	
	
}