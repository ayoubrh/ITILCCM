package com.cosumar.itilccm.entities;

import java.util.*;

public class VersionOs {
      private int id;
      private String nom;
      private String familleOs;
   
   /** @pdRoleInfo migr=no name=LicenseOs assc=association46 mult=1..1 side=A */
      private LicenseOs licenseOs;

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
	
	public String getFamilleOs() {
		return familleOs;
	}
	
	public void setFamilleOs(String familleOs) {
		this.familleOs = familleOs;
	}
	
	public LicenseOs getLicenseOs() {
		return licenseOs;
	}
	
	public void setLicenseOs(LicenseOs licenseOs) {
		this.licenseOs = licenseOs;
	}
      
      

}