package com.cosumar.itilccm.entities;

import java.util.*;

public class PduElectrique extends ConnexionElectrique {
   /** @pdRoleInfo migr=no name=ArriveeElectrique assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<ArriveeElectrique> arriveeElectrique;
   /** @pdRoleInfo migr=no name=Rack assc=association7 mult=0..* side=A */
	private Rack[] rack;
   
   
   

	public Rack[] getRack() {
		return rack;
	}
	
	public void setRack(Rack[] rack) {
		this.rack = rack;
	}

	public java.util.Collection<ArriveeElectrique> getArriveeElectrique() {
		return arriveeElectrique;
	}

	public void setArriveeElectrique(java.util.Collection<ArriveeElectrique> arriveeElectrique) {
		this.arriveeElectrique = arriveeElectrique;
	}
	
	
	
   
   
   

}