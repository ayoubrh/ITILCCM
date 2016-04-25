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
	
	//Lieu
	
	public Long ajouterLieu(Lieu l);
	public void modifierLieu(Lieu l);
	public void supprimerLieu(Long id);
	public List<Lieu> listLieu();
	public Lieu getLieu(Long id);
	

}
