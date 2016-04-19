package com.cosumar.itilccm.entities;

import java.util.*;

public class Nas extends Infrastructure {
   /** @pdRoleInfo migr=no name=SystemeDeFicherNas assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
	private java.util.Collection<SystemeDeFicherNas> systemeDeFicherNas;
   /** @pdRoleInfo migr=no name=Serveur assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<Serveur> serveur;
   /** @pdRoleInfo migr=no name=SystemeDeStockage assc=association13 mult=0..* side=A */
	private SystemeDeStockage[] systemeDeStockage;
	
	public java.util.Collection<SystemeDeFicherNas> getSystemeDeFicherNas() {
		return systemeDeFicherNas;
	}
	public void setSystemeDeFicherNas(java.util.Collection<SystemeDeFicherNas> systemeDeFicherNas) {
		this.systemeDeFicherNas = systemeDeFicherNas;
	}
	public java.util.Collection<Serveur> getServeur() {
		return serveur;
	}
	public void setServeur(java.util.Collection<Serveur> serveur) {
		this.serveur = serveur;
	}
	public SystemeDeStockage[] getSystemeDeStockage() {
		return systemeDeStockage;
	}
	public void setSystemeDeStockage(SystemeDeStockage[] systemeDeStockage) {
		this.systemeDeStockage = systemeDeStockage;
	}
   
   
   
	   
   
   

}