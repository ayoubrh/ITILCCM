package com.cosumar.itilccm.metier;

import java.util.List;

import com.cosumar.itilccm.entities.*;

public interface EquipeITMetier extends UtilisateurMetier {
	
	public void modifierUser(User u);
	public User getUser(Long id);
	public List<Role> listRole();
	public List<Departement> listDepartement();
	public User getUserByMatricule(String matricule);
	
	
	// Ordinateur
	public List<Ordinateur> ListPC();
	public Ordinateur getPC(Long id);
	
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
