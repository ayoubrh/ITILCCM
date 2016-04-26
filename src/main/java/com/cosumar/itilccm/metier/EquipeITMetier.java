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

}
