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
	
	// Ordinateur
	public  Long addPC(Ordinateur pc);
	public  Long addPCUser(Ordinateur pc, Long u);
	public void editPC(Ordinateur pc);
	public List<Ordinateur> ListPC();
	public Ordinateur getPC(Long id);
	public void deletePC(Long id);


}
