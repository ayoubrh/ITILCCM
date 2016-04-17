package com.cosumar.itilccm.entities;

import java.util.*;

public class Groupe {
   private int id;
   private String nom;
   private String statut;
   private String type;
   private String description;
   
   /** @pdRoleInfo migr=no name=Groupe assc=association57 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Groupe> groupeB;
   /** @pdRoleInfo migr=no name=Groupe assc=association57 mult=0..1 side=A */
   private Groupe groupeA;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Groupe> getGroupeB() {
      if (groupeB == null)
         groupeB = new java.util.HashSet<Groupe>();
      return groupeB;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGroupeB() {
      if (groupeB == null)
         groupeB = new java.util.HashSet<Groupe>();
      return groupeB.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGroupeB */
   public void setGroupeB(java.util.Collection<Groupe> newGroupeB) {
      removeAllGroupeB();
      for (java.util.Iterator iter = newGroupeB.iterator(); iter.hasNext();)
         addGroupeB((Groupe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGroupe */
   public void addGroupeB(Groupe newGroupe) {
      if (newGroupe == null)
         return;
      if (this.groupeB == null)
         this.groupeB = new java.util.HashSet<Groupe>();
      if (!this.groupeB.contains(newGroupe))
      {
         this.groupeB.add(newGroupe);
         newGroupe.setGroupeA(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldGroupe */
   public void removeGroupeB(Groupe oldGroupe) {
      if (oldGroupe == null)
         return;
      if (this.groupeB != null)
         if (this.groupeB.contains(oldGroupe))
         {
            this.groupeB.remove(oldGroupe);
            oldGroupe.setGroupeA((Groupe)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGroupeB() {
      if (groupeB != null)
      {
         Groupe oldGroupe;
         for (java.util.Iterator iter = getIteratorGroupeB(); iter.hasNext();)
         {
            oldGroupe = (Groupe)iter.next();
            iter.remove();
            oldGroupe.setGroupeA((Groupe)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Groupe getGroupeA() {
      return groupeA;
   }
   
   /** @pdGenerated default parent setter
     * @param newGroupe */
   public void setGroupeA(Groupe newGroupe) {
      if (this.groupeA == null || !this.groupeA.equals(newGroupe))
      {
         if (this.groupeA != null)
         {
            Groupe oldGroupe = this.groupeA;
            this.groupeA = null;
            oldGroupe.removeGroupeB(this);
         }
         if (newGroupe != null)
         {
            this.groupeA = newGroupe;
            this.groupeA.addGroupeB(this);
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
	
	public String getStatut() {
		return statut;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	   
   
   

}