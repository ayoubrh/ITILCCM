package com.cosumar.itilccm.dao;

import java.util.List;

import com.cosumar.itilccm.entities.*;

public interface ITILCCMDAO {
	
	// User
	public Long ajouterUser(User u, Long idDep);
	public Long ajouterUserRole(User u, Long idDep, Long idR);
	public void modifierUser(User u);
	public void supprimerUser(Long id);
	public List<User> listUser();
	public User getUser(Long id);
	public User getUserByMatricule(String matricule);
	public List<User> listUserSim();
	public List<User> listUserTeleMobile();
	public List<User> listUserTeleFixe();
	public List<User> listUserTablette();
	
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
	
	// Ordinateur
	
	public  Long addPC(Ordinateur pc);
	public  Long addPCAll(Ordinateur pc, Long user, Long lieu, Long licenseos, List<Long> logicielEtApplication, List<Long> equipementReseau, List<Long> intefaceReseau, List<Long> peripherique, List<Long> document, List<Long> contact, List<Long> contrat);
	public  Long addPCUser(Ordinateur pc, Long u);
	public void editPC(Ordinateur pc);
	public List<Ordinateur> ListPC();
	public Ordinateur getPC(Long id);
	public void deletePC(Long id);
		
	
	//Lieu
	
	public Long ajouterLieu(Lieu l);
	public Long ajouterLieuCont(Lieu l,List<Long> contacts);
	public void modifierLieu(Lieu l);
	public void supprimerLieu(Long id);
	public List<Lieu> listLieu();
	public Lieu getLieu(Long id);
	
	// Contact
		
	public Long ajouterContact(Contact c);
	public Long ajouterContactAll(Contact c, Long idlieu,List<Long> contrats);
	public void modifierContact(Contact c);
	public void supprimerContact(Long id);
	public List<Contact> listContact();
	public Contact getContact(Long id);
		
	// Contrat
		
	public Long ajouterContrat(Contrat c);
	public Long ajouterContratAll(Contrat c ,List<Long> contacts,List<Long> documents);
	public void modifierContrat(Contrat c);
	public void supprimerContrat(Long id);
	public List<Contrat> listContrat();
	public Contrat getContrat(Long id);
	
	// Document 
	
	public List<Document> listDocument();
	public Document getDocument(Long id);
	
	//  Document  Fichier
	
	public Long ajouterDocumentFichier(DocumentFichier df);
	public void modifierDocumentFichier(DocumentFichier df);
	public void supprimerDocumentFichier(Long id);
	public List<DocumentFichier> listDocumentFichier();
	public DocumentFichier getDocumentFichier(Long id);
	
    //  Document  Web
	
	public Long ajouterDocumentWeb(DocumentWeb dw);
	public void modifierDocumentWeb(DocumentWeb dw);
	public void supprimerDocumentWeb(Long id);
	public List<DocumentWeb> listDocumentWeb();
	public DocumentWeb getDocumentWeb(Long id);
	
	 //  Document Note
	
	public Long ajouterDocumentNote(DocumentNote dn);
	public void modifierDocumentNote(DocumentNote dn);
	public void supprimerDocumentNote(Long id);
	public List<DocumentNote> listDocumentNote();
	public DocumentNote getDocumentNote(Long id);
	
	// Groupe
	
	public Long ajouterGroupe(Groupe g);
	public Long ajouterGroupe(Groupe g,Long id_groupe);
	public void modifierGroupe(Groupe d);
	public void supprimerGroupe(Long id);
	public List<Groupe> listGroupe();
	public Groupe getGroupe(Long id);
	
	
   

	// Imprimente
	public  Long addImp(Imprimante imp);
	public  Long addImpAll(Imprimante imp, Long user, Long lieu, List<Long> document, List<Long> contact, List<Long> contrat);
	public  Long addImpUser(Imprimante imp, Long u);
	public void editImp(Imprimante imp);
	public List<Imprimante> ListImp();
	public Imprimante getImp(Long id);
	public void deleteImp(Long id);
	
