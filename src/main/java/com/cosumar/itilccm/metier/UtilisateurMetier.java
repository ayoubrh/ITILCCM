package com.cosumar.itilccm.metier;

import java.util.List;

import com.cosumar.itilccm.entities.*;

public interface UtilisateurMetier {
	
	public void modifierUser(User u);
	public User getUser(Long id);
	public List<Role> listRole();
	public List<Departement> listDepartement();
	public User getUserByMatricule(String matricule);
	public void SendEmail(final String recipientAddress, final String subject, final String message);
	public String hashmd5password(String password) throws Exception;
	
	// Lieu
	
	public List<Lieu> listLieu();
	public Lieu getLieu(Long id);
	
	
	// Ordinateur
	public List<Ordinateur> ListPC();
	public List<Ordinateur> SearchPC(String s);
	public Ordinateur getPC(Long id);
	

	//Contact
	
	public List<Contact> listContact();
	public Contact getContact(Long id);
	
	// Contrat
	
	public List<Contrat> listContrat();
	public Contrat getContrat(Long id);
		
	// Document
	
	public List<Document> listDocument();
	public Document getDocument(Long id);
	
    //  Document  Fichier
	
	public List<DocumentFichier> listDocumentFichier();
	public DocumentFichier getDocumentFichier(Long id);
	
    //  Document  Web
	
	public List<DocumentWeb> listDocumentWeb();
	public DocumentWeb getDocumentWeb(Long id);
	
	 //  Document Note
	
	public List<DocumentNote> listDocumentNote();
	public DocumentNote getDocumentNote(Long id);
		
	// Groupe
	
	public List<Groupe> listGroupe();
	public Groupe getGroupe(Long id);
	
	// Application Web
	
	public List<ApplicationWeb> listApplicationWeb();
	public ApplicationWeb getApplicationWeb(Long id);
		
	// Instance Middleware

	public List<InstanceMiddleware> listInstanceMiddleware();
	public InstanceMiddleware getInstanceMiddleware(Long id);
		
	//Instance de basse de donns
	
	public List<InstanceDeBasseDeDonnes> listInstanceDeBasseDeDonnes();
	public InstanceDeBasseDeDonnes getInstanceDeBasseDeDonnes(Long id);
	
	 //License Logiciel
	
	public List<LicenseLogiciel> listLicenseLogiciel();
	public LicenseLogiciel getLicenseLogiciel(Long id);
		
	 // License OS
	
	public List<LicenseOs> listLicenseOs();
	public LicenseOs getLicenseOs(Long id);
		
	// Version OS
		
	public List<VersionOs> listVersionOs();
	public VersionOs getVersionOs(Long id);
	
	// Logiciel et Application
	
	public List<LogicielEtApplication> listLogicielEtApplication();
	public LogicielEtApplication getLogicielEtApplication(Long id);
		
	// Autre logiciel
	
	public List<AutreLogiciel> listAutreLogiciel();
	public AutreLogiciel getAutreLogiciel(Long id);
		
	// Logiciel PC
	
	public List<LogicielPc> listLogicielPc();
	public LogicielPc getLogicielPc(Long id);
		
	// Serveur Web
	
	public List<ServeurWeb> listServeurWeb();
	public ServeurWeb getServeurWeb(Long id);
		
	// Middleware
	
	public List<Middleware> listMiddleware();
	public Middleware getMiddleware(Long id);
		
	// Serveur de basse de donnes
	
	public List<ServeurDeBasseDeDonnees> listServeurDeBasseDeDonnees();
	public ServeurDeBasseDeDonnees getServeurDeBasseDeDonnees(Long id);
		
	// Machine Virtuelle
	
	public List<MachineVirtuelle> listMachineVirtuelle();
	public MachineVirtuelle getMachineVirtuelle(Long id);
		
	// Virtualisation
		
	public List<Virtualisation> listVirtualisation();
	public Virtualisation getVirtualisation(Long id);
		
	// Vcluster
	
	public List<Vcluster> listVcluster();
	public Vcluster getVcluster(Long id);
		
	// Hyperviseur
	
	public List<Hyperviseur> listHyperviseur();
	public Hyperviseur getHyperviseur(Long id);
	
	

	// Impriment
	
	public List<Imprimante> ListImp();
	public Imprimante getImp(Long id);
	
	// Telephone Mobile
	public List<TelephneMobile> ListTeleMobile();
	public TelephneMobile getTeleMobile(Long id);
	
	// SIM
	public List<Sim> ListSIM();
	public Sim getSIM(Long id);
	
	// Tablette
	public List<Tablette> ListTablette();
	public Tablette getTablette(Long id);
	
	// Telephone Fixe
	public List<TelephoneFixe> ListTeleFixe();
	public TelephoneFixe getTeleFixe(Long id);
	
	// Periphrique
	public List<Peripherique> ListPeriph();
	public Peripherique getPeriph(Long id);
	
	// IntefaceReseau
	public List<IntefaceReseau> ListInterfaceReseau();
	public IntefaceReseau getInterfaceReseau(Long id);
		
	// Fibre
	public List<Fibre> ListFibre();
	public Fibre getFibre(Long id);
		
		
	// Logique
	public List<Logique> ListLogique();
	public Logique getLogique(Long id);
		
	// Physique
	public List<Physique> ListPhysique();
	public Physique getPhysique(Long id);
		
	// Vlan
	public List<Vlan> ListVlan();
	public Vlan getVlan(Long id);
		
	// Subnet
	public List<Subnet> ListSubnet();
	public Subnet getSubnet(Long id);
		
	// Camera
	public List<Camera> ListCamera();
	public Camera getCamera(Long id);
		
	// ProcessusMetier
	public List<ProcessusMetier> ListProcessusMetier();
	public ProcessusMetier getProcessusMetier(Long id);
		
	// SolutionApplicative
	public List<SolutionApplicative> ListSolutionApplicative();
	public SolutionApplicative getSolutionApplicative(Long id);
		
	// VolumeLogique
	public List<VolumeLogique> ListVolumeLogique();
	public VolumeLogique getVolumeLogique(Long id);
		
	// Dvr
	public List<Dvr> ListDvr();
	public Dvr getDvr(Long id);
		
	// Serveur
	public void editServeur(Serveur Serveur);
	public List<Serveur> ListServeur();
	public Serveur getServeur(Long id);
	
	
	//EquipementReseau
	public void editEquipementReseau(EquipementReseau er);
	public List<EquipementReseau> ListEquipementReseau();
	public EquipementReseau getEquipementReseau(Long id);

}
