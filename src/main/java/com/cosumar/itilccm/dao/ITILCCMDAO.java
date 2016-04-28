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
	//public  Long addPCAll(Ordinateur pc,List<Long> os);
	public  Long addPCUser(Ordinateur pc, Long u);
	public void editPC(Ordinateur pc);
	public List<Ordinateur> ListPC();
	public Ordinateur getPC(Long id);
	public void deletePC(Long id);
	
	// Imprimente
	public  Long addImp(Imprimante imp);
	public  Long addImpUser(Imprimante imp, Long u);
	public void editImp(Imprimante imp);
	public List<Imprimante> ListImp();
	public Imprimante getImp(Long id);
	public void deleteImp(Long id);
	
	// Telephone Mobile
	public  Long addTeleMobile(TelephneMobile telem);
	public  Long addTeleMobileUser(TelephneMobile telem, Long u);
	public void editTeleMobile(TelephneMobile telem);
	public List<TelephneMobile> ListTeleMobile();
	public TelephneMobile getTeleMobile(Long id);
	public void deleteTeleMobile(Long id);
	
	// SIM
	public  Long addSIM(Sim sim);
	public  Long addSIMUser(Sim sim, Long u);
	public void editSIM(Sim sim);
	public List<Sim> ListSIM();
	public Sim getSIM(Long id);
	public void deleteSIM(Long id);
	
	// Tablette
	public  Long addTablette(Tablette tab);
	public  Long addTabletteUser(Tablette tab, Long u);
	public void editTablette(Tablette tab);
	public List<Tablette> ListTablette();
	public Tablette getTablette(Long id);
	public void deleteTablette(Long id);
	
	// Telephone Fixe
	public  Long addTeleFixe(TelephoneFixe fixe);
	public  Long addTeleFixeUser(TelephoneFixe fixe, Long u);
	public void editTeleFixe(TelephoneFixe fixe);
	public List<TelephoneFixe> ListTeleFixe();
	public TelephoneFixe getTeleFixe(Long id);
	public void deleteTeleFixe(Long id);
	
	// Peripherique
	public  Long addPeriph(Peripherique per);
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
	//public  Long addFibre(Fibre f, Long pc);
	public void editArriveeElectrique(ArriveeElectrique ae);
	public List<ArriveeElectrique> ListArriveeElectrique();
	public ArriveeElectrique getArriveeElectrique(Long id);
	public void deleteArriveeElectrique(Long id);
	
	// PduElectrique
	public  Long addPduElectrique(PduElectrique pdue);
	//public  Long addFibre(Fibre f, Long pc);
	public void editPduElectrique(PduElectrique pdue);
	public List<PduElectrique> ListPduElectrique();
	public PduElectrique getPduElectrique(Long id);
	public void deletePduElectrique(Long id);
	
	// Rack
	public  Long addRack(Rack Rack);
	//public  Long addFibre(Fibre f, Long pc);
	public void editRack(Rack Rack);
	public List<Rack> ListRack();
	public Rack getRack(Long id);
	public void deleteRack(Long id);
	
	// Chassis
	public  Long addChassis(Chassis Chassis);
	//public  Long addFibre(Fibre f, Long pc);
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
	

}