	// Telephone Mobile
	public  Long addTeleMobile(TelephneMobile telem);
	public  Long addTeleMobileAll(TelephneMobile telem, Long user, Long lieu, List<Long> document, List<Long> contact, List<Long> contrat);
	public  Long addTeleMobileUser(TelephneMobile telem, Long u);
	public void editTeleMobile(TelephneMobile telem);
	public List<TelephneMobile> ListTeleMobile();
	public TelephneMobile getTeleMobile(Long id);
	public void deleteTeleMobile(Long id);
	
	// SIM
	public  Long addSIM(Sim sim);
	public  Long addSIMAll(Sim sim, Long user, List<Long> document, List<Long> contact, List<Long> contrat);
	public  Long addSIMUser(Sim sim, Long u);
	public void editSIM(Sim sim);
	public List<Sim> ListSIM();
	public Sim getSIM(Long id);
	public void deleteSIM(Long id);
	
	// Tablette
	public  Long addTablette(Tablette tab);
	public  Long addTabletteAll(Tablette tab, Long user, Long lieu, List<Long> document, List<Long> contact, List<Long> contrat);
	public  Long addTabletteUser(Tablette tab, Long u);
	public void editTablette(Tablette tab);
	public List<Tablette> ListTablette();
	public Tablette getTablette(Long id);
	public void deleteTablette(Long id);
	
	// Telephone Fixe
	public  Long addTeleFixe(TelephoneFixe fixe);
	public  Long addTeleFixeAll(TelephoneFixe fixe, Long user, Long lieu, List<Long> document, List<Long> contact, List<Long> contrat);
	public  Long addTeleFixeUser(TelephoneFixe fixe, Long u);
	public void editTeleFixe(TelephoneFixe fixe);
	public List<TelephoneFixe> ListTeleFixe();
	public TelephoneFixe getTeleFixe(Long id);
	public void deleteTeleFixe(Long id);
	
	// Peripherique
	public  Long addPeriph(Peripherique per);
	public  Long addPerAll(Peripherique per, Long pc, Long lieu, List<Long> document, List<Long> contact, List<Long> contrat);
	public  Long addPeriphPC(Peripherique per, Long pc);
	public void editPeriph(Peripherique per);
	public List<Peripherique> ListPeriph();
	public Peripherique getPeriph(Long id);
	public void deletePeriph(Long id);
	
	// IntefaceReseau
	public List<IntefaceReseau> ListInterfaceReseau();
	public IntefaceReseau getInterfaceReseau(Long id);
	
	// Fibre
	public  Long addFibre(Fibre f);
	//public  Long addFibre(Fibre f, Long pc);
	public void editFibre(Fibre f);
	public List<Fibre> ListFibre();
	public Fibre getFibre(Long id);
	public void deleteFibre(Long id);
	
	
	// Logique
	public  Long addLogique(Logique logique);
	//public  Long addFibre(Fibre f, Long pc);
	public void editLogique(Logique logique);
	public List<Logique> ListLogique();
	public Logique getLogique(Long id);
	public void deleteLogique(Long id);
	
	// Physique
	public  Long addPhysique(Physique Physique);
	//public  Long addFibre(Fibre f, Long pc);
	public void editPhysique(Physique Physique);
	public List<Physique> ListPhysique();
	public Physique getPhysique(Long id);
	public void deletePhysique(Long id);
	
	// Vlan
	public  Long addVlan(Vlan Vlan);
	//public  Long addFibre(Fibre f, Long pc);
	public void editVlan(Vlan Vlan);
	public List<Vlan> ListVlan();
	public Vlan getVlan(Long id);
	public void deleteVlan(Long id);
	
	// Subnet
	public  Long addSubnet(Subnet Subnet);
	//public  Long addFibre(Fibre f, Long pc);
	public void editSubnet(Subnet Subnet);
	public List<Subnet> ListSubnet();
	public Subnet getSubnet(Long id);
	public void deleteSubnet(Long id);
	
