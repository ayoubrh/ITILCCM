package com.cosumar.itilccm.metier;

import java.util.List;

import com.cosumar.itilccm.entities.*;

public interface AdminMetier extends UtilisateurMetier {
	
			// User
	public Long ajouterUser(User u, Long idDep);
	public Long ajouterUserRole(User u, Long idDep, Long idR);
	public void modifierUser(User u);
	public void supprimerUser(Long id);
	public List<User> listUser();
	public User getUser(Long id);
	public User getUserByMatricule(String matricule);
			
			// Departement
	public Long ajouterDepartement(Departement d);
	public void modifierDepartement(Departement d);
	public void supprimerDepatement(Long id);
	public List<Departement> listDepartement();
	public Departement getDepartement(Long id);
			
			// Role
	public Long ajouterRole(Role r);
	public void modifierRole(Role r);
	public void supprimerRole(Long id);
	public List<Role> listRole();
	public Role getRole(Long id);
	public void attribuerRole(Role r,User u);
	
	//Lieu
	
	public Long ajouterLieu(Lieu l);
	public void modifierLieu(Lieu l);
	public void supprimerLieu(Long id);
	public List<Lieu> listLieu();
	public Lieu getLieu(Long id);
	
	// Ordinateur
	
	public  Long addPC(Ordinateur pc);
	public  Long addPCUser(Ordinateur pc, Long u);
	public void editPC(Ordinateur pc);
	public List<Ordinateur> ListPC();
	public Ordinateur getPC(Long id);
	public void deletePC(Long id);
	

	// Contact
	
	public Long ajouterContact(Contact c);
	public Long ajouterContactLieu(Contact c, Long idlieu);
	public void modifierContact(Contact c);
	public void supprimerContact(Long id);
	public List<Contact> listContact();
	public Contact getContact(Long id);
	
	// Contrat
	
	public Long ajouterContrat(Contrat c);
	public void modifierContrat(Contrat c);
	public void supprimerContrat(Long id);
	public List<Contrat> listContrat();
	public Contrat getContrat(Long id);
		
	// Document
		
	public Long ajouterDocument(Document d);
	public void modifierDocument(Document d);
	public void supprimerDocument(Long id);
	public List<Document> listDocument();
	public Document getDocument(Long id);
		
	// Groupe
		
	public Long ajouterGroupe(Groupe g);
	public Long ajouterGroupe(Groupe g,Long id_groupe);
	public void modifierGroupe(Groupe d);
	public void supprimerGroupe(Long id);
	public List<Groupe> listGroupe();
	public Groupe getGroupe(Long id);
	
	//Application Web
	
	public Long ajouterApplicationWeb(ApplicationWeb aw);
	public void modifierApplicationWeb(ApplicationWeb aw);
	public void supprimerApplicationWeb(Long id);
	public List<ApplicationWeb> listApplicationWeb();
	public ApplicationWeb getApplicationWeb(Long id);
		
	//Instance Middleware

	public Long ajouterInstanceMiddleware(InstanceMiddleware im);
	public void modifierInstanceMiddleware(InstanceMiddleware im);
	public void supprimerInstanceMiddleware(Long id);
	public List<InstanceMiddleware> listInstanceMiddleware();
	public InstanceMiddleware getInstanceMiddleware(Long id);
		
	// Instance de basse de donnés
		
