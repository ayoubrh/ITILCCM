package com.cosumar.itilccm.dao;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cosumar.itilccm.entities.*;

public class ITILCCMDAOImp implements ITILCCMDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Long ajouterUser(User u, Long idDep) {
		Departement d = getDepartement(idDep);
		u.setDepartement(d);
		em.persist(u);
		return u.getId();
	}
	
	@Override
	public Long ajouterUserRole(User u, Long idDep, Long idR) {
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
	public void supprimerUser(Long id) {
		User u = em.find(User.class, id);
		em.remove(u);
	}

	@Override
	public List<User> listUser() {
		Query req = em.createQuery("select u from User u");
		return req.getResultList();
	}

	@Override
	public User getUser(Long id) {
		return em.find(User.class, id);
	}

	@Override
	public Long ajouterDepartement(Departement d) {
		em.persist(d);
		return d.getId();
	}

	@Override
	public void modifierDepartement(Departement d) {
		em.merge(d);
	}

	@Override
	public void supprimerDepatement(Long id) {
		Departement d = em.find(Departement.class, id);
		em.remove(d);
	}

	@Override
	public List<Departement> listDepartement() {
		Query req = em.createQuery("select d from Departement d");
		return req.getResultList();
	}

	@Override
	public Departement getDepartement(Long id) {
		return em.find(Departement.class, id);
	}

	@Override
	public Long ajouterRole(Role r) {
		em.persist(r);
		return r.getId();
	}

	@Override
	public void modifierRole(Role r) {
		em.merge(r);
	}

	@Override
	public void supprimerRole(Long id) {
		Role r = em.find(Role.class, id);
		em.remove(r);
	}

	@Override
	public List<Role> listRole() {
		Query req = em.createQuery("select r from Role r");
		return req.getResultList();
	}

	@Override
	public Role getRole(Long id) {
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

	@Override
	public Long addPC(Ordinateur pc) {
		em.persist(pc);
		return pc.getId();
	}

	@Override
	public Long addPCUser(Ordinateur pc, Long u) {
		User user = getUser(u);
		pc.setUser(user);
		em.persist(pc);
		return pc.getId();
	}

	@Override
	public void editPC(Ordinateur pc) {
		em.merge(pc);
		
	}

	@Override
	public List<Ordinateur> ListPC() {
		Query req = em.createQuery("select pc from Ordinateur pc");
		return req.getResultList();
	}

	@Override
	public Ordinateur getPC(Long id) {
		return em.find(Ordinateur.class, id);
	}

	@Override
	public void deletePC(Long id) {
		Ordinateur pc = em.find(Ordinateur.class, id);
		em.remove(pc);
		
	}

	@Override
	public Long addImp(Imprimante imp) {
		em.persist(imp);
		return imp.getId();
	}

	@Override
	public Long addImpUser(Imprimante imp, Long u) {
		User user = getUser(u);
		imp.setUser(user);
		em.persist(imp);
		return imp.getId();
	}

	@Override
	public void editImp(Imprimante imp) {
		em.merge(imp);
		
	}

	@Override
	public List<Imprimante> ListImp() {
		Query req = em.createQuery("select imp from Imprimante imp");
		return req.getResultList();
	}

	@Override
	public Imprimante getImp(Long id) {
		return em.find(Imprimante.class, id);
	}

	@Override
	public void deleteImp(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addTeleMobile(TelephneMobile telem) {
		em.persist(telem);
		return telem.getId();
	}

	@Override
	public Long addTeleMobileUser(TelephneMobile telem, Long u) {
		User user = getUser(u);
		telem.setUser(user);
		em.persist(telem);
		return telem.getId();
	}

	@Override
	public void editTeleMobile(TelephneMobile telem) {
		em.merge(telem);
		
	}

	@Override
	public List<TelephneMobile> ListTeleMobile() {
		Query req = em.createQuery("select telem from TelephneMobile telem");
		return req.getResultList();
	}

	@Override
	public TelephneMobile getTeleMobile(Long id) {
		return em.find(TelephneMobile.class, id);
	}

	@Override
	public void deleteTeleMobile(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addSIM(Sim sim) {
		em.persist(sim);
		return sim.getId();
	}

	@Override
	public Long addSIMUser(Sim sim, Long u) {
		User user = getUser(u);
		sim.setUser(user);
		em.persist(sim);
		return sim.getId();
	}

	@Override
	public void editSIM(Sim sim) {
		em.merge(sim);
		
	}

	@Override
	public List<Sim> ListSIM() {
		Query req = em.createQuery("select sim from Sim sim");
		return req.getResultList();
	}

	@Override
	public Sim getSIM(Long id) {
		return em.find(Sim.class, id);
	}

	@Override
	public void deleteSIM(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addTablette(Tablette tab) {
		em.persist(tab);
		return tab.getId();
	}

	@Override
	public Long addTabletteUser(Tablette tab, Long u) {
		User user = getUser(u);
		tab.setUser(user);
		em.persist(tab);
		return tab.getId();
	}

	@Override
	public void editTablette(Tablette tab) {
		em.merge(tab);
		
	}

	@Override
	public List<Tablette> ListTablette() {
		Query req = em.createQuery("select tab from Tablette tab");
		return req.getResultList();
	}

	@Override
	public Tablette getTablette(Long id) {
		return em.find(Tablette.class, id);
	}

	@Override
	public void deleteTablette(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addTeleFixe(TelephoneFixe fixe) {
		em.persist(fixe);
		return fixe.getId();
	}

	@Override
	public Long addTeleFixeUser(TelephoneFixe fixe, Long u) {
		User user = getUser(u);
		fixe.setUser(user);
		em.persist(fixe);
		return fixe.getId();
	}

	@Override
	public void editTeleFixe(TelephoneFixe fixe) {
		em.merge(fixe);
		
	}

	@Override
	public List<TelephoneFixe> ListTeleFixe() {
		Query req = em.createQuery("select fixe from TelephoneFixe fixe");
		return req.getResultList();
	}

	@Override
	public TelephoneFixe getTeleFixe(Long id) {
		return em.find(TelephoneFixe.class, id);
	}

	@Override
	public void deleteTeleFixe(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addPeriph(Peripherique per) {
		em.persist(per);
		return per.getId();
	}

	@Override
	public Long addPeriphPC(Peripherique per, Long pc) {
		Ordinateur ordi = getPC(pc);
		//Collection<Ordinateur> ordi = null;
		//for (Long long1 : pc) {
		//	ordi.add(getPC(long1));
		//}
		per.setOrdinateur(ordi);
		em.persist(per);
		return per.getId();
	}

	@Override
	public void editPeriph(Peripherique per) {
		em.merge(per);
		
	}

	@Override
	public List<Peripherique> ListPeriph() {
		Query req = em.createQuery("select per from Peripherique per");
		return req.getResultList();
	}

	@Override
	public Peripherique getPeriph(Long id) {
		return em.find(Peripherique.class, id);
	}

	@Override
	public void deletePeriph(Long id) {
		em.remove(id);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