	// Camera
	public  Long addCamera(Camera Cam);
	//public  Long addFibre(Fibre f, Long pc);
	public void editCamera(Camera Cam);
	public List<Camera> ListCamera();
	public Camera getCamera(Long id);
	public void deleteCamera(Long id);
	
	// ProcessusMetier
	public  Long addProcessusMetier(ProcessusMetier pm);
	//public  Long addFibre(Fibre f, Long pc);
	public void editProcessusMetier(ProcessusMetier pm);
	public List<ProcessusMetier> ListProcessusMetier();
	public ProcessusMetier getProcessusMetier(Long id);
	public void deleteProcessusMetier(Long id);
	
	// SolutionApplicative
	public  Long addSolutionApplicative(SolutionApplicative sa);
	//public  Long addFibre(Fibre f, Long pc);
	public void editSolutionApplicative(SolutionApplicative sa);
	public List<SolutionApplicative> ListSolutionApplicative();
	public SolutionApplicative getSolutionApplicative(Long id);
	public void deleteSolutionApplicative(Long id);
	
	// VolumeLogique
	public  Long addVolumeLogique(VolumeLogique vl);
	//public  Long addFibre(Fibre f, Long pc);
	public void editVolumeLogique(VolumeLogique vl);
	public List<VolumeLogique> ListVolumeLogique();
	public VolumeLogique getVolumeLogique(Long id);
	public void deleteVolumeLogique(Long id);
	
	// Dvr
	public  Long addDvr(Dvr dvr);
	//public  Long addFibre(Fibre f, Long pc);
	public void editDvr(Dvr dvr);
	public List<Dvr> ListDvr();
	public Dvr getDvr(Long id);
	public void deleteDvr(Long id);
	
	// ConnexionElectrique
	public List<ConnexionElectrique> ListConnexionElectrique();
	public ConnexionElectrique getConnexionElectrique(Long id);
	
	// ArriveeElectrique
	public  Long addArriveeElectrique(ArriveeElectrique ae);
	public  Long addArriveeElectriqueAll(ArriveeElectrique ae,Long lieu,List<Long> pdus,List<Long> contacts,List<Long> documents,List<Long> contrats);
	public void editArriveeElectrique(ArriveeElectrique ae);
	public List<ArriveeElectrique> ListArriveeElectrique();
	public ArriveeElectrique getArriveeElectrique(Long id);
	public void deleteArriveeElectrique(Long id);
	
	// PduElectrique
	public  Long addPduElectrique(PduElectrique pdue);
	public  Long addPduElectriqueAll(PduElectrique pdue,Long lieu,Long rack,Long arrivee, List<Long> contacts,List<Long> documents,List<Long> contrats);
	public void editPduElectrique(PduElectrique pdue);
	public List<PduElectrique> ListPduElectrique();
	public PduElectrique getPduElectrique(Long id);
	public void deletePduElectrique(Long id);
	
	// Rack
	public  Long addRack(Rack Rack);
	public  Long addRackAll(Rack rack, Long lieu, List<Long> chassis, List<Long> materiels, List<Long> pdu, List<Long> document, List<Long> contact, List<Long> contrat);
	public void editRack(Rack Rack);
	public List<Rack> ListRack();
	public Rack getRack(Long id);
	public void deleteRack(Long id);
	
	// Chassis
	public  Long addChassis(Chassis Chassis);
	public  Long addChassisAll(Chassis Chassis, Long lieu, Long rack, List<Long> materiels, List<Long> document, List<Long> contact, List<Long> contrat);
	public void editChassis(Chassis Chassis);
	public List<Chassis> ListChassis();
	public Chassis getChassis(Long id);
	public void deleteChassis(Long id);
	
	// Infrastructure
	public List<Infrastructure> ListInfrastructure();
	public Infrastructure getInfrastructure(Long id);
	
