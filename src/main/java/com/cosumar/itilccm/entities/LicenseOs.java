package com.cosumar.itilccm.entities;

import java.util.*;

public class LicenseOs {
      private int id;
      private String nom;
      private String limiteD_utilisation;
      private String description;
      private String perprtuelle;
      private Date dateDeDebutDeValidite;
      private Date dateDeFinDeValiite;
      private String cle;
   
   /** @pdRoleInfo migr=no name=VersionOs assc=association46 mult=1..1 type=Composition */
      private VersionOs versionOs;
   /** @pdRoleInfo migr=no name=Ordinateur assc=association47 mult=0..1 */
      private Ordinateur ordinateur;
   /** @pdRoleInfo migr=no name=Serveur assc=association50 mult=0..1 */
      private Serveur serveur;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association51 mult=0..1 */
      private MachineVirtuelle machineVirtuelle;
   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLimiteD_utilisation() {
		return limiteD_utilisation;
	}
	public void setLimiteD_utilisation(String limiteD_utilisation) {
		this.limiteD_utilisation = limiteD_utilisation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPerprtuelle() {
		return perprtuelle;
	}
	public void setPerprtuelle(String perprtuelle) {
		this.perprtuelle = perprtuelle;
	}
	public Date getDateDeDebutDeValidite() {
		return dateDeDebutDeValidite;
	}
	public void setDateDeDebutDeValidite(Date dateDeDebutDeValidite) {
		this.dateDeDebutDeValidite = dateDeDebutDeValidite;
	}
	public Date getDateDeFinDeValiite() {
		return dateDeFinDeValiite;
	}
	public void setDateDeFinDeValiite(Date dateDeFinDeValiite) {
		this.dateDeFinDeValiite = dateDeFinDeValiite;
	}
	public String getCle() {
		return cle;
	}
	public void setCle(String cle) {
		this.cle = cle;
	}
	public VersionOs getVersionOs() {
		return versionOs;
	}
	public void setVersionOs(VersionOs versionOs) {
		this.versionOs = versionOs;
	}
	public Ordinateur getOrdinateur() {
		return ordinateur;
	}
	public void setOrdinateur(Ordinateur ordinateur) {
		this.ordinateur = ordinateur;
	}
	public Serveur getServeur() {
		return serveur;
	}
	public void setServeur(Serveur serveur) {
		this.serveur = serveur;
	}
	public MachineVirtuelle getMachineVirtuelle() {
		return machineVirtuelle;
	}
	public void setMachineVirtuelle(MachineVirtuelle machineVirtuelle) {
		this.machineVirtuelle = machineVirtuelle;
	}
   
   
   

}