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
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<ApplicationWeb> applicationWeb;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<ArriveeElectrique> arriveeElectrique;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<AutreLogiciel> autreLogiciel;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Bandotheque> bandotheque;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Camera> camera;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Chassis> chassis;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Dvr> dvr;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<EquipementReseau> equipementReseau;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Hyperviseur> hyperviseur;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Imprimante> imprimante;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<InstanceMiddleware> instanceMiddleware;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<LogicielPc> logicielPc;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<MachineVirtuelle> machineVirtuelle;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Middleware> middleware;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Nas> nas;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Ordinateur> ordinateur;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<PduElectrique> pduElectrique;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Peripherique> peripherique;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<ProcessusMetier> processusMetier;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Rack> rack;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Serveur> serveur;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<ServeurDeBasseDeDonnees> serveurDeBasseDeDonnees;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<ServeurWeb> serveurWeb;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Sim> sim;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<SolutionApplicative> solutionApplicative;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<SwitchSan> switchSan;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<SystemeDeStockage> systemeDeStockage;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Tablette> tablette;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<TelephneMobile> telephneMobile;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<TelephoneFixe> telephoneFixe;
	   
	   @Column(nullable=true)
	   @ManyToMany(cascade = CascadeType.ALL)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Vcluster> vcluster;
		   
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

		public Collection<ArriveeElectrique> getArriveeElectrique() {
			return arriveeElectrique;
		}

		public void setArriveeElectrique(Collection<ArriveeElectrique> arriveeElectrique) {
			this.arriveeElectrique = arriveeElectrique;
		}

		public Collection<AutreLogiciel> getAutreLogiciel() {
			return autreLogiciel;
		}

		public void setAutreLogiciel(Collection<AutreLogiciel> autreLogiciel) {
			this.autreLogiciel = autreLogiciel;
		}

		public Collection<Bandotheque> getBandotheque() {
			return bandotheque;
		}

		public void setBandotheque(Collection<Bandotheque> bandotheque) {
			this.bandotheque = bandotheque;
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

		public Collection<Dvr> getDvr() {
			return dvr;
		}

		public void setDvr(Collection<Dvr> dvr) {
			this.dvr = dvr;
		}

		public Collection<EquipementReseau> getEquipementReseau() {
			return equipementReseau;
		}

		public void setEquipementReseau(Collection<EquipementReseau> equipementReseau) {
			this.equipementReseau = equipementReseau;
		}

		public Collection<Hyperviseur> getHyperviseur() {
			return hyperviseur;
		}

		public void setHyperviseur(Collection<Hyperviseur> hyperviseur) {
			this.hyperviseur = hyperviseur;
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

		public Collection<LogicielPc> getLogicielPc() {
			return logicielPc;
		}

		public void setLogicielPc(Collection<LogicielPc> logicielPc) {
			this.logicielPc = logicielPc;
		}

		public Collection<MachineVirtuelle> getMachineVirtuelle() {
			return machineVirtuelle;
		}

		public void setMachineVirtuelle(Collection<MachineVirtuelle> machineVirtuelle) {
			this.machineVirtuelle = machineVirtuelle;
		}

		public Collection<Middleware> getMiddleware() {
			return middleware;
		}

		public void setMiddleware(Collection<Middleware> middleware) {
			this.middleware = middleware;
		}

		public Collection<Nas> getNas() {
			return nas;
		}

		public void setNas(Collection<Nas> nas) {
			this.nas = nas;
		}

		public Collection<Ordinateur> getOrdinateur() {
			return ordinateur;
		}

		public void setOrdinateur(Collection<Ordinateur> ordinateur) {
			this.ordinateur = ordinateur;
		}

		public Collection<PduElectrique> getPduElectrique() {
			return pduElectrique;
		}

		public void setPduElectrique(Collection<PduElectrique> pduElectrique) {
			this.pduElectrique = pduElectrique;
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

		public Collection<Serveur> getServeur() {
			return serveur;
		}

		public void setServeur(Collection<Serveur> serveur) {
			this.serveur = serveur;
		}

		public Collection<ServeurDeBasseDeDonnees> getServeurDeBasseDeDonnees() {
			return serveurDeBasseDeDonnees;
		}

		public void setServeurDeBasseDeDonnees(Collection<ServeurDeBasseDeDonnees> serveurDeBasseDeDonnees) {
			this.serveurDeBasseDeDonnees = serveurDeBasseDeDonnees;
		}

		public Collection<ServeurWeb> getServeurWeb() {
			return serveurWeb;
		}

		public void setServeurWeb(Collection<ServeurWeb> serveurWeb) {
			this.serveurWeb = serveurWeb;
		}

		public Collection<Sim> getSim() {
			return sim;
		}

		public void setSim(Collection<Sim> sim) {
			this.sim = sim;
		}

		public Collection<SolutionApplicative> getSolutionApplicative() {
			return solutionApplicative;
		}

		public void setSolutionApplicative(Collection<SolutionApplicative> solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}

		public Collection<SwitchSan> getSwitchSan() {
			return switchSan;
		}

		public void setSwitchSan(Collection<SwitchSan> switchSan) {
			this.switchSan = switchSan;
		}

		public Collection<SystemeDeStockage> getSystemeDeStockage() {
			return systemeDeStockage;
		}

		public void setSystemeDeStockage(Collection<SystemeDeStockage> systemeDeStockage) {
			this.systemeDeStockage = systemeDeStockage;
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

		public Collection<Vcluster> getVcluster() {
			return vcluster;
		}

		public void setVcluster(Collection<Vcluster> vcluster) {
			this.vcluster = vcluster;
		}
		
		
		   
       
   
   

}