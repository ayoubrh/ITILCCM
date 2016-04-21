/***********************************************************************
 * Module:  SolutionApplicative.java
 * Author:  ayoub
 * Purpose: Defines the Class SolutionApplicative
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SolutionApplicative {
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
		   private int id;
			
		   private String nom;
		   private String statut;
		   private String criticite;
		   private Date dateDeMiseEnProduction;
		   private String description;
		   private Collection<Infrastructure> infrastructure;
		   private Collection<EquipementReseau> equipementReseau;
		   private ProessusMetier[] proessusMetier;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="solutionApplicative")
		   private Collection<MachineVirtuelle> machineVirtuelle;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="solutionApplicative")
		   private Collection<Virtualisation> virtualisation;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="solutionApplicative")
		   private Collection<LogicielEtApplication> logicielEtApplication;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="solutionApplicative")
		   private Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="solutionApplicative")
		   private Collection<InstanceMiddleware> instanceMiddleware;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="solutionApplicative")
		   private Collection<ApplicationWeb> applicationWeb;


   
   
   

}