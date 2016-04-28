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
			
	public Long ajouterDocument(Document d);
	public void modifierDocument(Document d);
	public void supprimerDocument(Long id);
	public List<Document> listDocument();
	public Document getDocument(Long id);
			
	// Groupe
		
	public List<Groupe> listGroupe();
	public Groupe getGroupe(Long id);
	
	// Application Web
	
	public Long ajouterApplicationWeb(ApplicationWeb aw);
	public void modifierApplicationWeb(ApplicationWeb aw);
	public void supprimerApplicationWeb(Long id);
	public List<ApplicationWeb> listApplicationWeb();
	public ApplicationWeb getApplicationWeb(Long id);
			
	// Instance Middleware

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
		

}
