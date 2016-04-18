package com.cosumar.itilccm.entities;

import java.util.*;

public class Bandotheque extends Infrastructure {
   /** @pdRoleInfo migr=no name=Bande assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
	private java.util.Collection<Bande> bande;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Bande> getBande() {
      if (bande == null)
         bande = new java.util.HashSet<Bande>();
      return bande;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBande() {
      if (bande == null)
         bande = new java.util.HashSet<Bande>();
      return bande.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBande */
   public void setBande(java.util.Collection<Bande> newBande) {
      removeAllBande();
      for (java.util.Iterator iter = newBande.iterator(); iter.hasNext();)
         addBande((Bande)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBande */
   public void addBande(Bande newBande) {
      if (newBande == null)
         return;
      if (this.bande == null)
         this.bande = new java.util.HashSet<Bande>();
      if (!this.bande.contains(newBande))
      {
         this.bande.add(newBande);
         newBande.setBandotheque(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBande */
   public void removeBande(Bande oldBande) {
      if (oldBande == null)
         return;
      if (this.bande != null)
         if (this.bande.contains(oldBande))
         {
            this.bande.remove(oldBande);
            oldBande.setBandotheque((Bandotheque)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBande() {
      if (bande != null)
      {
         Bande oldBande;
         for (java.util.Iterator iter = getIteratorBande(); iter.hasNext();)
         {
            oldBande = (Bande)iter.next();
            iter.remove();
            oldBande.setBandotheque((Bandotheque)null);
         }
      }
   }

   
   
}