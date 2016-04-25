package com.cosumar.itilccm.metier;

import java.util.List;

import com.cosumar.itilccm.entities.*;

public interface EquipeITMetier extends UtilisateurMetier {
	
	public void modifierUser(User u);
	public User getUser(Long id);
	public List<Role> listRole();
	public List<Departement> listDepartement();
	public User getUserByMatricule(String matricule);
<<<<<<< HEAD
	public List<Lieu> listLieu();
	public Lieu getLieu(Long id);
=======
	
	
	// Ordinateur
	
	public List<Ordinateur> ListPC();
	public Ordinateur getPC(Long id);
>>>>>>> origin/tawfiq-jpa

}
