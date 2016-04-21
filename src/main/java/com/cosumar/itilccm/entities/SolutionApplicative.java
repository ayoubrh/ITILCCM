package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class SolutionApplicative implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String statut;
   private String criticite;
   private Date dateDeMiseEnProduction;
   private String description;
   
   	@ManyToMany(mappedBy="solutionApplicative")
  	@Column(nullable = true)
   private Collection<Infrastructure> infrastructure;
   	
   	@ManyToMany(mappedBy="solutionApplicative")
  	@Column(nullable = true)
   private java.util.Collection<EquipementReseau> equipementReseau;
   
   	@ManyToMany(mappedBy="solutionApplicative")
 	@Column(nullable = true)
   private Collection<ProessusMetier> proessusMetier;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association31 mult=0..* side=A */
   private MachineVirtuelle[] machineVirtuelle;
   /** @pdRoleInfo migr=no name=Virtualisation assc=association32 mult=0..* side=A */
   private Virtualisation[] virtualisation;
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association49 mult=0..* side=A */
   private LogicielEtApplication[] logicielEtApplication;
   /** @pdRoleInfo migr=no name=InstanceDeBasseDeDonnes assc=association54 mult=0..* side=A */
   private InstanceDeBasseDeDonnes[] instanceDeBasseDeDonnes;
   /** @pdRoleInfo migr=no name=InstanceMiddleware assc=association55 mult=0..* side=A */
   private InstanceMiddleware[] instanceMiddleware;
   /** @pdRoleInfo migr=no name=ApplicationWeb assc=association56 mult=0..* side=A */
   private Collection<ApplicationWeb> applicationWeb;
   
   
   

}