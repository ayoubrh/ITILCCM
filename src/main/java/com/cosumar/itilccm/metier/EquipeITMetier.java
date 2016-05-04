package com.cosumar.itilccm.metier;

import java.util.List;

import com.cosumar.itilccm.entities.*;

public interface EquipeITMetier extends UtilisateurMetier {
	
	public void modifierUser(User u);
	public User getUser(Long id);
	public List<Role> listRole();
	public List<Departement> listDepartement();
	public User getUserByMatricule(String matricule);
	
	//Lieu
	
	public List<Lieu> listLieu();
	public Lieu getLieu(Long id);
	
	
	// Ordinateur
	public List<Ordinateur> ListPC();
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
	
	public Long ajouterDocumentFichier(DocumentFichier df);
	public void modifierDocumentFichier(DocumentFichier df);
	public List<DocumentFichier> listDocumentFichier();
	public DocumentFichier getDocumentFichier(Long id);
	
    //  Document  Web
	
	public Long ajouterDocumentWeb(DocumentWeb dw);
	public void modifierDocumentWeb(DocumentWeb dw);
	public List<DocumentWeb> listDocumentWeb();
	public DocumentWeb getDocumentWeb(Long id);
	
	 //  Document Note
	
	public Long ajouterDocumentNote(DocumentNote dn);
	public void modifierDocumentNote(DocumentNote dn);
	public List<DocumentNote> listDocumentNote();
	public DocumentNote getDocumentNote(Long id);
			
	// Groupe
		
	public List<Groupe> listGroupe();
	public Groupe getGroupe(Long id);
	
	// Application Web
	
	public Long ajouterApplicationWeb(ApplicationWeb aw);
	public void modifierApplicationWeb(ApplicationWeb aw);
	public List<ApplicationWeb> listApplicationWeb();
	public ApplicationWeb getApplicationWeb(Long id);
			
	// Instance Middleware

	public Long ajouterInstanceMiddleware(InstanceMiddleware im);
	public void modifierInstanceMiddleware(InstanceMiddleware im);
	public List<InstanceMiddleware> listInstanceMiddleware();
	public InstanceMiddleware getInstanceMiddleware(Long id);
			
	// Instance de basse de donnés
			
	public Long ajouterInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd);
	public void modifierInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd);
	public List<InstanceDeBasseDeDonnes> listInstanceDeBasseDeDonnes();
	public InstanceDeBasseDeDonnes getInstanceDeBasseDeDonnes(Long id);
	
	// License Logiciel
	
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
		
	// Serveur de basse de données
	
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
	
	// Periphérique
	public List<Peripherique> ListPeriph();
	public Peripherique getPeriph(Long id);
	
	
	// IntefaceReseau
	public List<IntefaceReseau> ListInterfaceReseau();
	public IntefaceReseau getInterfaceReseau(Long id);
		
	// Fibre
	//public  Long addFibre(Fibre f, Long pc);
	public void editFibre(Fibre f);
	public List<Fibre> ListFibre();
	public Fibre getFibre(Long id);
		
	// Logique
	//public  Long addFibre(Fibre f, Long pc);
	public void editLogique(Logique logique);
	public List<Logique> ListLogique();
	public Logique getLogique(Long id);
		
	// Physique
	//public  Long addFibre(Fibre f, Long pc);
	public void editPhysique(Physique Physique);
	public List<Physique> ListPhysique();
	public Physique getPhysique(Long id);
		
	// Vlan
	//public  Long addFibre(Fibre f, Long pc);
	public void editVlan(Vlan Vlan);
	public List<Vlan> ListVlan();
	public Vlan getVlan(Long id);
		
	// Subnet
	//public  Long addFibre(Fibre f, Long pc);
	public void editSubnet(Subnet Subnet);
	public List<Subnet> ListSubnet();
	public Subnet getSubnet(Long id);
		
	// Camera
	//public  Long addFibre(Fibre f, Long pc);
	public void editCamera(Camera Cam);
	public List<Camera> ListCamera();
	public Camera getCamera(Long id);
		
	// ProcessusMetier
	public  Long addProcessusMetier(ProcessusMetier pm);
	//public  Long addFibre(Fibre f, Long pc);
	public void editProcessusMetier(ProcessusMetier pm);
	public List<ProcessusMetier> ListProcessusMetier();
	public ProcessusMetier getProcessusMetier(Long id);
	public void deleteProcessusMetier(Long id);
		
	// SolutionApplicative
	//public  Long addFibre(Fibre f, Long pc);
	public List<SolutionApplicative> ListSolutionApplicative();
	public SolutionApplicative getSolutionApplicative(Long id);
		
	// VolumeLogique
	//public  Long addFibre(Fibre f, Long pc);
	public void editVolumeLogique(VolumeLogique vl);
	public List<VolumeLogique> ListVolumeLogique();
	public VolumeLogique getVolumeLogique(Long id);
	
	// Dvr
	//public  Long addFibre(Fibre f, Long pc);
	public void editDvr(Dvr dvr);
	public List<Dvr> ListDvr();
	public Dvr getDvr(Long id);
		


}
