package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Groupe implements Serializable {
	
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
       
       @NotEmpty
	   private String nom;
       
       @NotEmpty
	   private String statut;
       
	   private String type;
	   private String description;
	   
	   @ManyToOne
	   @JoinColumn(name="id_groupe")
	   private Groupe groupe_parent;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<ApplicationWeb> applicationWeb;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<ConnexionElectrique> connexionElectrique;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<LogicielEtApplication> logicielEtApplication;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Infrastructure> infrastructure;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Camera> camera;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Chassis> chassis;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<EquipementReseau> equipementReseau;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Virtualisation> virtualisation;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Imprimante> imprimante;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<InstanceMiddleware> instanceMiddleware;
	   
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<MachineVirtuelle> machineVirtuelle;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Ordinateur> ordinateur;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Peripherique> peripherique;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<ProcessusMetier> processusMetier;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Rack> rack;
	 
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<SolutionApplicative> solutionApplicative;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Tablette> tablette;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<TelephneMobile> telephneMobile;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<TelephoneFixe> telephoneFixe;
	   
		   
		public Groupe() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Groupe(String nom, String statut, String type, String description) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.type = type;
			this.description = description;
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

		public String getStatut() {
			return statut;
		}

		public void setStatut(String statut) {
			this.statut = statut;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Groupe getGroupe_parent() {
			return groupe_parent;
		}

		public void setGroupe_parent(Groupe groupe_parent) {
			this.groupe_parent = groupe_parent;
		}

		public Collection<ApplicationWeb> getApplicationWeb() {
			return applicationWeb;
		}

		public void setApplicationWeb(Collection<ApplicationWeb> applicationWeb) {
			this.applicationWeb = applicationWeb;
		}

		public Collection<Camera> getCamera() {
			return camera;
		}

		public void setCamera(Collection<Camera> camera) {
			this.camera = camera;
		}

		public Collection<Chassis> getChassis() {
			return chassis;
		}

		public void setChassis(Collection<Chassis> chassis) {
			this.chassis = chassis;
		}

		public Collection<EquipementReseau> getEquipementReseau() {
			return equipementReseau;
		}

		public void setEquipementReseau(Collection<EquipementReseau> equipementReseau) {
			this.equipementReseau = equipementReseau;
		}

		public Collection<Imprimante> getImprimante() {
			return imprimante;
		}

		public void setImprimante(Collection<Imprimante> imprimante) {
			this.imprimante = imprimante;
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

		public Collection<MachineVirtuelle> getMachineVirtuelle() {
			return machineVirtuelle;
		}

		public void setMachineVirtuelle(Collection<MachineVirtuelle> machineVirtuelle) {
			this.machineVirtuelle = machineVirtuelle;
		}

		public Collection<Ordinateur> getOrdinateur() {
			return ordinateur;
		}

		public void setOrdinateur(Collection<Ordinateur> ordinateur) {
			this.ordinateur = ordinateur;
		}

		public Collection<Peripherique> getPeripherique() {
			return peripherique;
		}

		public void setPeripherique(Collection<Peripherique> peripherique) {
			this.peripherique = peripherique;
		}

		public Collection<ProcessusMetier> getProcessusMetier() {
			return processusMetier;
		}

		public void setProcessusMetier(Collection<ProcessusMetier> processusMetier) {
			this.processusMetier = processusMetier;
		}

		public Collection<Rack> getRack() {
			return rack;
		}

		public void setRack(Collection<Rack> rack) {
			this.rack = rack;
		}

		public Collection<SolutionApplicative> getSolutionApplicative() {
			return solutionApplicative;
		}

		public void setSolutionApplicative(Collection<SolutionApplicative> solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}

		public Collection<Tablette> getTablette() {
			return tablette;
		}

		public void setTablette(Collection<Tablette> tablette) {
			this.tablette = tablette;
		}

		public Collection<TelephneMobile> getTelephneMobile() {
			return telephneMobile;
		}

		public void setTelephneMobile(Collection<TelephneMobile> telephneMobile) {
			this.telephneMobile = telephneMobile;
		}

		public Collection<TelephoneFixe> getTelephoneFixe() {
			return telephoneFixe;
		}

		public void setTelephoneFixe(Collection<TelephoneFixe> telephoneFixe) {
			this.telephoneFixe = telephoneFixe;
		}

		public Collection<ConnexionElectrique> getConnexionElectrique() {
			return connexionElectrique;
		}

		public void setConnexionElectrique(Collection<ConnexionElectrique> connexionElectrique) {
			this.connexionElectrique = connexionElectrique;
		}

		public Collection<LogicielEtApplication> getLogicielEtApplication() {
			return logicielEtApplication;
		}

		public void setLogicielEtApplication(Collection<LogicielEtApplication> logicielEtApplication) {
			this.logicielEtApplication = logicielEtApplication;
		}

		public Collection<Infrastructure> getInfrastructure() {
			return infrastructure;
		}

		public void setInfrastructure(Collection<Infrastructure> infrastructure) {
			this.infrastructure = infrastructure;
		}

		public Collection<Virtualisation> getVirtualisation() {
			return virtualisation;
		}

		public void setVirtualisation(Collection<Virtualisation> virtualisation) {
			this.virtualisation = virtualisation;
		}
         
}