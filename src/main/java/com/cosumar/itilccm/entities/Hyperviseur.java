package com.cosumar.itilccm.entities;

import java.util.*;

public class Hyperviseur extends Virtualisation {
   /** @pdRoleInfo migr=no name=Serveur assc=association26 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<Serveur> serveur;
   /** @pdRoleInfo migr=no name=Vcluster assc=association25 mult=0..* side=A */
	private Vcluster[] vcluster;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Serveur> getServeur() {
      if (serveur == null)
         serveur = new java.util.HashSet<Serveur>();
      return serveur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorServeur() {
      if (serveur == null)
         serveur = new java.util.HashSet<Serveur>();
      return serveur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newServeur */
   public void setServeur(java.util.Collection<Serveur> newServeur) {
      removeAllServeur();
      for (java.util.Iterator iter = newServeur.iterator(); iter.hasNext();)
         addServeur((Serveur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newServeur */
   public void addServeur(Serveur newServeur) {
      if (newServeur == null)
         return;
      if (this.serveur == null)
         this.serveur = new java.util.HashSet<Serveur>();
      if (!this.serveur.contains(newServeur))
      {
         this.serveur.add(newServeur);
         newServeur.setHyperviseur(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldServeur */
   public void removeServeur(Serveur oldServeur) {
      if (oldServeur == null)
         return;
      if (this.serveur != null)
         if (this.serveur.contains(oldServeur))
         {
            this.serveur.remove(oldServeur);
            oldServeur.setHyperviseur((Hyperviseur)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllServeur() {
      if (serveur != null)
      {
         Serveur oldServeur;
         for (java.util.Iterator iter = getIteratorServeur(); iter.hasNext();)
         {
            oldServeur = (Serveur)iter.next();
            iter.remove();
            oldServeur.setHyperviseur((Hyperviseur)null);
         }
      }
   }

	public Vcluster[] getVcluster() {
		return vcluster;
	}
	
	public void setVcluster(Vcluster[] vcluster) {
		this.vcluster = vcluster;
	}
   
   

}