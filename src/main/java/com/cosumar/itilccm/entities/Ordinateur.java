package com.cosumar.itilccm.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Ordinateur {
	       @Id
	       @GeneratedValue(strategy=GenerationType.IDENTITY)
		   private int id;
		  
		   private String nom;
		   
		   private String statut;
		  
		   private String criticite;
		   
		   private String marque;
		   
		   private String type;
		   
		   private String cpu;
		  
		   private String ram;
		   
		   private String numeroDeSerie;
		   
		   private String numeroAsset;
		   
		   private Date dateDeMiseEnProduction;
		  
		   private Date dateD_achat;
		  
		   private Date dateDeFinDeGarantie;
		   
		   private String description;
		   
		   private User user;
		   
		   private Collection<EquipementReseau> equipementReseau;
		   
		   private IntefaceReseau[] intefaceReseau;
		   
		   private Peripherique[] peripherique;
		   
		   @Column(nullable=true)
		   @ManyToOne
		   @JoinColumn(name="id_licenseOs")
		   private LicenseOs licenseOs;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="ordinateur")
		   private Collection<LogicielEtApplication> logicielEtApplication;
   
   
   

}