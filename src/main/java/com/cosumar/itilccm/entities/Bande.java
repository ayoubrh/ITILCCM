package com.cosumar.itilccm.entities;

import java.util.*;

public class Bande {
   private int id;
   private String nom;
   private String taille;
   private String description;
   
   /** @pdRoleInfo migr=no name=Bandotheque assc=association5 mult=1..1 side=A */
   private Bandotheque bandotheque;
   
   
   /** @pdGenerated default parent getter */
   public Bandotheque getBandotheque() {
      return bandotheque;
   }
   
   /** @pdGenerated default parent setter
     * @param newBandotheque */
   public void setBandotheque(Bandotheque newBandotheque) {
      if (this.bandotheque == null || !this.bandotheque.equals(newBandotheque))
      {
         if (this.bandotheque != null)
         {
            Bandotheque oldBandotheque = this.bandotheque;
            this.bandotheque = null;
            oldBandotheque.removeBande(this);
         }
         if (newBandotheque != null)
         {
            this.bandotheque = newBandotheque;
            this.bandotheque.addBande(this);
         }
      }
   }

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
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