	public Long ajouterInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd);
	public void modifierInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd);
	public void supprimerInstanceDeBasseDeDonnes(Long id);
	public List<InstanceDeBasseDeDonnes> listInstanceDeBasseDeDonnes();
	public InstanceDeBasseDeDonnes getInstanceDeBasseDeDonnes(Long id);
	
	 // License Logiciel
	
	public Long ajouterLicenseLogiciel(LicenseLogiciel ll);
	public void modifierLicenseLogiciel(LicenseLogiciel ll);
	public void supprimerLicenseLogiciel(Long id);
	public List<LicenseLogiciel> listLicenseLogiciel();
	public LicenseLogiciel getLicenseLogiciel(Long id);
		
	// License OS
		
	public Long ajouterLicenseOs(LicenseOs lo);
	public void modifierLicenseOs(LicenseOs lo);
	public void supprimerLicenseOs(Long id);
	public List<LicenseOs> listLicenseOs();
	public LicenseOs getLicenseOs(Long id);
		
	// Version OS
		
	public Long ajouterVersionOs(VersionOs vo);
	public void modifierVersionOs(VersionOs vo);
	public void supprimerVersionOs(Long id);
	public List<VersionOs> listVersionOs();
	public VersionOs getVersionOs(Long id);
	
	// Logiciel et Application
	
	public List<LogicielEtApplication> listLogicielEtApplication();
	public LogicielEtApplication getLogicielEtApplication(Long id);
		
	// Autre logiciel
		
	public Long ajouterAutreLogiciel(AutreLogiciel al);
	public void modifierAutreLogiciel(AutreLogiciel al);
	public void supprimerAutreLogiciel(Long id);
	public List<AutreLogiciel> listAutreLogiciel();
	public AutreLogiciel getAutreLogiciel(Long id);
		
	// Logiciel PC
		
	public Long ajouterLogicielPc(LogicielPc lp);
	public void modifierLogicielPc(LogicielPc lp);
	public void supprimerLogicielPc(Long id);
	public List<LogicielPc> listLogicielPc();
	public LogicielPc getLogicielPc(Long id);
		
	// Serveur Web
		
	public Long ajouterServeurWeb(ServeurWeb sw);
	public void modifierServeurWeb(ServeurWeb sw);
	public void supprimerServeurWeb(Long id);
	public List<ServeurWeb> listServeurWeb();
	public ServeurWeb getServeurWeb(Long id);
		
	// Middleware
		
	public Long ajouterMiddleware(Middleware m);
	public void modifierMiddleware(Middleware m);
	public void supprimerMiddleware(Long id);
	public List<Middleware> listMiddleware();
	public Middleware getMiddleware(Long id);
		
	//Serveur de basse de données
		
	public Long ajouterServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees sbd);
	public void modifierServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees sbd);
	public void supprimerServeurDeBasseDeDonnees(Long id);
	public List<ServeurDeBasseDeDonnees> listServeurDeBasseDeDonnees();
	public ServeurDeBasseDeDonnees getServeurDeBasseDeDonnees(Long id);
		
	// Machine Virtuelle
		
	public Long ajouterMachineVirtuelle(MachineVirtuelle mv);
	public void modifierMachineVirtuelle(MachineVirtuelle mv);
	public void supprimerMachineVirtuelle(Long id);
	public List<MachineVirtuelle> listMachineVirtuelle();
	public MachineVirtuelle getMachineVirtuelle(Long id);
		
	// Virtualisation
		
	public List<Virtualisation> listVirtualisation();
	public Virtualisation getVirtualisation(Long id);
		
	// Vcluster
		
	public Long ajouterVcluster(Vcluster v);
	public void modifierVcluster(Vcluster v);
	public void supprimerVcluster(Long id);
	public List<Vcluster> listVcluster();
	public Vcluster getVcluster(Long id);
		
	// Hyperviseur
		
	public Long ajouterHyperviseur(Hyperviseur h);
	public void modifierHyperviseur(Hyperviseur h);
	public void supprimerHyperviseur(Long id);
	public List<Hyperviseur> listHyperviseur();
	public Hyperviseur getHyperviseur(Long id);

	
	// Imprimente
	public  Long addImp(Imprimante imp);
	public  Long addImpUser(Imprimante imp, Long u);
	public void editImp(Imprimante imp);
	public List<Imprimante> ListImp();
	public Imprimante getImp(Long id);
	public void deleteImp(Long id);



}
