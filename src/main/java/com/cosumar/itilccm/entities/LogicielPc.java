package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("LogicielPC")
public class LogicielPc extends LogicielEtApplication implements Serializable {

	@Column(nullable=true)
	@ManyToMany(mappedBy="logicielPc",cascade = CascadeType.ALL)
	private Collection<Groupe> groupe;
	
	public LogicielPc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LogicielPc(String nom, String statut, String criticite, String cheminD_installation,
			Date dateDeMiseEnProduction, String description) {
		super(nom, statut, criticite, cheminD_installation, dateDeMiseEnProduction, description);
		// TODO Auto-generated constructor stub
	}

	public Collection<Groupe> getGroupe() {
		return groupe;
	}

	public void setGroupe(Collection<Groupe> groupe) {
		this.groupe = groupe;
	}
	
	
}