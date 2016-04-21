package com.cosumar.itilccm.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cosumar.itilccm.entities.*;

public class ITILCCMDAOImp implements ITILCCMDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public int ajouterUser(User u, int idDep) {
		Departement d = getDepartement(idDep);
		u.setDepartement(d);
		em.persist(u);
		return u.getId();
	}
	
	@Override
	public int ajouterUserRole(User u, int idDep, int idR) {
		Departement d = getDepartement(idDep);
		u.setDepartement(d);
		Role r = getRole(idR);
		u.setRole(r);
		em.persist(u);
		return u.getId();
	}

	@Override
	public void modifierUser(User u) {
		em.merge(u);
	}

	@Override
	public void supprimerUser(int id) {
		User u = em.find(User.class, id);
		em.remove(u);
	}

	@Override
	public List<User> listUser() {
		Query req = em.createQuery("select u from User u");
		return req.getResultList();
	}

	@Override
	public User getUser(int id) {
		return em.find(User.class, id);
	}

	@Override
	public int ajouterDepartement(Departement d) {
		em.persist(d);
		return d.getId();
	}

	@Override
	public void modifierDepartement(Departement d) {
		em.merge(d);
	}

	@Override
	public void supprimerDepatement(int id) {
		Departement d = em.find(Departement.class, id);
		em.remove(d);
	}

	@Override
	public List<Departement> listDepartement() {
		Query req = em.createQuery("select d from Departement d");
		return req.getResultList();
	}

	@Override
	public Departement getDepartement(int id) {
		return em.find(Departement.class, id);
	}

	@Override
	public int ajouterRole(Role r) {
		em.persist(r);
		return r.getId();
	}

	@Override
	public void modifierRole(Role r) {
		em.merge(r);
	}

	@Override
	public void supprimerRole(int id) {
		Role r = em.find(Role.class, id);
		em.remove(r);
	}

	@Override
	public List<Role> listRole() {
		Query req = em.createQuery("select r from Role r");
		return req.getResultList();
	}

	@Override
	public Role getRole(int id) {
		return em.find(Role.class, id);
	}

	@Override
	public void attribuerRole(Role r, User u) {
		//User u = em.find(User.class, userID);
		u.setRole(r);
		em.persist(r);
	}

	@Override
	public User getUserByMatricule(String matricule) {
		Query req = em.createQuery("Select u from User u where u.matricule = :matricule");
		req.setParameter("matricule",matricule);
		return (User) req.getSingleResult();
	}

}

