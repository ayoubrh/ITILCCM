package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class IntefaceReseau implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   
	@ManyToOne
  	@JoinColumn(name="infrastructure_id")
   private Infrastructure infrastructure;
	
	@ManyToOne
  	@JoinColumn(name="equipementReseau_id")
   private EquipementReseau equipementReseau;

	@ManyToOne
    @JoinColumn(name="id_machineVirtuelle")
   private MachineVirtuelle machineVirtuelle;
   
   	@ManyToOne
  	@JoinColumn(name="ordinateur_id")
  	@Column(nullable = true)
   private Ordinateur ordinateur;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Infrastructure getInfrastructure() {
		return infrastructure;
	}
	
	public void setInfrastructure(Infrastructure infrastructure) {
		this.infrastructure = infrastructure;
	}
	
	public EquipementReseau getEquipementReseau() {
		return equipementReseau;
	}
	
	public void setEquipementReseau(EquipementReseau equipementReseau) {
		this.equipementReseau = equipementReseau;
	}
	
	public MachineVirtuelle getMachineVirtuelle() {
		return machineVirtuelle;
	}
	
	public void setMachineVirtuelle(MachineVirtuelle machineVirtuelle) {
		this.machineVirtuelle = machineVirtuelle;
	}
	
	public Ordinateur getOrdinateur() {
		return ordinateur;
	}
	
	public void setOrdinateur(Ordinateur ordinateur) {
		this.ordinateur = ordinateur;
	}
   
   	

}