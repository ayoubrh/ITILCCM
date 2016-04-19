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

	public java.util.Collection<Physique> getPhysique() {
		return physique;
	}

	public void setPhysique(java.util.Collection<Physique> physique) {
		this.physique = physique;
	}
	
	
	
	   
   
   

}