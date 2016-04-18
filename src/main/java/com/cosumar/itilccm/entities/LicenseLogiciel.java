package com.cosumar.itilccm.entities;

import java.util.*;

public class LicenseLogiciel {
      private int id;
      private String nom;
      private String limiteD_utilisation;
      private String description;
      private String perpetuelle;
      private Date dateDeFinDeValiite;
      private Date dateDeDebutDeValidite;
      private String cle;
   
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association45 mult=1..1 */
      private LogicielEtApplication logicielEtApplication;
	
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
	
	public String getPerpetuelle() {
		return perpetuelle;
	}
	
	public void setPerpetuelle(String perpetuelle) {
		this.perpetuelle = perpetuelle;
	}
	
	public Date getDateDeFinDeValiite() {
		return dateDeFinDeValiite;
	}
	
	public void setDateDeFinDeValiite(Date dateDeFinDeValiite) {
		this.dateDeFinDeValiite = dateDeFinDeValiite;
	}
	
	public Date getDateDeDebutDeValidite() {
		return dateDeDebutDeValidite;
	}
	
	public void setDateDeDebutDeValidite(Date dateDeDebutDeValidite) {
		this.dateDeDebutDeValidite = dateDeDebutDeValidite;
	}
	
	public String getCle() {
		return cle;
	}
	
	public void setCle(String cle) {
		this.cle = cle;
	}
	
	public LogicielEtApplication getLogicielEtApplication() {
		return logicielEtApplication;
	}
	
	public void setLogicielEtApplication(LogicielEtApplication logicielEtApplication) {
		this.logicielEtApplication = logicielEtApplication;
	}
	   
	   

}