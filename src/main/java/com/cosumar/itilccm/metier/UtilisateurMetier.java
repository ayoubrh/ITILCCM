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
	
	// Ordinateur
	public List<Ordinateur> ListPC();
	public Ordinateur getPC(Long id);
	
	// Impriment
	public List<Imprimante> ListImp();
	public Imprimante getImp(Long id);

}
