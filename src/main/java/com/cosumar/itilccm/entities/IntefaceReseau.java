package com.cosumar.itilccm.entities;

import java.util.*;

public class IntefaceReseau {

   private int id;
   
   /** @pdRoleInfo migr=no name=Infrastructure assc=association21 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Infrastructure> infrastructure;
   /** @pdRoleInfo migr=no name=EquipementReseau assc=association23 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<EquipementReseau> equipementReseau;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association29 mult=0..* side=A */
   private MachineVirtuelle[] machineVirtuelle;
   /** @pdRoleInfo migr=no name=Ordinateur assc=association41 mult=0..* side=A */
   private Ordinateur[] ordinateur;
   
   
   

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public MachineVirtuelle[] getMachineVirtuelle() {
		return machineVirtuelle;
	}
	
	public void setMachineVirtuelle(MachineVirtuelle[] machineVirtuelle) {
		this.machineVirtuelle = machineVirtuelle;
	}
	
	public Ordinateur[] getOrdinateur() {
		return ordinateur;
	}
	
	public void setOrdinateur(Ordinateur[] ordinateur) {
		this.ordinateur = ordinateur;
	}

	public java.util.Collection<Infrastructure> getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(java.util.Collection<Infrastructure> infrastructure) {
		this.infrastructure = infrastructure;
	}

	public java.util.Collection<EquipementReseau> getEquipementReseau() {
		return equipementReseau;
	}

	public void setEquipementReseau(java.util.Collection<EquipementReseau> equipementReseau) {
		this.equipementReseau = equipementReseau;
	}
	
	
	
   
   
   

}