	// Bandotheque
	public  Long addBandotheque(Bandotheque Bandotheque);
	//public  Long addFibre(Fibre f, Long pc);
	public void editBandotheque(Bandotheque Bandotheque);
	public List<Bandotheque> ListBandotheque();
	public Bandotheque getBandotheque(Long id);
	public void deleteBandotheque(Long id);
	
	// Bande
	public  Long addBande(Bande Bande);
	//public  Long addFibre(Fibre f, Long pc);
	public void editBande(Bande Bande);
	public List<Bande> ListBande();
	public Bande getBande(Long id);
	public void deleteBande(Long id);
	
	// Serveur
	public  Long addServeur(Serveur Serveur);
	//public  Long addFibre(Fibre f, Long pc);
	public void editServeur(Serveur Serveur);
	public List<Serveur> ListServeur();
	public Serveur getServeur(Long id);
	public void deleteServeur(Long id);
	
	// SystemeDeStockage
	public  Long addSystemeDeStockage(SystemeDeStockage sds);
	//public  Long addFibre(Fibre f, Long pc);
	public void editSystemeDeStockage(SystemeDeStockage sds);
	public List<SystemeDeStockage> ListSystemeDeStockage();
	public SystemeDeStockage getSystemeDeStockage(Long id);
	public void deleteSystemeDeStockage(Long id);
	
	// SwitchSan
	public  Long addSwitchSan(SwitchSan san);
	//public  Long addFibre(Fibre f, Long pc);
	public void editSwitchSan(SwitchSan san);
	public List<SwitchSan> ListSwitchSan();
	public SwitchSan getSwitchSan(Long id);
	public void deleteSwitchSan(Long id);
	
	// Nas
	public  Long addNas(Nas Nas);
	//public  Long addFibre(Fibre f, Long pc);
	public void editNas(Nas Nas);
	public List<Nas> ListNas();
	public Nas getNas(Long id);
	public void deleteNas(Long id);
	
	// SystemeDeFicherNas
	public  Long addSystemeDeFicherNas(SystemeDeFicherNas sdnas);
	//public  Long addFibre(Fibre f, Long pc);
	public void editSystemeDeFicherNas(SystemeDeFicherNas sdnas);
	public List<SystemeDeFicherNas> ListSystemeDeFicherNas();
	public SystemeDeFicherNas getSystemeDeFicherNas(Long id);
	public void deleteSystemeDeFicherNas(Long id);
	
	//EquipementReseau
	public  Long addEquipementReseau(EquipementReseau er);
	//public  Long addFibre(Fibre f, Long pc);
	public void editEquipementReseau(EquipementReseau er);
	public List<EquipementReseau> ListEquipementReseau();
	public EquipementReseau getEquipementReseau(Long id);
	public void deleteEquipementReseau(Long id);
	
	
	 //License Logiciel
	
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
	public Long ajouterAutreLogicielAll(AutreLogiciel al,Long l,List<Long> contacts,List<Long> documents,List<Long> solutionsApplicatives,List<Long> contrats);
	public void modifierAutreLogiciel(AutreLogiciel al);
	public void supprimerAutreLogiciel(Long id);
	public List<AutreLogiciel> listAutreLogiciel();
	public AutreLogiciel getAutreLogiciel(Long id);
	
	// Logiciel PC
	
	public Long ajouterLogicielPc(LogicielPc lp);
	public Long ajouterLogicielPcAll(LogicielPc lp,Long l,List<Long> contacts,List<Long> documents,List<Long> solutionsApplicatives,List<Long> contrats);
	public void modifierLogicielPc(LogicielPc lp);
	public void supprimerLogicielPc(Long id);
	public List<LogicielPc> listLogicielPc();
	public LogicielPc getLogicielPc(Long id);
	
	// Serveur Web
	
	public Long ajouterServeurWeb(ServeurWeb sw);
	public Long ajouterServeurWebAll(ServeurWeb sw,Long l,List<Long> contacts,List<Long> documents,List<Long> solutionsApplicatives,List<Long> applicationWeb,List<Long> contrats);
	public void modifierServeurWeb(ServeurWeb sw);
	public void supprimerServeurWeb(Long id);
	public List<ServeurWeb> listServeurWeb();
	public ServeurWeb getServeurWeb(Long id);
	
