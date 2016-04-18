package com.cosumar.itilccm.entities;

import java.util.*;

public class Vcluster extends Virtualisation {
   /** @pdRoleInfo migr=no name=Hyperviseur assc=association25 mult=0..1 */
	private Hyperviseur hyperviseur;

	public Hyperviseur getHyperviseur() {
		return hyperviseur;
	}
	
	public void setHyperviseur(Hyperviseur hyperviseur) {
		this.hyperviseur = hyperviseur;
	}
	
	
	

}