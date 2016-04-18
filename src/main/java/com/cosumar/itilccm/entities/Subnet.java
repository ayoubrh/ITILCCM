package com.cosumar.itilccm.entities;

import java.util.*;

public class Subnet {
      private int id;
      private String ip;
      private String masqueIp;
      private String nomDeSubnnet;
      private String organisation;
      private String description;
   
   /** @pdRoleInfo migr=no name=Vlan assc=association17 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<Vlan> vlan;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Vlan> getVlan() {
      if (vlan == null)
         vlan = new java.util.HashSet<Vlan>();
      return vlan;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVlan() {
      if (vlan == null)
         vlan = new java.util.HashSet<Vlan>();
      return vlan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVlan */
   public void setVlan(java.util.Collection<Vlan> newVlan) {
      removeAllVlan();
      for (java.util.Iterator iter = newVlan.iterator(); iter.hasNext();)
         addVlan((Vlan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVlan */
   public void addVlan(Vlan newVlan) {
      if (newVlan == null)
         return;
      if (this.vlan == null)
         this.vlan = new java.util.HashSet<Vlan>();
      if (!this.vlan.contains(newVlan))
         this.vlan.add(newVlan);
   }
   
   /** @pdGenerated default remove
     * @param oldVlan */
   public void removeVlan(Vlan oldVlan) {
      if (oldVlan == null)
         return;
      if (this.vlan != null)
         if (this.vlan.contains(oldVlan))
            this.vlan.remove(oldVlan);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVlan() {
      if (vlan != null)
         vlan.clear();
   }

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getMasqueIp() {
		return masqueIp;
	}
	
	public void setMasqueIp(String masqueIp) {
		this.masqueIp = masqueIp;
	}
	
	public String getNomDeSubnnet() {
		return nomDeSubnnet;
	}
	
	public void setNomDeSubnnet(String nomDeSubnnet) {
		this.nomDeSubnnet = nomDeSubnnet;
	}
	
	public String getOrganisation() {
		return organisation;
	}
	
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	   
   
   

}