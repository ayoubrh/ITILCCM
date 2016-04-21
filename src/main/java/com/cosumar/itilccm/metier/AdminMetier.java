package com.cosumar.itilccm.metier;

import java.util.List;

import com.cosumar.itilccm.entities.*;

public interface AdminMetier extends UtilisateurMetier {
	
			// User
	public int ajouterUser(User u, int idDep);
	public int ajouterUserRole(User u, int idDep, int idR);
	public void modifierUser(User u);
	public void supprimerUser(int id);
	public List<User> listUser();
	public User getUser(int id);
	public User getUserByMatricule(String matricule);
			
			// Departement
	public int ajouterDepartement(Departement d);
	public void modifierDepartement(Departement d);
	public void supprimerDepatement(int id);
	public List<Departement> listDepartement();
	public Departement getDepartement(int id);
			
			// Role
	public int ajouterRole(Role r);
	public void modifierRole(Role r);
	public void supprimerRole(int id);
	public List<Role> listRole();
	public Role getRole(int id);
	public void attribuerRole(Role r,User u);


}
