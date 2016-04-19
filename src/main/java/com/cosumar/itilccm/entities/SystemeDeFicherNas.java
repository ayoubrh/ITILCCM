package com.cosumar.itilccm.entities;

import java.util.*;

public class SystemeDeFicherNas {
      private int id;
      private String niveauRaid;
      private String taille;
      private String description;
   
   /** @pdRoleInfo migr=no name=Nas assc=association4 mult=1..1 side=A */
      private Nas nas;
   
   
   

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNiveauRaid() {
		return niveauRaid;
	}
	
	public void setNiveauRaid(String niveauRaid) {
		this.niveauRaid = niveauRaid;
	}
	
	public String getTaille() {
		return taille;
	}
	
	public void setTaille(String taille) {
		this.taille = taille;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public Nas getNas() {
		return nas;
	}

	public void setNas(Nas nas) {
		this.nas = nas;
	}
	
	
	
   
   

}