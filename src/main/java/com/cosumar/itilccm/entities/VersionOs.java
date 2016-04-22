package com.cosumar.itilccm.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class VersionOs implements Serializable {
	
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;
			
			@NotEmpty
		    private String nom;
		  
		    private String familleOs;
		   
		    @OneToOne(mappedBy="versionOs")
		    private LicenseOs licenseOs;

			public VersionOs() {
				super();
				// TODO Auto-generated constructor stub
			}

			public VersionOs(String nom, String familleOs) {
				super();
				this.nom = nom;
				this.familleOs = familleOs;
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
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