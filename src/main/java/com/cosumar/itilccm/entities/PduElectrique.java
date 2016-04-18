package com.cosumar.itilccm.entities;

import java.util.*;

public class PduElectrique extends ConnexionElectrique {
   /** @pdRoleInfo migr=no name=ArriveeElectrique assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<ArriveeElectrique> arriveeElectrique;
   /** @pdRoleInfo migr=no name=Rack assc=association7 mult=0..* side=A */
	private Rack[] rack;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ArriveeElectrique> getArriveeElectrique() {
      if (arriveeElectrique == null)
         arriveeElectrique = new java.util.HashSet<ArriveeElectrique>();
      return arriveeElectrique;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorArriveeElectrique() {
      if (arriveeElectrique == null)
         arriveeElectrique = new java.util.HashSet<ArriveeElectrique>();
      return arriveeElectrique.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newArriveeElectrique */
   public void setArriveeElectrique(java.util.Collection<ArriveeElectrique> newArriveeElectrique) {
      removeAllArriveeElectrique();
      for (java.util.Iterator iter = newArriveeElectrique.iterator(); iter.hasNext();)
         addArriveeElectrique((ArriveeElectrique)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newArriveeElectrique */
   public void addArriveeElectrique(ArriveeElectrique newArriveeElectrique) {
      if (newArriveeElectrique == null)
         return;
      if (this.arriveeElectrique == null)
         this.arriveeElectrique = new java.util.HashSet<ArriveeElectrique>();
      if (!this.arriveeElectrique.contains(newArriveeElectrique))
      {
         this.arriveeElectrique.add(newArriveeElectrique);
         newArriveeElectrique.setPduElectrique(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldArriveeElectrique */
   public void removeArriveeElectrique(ArriveeElectrique oldArriveeElectrique) {
      if (oldArriveeElectrique == null)
         return;
      if (this.arriveeElectrique != null)
         if (this.arriveeElectrique.contains(oldArriveeElectrique))
         {
            this.arriveeElectrique.remove(oldArriveeElectrique);
            oldArriveeElectrique.setPduElectrique((PduElectrique)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllArriveeElectrique() {
      if (arriveeElectrique != null)
      {
         ArriveeElectrique oldArriveeElectrique;
         for (java.util.Iterator iter = getIteratorArriveeElectrique(); iter.hasNext();)
         {
            oldArriveeElectrique = (ArriveeElectrique)iter.next();
            iter.remove();
            oldArriveeElectrique.setPduElectrique((PduElectrique)null);
         }
      }
   }

	public Rack[] getRack() {
		return rack;
	}
	
	public void setRack(Rack[] rack) {
		this.rack = rack;
	}
   
   
   

}