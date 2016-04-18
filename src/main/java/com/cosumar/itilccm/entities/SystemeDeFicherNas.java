package com.cosumar.itilccm.entities;

import java.util.*;

public class SystemeDeFicherNas {
      private int id;
      private String niveauRaid;
      private String taille;
      private String description;
   
   /** @pdRoleInfo migr=no name=Nas assc=association4 mult=1..1 side=A */
      private Nas nas;
   
   
   /** @pdGenerated default parent getter */
   public Nas getNas() {
      return nas;
   }
   
   /** @pdGenerated default parent setter
     * @param newNas */
   public void setNas(Nas newNas) {
      if (this.nas == null || !this.nas.equals(newNas))
      {
         if (this.nas != null)
         {
            Nas oldNas = this.nas;
            this.nas = null;
            oldNas.removeSystemeDeFicherNas(this);
         }
         if (newNas != null)
         {
            this.nas = newNas;
            this.nas.addSystemeDeFicherNas(this);
         }
      }
   }

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
   
   

}