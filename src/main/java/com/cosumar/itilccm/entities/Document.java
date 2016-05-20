package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Document implements Serializable {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   @NotEmpty
	   private String nom;
	   
	   private String statut;
	   private String version;
	   private String description;
	  
	  
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<Contrat> contrats;
	   
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Ordinateur> ordinateur;
	   	
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Rack> rack;
	   	
		@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Chassis> chassis;
	   	
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Imprimante> imprimante;
	   	
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<TelephneMobile> telephonemobile;
	   	
	   	
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Peripherique> peripherique;
	   	
	   	
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<TelephoneFixe> telephonefixe;
	    
	    @ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Tablette> tablette;
	    
	    @ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Sim> sim;
	    
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<LogicielEtApplication> logicielEtApplication;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<ConnexionElectrique> connexionElectrique;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<LicenseLogiciel> licenseLogiciel;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<ApplicationWeb> applicationWeb;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<InstanceMiddleware> instanceMiddleware;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<LicenseOs> licenseOs;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<Virtualisation> virtualisation;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<Camera> camera;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<MachineVirtuelle> machineVirtuelle;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<ProcessusMetier> processusMetier;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<SolutionApplicative> solutionApplicative;

		public Document() {
			super();
			// TODO Auto-generated constructor stub
		}
   
		public Document(String nom, String statut, String version, String description) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.version = version;
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

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Collection<Contrat> getContrats() {
			return contrats;
		}

		public void setContrats(Collection<Contrat> contrats) {
			this.contrats = contrats;
		}

		public Collection<Ordinateur> getOrdinateur() {
			return ordinateur;
		}

		public void setOrdinateur(Collection<Ordinateur> ordinateur) {
			this.ordinateur = ordinateur;
		}

		public Collection<Rack> getRack() {
			return rack;
		}

		public void setRack(Collection<Rack> rack) {
			this.rack = rack;
		}

		public Collection<Chassis> getChassis() {
			return chassis;
		}

		public void setChassis(Collection<Chassis> chassis) {
			this.chassis = chassis;
		}

		public Collection<Imprimante> getImprimante() {
			return imprimante;
		}

		public void setImprimante(Collection<Imprimante> imprimante) {
			this.imprimante = imprimante;
		}

		public Collection<TelephneMobile> getTelephonemobile() {
			return telephonemobile;
		}

		public void setTelephonemobile(Collection<TelephneMobile> telephonemobile) {
			this.telephonemobile = telephonemobile;
		}

		public Collection<Peripherique> getPeripherique() {
			return peripherique;
		}

		public void setPeripherique(Collection<Peripherique> peripherique) {
			this.peripherique = peripherique;
		}

		public Collection<TelephoneFixe> getTelephonefixe() {
			return telephonefixe;
		}

		public void setTelephonefixe(Collection<TelephoneFixe> telephonefixe) {
			this.telephonefixe = telephonefixe;
		}

		public Collection<Tablette> getTablette() {
			return tablette;
		}

		public void setTablette(Collection<Tablette> tablette) {
			this.tablette = tablette;
		}

		public Collection<Sim> getSim() {
			return sim;
		}

		public void setSim(Collection<Sim> sim) {
			this.sim = sim;
		}

		public Collection<LogicielEtApplication> getLogicielEtApplication() {
			return logicielEtApplication;
		}

		public void setLogicielEtApplication(Collection<LogicielEtApplication> logicielEtApplication) {
			this.logicielEtApplication = logicielEtApplication;
		}

		public Collection<ConnexionElectrique> getConnexionElectrique() {
			return connexionElectrique;
		}

		public void setConnexionElectrique(Collection<ConnexionElectrique> connexionElectrique) {
			this.connexionElectrique = connexionElectrique;
		}

		public Collection<LicenseLogiciel> getLicenseLogiciel() {
			return licenseLogiciel;
		}

		public void setLicenseLogiciel(Collection<LicenseLogiciel> licenseLogiciel) {
			this.licenseLogiciel = licenseLogiciel;
		}

		public Collection<ApplicationWeb> getApplicationWeb() {
			return applicationWeb;
		}

		public void setApplicationWeb(Collection<ApplicationWeb> applicationWeb) {
			this.applicationWeb = applicationWeb;
		}

		public Collection<InstanceMiddleware> getInstanceMiddleware() {
			return instanceMiddleware;
		}

		public void setInstanceMiddleware(Collection<InstanceMiddleware> instanceMiddleware) {
			this.instanceMiddleware = instanceMiddleware;
		}

		public Collection<InstanceDeBasseDeDonnes> getInstanceDeBasseDeDonnes() {
			return instanceDeBasseDeDonnes;
		}

		public void setInstanceDeBasseDeDonnes(Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes) {
			this.instanceDeBasseDeDonnes = instanceDeBasseDeDonnes;
		}

		public Collection<LicenseOs> getLicenseOs() {
			return licenseOs;
		}

		public void setLicenseOs(Collection<LicenseOs> licenseOs) {
			this.licenseOs = licenseOs;
		}

		public Collection<Virtualisation> getVirtualisation() {
			return virtualisation;
		}

		public void setVirtualisation(Collection<Virtualisation> virtualisation) {
			this.virtualisation = virtualisation;
		}

		public Collection<Camera> getCamera() {
			return camera;
		}

		public void setCamera(Collection<Camera> camera) {
			this.camera = camera;
		}

		public Collection<MachineVirtuelle> getMachineVirtuelle() {
			return machineVirtuelle;
		}

		public void setMachineVirtuelle(Collection<MachineVirtuelle> machineVirtuelle) {
			this.machineVirtuelle = machineVirtuelle;
		}

		public Collection<ProcessusMetier> getProcessusMetier() {
			return processusMetier;
		}

		public void setProcessusMetier(Collection<ProcessusMetier> processusMetier) {
			this.processusMetier = processusMetier;
		}

		public Collection<SolutionApplicative> getSolutionApplicative() {
			return solutionApplicative;
		}

		public void setSolutionApplicative(Collection<SolutionApplicative> solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}
		
		
		

}