package com.cosumar.itilccm.entities;

import java.util.*;

public class Bandotheque extends Infrastructure {
   /** @pdRoleInfo migr=no name=Bande assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
	private java.util.Collection<Bande> bande;

public java.util.Collection<Bande> getBande() {
	return bande;
}

public void setBande(java.util.Collection<Bande> bande) {
	this.bande = bande;
}
   
   
   

   
   
}