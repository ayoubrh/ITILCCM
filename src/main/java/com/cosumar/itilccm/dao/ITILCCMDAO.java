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

}
