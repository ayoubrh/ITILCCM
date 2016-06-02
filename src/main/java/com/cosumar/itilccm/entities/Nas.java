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
public class Nas extends Infrastructure implements Serializable{
	
	 @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	 @JoinColumn(name="systemeDeFicherNas_id")
	private SystemeDeFicherNas systemeDeFicherNas;
	 
	 @Column(nullable=true)
	 @ManyToMany(mappedBy="nas",cascade = CascadeType.ALL)
	  private Collection<Groupe> groupe;
	 
	public SystemeDeFicherNas getSystemeDeFicherNas() {
		return systemeDeFicherNas;
	}
	public void setSystemeDeFicherNas(SystemeDeFicherNas systemeDeFicherNas) {
		this.systemeDeFicherNas = systemeDeFicherNas;
	}
	public Nas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nas(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	public Collection<Groupe> getGroupe() {
		return groupe;
	}
	public void setGroupe(Collection<Groupe> groupe) {
		this.groupe = groupe;
	}
	
	

}