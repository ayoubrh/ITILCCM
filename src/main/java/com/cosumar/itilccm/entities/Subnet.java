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

	public java.util.Collection<Vlan> getVlan() {
		return vlan;
	}

	public void setVlan(java.util.Collection<Vlan> vlan) {
		this.vlan = vlan;
	}
	
	
	
	   
   
   

}