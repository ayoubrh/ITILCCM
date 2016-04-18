package com.cosumar.itilccm.entities;

import java.util.*;

public class Vlan {
      private int id;
      private String vlantag;
      private String description;
   
   /** @pdRoleInfo migr=no name=Physique assc=association16 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<Physique> physique;
   /** @pdRoleInfo migr=no name=Subnet assc=association17 mult=0..* side=A */
      private Subnet[] subnet;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Physique> getPhysique() {
      if (physique == null)
         physique = new java.util.HashSet<Physique>();
      return physique;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPhysique() {
      if (physique == null)
         physique = new java.util.HashSet<Physique>();
      return physique.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPhysique */
   public void setPhysique(java.util.Collection<Physique> newPhysique) {
      removeAllPhysique();
      for (java.util.Iterator iter = newPhysique.iterator(); iter.hasNext();)
         addPhysique((Physique)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPhysique */
   public void addPhysique(Physique newPhysique) {
      if (newPhysique == null)
         return;
      if (this.physique == null)
         this.physique = new java.util.HashSet<Physique>();
      if (!this.physique.contains(newPhysique))
         this.physique.add(newPhysique);
   }
   
   /** @pdGenerated default remove
     * @param oldPhysique */
   public void removePhysique(Physique oldPhysique) {
      if (oldPhysique == null)
         return;
      if (this.physique != null)
         if (this.physique.contains(oldPhysique))
            this.physique.remove(oldPhysique);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPhysique() {
      if (physique != null)
         physique.clear();
   }

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getVlantag() {
		return vlantag;
	}
	
	public void setVlantag(String vlantag) {
		this.vlantag = vlantag;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Subnet[] getSubnet() {
		return subnet;
	}
	
	public void setSubnet(Subnet[] subnet) {
		this.subnet = subnet;
	}
	   
   
   

}