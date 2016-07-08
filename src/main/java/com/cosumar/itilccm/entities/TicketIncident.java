package com.cosumar.itilccm.entities;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class TicketIncident {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   
	   private String impact;
	   private String priorite;
	   private String statut;
	   private String urgence;
	   private boolean valider;
	   private boolean resolver;
	   @NotEmpty
	   private String titre;
	   
	   private String description;
	   private String solution;
	   private Date dateDeDebut;
	   private Date dateDeFermeture;
	   private Date dateDeResolution;
	   private Date dateD_affectation;
	   private Date dateDeValidation;
	   private boolean notificationAdmininstration = true ;
	   private boolean notificationUtilisateur ;
	   private boolean notificationEquipeIt ;
	  
	   @ManyToOne
	   private User demandeur;
	   @ManyToOne
	   private User admin;
	   @ManyToOne
	   private User equipeIt;
	   @JsonIgnore
	   @ManyToOne  
	   private ApplicationWeb applicationWeb;
	   @JsonIgnore
	   @ManyToOne
	   private ConnexionElectrique connexionElectrique;
	   @JsonIgnore
	   @ManyToOne
	   private LogicielEtApplication logicielEtApplication;
	   @JsonIgnore
	   @ManyToOne
	   private Infrastructure infrastructure;
	   @JsonIgnore
	   @ManyToOne
	   private Camera camera;
	   @JsonIgnore
	   @ManyToOne
	   private Chassis chassis;
	   @JsonIgnore
	   @ManyToOne
	   private EquipementReseau equipementReseau;
	   @JsonIgnore
	   @ManyToOne
	   private Virtualisation virtualisation;
	   @JsonIgnore
	   @ManyToOne
	   private Imprimante imprimante;
	   @JsonIgnore
	   @ManyToOne
	   private InstanceDeBasseDeDonnes instanceDeBasseDeDonnes;
	   @JsonIgnore
	   @ManyToOne
	   private InstanceMiddleware instanceMiddleware;
	   @JsonIgnore
	   @ManyToOne
	   private MachineVirtuelle machineVirtuelle;
	   @JsonIgnore
	   @ManyToOne
	   private Ordinateur ordinateur;
	   @JsonIgnore
	   @ManyToOne
	   private Peripherique peripherique;
	   @JsonIgnore
	   @ManyToOne
	   private ProcessusMetier processusMetier;
	   @JsonIgnore
	   @ManyToOne
	   private Rack rack;
	   @JsonIgnore
	   @ManyToOne
	   private SolutionApplicative solutionApplicative;
	   @JsonIgnore
	   @ManyToOne
	   private Tablette tablette;
	   @JsonIgnore
	   @ManyToOne
	   private TelephneMobile telephneMobile;
	   @JsonIgnore
	   @ManyToOne
	   private TelephoneFixe telephoneFixe; 
	   @JsonIgnore
	   @ManyToOne
	   private Sim sim;
	 
		public TicketIncident() {
			super();
			// TODO Auto-generated constructor stub
		}
		public TicketIncident(String impact, String priorite, String statut, String urgence,String titre, String description) {
			super();
			this.impact = impact;
			this.priorite = priorite;
			this.statut = statut;
			this.urgence = urgence;
			this.titre = titre;
			this.description = description;
		}
		
		public TicketIncident(Long id, String impact, String priorite, String statut, String urgence, boolean valider,
				boolean resolver, String titre, String description, String solution) {
			super();
			this.id = id;
			this.impact = impact;
			this.priorite = priorite;
			this.statut = statut;
			this.urgence = urgence;
			this.valider = valider;
			this.resolver = resolver;
			this.titre = titre;
			this.description = description;
			this.solution = solution;
			
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getImpact() {
			return impact;
		}
		public void setImpact(String impact) {
			this.impact = impact;
		}
		public String getPriorite() {
			return priorite;
		}
		public void setPriorite(String priorite) {
			this.priorite = priorite;
		}
		public String getStatut() {
			return statut;
		}
		public void setStatut(String statut) {
			this.statut = statut;
		}
		public String getUrgence() {
			return urgence;
		}
		public void setUrgence(String urgence) {
			this.urgence = urgence;
		}
		public boolean isValider() {
			return valider;
		}
		public void setValider(boolean valider) {
			this.valider = valider;
		}
		public boolean isResolver() {
			return resolver;
		}
		public void setResolver(boolean resolver) {
			this.resolver = resolver;
		}
		public String getTitre() {
			return titre;
		}
		public void setTitre(String titre) {
			this.titre = titre;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getSolution() {
			return solution;
		}
		public void setSolution(String solution) {
			this.solution = solution;
		}
		public Date getDateDeDebut() {
			return dateDeDebut;
		}
		public void setDateDeDebut(Date dateDeDebut) {
			this.dateDeDebut = dateDeDebut;
		}
		public Date getDateDeFermeture() {
			return dateDeFermeture;
		}
		public void setDateDeFermeture(Date dateDeFermeture) {
			this.dateDeFermeture = dateDeFermeture;
		}
		public Date getDateDeResolution() {
			return dateDeResolution;
		}
		public void setDateDeResolution(Date dateDeResolution) {
			this.dateDeResolution = dateDeResolution;
		}
		public Date getDateD_affectation() {
			return dateD_affectation;
		}
		public void setDateD_affectation(Date dateD_affectation) {
			this.dateD_affectation = dateD_affectation;
		}
		public Date getDateDeValidation() {
			return dateDeValidation;
		}
		public void setDateDeValidation(Date dateDeValidation) {
			this.dateDeValidation = dateDeValidation;
		}
		public boolean isNotificationAdmininstration() {
			return notificationAdmininstration;
		}
		public void setNotificationAdmininstration(boolean notificationAdmininstration) {
			this.notificationAdmininstration = notificationAdmininstration;
		}
		public boolean isNotificationUtilisateur() {
			return notificationUtilisateur;
		}
		public void setNotificationUtilisateur(boolean notificationUtilisateur) {
			this.notificationUtilisateur = notificationUtilisateur;
		}
		public boolean isNotificationEquipeIt() {
			return notificationEquipeIt;
		}
		public void setNotificationEquipeIt(boolean notificationEquipeIt) {
			this.notificationEquipeIt = notificationEquipeIt;
		}
		public User getDemandeur() {
			return demandeur;
		}
		public void setDemandeur(User demandeur) {
			this.demandeur = demandeur;
		}
		public User getAdmin() {
			return admin;
		}
		public void setAdmin(User admin) {
			this.admin = admin;
		}
		public User getEquipeIt() {
			return equipeIt;
		}
		public void setEquipeIt(User equipeIt) {
			this.equipeIt = equipeIt;
		}
		public ApplicationWeb getApplicationWeb() {
			return applicationWeb;
		}
		public void setApplicationWeb(ApplicationWeb applicationWeb) {
			this.applicationWeb = applicationWeb;
		}
		public ConnexionElectrique getConnexionElectrique() {
			return connexionElectrique;
		}
		public void setConnexionElectrique(ConnexionElectrique connexionElectrique) {
			this.connexionElectrique = connexionElectrique;
		}
		public LogicielEtApplication getLogicielEtApplication() {
			return logicielEtApplication;
		}
		public void setLogicielEtApplication(LogicielEtApplication logicielEtApplication) {
			this.logicielEtApplication = logicielEtApplication;
		}
		public Infrastructure getInfrastructure() {
			return infrastructure;
		}
		public void setInfrastructure(Infrastructure infrastructure) {
			this.infrastructure = infrastructure;
		}
		public Camera getCamera() {
			return camera;
		}
		public void setCamera(Camera camera) {
			this.camera = camera;
		}
		public Chassis getChassis() {
			return chassis;
		}
		public void setChassis(Chassis chassis) {
			this.chassis = chassis;
		}
		public EquipementReseau getEquipementReseau() {
			return equipementReseau;
		}
		public void setEquipementReseau(EquipementReseau equipementReseau) {
			this.equipementReseau = equipementReseau;
		}
		public Virtualisation getVirtualisation() {
			return virtualisation;
		}
		public void setVirtualisation(Virtualisation virtualisation) {
			this.virtualisation = virtualisation;
		}
		public Imprimante getImprimante() {
			return imprimante;
		}
		public void setImprimante(Imprimante imprimante) {
			this.imprimante = imprimante;
		}
		public InstanceDeBasseDeDonnes getInstanceDeBasseDeDonnes() {
			return instanceDeBasseDeDonnes;
		}
		public void setInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes instanceDeBasseDeDonnes) {
			this.instanceDeBasseDeDonnes = instanceDeBasseDeDonnes;
		}
		public InstanceMiddleware getInstanceMiddleware() {
			return instanceMiddleware;
		}
		public void setInstanceMiddleware(InstanceMiddleware instanceMiddleware) {
			this.instanceMiddleware = instanceMiddleware;
		}
		public MachineVirtuelle getMachineVirtuelle() {
			return machineVirtuelle;
		}
		public void setMachineVirtuelle(MachineVirtuelle machineVirtuelle) {
			this.machineVirtuelle = machineVirtuelle;
		}
		public Ordinateur getOrdinateur() {
			return ordinateur;
		}
		public void setOrdinateur(Ordinateur ordinateur) {
			this.ordinateur = ordinateur;
		}
		public Peripherique getPeripherique() {
			return peripherique;
		}
		public void setPeripherique(Peripherique peripherique) {
			this.peripherique = peripherique;
		}
		public ProcessusMetier getProcessusMetier() {
			return processusMetier;
		}
		public void setProcessusMetier(ProcessusMetier processusMetier) {
			this.processusMetier = processusMetier;
		}
		public Rack getRack() {
			return rack;
		}
		public void setRack(Rack rack) {
			this.rack = rack;
		}
		public SolutionApplicative getSolutionApplicative() {
			return solutionApplicative;
		}
		public void setSolutionApplicative(SolutionApplicative solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}
		public Sim getSim() {
			return sim;
		}
		public void setSim(Sim sim) {
			this.sim = sim;
		}
		public Tablette getTablette() {
			return tablette;
		}
		public void setTablette(Tablette tablette) {
			this.tablette = tablette;
		}
		public TelephneMobile getTelephneMobile() {
			return telephneMobile;
		}
		public void setTelephneMobile(TelephneMobile telephneMobile) {
			this.telephneMobile = telephneMobile;
		}
		public TelephoneFixe getTelephoneFixe() {
			return telephoneFixe;
		}
		public void setTelephoneFixe(TelephoneFixe telephoneFixe) {
			this.telephoneFixe = telephoneFixe;
		}
		
		
   
}