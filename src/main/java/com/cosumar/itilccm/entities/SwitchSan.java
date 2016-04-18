package com.cosumar.itilccm.entities;

import java.util.*;

public class SwitchSan extends Infrastructure {
   /** @pdRoleInfo migr=no name=Serveur assc=association11 mult=0..* side=A */
	private Serveur[] serveur;
   /** @pdRoleInfo migr=no name=SystemeDeStockage assc=association12 mult=0..* side=A */
	private SystemeDeStockage[] systemeDeStockage;
   
	public Serveur[] getServeur() {
		return serveur;
	}
	public void setServeur(Serveur[] serveur) {
		this.serveur = serveur;
	}
	public SystemeDeStockage[] getSystemeDeStockage() {
		return systemeDeStockage;
	}
	public void setSystemeDeStockage(SystemeDeStockage[] systemeDeStockage) {
		this.systemeDeStockage = systemeDeStockage;
	}
	   
   

}