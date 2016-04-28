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
	
    //Lieu
	
	@Override
	public Long ajouterLieu(Lieu l) {
		em.persist(l);
		return l.getId();
	}
	
	@Override
	public Long ajouterLieuCont(Lieu l, List<Long> contacts) {
		Collection<Contact> list=null;
		for(Long cts : contacts ){
			list.add(getContact(cts));
		}
		l.setContacts(list);
		em.persist(l);
		return l.getId();
	}
	
	@Override
	public void modifierLieu(Lieu l) {
		em.merge(l);
		
	}

	@Override
	public void supprimerLieu(Long id) {
		Lieu l = em.find(Lieu.class, id);
		em.remove(l);
		
	}

	@Override
	public List<Lieu> listLieu() {
		Query req = em.createQuery("select l from Lieu l");
		return req.getResultList();
	}

	@Override
	public Lieu getLieu(Long id) {
		
		return em.find(Lieu.class, id);
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

	@Override
	public List<IntefaceReseau> ListInterfaceReseau() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntefaceReseau getInterfaceReseau(Long id) {
		return em.find(IntefaceReseau.class, id);
	}

	@Override
	public Long addFibre(Fibre f) {
		em.persist(f);
		return f.getId();
	}

	@Override
	public void editFibre(Fibre f) {
		em.merge(f);
		
	}

	@Override
	public List<Fibre> ListFibre() {
		Query req = em.createQuery("select f from Fibre f");
		return req.getResultList();
	}

	@Override
	public Fibre getFibre(Long id) {
		return em.find(Fibre.class, id);
	}

	@Override
	public void deleteFibre(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addLogique(Logique logique) {
		em.persist(logique);
		return logique.getId();
	}

	@Override
	public void editLogique(Logique logique) {
		em.merge(logique);
		
	}

	@Override
	public List<Logique> ListLogique() {
		Query req = em.createQuery("select l from Logique l");
		return req.getResultList();
	}

	@Override
	public Logique getLogique(Long id) {
		return em.find(Logique.class, id);
	}

	@Override
	public void deleteLogique(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addPhysique(Physique Physique) {
		em.persist(Physique);
		return Physique.getId();
	}

	@Override
	public void editPhysique(Physique Physique) {
		em.merge(Physique);
		
	}

	@Override
	public List<Physique> ListPhysique() {
		Query req = em.createQuery("select p from Physique p");
		return req.getResultList();
	}

	@Override
	public Physique getPhysique(Long id) {
		return em.find(Physique.class, id);
	}

	@Override
	public void deletePhysique(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addVlan(Vlan Vlan) {
		em.persist(Vlan);
		return Vlan.getId();
	}

	@Override
	public void editVlan(Vlan Vlan) {
		em.merge(Vlan);
		
	}

	@Override
	public List<Vlan> ListVlan() {
		Query req = em.createQuery("select v from Vlan v");
		return req.getResultList();
	}

	@Override
	public Vlan getVlan(Long id) {
		return em.find(Vlan.class, id);
	}

	@Override
	public void deleteVlan(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addSubnet(Subnet Subnet) {
		em.persist(Subnet);
		return Subnet.getId();
	}

	@Override
	public void editSubnet(Subnet Subnet) {
		em.merge(Subnet);
		
	}

	@Override
	public List<Subnet> ListSubnet() {
		Query req = em.createQuery("select s from Subnet s");
		return req.getResultList();
	}

	@Override
	public Subnet getSubnet(Long id) {
		return em.find(Subnet.class, id);
	}

	@Override
	public void deleteSubnet(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addCamera(Camera Cam) {
		em.persist(Cam);
		return Cam.getId();
	}

	@Override
	public void editCamera(Camera Cam) {
		em.merge(Cam);
		
	}

	@Override
	public List<Camera> ListCamera() {
		Query req = em.createQuery("select c from Camera c");
		return req.getResultList();
	}

	@Override
	public Camera getCamera(Long id) {
		return em.find(Camera.class, id);
	}

	@Override
	public void deleteCamera(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addProcessusMetier(ProcessusMetier pm) {
		em.persist(pm);
		return pm.getId();
	}

	@Override
	public void editProcessusMetier(ProcessusMetier pm) {
		em.merge(pm);
		
	}

	@Override
	public List<ProcessusMetier> ListProcessusMetier() {
		Query req = em.createQuery("select pm from ProcessusMetier pm");
		return req.getResultList();
	}

	@Override
	public ProcessusMetier getProcessusMetier(Long id) {
		return em.find(ProcessusMetier.class, id);
	}

	@Override
	public void deleteProcessusMetier(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addSolutionApplicative(SolutionApplicative sa) {
		em.persist(sa);
		return sa.getId();
	}

	@Override
	public void editSolutionApplicative(SolutionApplicative sa) {
		em.merge(sa);
		
	}

	@Override
	public List<SolutionApplicative> ListSolutionApplicative() {
		Query req = em.createQuery("select sa from SolutionApplicative sa");
		return req.getResultList();
	}

	@Override
	public SolutionApplicative getSolutionApplicative(Long id) {
		return em.find(SolutionApplicative.class, id);
	}

	@Override
	public void deleteSolutionApplicative(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addVolumeLogique(VolumeLogique vl) {
		em.persist(vl);
		return vl.getId();
	}

	@Override
	public void editVolumeLogique(VolumeLogique vl) {
		em.merge(vl);
		
	}

	@Override
	public List<VolumeLogique> ListVolumeLogique() {
		Query req = em.createQuery("select vl from VolumeLogique vl");
		return req.getResultList();
	}

	@Override
	public VolumeLogique getVolumeLogique(Long id) {
		return em.find(VolumeLogique.class, id);
	}

	@Override
	public void deleteVolumeLogique(Long id) {
		em.remove(id);
		
	}

	@Override
	public Long addDvr(Dvr dvr) {
		em.persist(dvr);
		return dvr.getId();
	}

	@Override
	public void editDvr(Dvr dvr) {
		em.merge(dvr);
		
	}

	@Override
	public List<Dvr> ListDvr() {
		Query req = em.createQuery("select dvr from Dvr dvr");
		return req.getResultList();
	}

	@Override
	public Dvr getDvr(Long id) {
		return em.find(Dvr.class, id);
	}

	@Override
	public void deleteDvr(Long id) {
		em.remove(id);
		
	}

	@Override
	public List<ConnexionElectrique> ListConnexionElectrique() {
		Query req = em.createQuery("select ce from ConnexionElectrique ce");
		return req.getResultList();
	}

	@Override
	public ConnexionElectrique getConnexionElectrique(Long id) {
		return em.find(ConnexionElectrique.class, id);
	}

	@Override
	public Long addArriveeElectrique(ArriveeElectrique ae) {
		em.persist(ae);
		return ae.getId();
	}

	@Override
	public void editArriveeElectrique(ArriveeElectrique ae) {
		em.merge(ae);		
	}

	@Override
	public List<ArriveeElectrique> ListArriveeElectrique() {
		Query req = em.createQuery("select ae from ArriveeElectrique ae");
		return req.getResultList();
	}

	@Override
	public ArriveeElectrique getArriveeElectrique(Long id) {
		return em.find(ArriveeElectrique.class, id);
	}

	@Override
	public void deleteArriveeElectrique(Long id) {
		em.remove(id);		
	}

	@Override
	public Long addPduElectrique(PduElectrique pdue) {
		em.persist(pdue);
		return pdue.getId();
	}

	@Override
	public void editPduElectrique(PduElectrique pdue) {
		em.merge(pdue);		
	}

	@Override
	public List<PduElectrique> ListPduElectrique() {
		Query req = em.createQuery("select pdue from PduElectrique pdue");
		return req.getResultList();
	}

	@Override
	public PduElectrique getPduElectrique(Long id) {
		return em.find(PduElectrique.class, id);
	}

	@Override
	public void deletePduElectrique(Long id) {
		em.remove(id);		
	}

	@Override
	public Long addRack(Rack Rack) {
		em.persist(Rack);
		return Rack.getId();
	}

	@Override
	public void editRack(Rack Rack) {
		em.merge(Rack);		
	}

	@Override
	public List<Rack> ListRack() {
		Query req = em.createQuery("select r from Rack r");
		return req.getResultList();
	}

	@Override
	public Rack getRack(Long id) {
		return em.find(Rack.class, id);
	}

	@Override
	public void deleteRack(Long id) {
		em.remove(id);		
	}

	@Override
	public Long addChassis(Chassis Chassis) {
		em.persist(Chassis);
		return Chassis.getId();
	}

	@Override
	public void editChassis(Chassis Chassis) {
		em.merge(Chassis);		
	}

	@Override
	public List<Chassis> ListChassis() {
		Query req = em.createQuery("select c from Chassis c");
		return req.getResultList();
	}

	@Override
	public Chassis getChassis(Long id) {
		return em.find(Chassis.class, id);
	}

	@Override
	public void deleteChassis(Long id) {
		em.remove(id);		
	}

	@Override
	public List<Infrastructure> ListInfrastructure() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Infrastructure getInfrastructure(Long id) {
		return em.find(Infrastructure.class, id);
	}

	@Override
	public Long addBandotheque(Bandotheque Bandotheque) {
		em.persist(Bandotheque);
		return Bandotheque.getId();
	}

	@Override
	public void editBandotheque(Bandotheque Bandotheque) {
		em.merge(Bandotheque);		
	}

	@Override
	public List<Bandotheque> ListBandotheque() {
		Query req = em.createQuery("select b from Bandotheque b");
		return req.getResultList();
	}

	@Override
	public Bandotheque getBandotheque(Long id) {
		return em.find(Bandotheque.class, id);
	}

	@Override
	public void deleteBandotheque(Long id) {
		em.remove(id);		
	}

	@Override
	public Long addBande(Bande Bande) {
		em.persist(Bande);
		return Bande.getId();
	}

	@Override
	public void editBande(Bande Bande) {
		em.merge(Bande);		
	}

	@Override
	public List<Bande> ListBande() {
		Query req = em.createQuery("select b from Bande b");
		return req.getResultList();
	}

	@Override
	public Bande getBande(Long id) {
		return em.find(Bande.class, id);
	}

	@Override
	public void deleteBande(Long id) {
		em.remove(id);		
	}

	@Override
	public Long addServeur(Serveur Serveur) {
		em.persist(Serveur);
		return Serveur.getId();
	}

	@Override
	public void editServeur(Serveur Serveur) {
		em.merge(Serveur);		
	}

	@Override
	public List<Serveur> ListServeur() {
		Query req = em.createQuery("select s from Serveur s");
		return req.getResultList();
	}

	@Override
	public Serveur getServeur(Long id) {
		return em.find(Serveur.class, id);
	}

	@Override
	public void deleteServeur(Long id) {
		em.remove(id);		
	}

	@Override
	public Long addSystemeDeStockage(SystemeDeStockage sds) {
		em.persist(sds);
		return sds.getId();
	}

	@Override
	public void editSystemeDeStockage(SystemeDeStockage sds) {
		em.merge(sds);		
	}

	@Override
	public List<SystemeDeStockage> ListSystemeDeStockage() {
		Query req = em.createQuery("select sds from SystemeDeStockage sds");
		return req.getResultList();
	}

	@Override
	public SystemeDeStockage getSystemeDeStockage(Long id) {
		return em.find(SystemeDeStockage.class, id);
	}

	@Override
	public void deleteSystemeDeStockage(Long id) {
		em.remove(id);		
	}

	@Override
	public Long addSwitchSan(SwitchSan san) {
		em.persist(san);
		return san.getId();
	}

	@Override
	public void editSwitchSan(SwitchSan san) {
		em.merge(san);		
	}

	@Override
	public List<SwitchSan> ListSwitchSan() {
		Query req = em.createQuery("select san from SwitchSan san");
		return req.getResultList();
	}

	@Override
	public SwitchSan getSwitchSan(Long id) {
		return em.find(SwitchSan.class, id);
	}

	@Override
	public void deleteSwitchSan(Long id) {
		em.remove(id);		
	}

	@Override
	public Long addNas(Nas Nas) {
		em.persist(Nas);
		return Nas.getId();
	}

	@Override
	public void editNas(Nas Nas) {
		em.merge(Nas);		
	}

	@Override
	public List<Nas> ListNas() {
		Query req = em.createQuery("select n from Nas n");
		return req.getResultList();
	}

	@Override
	public Nas getNas(Long id) {
		return em.find(Nas.class, id);
	}

	@Override
	public void deleteNas(Long id) {
		em.remove(id);		
	}

	@Override
	public Long addSystemeDeFicherNas(SystemeDeFicherNas sdnas) {
		em.persist(sdnas);
		return sdnas.getId();
	}

	@Override
	public void editSystemeDeFicherNas(SystemeDeFicherNas sdnas) {
		em.merge(sdnas);		
	}

	@Override
	public List<SystemeDeFicherNas> ListSystemeDeFicherNas() {
		Query req = em.createQuery("select sdnas from SystemeDeFicherNas sdnas");
		return req.getResultList();
	}

	@Override
	public SystemeDeFicherNas getSystemeDeFicherNas(Long id) {
		return em.find(SystemeDeFicherNas.class, id);
	}

	@Override
	public void deleteSystemeDeFicherNas(Long id) {
		em.remove(id);		
	}

	@Override
	public Long addEquipementReseau(EquipementReseau er) {
		em.persist(er);
		return er.getId();
	}

	@Override
	public void editEquipementReseau(EquipementReseau er) {
		em.merge(er);		
	}

	@Override
	public List<EquipementReseau> ListEquipementReseau() {
		Query req = em.createQuery("select er from EquipementReseau er");
		return req.getResultList();
	}

	@Override
	public EquipementReseau getEquipementReseau(Long id) {
		return em.find(EquipementReseau.class, id);
	}

	@Override
	public void deleteEquipementReseau(Long id) {
		em.remove(id);		
	}
	
	//Contact
	
	@Override
	public Long ajouterContact(Contact c) {
		em.persist(c);
		return c.getId();
	}

	@Override
	public Long ajouterContactLieu(Contact c, Long idlieu) {
		Lieu lieu = getLieu(idlieu);
		c.setLieu(lieu);
		em.persist(c);
		return c.getId();
	}

	@Override
	public void modifierContact(Contact c) {
		em.merge(c);
		
	}

	@Override
	public void supprimerContact(Long id) {
		Contact c = em.find(Contact.class, id);
		em.remove(c);
		
	}

	@Override
	public List<Contact> listContact() {
		Query req = em.createQuery("select c from Contact c");
		return req.getResultList();
		
	}

	@Override
	public Contact getContact(Long id) {
		
		return em.find(Contact.class, id);
	}

	
	@Override
	public Long ajouterContrat(Contrat c) {
		em.persist(c);
		return c.getId();
	}

	@Override
	public void modifierContrat(Contrat c) {
		em.merge(c);
		
	}

	@Override
	public void supprimerContrat(Long id) {
		Contrat contrat = getContrat(id);
		em.remove(contrat);
		
	}

	@Override
	public List<Contrat> listContrat() {
		
		Query req = em.createQuery("select c from Contrat c");
		return req.getResultList();
	}

	@Override
	public Contrat getContrat(Long id) {
		return em.find(Contrat.class, id);
	}

	@Override
	public Long ajouterDocument(Document d) {
		em.persist(d);
		return d.getId();
	}

	@Override
	public void modifierDocument(Document d) {
		em.merge(d);
		
	}

	@Override
	public void supprimerDocument(Long id) {
		Document document = getDocument(id);
		em.remove(document);
		
	}

	@Override
	public List<Document> listDocument() {
		Query req = em.createQuery("select d from Document d");
		return req.getResultList();
	}

	@Override
	public Document getDocument(Long id) {
		return em.find(Document.class, id);
	}

	@Override
	public Long ajouterGroupe(Groupe g) {
		em.persist(g);
		return g.getId();
	}
	
	@Override
	public Long ajouterGroupe(Groupe g, Long id_groupe) {
		Groupe groupe = getGroupe(id_groupe);
		g.setGroupe_parent(groupe);
		em.persist(g);
		return g.getId();
	}

	@Override
	public void modifierGroupe(Groupe d) {
		em.merge(d);
		
	}

	@Override
	public void supprimerGroupe(Long id) {
		Groupe groupe = getGroupe(id);
		em.remove(groupe);
		
	}

	@Override
	public List<Groupe> listGroupe() {
		Query req = em.createQuery("select g from Groupe g");
		return req.getResultList();
	}

	@Override
	public Groupe getGroupe(Long id) {
		return em.find(Groupe.class, id);
	}

	@Override
	public Long ajouterApplicationWeb(ApplicationWeb aw) {
		em.persist(aw);
		return aw.getId();
	}

	@Override
	public void modifierApplicationWeb(ApplicationWeb aw) {
		em.merge(aw);
		
	}

	@Override
	public void supprimerApplicationWeb(Long id) {
		ApplicationWeb applicationWeb = getApplicationWeb(id);
		em.remove(applicationWeb);
		
	}

	@Override
	public List<ApplicationWeb> listApplicationWeb() {
		Query req = em.createQuery("select aw from ApplicationWeb aw");
		return req.getResultList();
	}

	@Override
	public ApplicationWeb getApplicationWeb(Long id) {
		return em.find(ApplicationWeb.class, id);
	}

	@Override
	public Long ajouterInstanceMiddleware(InstanceMiddleware im) {
		em.persist(im);
		return im.getId();
	}

	@Override
	public void modifierInstanceMiddleware(InstanceMiddleware im) {
		em.merge(im);
		
	}

	@Override
	public void supprimerInstanceMiddleware(Long id) {
		InstanceMiddleware InstanceMiddleware = getInstanceMiddleware(id);
		em.remove(InstanceMiddleware);
	}

	@Override
	public List<InstanceMiddleware> listInstanceMiddleware() {
		Query req = em.createQuery("select im from InstanceMiddleware im");
		return req.getResultList();
	}

	@Override
	public InstanceMiddleware getInstanceMiddleware(Long id) {
		return em.find(InstanceMiddleware.class, id);
	}

	@Override
	public Long ajouterInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd) {
		em.persist(ibd);
		return ibd.getId();
	}

	@Override
	public void modifierInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd) {
		em.merge(ibd);
		
	}

	@Override
	public void supprimerInstanceDeBasseDeDonnes(Long id) {
		InstanceDeBasseDeDonnes instanceBD = getInstanceDeBasseDeDonnes(id);
		em.remove(instanceBD);
		
	}

	@Override
	public List<InstanceDeBasseDeDonnes> listInstanceDeBasseDeDonnes() {
		Query req = em.createQuery("select ibd from InstanceDeBasseDeDonnes ibd");
		return req.getResultList();
	}

	@Override
	public InstanceDeBasseDeDonnes getInstanceDeBasseDeDonnes(Long id) {
		return em.find(InstanceDeBasseDeDonnes.class, id);
		
	}

	@Override
	public Long ajouterLicenseLogiciel(LicenseLogiciel ll) {
		em.persist(ll);
		return ll.getId();
	}

	@Override
	public void modifierLicenseLogiciel(LicenseLogiciel ll) {
		em.merge(ll);
		
	}

	@Override
	public void supprimerLicenseLogiciel(Long id) {
		LicenseLogiciel licenseLogiciel = getLicenseLogiciel(id);
		em.remove(licenseLogiciel);
		
	}

	@Override
	public List<LicenseLogiciel> listLicenseLogiciel() {
		Query req = em.createQuery("select ll from LicenseLogiciel ll");
		return req.getResultList();
	}

	@Override
	public LicenseLogiciel getLicenseLogiciel(Long id) {
		return em.find(LicenseLogiciel.class, id);
	}

	@Override
	public Long ajouterLicenseOs(LicenseOs lo) {
		em.persist(lo);
		return lo.getId();
	}

	@Override
	public void modifierLicenseOs(LicenseOs lo) {
		em.merge(lo);
		
	}

	@Override
	public void supprimerLicenseOs(Long id) {
		LicenseOs liceseOs = getLicenseOs(id);
		em.remove(liceseOs);
		
	}

	@Override
	public List<LicenseOs> listLicenseOs() {
		Query req = em.createQuery("select lo from LicenseOs lo");
		return req.getResultList();
	}

	@Override
	public LicenseOs getLicenseOs(Long id) {
		return em.find(LicenseOs.class, id);
	}

	@Override
	public Long ajouterVersionOs(VersionOs vo) {
		em.persist(vo);
		return vo.getId();
	}

	@Override
	public void modifierVersionOs(VersionOs vo) {
		em.merge(vo);
		
	}

	@Override
	public void supprimerVersionOs(Long id) {
		VersionOs versionOs = getVersionOs(id);
		em.remove(versionOs);
		
	}

	@Override
	public List<VersionOs> listVersionOs() {
		Query req = em.createQuery("select vo from VersionOs vo");
		return req.getResultList();
	}

	@Override
	public VersionOs getVersionOs(Long id) {
		return em.find(VersionOs.class, id);
	}

	@Override
	public List<LogicielEtApplication> listLogicielEtApplication() {
		Query req = em.createQuery("select la from LogicielEtApplication la");
		return req.getResultList();
	}

	@Override
	public LogicielEtApplication getLogicielEtApplication(Long id) {
		return em.find(LogicielEtApplication.class, id);
	}

	@Override
	public Long ajouterAutreLogiciel(AutreLogiciel al) {
		em.persist(al);
		return al.getId();
	}

	@Override
	public void modifierAutreLogiciel(AutreLogiciel al) {
		em.merge(al);
		
	}

	@Override
	public void supprimerAutreLogiciel(Long id) {
		AutreLogiciel autreLogiciel = getAutreLogiciel(id);
		em.remove(autreLogiciel);
		
	}

	@Override
	public List<AutreLogiciel> listAutreLogiciel() {
		Query req = em.createQuery("select al from AutreLogiciel al");
		return req.getResultList();
	}

	@Override
	public AutreLogiciel getAutreLogiciel(Long id) {
		return em.find(AutreLogiciel.class, id);
	}

	@Override
	public Long ajouterLogicielPc(LogicielPc lp) {
		em.persist(lp);
		return lp.getId();
	}

	@Override
	public void modifierLogicielPc(LogicielPc lp) {
		em.merge(lp);
		
	}

	@Override
	public void supprimerLogicielPc(Long id) {
		LogicielPc logicielPc = getLogicielPc(id);
		em.remove(logicielPc);
		
	}

	@Override
	public List<LogicielPc> listLogicielPc() {
		Query req = em.createQuery("select lp from LogicielPc lp");
		return req.getResultList();
	}

	@Override
	public LogicielPc getLogicielPc(Long id) {
		return em.find(LogicielPc.class, id);
	}

	@Override
	public Long ajouterServeurWeb(ServeurWeb sw) {
		em.persist(sw);
		return sw.getId();
	}

	@Override
	public void modifierServeurWeb(ServeurWeb sw) {
		em.merge(sw);
		
	}

	@Override
	public void supprimerServeurWeb(Long id) {
		ServeurWeb serveurWeb = getServeurWeb(id);
		em.remove(serveurWeb);
		
	}

	@Override
	public List<ServeurWeb> listServeurWeb() {
		Query req = em.createQuery("select sw from ServeurWeb sw");
		return req.getResultList();
	}

	@Override
	public ServeurWeb getServeurWeb(Long id) {
		return em.find(ServeurWeb.class, id);
	}

	@Override
	public Long ajouterMiddleware(Middleware m) {
		em.persist(m);
		return m.getId();
	}

	@Override
	public void modifierMiddleware(Middleware m) {
		em.merge(m);
		
	}

	@Override
	public void supprimerMiddleware(Long id) {
		Middleware middleware = getMiddleware(id);
		em.remove(middleware);
		
	}

	@Override
	public List<Middleware> listMiddleware() {
		Query req = em.createQuery("select m from Middleware m");
		return req.getResultList();
	}

	@Override
	public Middleware getMiddleware(Long id) {
		return em.find(Middleware.class, id);
	}

	@Override
	public Long ajouterServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees sbd) {
		em.persist(sbd);
		return sbd.getId();
	}

	@Override
	public void modifierServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees sbd) {
		em.merge(sbd);
		
	}

	@Override
	public void supprimerServeurDeBasseDeDonnees(Long id) {
		ServeurDeBasseDeDonnees serveurBD = getServeurDeBasseDeDonnees(id);
		em.remove(serveurBD);
		
	}

	@Override
	public List<ServeurDeBasseDeDonnees> listServeurDeBasseDeDonnees() {
		Query req = em.createQuery("select sbd from ServeurDeBasseDeDonnees sbd");
		return req.getResultList();
	}

	@Override
	public ServeurDeBasseDeDonnees getServeurDeBasseDeDonnees(Long id) {
		return em.find(ServeurDeBasseDeDonnees.class, id);
	}

	@Override
	public Long ajouterMachineVirtuelle(MachineVirtuelle mv) {
		em.persist(mv);
		return mv.getId();
	}

	@Override
	public void modifierMachineVirtuelle(MachineVirtuelle mv) {
		em.merge(mv);
		
	}

	@Override
	public void supprimerMachineVirtuelle(Long id) {
		MachineVirtuelle machineVirtuelle = getMachineVirtuelle(id);
		em.remove(machineVirtuelle);
		
	}

	@Override
	public List<MachineVirtuelle> listMachineVirtuelle() {
		Query req = em.createQuery("select mv from MachineVirtuelle mv");
		return req.getResultList();
	}

	@Override
	public MachineVirtuelle getMachineVirtuelle(Long id) {
		return em.find(MachineVirtuelle.class, id);
	}

	@Override
	public List<Virtualisation> listVirtualisation() {
		Query req = em.createQuery("select v from Virtualisation v");
		return req.getResultList();
	}

	@Override
	public Virtualisation getVirtualisation(Long id) {
		return em.find(Virtualisation.class, id);
	}

	@Override
	public Long ajouterVcluster(Vcluster v) {
		em.persist(v);
		return v.getId();
	}

	@Override
	public void modifierVcluster(Vcluster v) {
		em.merge(v);
		
	}

	@Override
	public void supprimerVcluster(Long id) {
		Vcluster vcluster = getVcluster(id);
		em.remove(vcluster);
		
	}

	@Override
	public List<Vcluster> listVcluster() {
		Query req = em.createQuery("select v from Vcluster v");
		return req.getResultList();
	}

	@Override
	public Vcluster getVcluster(Long id) {
		return em.find(Vcluster.class , id);
	}

	@Override
	public Long ajouterHyperviseur(Hyperviseur h) {
		em.persist(h);
		return h.getId();
	}

	@Override
	public void modifierHyperviseur(Hyperviseur h) {
		em.merge(h);
		
	}

	@Override
	public void supprimerHyperviseur(Long id) {
		Hyperviseur hyperviseur = getHyperviseur(id);
		em.remove(hyperviseur);
		
	}

	@Override
	public List<Hyperviseur> listHyperviseur() {
		Query req = em.createQuery("select h from Hyperviseur h");
		return req.getResultList();
	}

	@Override
	public Hyperviseur getHyperviseur(Long id) {
		return em.find(Hyperviseur.class, id);
	}



	

}

