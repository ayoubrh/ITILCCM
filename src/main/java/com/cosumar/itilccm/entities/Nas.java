package com.cosumar.itilccm.entities;

import java.util.*;

public class Nas extends Infrastructure {
   /** @pdRoleInfo migr=no name=SystemeDeFicherNas assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
	private java.util.Collection<SystemeDeFicherNas> systemeDeFicherNas;
   /** @pdRoleInfo migr=no name=Serveur assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<Serveur> serveur;
   /** @pdRoleInfo migr=no name=SystemeDeStockage assc=association13 mult=0..* side=A */
	private SystemeDeStockage[] systemeDeStockage;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<SystemeDeFicherNas> getSystemeDeFicherNas() {
      if (systemeDeFicherNas == null)
         systemeDeFicherNas = new java.util.HashSet<SystemeDeFicherNas>();
      return systemeDeFicherNas;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSystemeDeFicherNas() {
      if (systemeDeFicherNas == null)
         systemeDeFicherNas = new java.util.HashSet<SystemeDeFicherNas>();
      return systemeDeFicherNas.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSystemeDeFicherNas */
   public void setSystemeDeFicherNas(java.util.Collection<SystemeDeFicherNas> newSystemeDeFicherNas) {
      removeAllSystemeDeFicherNas();
      for (java.util.Iterator iter = newSystemeDeFicherNas.iterator(); iter.hasNext();)
         addSystemeDeFicherNas((SystemeDeFicherNas)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSystemeDeFicherNas */
   public void addSystemeDeFicherNas(SystemeDeFicherNas newSystemeDeFicherNas) {
      if (newSystemeDeFicherNas == null)
         return;
      if (this.systemeDeFicherNas == null)
         this.systemeDeFicherNas = new java.util.HashSet<SystemeDeFicherNas>();
      if (!this.systemeDeFicherNas.contains(newSystemeDeFicherNas))
      {
         this.systemeDeFicherNas.add(newSystemeDeFicherNas);
         newSystemeDeFicherNas.setNas(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldSystemeDeFicherNas */
   public void removeSystemeDeFicherNas(SystemeDeFicherNas oldSystemeDeFicherNas) {
      if (oldSystemeDeFicherNas == null)
         return;
      if (this.systemeDeFicherNas != null)
         if (this.systemeDeFicherNas.contains(oldSystemeDeFicherNas))
         {
            this.systemeDeFicherNas.remove(oldSystemeDeFicherNas);
            oldSystemeDeFicherNas.setNas((Nas)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSystemeDeFicherNas() {
      if (systemeDeFicherNas != null)
      {
         SystemeDeFicherNas oldSystemeDeFicherNas;
         for (java.util.Iterator iter = getIteratorSystemeDeFicherNas(); iter.hasNext();)
         {
            oldSystemeDeFicherNas = (SystemeDeFicherNas)iter.next();
            iter.remove();
            oldSystemeDeFicherNas.setNas((Nas)null);
         }
      }
   }
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
         newServeur.setNas(this);      
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
            oldServeur.setNas((Nas)null);
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
            oldServeur.setNas((Nas)null);
         }
      }
   }

	public SystemeDeStockage[] getSystemeDeStockage() {
		return systemeDeStockage;
	}
	
	public void setSystemeDeStockage(SystemeDeStockage[] systemeDeStockage) {
		this.systemeDeStockage = systemeDeStockage;
	}
	   
   
   

}