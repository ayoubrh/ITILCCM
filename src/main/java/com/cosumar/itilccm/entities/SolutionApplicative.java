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
   private Long id;
	
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
   private Collection<ProcessusMetier> processusMetier;
   	
   	
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

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getCriticite() {
		return criticite;
	}

	public void setCriticite(String criticite) {
		this.criticite = criticite;
	}

	public Date getDateDeMiseEnProduction() {
		return dateDeMiseEnProduction;
	}

	public void setDateDeMiseEnProduction(Date dateDeMiseEnProduction) {
		this.dateDeMiseEnProduction = dateDeMiseEnProduction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Infrastructure> getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(Collection<Infrastructure> infrastructure) {
		this.infrastructure = infrastructure;
	}
	
	public java.util.Collection<EquipementReseau> getEquipementReseau() {
		return equipementReseau;
	}

	public void setEquipementReseau(java.util.Collection<EquipementReseau> equipementReseau) {
		this.equipementReseau = equipementReseau;
	}

	public Collection<ProcessusMetier> getProcessusMetier() {
		return processusMetier;
	}

	public void setProcessusMetier(Collection<ProcessusMetier> processusMetier) {
		this.processusMetier = processusMetier;
	}

	public Collection<MachineVirtuelle> getMachineVirtuelle() {
		return machineVirtuelle;
	}

	public void setMachineVirtuelle(Collection<MachineVirtuelle> machineVirtuelle) {
		this.machineVirtuelle = machineVirtuelle;
	}

	public Collection<Virtualisation> getVirtualisation() {
		return virtualisation;
	}

	public void setVirtualisation(Collection<Virtualisation> virtualisation) {
		this.virtualisation = virtualisation;
	}

	public Collection<LogicielEtApplication> getLogicielEtApplication() {
		return logicielEtApplication;
	}

	public void setLogicielEtApplication(Collection<LogicielEtApplication> logicielEtApplication) {
		this.logicielEtApplication = logicielEtApplication;
	}

	public Collection<InstanceDeBasseDeDonnes> getInstanceDeBasseDeDonnes() {
		return instanceDeBasseDeDonnes;
	}

	public void setInstanceDeBasseDeDonnes(Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes) {
		this.instanceDeBasseDeDonnes = instanceDeBasseDeDonnes;
	}

	public Collection<InstanceMiddleware> getInstanceMiddleware() {
		return instanceMiddleware;
	}

	public void setInstanceMiddleware(Collection<InstanceMiddleware> instanceMiddleware) {
		this.instanceMiddleware = instanceMiddleware;
	}

	public Collection<ApplicationWeb> getApplicationWeb() {
		return applicationWeb;
	}

	public void setApplicationWeb(Collection<ApplicationWeb> applicationWeb) {
		this.applicationWeb = applicationWeb;
	}

   
	 
   

}