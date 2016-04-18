package com.cosumar.itilccm.entities;

import java.util.*;

public class Lieu {
      private int id;
      private String statut;
      private String organisme;
      private String adresse;
      private String codePostale;
      private String ville;
      private String pays;
   
   /** @pdRoleInfo migr=no name=Contact assc=association58 mult=0..1 */
      private Contact contact;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStatut() {
		return statut;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	public String getOrganisme() {
		return organisme;
	}
	
	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getCodePostale() {
		return codePostale;
	}
	
	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getPays() {
		return pays;
	}
	
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	public Contact getContact() {
		return contact;
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	   
   

}