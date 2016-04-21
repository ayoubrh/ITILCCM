package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Nas extends Infrastructure implements Serializable{
	
	 @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	 @JoinColumn(name="systemeDeFicherNas_id")
 	 @Column(nullable = true)
	private SystemeDeFicherNas systemeDeFicherNas;
	 
	public SystemeDeFicherNas getSystemeDeFicherNas() {
		return systemeDeFicherNas;
	}
	public void setSystemeDeFicherNas(SystemeDeFicherNas systemeDeFicherNas) {
		this.systemeDeFicherNas = systemeDeFicherNas;
	}

}