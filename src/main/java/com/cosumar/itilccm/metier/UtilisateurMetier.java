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
<<<<<<< HEAD
	public List<Lieu> listLieu();
	public Lieu getLieu(Long id);
	
=======
	
	// Ordinateur
	
	public List<Ordinateur> ListPC();
	public Ordinateur getPC(Long id);
>>>>>>> origin/tawfiq-jpa

}
