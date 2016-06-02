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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Contrat implements Serializable {
	
	       @Id
	       @GeneratedValue(strategy=GenerationType.IDENTITY)
		   private Long id;
	       
	       @NotEmpty
		   private String nom;
		   private String client;
	       
		   private String description;
		   private Date dateDeDebut;
		   private Date dateDeFin;
		   private double cout;
		   private String monnaie;
		   private String periodiciteDeFacturation;
		   private String uniteDeCout;
		   private String fournisseur;
		   
		   private String niveauDeService;
		   private String statut;
		   private String typeDeContrat;
		   
		   @Column(nullable=true)
		   @ManyToMany(cascade = CascadeType.ALL)
		   @LazyCollection(LazyCollectionOption.FALSE) 
		   private Collection<Contact> contacts;
		   
		   @Column(nullable=true)
		   @ManyToMany(cascade = CascadeType.ALL)
		   @LazyCollection(LazyCollectionOption.FALSE)
		   private Collection<Document> documents;
		   
		   @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<Ordinateur> ordinateur;
		   
		   @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<EquipementReseau> equipementreseaux;
		   
		   @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<Infrastructure> infrastructure;
		   
		   @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<Rack> rack;

		   @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<Chassis> chassis;
		   
		   @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<Imprimante> imprimante;
		   
		   @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<TelephneMobile> telephonemobile;
		   
		   @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<Peripherique> peripherique;
		   
		   
		    @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<TelephoneFixe> telephonefixe;
		    
		    @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<Tablette> tablette;
		    
		    @ManyToMany(mappedBy="contrat")
		   	@Column(nullable = true)
		   private Collection<Sim> sim;

		    @Column(nullable=true)
		   @ManyToMany(mappedBy="contrats")
		   private Collection<LogicielEtApplication> logicielEtApplication;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="contrats")
		   private Collection<ApplicationWeb> applicationWeb;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="contrats")
		   private Collection<InstanceMiddleware> instanceMiddleware;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="contrats")
		   private Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="contrats")
		   private Collection<ConnexionElectrique> connexionElectrique;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="contrats")
		   private Collection<Virtualisation> virtualisation;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="contrats")
		   private Collection<Camera> camera;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="contrats")
		   private Collection<MachineVirtuelle> machineVirtuelle;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="contrats")
		   private Collection<SolutionApplicative> solutionApplicative;
		   
			public Contrat() {
				super();
				// TODO Auto-generated constructor stub
			}
			
			public Contrat(String nom, String client, String description, Date dateDeDebut, Date dateDeFin, double cout,
					String monnaie, String periodiciteDeFacturation, String uniteDeCout, String fournisseur,
					String niveauDeService, String statut, String typeDeContrat) {
				super();
				this.nom = nom;
				this.client = client;
				this.description = description;
				this.dateDeDebut = dateDeDebut;
				this.dateDeFin = dateDeFin;
				this.cout = cout;
				this.monnaie = monnaie;
				this.periodiciteDeFacturation = periodiciteDeFacturation;
				this.uniteDeCout = uniteDeCout;
				this.fournisseur = fournisseur;
				this.niveauDeService = niveauDeService;
				this.statut = statut;
				this.typeDeContrat = typeDeContrat;
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

			public String getClient() {
				return client;
			}

			public void setClient(String client) {
				this.client = client;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Date getDateDeDebut() {
				return dateDeDebut;
			}

			public void setDateDeDebut(Date dateDeDebut) {
				this.dateDeDebut = dateDeDebut;
			}

			public Date getDateDeFin() {
				return dateDeFin;
			}

			public void setDateDeFin(Date dateDeFin) {
				this.dateDeFin = dateDeFin;
			}

			public double getCout() {
				return cout;
			}

			public void setCout(double cout) {
				this.cout = cout;
			}

			public String getMonnaie() {
				return monnaie;
			}

			public void setMonnaie(String monnaie) {
				this.monnaie = monnaie;
			}

			public String getPeriodiciteDeFacturation() {
				return periodiciteDeFacturation;
			}

			public void setPeriodiciteDeFacturation(String periodiciteDeFacturation) {
				this.periodiciteDeFacturation = periodiciteDeFacturation;
			}

			public String getUniteDeCout() {
				return uniteDeCout;
			}

			public void setUniteDeCout(String uniteDeCout) {
				this.uniteDeCout = uniteDeCout;
			}

			public String getFournisseur() {
				return fournisseur;
			}

			public void setFournisseur(String fournisseur) {
				this.fournisseur = fournisseur;
			}

			public String getNiveauDeService() {
				return niveauDeService;
			}

			public void setNiveauDeService(String niveauDeService) {
				this.niveauDeService = niveauDeService;
			}

			public String getStatut() {
				return statut;
			}

			public void setStatut(String statut) {
				this.statut = statut;
			}

			public String getTypeDeContrat() {
				return typeDeContrat;
			}

			public void setTypeDeContrat(String typeDeContrat) {
				this.typeDeContrat = typeDeContrat;
			}

			public Collection<Contact> getContacts() {
				return contacts;
			}

			public void setContacts(Collection<Contact> contacts) {
				this.contacts = contacts;
			}

			public Collection<Document> getDocuments() {
				return documents;
			}

			public void setDocuments(Collection<Document> documents) {
				this.documents = documents;
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

			public Collection<ConnexionElectrique> getConnexionElectrique() {
				return connexionElectrique;
			}

			public void setConnexionElectrique(Collection<ConnexionElectrique> connexionElectrique) {
				this.connexionElectrique = connexionElectrique;
			}

			public Collection<Virtualisation> getVirtualisation() {
				return virtualisation;
			}

			public void setVirtualisation(Collection<Virtualisation> virtualisation) {
				this.virtualisation = virtualisation;
			}

			public Collection<Infrastructure> getInfrastructure() {
				return infrastructure;
			}

			public void setInfrastructure(Collection<Infrastructure> infrastructure) {
				this.infrastructure = infrastructure;
			}

			public Collection<EquipementReseau> getEquipementreseaux() {
				return equipementreseaux;
			}

			public void setEquipementreseaux(Collection<EquipementReseau> equipementreseaux) {
				this.equipementreseaux = equipementreseaux;
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

			public Collection<SolutionApplicative> getSolutionApplicative() {
				return solutionApplicative;
			}

			public void setSolutionApplicative(Collection<SolutionApplicative> solutionApplicative) {
				this.solutionApplicative = solutionApplicative;
			}
			
	
}