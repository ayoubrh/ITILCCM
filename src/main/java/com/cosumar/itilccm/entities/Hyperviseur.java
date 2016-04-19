package com.cosumar.itilccm.entities;

import java.util.*;

public class Hyperviseur extends Virtualisation {
   /** @pdRoleInfo migr=no name=Serveur assc=association26 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<Serveur> serveur;
   /** @pdRoleInfo migr=no name=Vcluster assc=association25 mult=0..* side=A */
	private Vcluster[] vcluster;
   
   
   

	public Vcluster[] getVcluster() {
		return vcluster;
	}
	
	public void setVcluster(Vcluster[] vcluster) {
		this.vcluster = vcluster;
	}

	public java.util.Collection<Serveur> getServeur() {
		return serveur;
	}

	public void setServeur(java.util.Collection<Serveur> serveur) {
		this.serveur = serveur;
	}
	
	
	
   
   

}