	// Middleware
	
	public Long ajouterMiddleware(Middleware m);
	public Long ajouterMiddlewareAll(Middleware m,Long l,List<Long> contacts,List<Long> documents,List<Long> solutionsApplicatives,List<Long> instancesMiddleware,List<Long> contrats);
	public void modifierMiddleware(Middleware m);
	public void supprimerMiddleware(Long id);
	public List<Middleware> listMiddleware();
	public Middleware getMiddleware(Long id);
	
	//Serveur de basse de données
	
	public Long ajouterServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees sbd);
	public Long ajouterServeurDeBasseDeDonneesAll(ServeurDeBasseDeDonnees sbd,Long l,List<Long> contacts,List<Long> documents,List<Long> solutionsApplicatives,List<Long> instancesBD,List<Long> contrats);
	public void modifierServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees sbd);
	public void supprimerServeurDeBasseDeDonnees(Long id);
	public List<ServeurDeBasseDeDonnees> listServeurDeBasseDeDonnees();
	public ServeurDeBasseDeDonnees getServeurDeBasseDeDonnees(Long id);
	

	//Application Web
	
	public Long ajouterApplicationWeb(ApplicationWeb aw);
	public Long ajouterApplicationWebAll(ApplicationWeb aw,Long sw,List<Long> contacts,List<Long> documents,List<Long> solutionsApplicatives,List<Long> contrats);
	public void modifierApplicationWeb(ApplicationWeb aw);
	public void supprimerApplicationWeb(Long id);
	public List<ApplicationWeb> listApplicationWeb();
	public ApplicationWeb getApplicationWeb(Long id);
	

	//Instance Middleware
	
	public Long ajouterInstanceMiddleware(InstanceMiddleware im);
	public Long ajouterInstanceMiddlewareAll(InstanceMiddleware im,Long m,List<Long> contacts,List<Long> documents,List<Long> solutionsApplicatives,List<Long> contrats);
	public void modifierInstanceMiddleware(InstanceMiddleware im);
	public void supprimerInstanceMiddleware(Long id);
	public List<InstanceMiddleware> listInstanceMiddleware();
	public InstanceMiddleware getInstanceMiddleware(Long id);
	
   //Instance de basse de donnés
	
	public Long ajouterInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd);
	public Long ajouterInstanceDeBasseDeDonnesAll(InstanceDeBasseDeDonnes ibd,Long sbd,List<Long> contacts,List<Long> documents,List<Long> solutionsApplicatives,List<Long> contrats);
	public void modifierInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd);
	public void supprimerInstanceDeBasseDeDonnes(Long id);
	public List<InstanceDeBasseDeDonnes> listInstanceDeBasseDeDonnes();
	public InstanceDeBasseDeDonnes getInstanceDeBasseDeDonnes(Long id);
	
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
	public Long ajouterVclusterAll(Vcluster v,List<Long> contacts,List<Long> documents,List<Long> solutionsApplicatives,List<Long> volumesLogiques,List<Long> machinesVirtuelles,List<Long> hyperviseurs,List<Long> contrats);
	public void modifierVcluster(Vcluster v);
	public void supprimerVcluster(Long id);
	public List<Vcluster> listVcluster();
	public Vcluster getVcluster(Long id);
	
	// Hyperviseur
	
	public Long ajouterHyperviseur(Hyperviseur h);
	public Long ajouterHyperviseurAll(Hyperviseur h,Long vCluster,Long Serveur,List<Long> contacts,List<Long> documents,List<Long> solutionsApplicatives,List<Long> volumesLogiques,List<Long> machinesVirtuelles,List<Long> contrats);
	public void modifierHyperviseur(Hyperviseur h);
	public void supprimerHyperviseur(Long id);
	public List<Hyperviseur> listHyperviseur();
	public Hyperviseur getHyperviseur(Long id);
}
