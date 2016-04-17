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
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Infrastructure> getInfrastructure() {
      if (infrastructure == null)
         infrastructure = new java.util.HashSet<Infrastructure>();
      return infrastructure;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInfrastructure() {
      if (infrastructure == null)
         infrastructure = new java.util.HashSet<Infrastructure>();
      return infrastructure.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInfrastructure */
   public void setInfrastructure(java.util.Collection<Infrastructure> newInfrastructure) {
      removeAllInfrastructure();
      for (java.util.Iterator iter = newInfrastructure.iterator(); iter.hasNext();)
         addInfrastructure((Infrastructure)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInfrastructure */
   public void addInfrastructure(Infrastructure newInfrastructure) {
      if (newInfrastructure == null)
         return;
      if (this.infrastructure == null)
         this.infrastructure = new java.util.HashSet<Infrastructure>();
      if (!this.infrastructure.contains(newInfrastructure))
      {
         this.infrastructure.add(newInfrastructure);
         newInfrastructure.setIntefaceReseau(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldInfrastructure */
   public void removeInfrastructure(Infrastructure oldInfrastructure) {
      if (oldInfrastructure == null)
         return;
      if (this.infrastructure != null)
         if (this.infrastructure.contains(oldInfrastructure))
         {
            this.infrastructure.remove(oldInfrastructure);
            oldInfrastructure.setIntefaceReseau((IntefaceReseau)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInfrastructure() {
      if (infrastructure != null)
      {
         Infrastructure oldInfrastructure;
         for (java.util.Iterator iter = getIteratorInfrastructure(); iter.hasNext();)
         {
            oldInfrastructure = (Infrastructure)iter.next();
            iter.remove();
            oldInfrastructure.setIntefaceReseau((IntefaceReseau)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<EquipementReseau> getEquipementReseau() {
      if (equipementReseau == null)
         equipementReseau = new java.util.HashSet<EquipementReseau>();
      return equipementReseau;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEquipementReseau() {
      if (equipementReseau == null)
         equipementReseau = new java.util.HashSet<EquipementReseau>();
      return equipementReseau.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEquipementReseau */
   public void setEquipementReseau(java.util.Collection<EquipementReseau> newEquipementReseau) {
      removeAllEquipementReseau();
      for (java.util.Iterator iter = newEquipementReseau.iterator(); iter.hasNext();)
         addEquipementReseau((EquipementReseau)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEquipementReseau */
   public void addEquipementReseau(EquipementReseau newEquipementReseau) {
      if (newEquipementReseau == null)
         return;
      if (this.equipementReseau == null)
         this.equipementReseau = new java.util.HashSet<EquipementReseau>();
      if (!this.equipementReseau.contains(newEquipementReseau))
      {
         this.equipementReseau.add(newEquipementReseau);
         newEquipementReseau.setIntefaceReseau(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEquipementReseau */
   public void removeEquipementReseau(EquipementReseau oldEquipementReseau) {
      if (oldEquipementReseau == null)
         return;
      if (this.equipementReseau != null)
         if (this.equipementReseau.contains(oldEquipementReseau))
         {
            this.equipementReseau.remove(oldEquipementReseau);
            oldEquipementReseau.setIntefaceReseau((IntefaceReseau)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEquipementReseau() {
      if (equipementReseau != null)
      {
         EquipementReseau oldEquipementReseau;
         for (java.util.Iterator iter = getIteratorEquipementReseau(); iter.hasNext();)
         {
            oldEquipementReseau = (EquipementReseau)iter.next();
            iter.remove();
            oldEquipementReseau.setIntefaceReseau((IntefaceReseau)null);
         }
      }
   }

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
   
   
   

}