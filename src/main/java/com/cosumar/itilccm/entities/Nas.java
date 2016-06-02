package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Nas extends Infrastructure implements Serializable{
	

	 
	    @OneToMany(mappedBy="nas")
	   	@LazyCollection(LazyCollectionOption.FALSE)
		@Column(nullable = true)
	   private Collection<SystemeDeFicherNas> systemeDeFicherNas;
	 
	
	 @Column(nullable=true)
	 @ManyToMany(mappedBy="nas",cascade = CascadeType.ALL)
	  private Collection<Groupe> groupe;


	public Collection<SystemeDeFicherNas> getSystemeDeFicherNas() {
		return systemeDeFicherNas;
	}


	public void setSystemeDeFicherNas(Collection<SystemeDeFicherNas> systemeDeFicherNas) {
		this.systemeDeFicherNas = systemeDeFicherNas;
	}


	public Collection<Groupe> getGroupe() {
		return groupe;
	}


	public void setGroupe(Collection<Groupe> groupe) {
		this.groupe = groupe;
	}
	
	
	

}