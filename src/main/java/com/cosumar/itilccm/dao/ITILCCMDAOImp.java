package com.cosumar.itilccm.dao;

import java.util.ArrayList;
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
	public List<User> listUserSim() {
		Query req = em.createQuery("select u from User u  where u.id not in ( select us.id from User us join us.sim s where us.id = s.user.id and s.user.id is not null)");

		//Query req = em.createQuery("select u from User u join u.sim s where u.id not in s.user.id and s.user.id is not null");
		return req.getResultList();
	}
	
	@Override
	public List<User> listUserTeleMobile() {
		Query req = em.createQuery("select u from User u  where u.id not in ( select us.id from User us join us.telephneMobile t where us.id = t.user.id and t.user.id is not null)");

		//Query req = em.createQuery("select u from User u join u.sim s where u.id not in s.user.id and s.user.id is not null");
		return req.getResultList();
	}
	
	@Override
	public List<User> listUserTeleFixe() {
		Query req = em.createQuery("select u from User u  where u.id not in ( select us.id from User us join us.telephoneFixe t where us.id = t.user.id and t.user.id is not null)");

		//Query req = em.createQuery("select u from User u join u.sim s where u.id not in s.user.id and s.user.id is not null");
		return req.getResultList();
	}
	
	@Override
	public List<User> listUserTablette() {
		Query req = em.createQuery("select u from User u  where u.id not in ( select us.id from User us join us.tablette t where us.id = t.user.id and t.user.id is not null)");

		//Query req = em.createQuery("select u from User u join u.sim s where u.id not in s.user.id and s.user.id is not null");
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
		
		if(contacts!=null){
			Collection<Contact> list = new ArrayList<Contact>();
			for(Long cts : contacts ){
				Contact contact = getContact(cts);
				list.add(contact);
				contact.setLieu(l); 
			}
			l.setContacts(list);
		}
		em.persist(l);
		return l.getId();
	}
	
	@Override
	public void modifierLieu(Lieu l,List<Long> contacts) {
		
		if(contacts!=null){
			Collection<Contact> list = new ArrayList<Contact>();
			for(Long cts : contacts ){
				Contact contact = getContact(cts);
				list.add(contact);
				contact.setLieu(l); 
			}
			l.setContacts(list);
		}
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
	public List<Lieu> SearchLieu(String l) {
		Query req = em.createQuery("select lieu from Lieu lieu where lieu.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+l+"%");
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
	public Long addPCAll(Ordinateur pc, Long user,Long lieu, Long licenseos, List<Long> logicielEtApplication, List<Long> equipementReseau, 
			List<Long> intefaceReseau, List<Long> peripherique, List<Long> document, List<Long> contact, List<Long> contrat) {
		
		if(user != null){
			User u = getUser(user);
			pc.setUser(u);
		}else {
			pc.setUser(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			pc.setLieu(lie);
		} else {
			pc.setLieu(null);
		}
		if(licenseos != null){
			LicenseOs los = getLicenseOs(licenseos);
			pc.setLicenseOs(los);
		} else {
			pc.setLicenseOs(null);
		}
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			pc.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			pc.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			pc.setContrat(contr);
		}
		if(logicielEtApplication != null){
			Collection<LogicielEtApplication> la = new ArrayList<LogicielEtApplication>();
			for (Long l : logicielEtApplication) {
				LogicielEtApplication log = getLogicielEtApplication(l);
				la.add(log);
			}
			pc.setLogicielEtApplication(la);
		}
		
		if(equipementReseau != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementReseau) {
				er.add(getEquipementReseau(e));
			}
			pc.setEquipementReseau(er);
		}
		
		if(intefaceReseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : intefaceReseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setOrdinateur(pc);
			}
			pc.setIntefaceReseau(ir);
		}
		if(peripherique != null){
			Collection<Peripherique> per = new ArrayList<Peripherique>();
			for (Long p : peripherique) {
				Peripherique periph = getPeriph(p);
				per.add(periph);
				periph.setOrdinateur(pc);
			}
			pc.setPeripherique(per);
		}

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
	public List<Ordinateur> ListPCUser(Long id) {
		Query req = em.createQuery("select pc from Ordinateur pc join pc.user u where u.id = :userid");
		req.setParameter("userid", id);
		return req.getResultList();
	}
	
	@Override
	public List<Ordinateur> SearchPC(String s) {
		Query req = em.createQuery("select pc from Ordinateur pc where pc.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}
	
	@Override
	public List<Ordinateur> SearchPCUser(String s,Long user) {
		Query req = em.createQuery("select pc from Ordinateur pc join pc.user u where pc.nom LIKE :searchKeyword and u.id = :userid");
		req.setParameter("searchKeyword", "%"+s+"%");
		req.setParameter("userid", user);
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
	public List<Imprimante> ListImpUser(Long id) {
		Query req = em.createQuery("select imp from Imprimante imp join imp.user u where u.id = :userid");
		req.setParameter("userid", id);
		return req.getResultList();
	}

	@Override
	public Imprimante getImp(Long id) {
		return em.find(Imprimante.class, id);
	}

	@Override
	public void deleteImp(Long id) {
		Imprimante imp = em.find(Imprimante.class, id);
		em.remove(imp);
		
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
	public List<TelephneMobile> ListTeleMobileUser(Long id) {
		Query req = em.createQuery("select telem from TelephneMobile telem join telem.user u where u.id = :userid");
		req.setParameter("userid", id);
		return req.getResultList();
	}
	
	@Override
	public TelephneMobile getTeleMobile(Long id) {
		return em.find(TelephneMobile.class, id);
	}

	@Override
	public void deleteTeleMobile(Long id) {
		TelephneMobile t = em.find(TelephneMobile.class, id);
		em.remove(t);
		
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
	public List<Sim> ListSIMUser(Long id) {
		Query req = em.createQuery("select sim from Sim sim join sim.user u where u.id = :userid");
		req.setParameter("userid", id);
		return req.getResultList();
	}

	@Override
	public Sim getSIM(Long id) {
		return em.find(Sim.class, id);
	}

	@Override
	public void deleteSIM(Long id) {
		Sim s = em.find(Sim.class, id);
		em.remove(s);
		
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
	public List<Tablette> ListTabletteUser(Long id) {
		Query req = em.createQuery("select tab from Tablette tab join tab.user u where u.id = :userid");
		req.setParameter("userid", id);
		return req.getResultList();
	}

	@Override
	public Tablette getTablette(Long id) {
		return em.find(Tablette.class, id);
	}

	@Override
	public void deleteTablette(Long id) {
		Tablette t = em.find(Tablette.class, id);
		em.remove(t);
		
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
	public List<TelephoneFixe> ListTeleFixeUser(Long id) {
		Query req = em.createQuery("select fixe from TelephoneFixe fixe join fixe.user u where u.id = :userid");
		req.setParameter("userid", id);
		return req.getResultList();
	}

	@Override
	public TelephoneFixe getTeleFixe(Long id) {
		return em.find(TelephoneFixe.class, id);
	}

	@Override
	public void deleteTeleFixe(Long id) {
		TelephoneFixe t = em.find(TelephoneFixe.class, id);
		em.remove(t);
		
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
		Peripherique p = em.find(Peripherique.class, id);
		em.remove(p);
		
	}

	@Override
	public List<IntefaceReseau> ListInterfaceReseau() {
		Query req = em.createQuery("select ir from IntefaceReseau ir");
		return req.getResultList();
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
		Fibre f = em.find(Fibre.class, id);
		em.remove(f);
		
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
		Logique l = em.find(Logique.class, id);
		em.remove(l);
		
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
		Physique p = em.find(Physique.class, id);
		em.remove(p);
		
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
		Vlan v = em.find(Vlan.class, id);
		em.remove(v);
		
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
		Subnet s = em.find(Subnet.class, id);
		em.remove(s);
		
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
		Camera c = em.find(Camera.class, id);
		em.remove(c);
		
	}

	@Override
	public Long addProcessusMetier(ProcessusMetier pm) {
		em.persist(pm);
		return pm.getId();
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
		ProcessusMetier p = em.find(ProcessusMetier.class, id);
		em.remove(p);
		
	}

	@Override
	public Long addSolutionApplicative(SolutionApplicative sa) {
		em.persist(sa);
		return sa.getId();
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
		SolutionApplicative s = em.find(SolutionApplicative.class, id);
		em.remove(s);
		
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
		VolumeLogique v = em.find(VolumeLogique.class, id);
		em.remove(v);
		
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
		Dvr d = em.find(Dvr.class, id);
		em.remove(d);
		
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
		ArriveeElectrique a = em.find(ArriveeElectrique.class, id);
		em.remove(a);		
	}

	@Override
	public Long addPduElectrique(PduElectrique pdue) {
		em.persist(pdue);
		return pdue.getId();
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
		PduElectrique p = em.find(PduElectrique.class, id);
		em.remove(p);		
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
		Rack r = em.find(Rack.class, id);
		em.remove(r);		
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
		Chassis c = em.find(Chassis.class, id);
		em.remove(c);		
	}

	@Override
	public List<Infrastructure> ListInfrastructure() {
		Query req = em.createQuery("select infra from Infrastructure infra");
		return req.getResultList();
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
		Bandotheque b = em.find(Bandotheque.class, id);
		em.remove(b);		
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
		Bande b = em.find(Bande.class, id);
		em.remove(b);		
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
		Serveur s = em.find(Serveur.class, id);
		em.remove(s);		
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
		SystemeDeStockage s = em.find(SystemeDeStockage.class, id);
		em.remove(s);		
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
		SwitchSan s = em.find(SwitchSan.class, id);
		
		em.remove(s);		
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
		Nas n = em.find(Nas.class, id);
		em.remove(n);		
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
		SystemeDeFicherNas s = em.find(SystemeDeFicherNas.class, id);
		em.remove(s);		
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
		EquipementReseau e = em.find(EquipementReseau.class, id);
		em.remove(e);		
	}
	
	//Contact
	
	@Override
	public Long ajouterContact(Contact c) {
		em.persist(c);
		return c.getId();
	}
	

	@Override
	public Long ajouterContactAll(Contact c, Long idlieu) {
		
		if(idlieu !=null){
			
			Lieu lieu = getLieu(idlieu);
			c.setLieu(lieu);
		
		}else{
			c.setLieu(null);
		}
		
		
		em.persist(c);
		
		return c.getId();
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
	public Long ajouterContratAll(Contrat c, List<Long> contacts, List<Long> documents) {
		
			if(contacts != null){
				
				Collection<Contact> contact = new ArrayList<Contact>();
				for (Long cc : contacts) {
					
					Contact con = getContact(cc);
					contact.add(con);
				}
				
				c.setContacts(contact);
						
			}
			
			if(documents != null){
				
				Collection<Document> document = new ArrayList<Document>();
				for (Long d : documents) {
					Document doc = getDocument(d);
					document.add(doc);
				}
				
				c.setDocuments(document);
				
			}
			em.persist(c);
		return c.getId();
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
	public void modifierApplicationWeb(ApplicationWeb aw, Long sw, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		if(sw !=null){
			
	    	ServeurWeb serveurWeb = getServeurWeb(sw);
			aw.setServeurWeb(serveurWeb);
		
		}else{
			aw.setServeurWeb(null);
		}
	    
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			aw.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			aw.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			aw.setSolutionApplicative(solutionsAppl);
			
		}
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			aw.setContrats(contrat);
					
		}
		
		em.merge(aw);
		
	}

	@Override
	public List<ApplicationWeb> SearchApplicationWeb(String aw) {
		Query req = em.createQuery("select aw from ApplicationWeb aw where aw.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+aw+"%");
		return req.getResultList();
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
	public void modifierInstanceMiddleware(InstanceMiddleware im, Long m, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		
		   if(m !=null){
			
			   Middleware middleware = getMiddleware(m);
				im.setMiddleware(middleware);
			
			}else{
				im.setMiddleware(null);
			}
			if(contacts != null){
				
				Collection<Contact> contact = new ArrayList<Contact>();
				for (Long cc : contacts) {
					Contact con = getContact(cc);
					contact.add(con);
				}
				
				im.setContacts(contact);
						
			}
			
			if(documents != null){
				
				Collection<Document> document = new ArrayList<Document>();
				for (Long d : documents) {
					Document doc = getDocument(d);
					document.add(doc);
				}
				
				im.setDocuments(document);
				
			}
			
			if(solutionsApplicatives != null){
				
				Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
				for (Long sa : solutionsApplicatives) {
					SolutionApplicative sol = getSolutionApplicative(sa);
					solutionsAppl.add(sol);
				}
				
				im.setSolutionApplicative(solutionsAppl);
				
			}
			if(contrats != null){
						
				Collection<Contrat> contrat = new ArrayList<Contrat>();
				for (Long cc : contrats) {
					Contrat con = getContrat(cc);
					contrat.add(con);
				}
				
				im.setContrats(contrat);
						
			}
			
			em.merge(im);
		
	}

	@Override
	public List<InstanceMiddleware> SearchInstanceMiddleware(String im) {
		Query req = em.createQuery("select im from InstanceMiddleware im where im.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+im+"%");
		return req.getResultList();
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
	public void modifierInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd, Long sbd, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> contrats) {
		
		   if(sbd !=null){
			
			  ServeurDeBasseDeDonnees serveurDeBasseDeDonnees = getServeurDeBasseDeDonnees(sbd);
				ibd.setServeurDeBasseDeDonnees(serveurDeBasseDeDonnees);
			
			}else{
				ibd.setServeurDeBasseDeDonnees(null);
			}
			
			if(contacts != null){
				
				Collection<Contact> contact = new ArrayList<Contact>();
				for (Long cc : contacts) {
					Contact con = getContact(cc);
					contact.add(con);
				}
				
				ibd.setContacts(contact);
						
			}
			
			if(documents != null){
				
				Collection<Document> document = new ArrayList<Document>();
				for (Long d : documents) {
					Document doc = getDocument(d);
					document.add(doc);
				}
				
				ibd.setDocuments(document);
				
			}
			
			if(solutionsApplicatives != null){
				
				Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
				for (Long sa : solutionsApplicatives) {
					SolutionApplicative sol = getSolutionApplicative(sa);
					solutionsAppl.add(sol);
				}
				
				ibd.setSolutionApplicative(solutionsAppl);
				
			}
			if(contrats != null){
						
				Collection<Contrat> contrat = new ArrayList<Contrat>();
				for (Long cc : contrats) {
					Contrat con = getContrat(cc);
					contrat.add(con);
				}
				
				ibd.setContrats(contrat);
						
			}
			
			em.merge(ibd);
		
	}

	@Override
	public List<InstanceDeBasseDeDonnes> SearchInstanceDeBasseDeDonnes(String ibd) {
		Query req = em.createQuery("select ibd from InstanceDeBasseDeDonnes ibd where ibd.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+ibd+"%");
		return req.getResultList();
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


	@Override
	public Long ajouterDocumentFichier(DocumentFichier df) {
		em.persist(df);
		return df.getId();
	}

	@Override
	public void modifierDocumentFichier(DocumentFichier df) {
		em.merge(df);
		
	}

	@Override
	public void supprimerDocumentFichier(Long id) {
		DocumentFichier fichier = getDocumentFichier(id);
		em.remove(fichier);
		
	}

	@Override
	public List<DocumentFichier> listDocumentFichier() {
		Query req = em.createQuery("select df from DocumentFichier df");
		return req.getResultList();
	}

	@Override
	public DocumentFichier getDocumentFichier(Long id) {
		return em.find(DocumentFichier.class, id);
	}

	@Override
	public Long ajouterDocumentWeb(DocumentWeb dw) {
		em.persist(dw);
		return dw.getId();
	}

	@Override
	public void modifierDocumentWeb(DocumentWeb dw) {
		em.merge(dw);
		
	}

	@Override
	public void supprimerDocumentWeb(Long id) {
		DocumentWeb web = getDocumentWeb(id);
		em.remove(web);
		
	}

	@Override
	public List<DocumentWeb> listDocumentWeb() {
		Query req = em.createQuery("select dw from DocumentWeb dw");
		return req.getResultList();
	}

	@Override
	public DocumentWeb getDocumentWeb(Long id) {
		return em.find(DocumentWeb.class, id);
	}

	@Override
	public Long ajouterDocumentNote(DocumentNote dn) {
		em.persist(dn);
		return dn.getId();
	}

	@Override
	public void modifierDocumentNote(DocumentNote dn) {
		em.persist(dn);
		
	}

	@Override
	public void supprimerDocumentNote(Long id) {
		DocumentNote note = getDocumentNote(id);
		em.remove(note);
		
	}

	@Override
	public List<DocumentNote> listDocumentNote() {
		Query req = em.createQuery("select dn from DocumentNote dn");
		return req.getResultList();
	}

	@Override
	public DocumentNote getDocumentNote(Long id) {
		return em.find(DocumentNote.class, id);
	}

	@Override
	public Long addImpAll(Imprimante imp, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		
		if(user != null){
			User u = getUser(user);
			imp.setUser(u);
		}else {
			imp.setUser(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			imp.setLieu(lie);
		} else {
			imp.setLieu(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			imp.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			imp.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			imp.setContrat(contr);
		}

		em.persist(imp);
		return imp.getId();
	}
	
	@Override
	public Long editImpAll(Imprimante imp, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		
		if(user != null){
			User u = getUser(user);
			imp.setUser(u);
		}else {
			imp.setUser(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			imp.setLieu(lie);
		} else {
			imp.setLieu(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			imp.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			imp.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			imp.setContrat(contr);
		}

		em.merge(imp);
		return imp.getId();
	}
	


	@Override
	public Long addPerAll(Peripherique per, Long pc, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		
		if(pc != null){
			Ordinateur ordi = getPC(pc);
			per.setOrdinateur(ordi);
		}else {
			per.setOrdinateur(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			per.setLieu(lie);
		} else {
			per.setLieu(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			per.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			per.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			per.setContrat(contr);
		}

		em.persist(per);
		return per.getId();
	}
	
	@Override
	public Long editPerAll(Peripherique per, Long pc, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		
		if(pc != null){
			Ordinateur ordi = getPC(pc);
			per.setOrdinateur(ordi);
		}else {
			per.setOrdinateur(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			per.setLieu(lie);
		} else {
			per.setLieu(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			per.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			per.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			per.setContrat(contr);
		}

		em.merge(per);
		return per.getId();
	}

	@Override
	public Long addTeleMobileAll(TelephneMobile telem, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		if(user != null){
			User u = getUser(user);
			telem.setUser(u);
		}else {
			telem.setUser(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			telem.setLieu(lie);
		} else {
			telem.setLieu(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			telem.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			telem.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			telem.setContrat(contr);
		}

		em.persist(telem);
		return telem.getId();
	}
	
	@Override
	public Long editTeleMobileAll(TelephneMobile telem, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		if(user != null){
			User u = getUser(user);
			telem.setUser(u);
		}else {
			telem.setUser(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			telem.setLieu(lie);
		} else {
			telem.setLieu(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			telem.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			telem.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			telem.setContrat(contr);
		}

		em.merge(telem);
		return telem.getId();
	}
	
	
	@Override
	public Long addTeleFixeAll(TelephoneFixe fixe, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		if(user != null){
			User u = getUser(user);
			fixe.setUser(u);
		}else {
			fixe.setUser(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			fixe.setLieu(lie);
		} else {
			fixe.setLieu(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			fixe.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			fixe.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			fixe.setContrat(contr);
		}

		em.persist(fixe);
		return fixe.getId();
	}
	
	@Override
	public Long editTeleFixeAll(TelephoneFixe fixe, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		if(user != null){
			User u = getUser(user);
			fixe.setUser(u);
		}else {
			fixe.setUser(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			fixe.setLieu(lie);
		} else {
			fixe.setLieu(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			fixe.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			fixe.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			fixe.setContrat(contr);
		}

		em.merge(fixe);
		return fixe.getId();
	}
	

	@Override
	public Long addTabletteAll(Tablette tab, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		if(user != null){
			User u = getUser(user);
			tab.setUser(u);
		}else {
			tab.setUser(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			tab.setLieu(lie);
		} else {
			tab.setLieu(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			tab.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			tab.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			tab.setContrat(contr);
		}

		em.persist(tab);
		return tab.getId();
	}
	
	@Override
	public Long editTabletteAll(Tablette tab, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		if(user != null){
			User u = getUser(user);
			tab.setUser(u);
		}else {
			tab.setUser(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			tab.setLieu(lie);
		} else {
			tab.setLieu(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			tab.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			tab.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			tab.setContrat(contr);
		}

		em.merge(tab);
		return tab.getId();
	}
	
	
	@Override
	public Long addSIMAll(Sim sim, Long user, List<Long> document, List<Long> contact, List<Long> contrat) {
		if(user != null){
			User u = getUser(user);
			sim.setUser(u);
		}else {
			sim.setUser(null);
		}
		
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			sim.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			sim.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			sim.setContrat(contr);
		}

		em.persist(sim);
		return sim.getId();
	}
	
	
	@Override
	public Long editSIMAll(Sim sim, Long user, List<Long> document, List<Long> contact, List<Long> contrat) {
		if(user != null){
			User u = getUser(user);
			sim.setUser(u);
		}else {
			sim.setUser(null);
		}
		
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			sim.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			sim.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			sim.setContrat(contr);
		}

		em.merge(sim);
		return sim.getId();
	}
	
	@Override
	public Long addRackAll(Rack rack, Long lieu, List<Long> chassis, List<Long> materiels, List<Long> pdu,
			List<Long> document, List<Long> contact, List<Long> contrat) {
		
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			rack.setLieu(lie);
		} else {
			rack.setLieu(null);
		}
		
		if(chassis != null){
			Collection<Chassis> chass = new ArrayList<Chassis>();
			for (Long chas : chassis) {
				Chassis cha = getChassis(chas);
				chass.add(cha);
				cha.setRack(rack);
			}
			rack.setChassis(chass);
		}
		
		if(materiels != null){
			Collection<Infrastructure> infrastructure = new ArrayList<Infrastructure>();
			for (Long mat : materiels) {
				Infrastructure infra = getInfrastructure(mat);
				infrastructure.add(infra);
				infra.setRack(rack);
			}
			rack.setInfrastructure(infrastructure);
		}
		
		if(pdu != null){
			Collection<PduElectrique> pduelec = new ArrayList<PduElectrique>();
			for (Long p : pdu) {
				PduElectrique pdue = getPduElectrique(p);
				pduelec.add(pdue);
				pdue.setRack(rack);
			}
			rack.setPduElectrique(pduelec);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			rack.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			rack.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			rack.setContrat(contr);
		}

		em.persist(rack);
		return rack.getId();
	}
	
	@Override
	public Long editRackAll(Rack rack, Long lieu, List<Long> chassis, List<Long> materiels, List<Long> pdu,
			List<Long> document, List<Long> contact, List<Long> contrat) {
		
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			rack.setLieu(lie);
		} else {
			rack.setLieu(null);
		}
		
		if(chassis != null){
			Collection<Chassis> chass = new ArrayList<Chassis>();
			for (Long chas : chassis) {
				Chassis cha = getChassis(chas);
				chass.add(cha);
				cha.setRack(rack);
			}
			rack.setChassis(chass);
		}
		
		if(materiels != null){
			Collection<Infrastructure> infrastructure = new ArrayList<Infrastructure>();
			for (Long mat : materiels) {
				Infrastructure infra = getInfrastructure(mat);
				infrastructure.add(infra);
				infra.setRack(rack);
			}
			rack.setInfrastructure(infrastructure);
		}
		
		if(pdu != null){
			Collection<PduElectrique> pduelec = new ArrayList<PduElectrique>();
			for (Long p : pdu) {
				PduElectrique pdue = getPduElectrique(p);
				pduelec.add(pdue);
				pdue.setRack(rack);
			}
			rack.setPduElectrique(pduelec);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			rack.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			rack.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			rack.setContrat(contr);
		}

		em.merge(rack);
		return rack.getId();
	}
	
	@Override
	public Long addChassisAll(Chassis Chassis, Long lieu, Long rack, List<Long> materiels, List<Long> document,
			List<Long> contact, List<Long> contrat) {
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			Chassis.setLieu(lie);
		} else {
			Chassis.setLieu(null);
		}
		if(rack != null){
			Rack ra = getRack(rack);
			Chassis.setRack(ra);
		} else {
			Chassis.setRack(null);
		}
		
		if(materiels != null){
			Collection<Infrastructure> infrastructure = new ArrayList<Infrastructure>();
			for (Long mat : materiels) {
				Infrastructure infra = getInfrastructure(mat);
				infrastructure.add(infra);
				infra.setChassis(Chassis);
			}
			Chassis.setInfrastructure(infrastructure);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			Chassis.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			Chassis.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			Chassis.setContrat(contr);
		}
		em.persist(Chassis);
		return Chassis.getId();
	}
	
	@Override
	public Long editChassisAll(Chassis Chassis, Long lieu, Long rack, List<Long> materiels, List<Long> document,
			List<Long> contact, List<Long> contrat) {
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			Chassis.setLieu(lie);
		} else {
			Chassis.setLieu(null);
		}
		if(rack != null){
			Rack ra = getRack(rack);
			Chassis.setRack(ra);
		} else {
			Chassis.setRack(null);
		}
		
		if(materiels != null){
			Collection<Infrastructure> infrastructure = new ArrayList<Infrastructure>();
			for (Long mat : materiels) {
				Infrastructure infra = getInfrastructure(mat);
				infrastructure.add(infra);
				infra.setChassis(Chassis);
			}
			Chassis.setInfrastructure(infrastructure);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			Chassis.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			Chassis.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			Chassis.setContrat(contr);
		}
		em.merge(Chassis);
		return Chassis.getId();
	}

	@Override
	public Long ajouterAutreLogicielAll(AutreLogiciel al,Long serv,Long mach,Long l, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		
		if(serv !=null){
			
	        Serveur serveur = getServeur(serv);
			al.setServeur(serveur);
				
		}else{
			al.setServeur(null);
		}
		
        if(mach !=null){
			
	        MachineVirtuelle machineVirtuelle = getMachineVirtuelle(mach);
			al.setMachineVirtuelle(machineVirtuelle);
				
		}else{
			al.setMachineVirtuelle(null);
		}
		
		if(l !=null){
					
			        LicenseLogiciel licenseLogiciel = getLicenseLogiciel(l);
					al.setLicenseLogiciel(licenseLogiciel);
				
		}else{
					al.setLicenseLogiciel(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			al.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			al.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			al.setSolutionApplicative(solutionsAppl);
			
		}
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			al.setContrats(contrat);
					
		}
		
		em.persist(al);
		
		return al.getId();
	}

	@Override
	public Long ajouterLogicielPcAll(LogicielPc lp,Long serv,Long mach,Long l ,List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		
        if(serv !=null){
			
	        Serveur serveur = getServeur(serv);
			lp.setServeur(serveur);
				
		}else{
			lp.setServeur(null);
		}
		
        if(mach !=null){
			
	        MachineVirtuelle machineVirtuelle = getMachineVirtuelle(mach);
			lp.setMachineVirtuelle(machineVirtuelle);
				
		}else{
			lp.setMachineVirtuelle(null);
		}
		
		if(l !=null){
			
	        LicenseLogiciel licenseLogiciel = getLicenseLogiciel(l);
			lp.setLicenseLogiciel(licenseLogiciel);
		
		}else{
					lp.setLicenseLogiciel(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			lp.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			lp.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			lp.setSolutionApplicative(solutionsAppl);
			
		}
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			lp.setContrats(contrat);
					
		}
		
		em.persist(lp);

		return lp.getId();
	}

	@Override
	public Long ajouterServeurWebAll(ServeurWeb sw,Long serv,Long mach,Long l, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> applicationWeb, List<Long> contrats) {
		
	  if(serv !=null){
			
	        Serveur serveur = getServeur(serv);
			sw.setServeur(serveur);
				
		}else{
			sw.setServeur(null);
		}
		
        if(mach !=null){
			
	        MachineVirtuelle machineVirtuelle = getMachineVirtuelle(mach);
			sw.setMachineVirtuelle(machineVirtuelle);
				
		}else{
			sw.setMachineVirtuelle(null);
		}
		if(l !=null){
			
	        LicenseLogiciel licenseLogiciel = getLicenseLogiciel(l);
			sw.setLicenseLogiciel(licenseLogiciel);
		
		}else{
			sw.setLicenseLogiciel(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			sw.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			sw.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			sw.setSolutionApplicative(solutionsAppl);
			
		}
		
		if(applicationWeb != null){
					
			Collection<ApplicationWeb> applicationWe = new ArrayList<ApplicationWeb>();
			for (Long aw : applicationWeb) {
				ApplicationWeb appl = getApplicationWeb(aw);
				applicationWe.add(appl);
				appl.setServeurWeb(sw); 
			}
			
			sw.setApplicationWeb(applicationWe);
					
		}
		if(contrats != null){
			
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			sw.setContrats(contrat);
					
		}
		
		em.persist(sw);
		return sw.getId();
	}

	@Override
	public Long ajouterMiddlewareAll(Middleware m,Long serv,Long mach,Long l, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> instancesMiddleware, List<Long> contrats) {
	  if(serv !=null){
			
	        Serveur serveur = getServeur(serv);
			m.setServeur(serveur);
				
		}else{
			m.setServeur(null);
		}
		
        if(mach !=null){
			
	        MachineVirtuelle machineVirtuelle = getMachineVirtuelle(mach);
			m.setMachineVirtuelle(machineVirtuelle);
				
		}else{
			m.setMachineVirtuelle(null);
		}
        if(l !=null){
			
	        LicenseLogiciel licenseLogiciel = getLicenseLogiciel(l);
			m.setLicenseLogiciel(licenseLogiciel);
		
		}else{
					m.setLicenseLogiciel(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			m.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			m.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			m.setSolutionApplicative(solutionsAppl);
			
		}
        if(instancesMiddleware != null){
			
			Collection<InstanceMiddleware> instanceMiddleware = new ArrayList<InstanceMiddleware>();
			for (Long im : instancesMiddleware) {
				InstanceMiddleware inst = getInstanceMiddleware(im);
				instanceMiddleware.add(inst);
				inst.setMiddleware(m); 
			}
			
			m.setInstanceMiddleware(instanceMiddleware);
			
		}
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			m.setContrats(contrat);
					
		}
		
		em.persist(m);
		return m.getId();
	}

	@Override
	public Long ajouterServeurDeBasseDeDonneesAll(ServeurDeBasseDeDonnees sbd,Long serv,Long mach,Long l, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> instancesBD, List<Long> contrats) {
		
	  if(serv !=null){
			
	        Serveur serveur = getServeur(serv);
			sbd.setServeur(serveur);
				
		}else{
			sbd.setServeur(null);
		}
		
        if(mach !=null){
			
	        MachineVirtuelle machineVirtuelle = getMachineVirtuelle(mach);
			sbd.setMachineVirtuelle(machineVirtuelle);
				
		}else{
			sbd.setMachineVirtuelle(null);
		}
        if(l !=null){
			
	        LicenseLogiciel licenseLogiciel = getLicenseLogiciel(l);
			sbd.setLicenseLogiciel(licenseLogiciel);
		
		}else{
			sbd.setLicenseLogiciel(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			sbd.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			sbd.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			sbd.setSolutionApplicative(solutionsAppl);
			
		}
		if(instancesBD != null){
			
			Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes = new ArrayList<InstanceDeBasseDeDonnes>();
			for (Long ibd : instancesBD) {
				InstanceDeBasseDeDonnes inst = getInstanceDeBasseDeDonnes(ibd);
				instanceDeBasseDeDonnes.add(inst);
				inst.setServeurDeBasseDeDonnees(sbd);
			}
			
			sbd.setInstanceDeBasseDeDonnes(instanceDeBasseDeDonnes);
			
		}
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			sbd.setContrats(contrat);
					
		}
		
		em.persist(sbd);
		return sbd.getId();
	}

	@Override
	public Long ajouterApplicationWebAll(ApplicationWeb aw,Long sw, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		    
		    if(sw !=null){
				
		    	ServeurWeb serveurWeb = getServeurWeb(sw);
				aw.setServeurWeb(serveurWeb);
			
			}else{
				aw.setServeurWeb(null);
			}
		    
			if(contacts != null){
				
				Collection<Contact> contact = new ArrayList<Contact>();
				for (Long cc : contacts) {
					Contact con = getContact(cc);
					contact.add(con);
				}
				
				aw.setContacts(contact);
						
			}
			
			if(documents != null){
				
				Collection<Document> document = new ArrayList<Document>();
				for (Long d : documents) {
					Document doc = getDocument(d);
					document.add(doc);
				}
				
				aw.setDocuments(document);
				
			}
			
			if(solutionsApplicatives != null){
				
				Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
				for (Long sa : solutionsApplicatives) {
					SolutionApplicative sol = getSolutionApplicative(sa);
					solutionsAppl.add(sol);
				}
				
				aw.setSolutionApplicative(solutionsAppl);
				
			}
			if(contrats != null){
						
				Collection<Contrat> contrat = new ArrayList<Contrat>();
				for (Long cc : contrats) {
					Contrat con = getContrat(cc);
					contrat.add(con);
				}
				
				aw.setContrats(contrat);
						
			}
			
			em.persist(aw);
		return aw.getId();
	}

	@Override
	public Long ajouterInstanceMiddlewareAll(InstanceMiddleware im,Long m, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		 
		   if(m !=null){
			
			   Middleware middleware = getMiddleware(m);
				im.setMiddleware(middleware);
			
			}else{
				im.setMiddleware(null);
			}
			if(contacts != null){
				
				Collection<Contact> contact = new ArrayList<Contact>();
				for (Long cc : contacts) {
					Contact con = getContact(cc);
					contact.add(con);
				}
				
				im.setContacts(contact);
						
			}
			
			if(documents != null){
				
				Collection<Document> document = new ArrayList<Document>();
				for (Long d : documents) {
					Document doc = getDocument(d);
					document.add(doc);
				}
				
				im.setDocuments(document);
				
			}
			
			if(solutionsApplicatives != null){
				
				Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
				for (Long sa : solutionsApplicatives) {
					SolutionApplicative sol = getSolutionApplicative(sa);
					solutionsAppl.add(sol);
				}
				
				im.setSolutionApplicative(solutionsAppl);
				
			}
			if(contrats != null){
						
				Collection<Contrat> contrat = new ArrayList<Contrat>();
				for (Long cc : contrats) {
					Contrat con = getContrat(cc);
					contrat.add(con);
				}
				
				im.setContrats(contrat);
						
			}
			
			em.persist(im);
		return im.getId();
	}

	@Override
	public Long ajouterInstanceDeBasseDeDonnesAll(InstanceDeBasseDeDonnes ibd,Long sbd, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> contrats) {
		
		    if(sbd !=null){
				
			  ServeurDeBasseDeDonnees serveurDeBasseDeDonnees = getServeurDeBasseDeDonnees(sbd);
				ibd.setServeurDeBasseDeDonnees(serveurDeBasseDeDonnees);
			
			}else{
				ibd.setServeurDeBasseDeDonnees(null);
			}
			
			if(contacts != null){
				
				Collection<Contact> contact = new ArrayList<Contact>();
				for (Long cc : contacts) {
					Contact con = getContact(cc);
					contact.add(con);
				}
				
				ibd.setContacts(contact);
						
			}
			
			if(documents != null){
				
				Collection<Document> document = new ArrayList<Document>();
				for (Long d : documents) {
					Document doc = getDocument(d);
					document.add(doc);
				}
				
				ibd.setDocuments(document);
				
			}
			
			if(solutionsApplicatives != null){
				
				Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
				for (Long sa : solutionsApplicatives) {
					SolutionApplicative sol = getSolutionApplicative(sa);
					solutionsAppl.add(sol);
				}
				
				ibd.setSolutionApplicative(solutionsAppl);
				
			}
			if(contrats != null){
						
				Collection<Contrat> contrat = new ArrayList<Contrat>();
				for (Long cc : contrats) {
					Contrat con = getContrat(cc);
					contrat.add(con);
				}
				
				ibd.setContrats(contrat);
						
			}
			
			em.persist(ibd);
		return null;
	}

	@Override
	public Long addArriveeElectriqueAll(ArriveeElectrique ae, Long lieu,List<Long> pdus, List<Long> contacts, List<Long> documents,
			List<Long> contrats) {
		
	    if(lieu !=null){
			
	        Lieu l = getLieu(lieu);
			ae.setLieu(l);
		
		}else{
			ae.setLieu(null);
		}
	    if(pdus != null){
			
			Collection<PduElectrique> pduElectrique = new ArrayList<PduElectrique>();
			for (Long pdu : pdus) {
				PduElectrique pe = getPduElectrique(pdu);
				pduElectrique.add(pe);
				pe.setArriveeElectrique(ae);
			}
			
			ae.setPduElectrique(pduElectrique);
					
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			ae.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			ae.setDocuments(document);
			
		}
		
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			ae.setContrats(contrat);
					
		}
		
		em.persist(ae);
		
		return ae.getId();
	}

	@Override
	public Long addPduElectriqueAll(PduElectrique pdue, Long lieu,Long rack,Long arrivee, List<Long> contacts, List<Long> documents,
			List<Long> contrats) {
		
		if(lieu !=null){
				
		        Lieu l = getLieu(lieu);
				pdue.setLieu(l);
			
			}else{
				pdue.setLieu(null);
		}
		
		if(rack !=null){
			
	        Rack r = getRack(rack);
			pdue.setRack(r);
		
		}else{
			pdue.setRack(null);
	    }
		
        if(arrivee !=null){
			
        	ArriveeElectrique arriveeElectrique = getArriveeElectrique(arrivee);
			pdue.setArriveeElectrique(arriveeElectrique);
		
		}else{
			pdue.setArriveeElectrique(null);
	    }
        
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			pdue.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			pdue.setDocuments(document);
			
		}
		
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			pdue.setContrats(contrat);
					
		}
		
		em.persist(pdue);
		
		return pdue.getId();
	}

	@Override
	public Long ajouterHyperviseurAll(Hyperviseur h, Long vCluster, Long Serveur, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> volumesLogiques,
			List<Long> machinesVirtuelles, List<Long> contrats) {
		
		    if(vCluster !=null){
				
		    	Vcluster vcluster = getVcluster(vCluster );
				h.setVcluster(vcluster);
			
			}else{
				h.setVcluster(null);
			}
            if(Serveur !=null){
				
            	Serveur serveur = getServeur(Serveur );
				h.setServeur(serveur);
			
			}else{
				h.setServeur(null);
			}
			
			if(contacts != null){
				
				Collection<Contact> contact = new ArrayList<Contact>();
				for (Long cc : contacts) {
					Contact con = getContact(cc);
					contact.add(con);
				}
				
				h.setContacts(contact);
						
			}
			
			if(documents != null){
				
				Collection<Document> document = new ArrayList<Document>();
				for (Long d : documents) {
					Document doc = getDocument(d);
					document.add(doc);
				}
				
				h.setDocuments(document);
				
			}
            if(solutionsApplicatives != null){
				
				Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
				for (Long sa : solutionsApplicatives) {
					SolutionApplicative sol = getSolutionApplicative(sa);
					solutionsAppl.add(sol);
				}
				
				h.setSolutionApplicative(solutionsAppl);
				
			}
            
           if(volumesLogiques!=null){
				
				Collection<VolumeLogique> volumeslogique = new ArrayList<VolumeLogique>();
				for (Long vl : volumesLogiques) {
					VolumeLogique vol = getVolumeLogique(vl);
					volumeslogique.add(vol);
				}
				
				h.setVolumelogique(volumeslogique);
			}
           
           if(machinesVirtuelles!=null){
				
				Collection<MachineVirtuelle> machineVirtuelle = new ArrayList<MachineVirtuelle>();
				for (Long mv : machinesVirtuelles) {
					MachineVirtuelle mach = getMachineVirtuelle(mv);
					machineVirtuelle.add(mach);
					mach.setVirtualisation(h);
				}
				
				h.setMachineVirtuelle(machineVirtuelle);
			}
			
			if(contrats != null){
						
				Collection<Contrat> contrat = new ArrayList<Contrat>();
				for (Long cc : contrats) {
					Contrat con = getContrat(cc);
					contrat.add(con);
				}
				
				h.setContrats(contrat);
						
			}
			
			em.persist(h);
		return h.getId();
	}

	@Override
	public Long ajouterVclusterAll(Vcluster v, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> volumesLogiques, List<Long> machinesVirtuelles,
			List<Long> hyperviseurs, List<Long> contrats) {
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			v.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			v.setDocuments(document);
			
		}
        if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			v.setSolutionApplicative(solutionsAppl);
			
		}
        
       if(volumesLogiques!=null){
			
			Collection<VolumeLogique> volumeslogique = new ArrayList<VolumeLogique>();
			for (Long vl : volumesLogiques) {
				VolumeLogique vol = getVolumeLogique(vl);
				volumeslogique.add(vol);
			}
			
			v.setVolumelogique(volumeslogique);
		}
       
       if(machinesVirtuelles!=null){
			
			Collection<MachineVirtuelle> machineVirtuelle = new ArrayList<MachineVirtuelle>();
			for (Long mv : machinesVirtuelles) {
				MachineVirtuelle mach = getMachineVirtuelle(mv);
				machineVirtuelle.add(mach);
				mach.setVirtualisation(v);
			}
			
			v.setMachineVirtuelle(machineVirtuelle);
		}
       
       if(hyperviseurs != null){
			
			Collection<Hyperviseur> hyperviseur = new ArrayList<Hyperviseur>();
			for (Long h : hyperviseurs) {
				Hyperviseur hyp = getHyperviseur(h);
				hyperviseur.add(hyp);
				hyp.setVcluster(v);
			}
			
			v.setHyperviseur(hyperviseur);
					
		}
		
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			v.setContrats(contrat);
					
		}
		
		em.persist(v);
		return v.getId();
	}

	@Override
	public Long addServeurAll(Serveur Serveur, Long lieu, Long rack, Long chassis, Long licenseos,
			List<Long> sourceelec, List<Long> Logiciel, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> San, List<Long> volumesLogique, List<Long> document,
			List<Long> contact, List<Long> contrat) {

		
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			Serveur.setLieu(lie);
		} else {
			Serveur.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			Serveur.setRack(rac);
		}else {
			Serveur.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			Serveur.setChassis(chas);
		}else {
			Serveur.setChassis(null);
		}
		if(licenseos != null){
			LicenseOs los = getLicenseOs(licenseos);
			Serveur.setLicenseOs(los);
		} else {
			Serveur.setLicenseOs(null);
		}
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			Serveur.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			Serveur.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			Serveur.setContrat(contr);
		}
		if(Logiciel != null){
			Collection<LogicielEtApplication> la = new ArrayList<LogicielEtApplication>();
			for (Long l : Logiciel) {
				LogicielEtApplication log = getLogicielEtApplication(l);
				la.add(log);
			}
			Serveur.setLogicielEtApplication(la);
		}
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			Serveur.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(Serveur);
			}
			Serveur.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			Serveur.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			Serveur.setSolutionApplicative(solapp);
		}
		
		if(San != null){
			Collection<SwitchSan> switchsan = new ArrayList<SwitchSan>();
			for (Long s : San) {
				switchsan.add(getSwitchSan(s));
				
			}
			Serveur.setSwitchSan(switchsan);
		}
		
		if(volumesLogique != null){
			Collection<VolumeLogique> volumelog = new ArrayList<VolumeLogique>();
			for (Long vl : volumesLogique) {
				volumelog.add(getVolumeLogique(vl));
			}
			Serveur.setVolumelogique(volumelog);
		}
		
		

		em.persist(Serveur);
		return Serveur.getId();
	}
	
	@Override
	public Long editServeurAll(Serveur Serveur, Long lieu, Long rack, Long chassis, Long licenseos,
		List<Long> sourceelec, List<Long> Logiciel, List<Long> SolutionApplicative, List<Long> interfacereseau,
		List<Long> equipementreseaux, List<Long> San, List<Long> volumesLogique, List<Long> document,
		List<Long> contact, List<Long> contrat) {
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			Serveur.setLieu(lie);
		} else {
			Serveur.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			Serveur.setRack(rac);
		}else {
			Serveur.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			Serveur.setChassis(chas);
		}else {
			Serveur.setChassis(null);
		}
		if(licenseos != null){
			LicenseOs los = getLicenseOs(licenseos);
			Serveur.setLicenseOs(los);
		} else {
			Serveur.setLicenseOs(null);
		}
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			Serveur.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			Serveur.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			Serveur.setContrat(contr);
		}
		if(Logiciel != null){
			Collection<LogicielEtApplication> la = new ArrayList<LogicielEtApplication>();
			for (Long l : Logiciel) {
				LogicielEtApplication log = getLogicielEtApplication(l);
				la.add(log);
			}
			Serveur.setLogicielEtApplication(la);
		}
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			Serveur.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(Serveur);
			}
			Serveur.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			Serveur.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			Serveur.setSolutionApplicative(solapp);
		}
		
		if(San != null){
			Collection<SwitchSan> switchsan = new ArrayList<SwitchSan>();
			for (Long s : San) {
				switchsan.add(getSwitchSan(s));
			}
			Serveur.setSwitchSan(switchsan);
		}
		
		if(volumesLogique != null){
			Collection<VolumeLogique> volumelog = new ArrayList<VolumeLogique>();
			for (Long vl : volumesLogique) {
				volumelog.add(getVolumeLogique(vl));
			}
			Serveur.setVolumelogique(volumelog);
		}

		em.merge(Serveur);
		return Serveur.getId();
	}

	public Long ajouterLicenseLogicielAll(LicenseLogiciel ll,Long logiciel, List<Long> documents) {
		
		if(logiciel !=null){
			
			LogicielEtApplication logicielEtApplications = getLogicielEtApplication(logiciel);
			ll.setLogicielEtApplications(logicielEtApplications);
		
		}else{
			ll.setLogicielEtApplications(null);
		}
		
       if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			ll.setDocuments(document);
			
		}
        em.persist(ll); 
		return ll.getId();
	}

	@Override
	public Long ajouterLicenseOsAll(LicenseOs lo, Long versionOs, List<Long> documents, List<Long> serveurs,
			List<Long> machineVirtuelle) {
       if(versionOs !=null){
			
    	   VersionOs vo = getVersionOs(versionOs);
			lo.setVersionOs(vo);
		
		}else{
			lo.setVersionOs(null);
		}
		
       if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			lo.setDocuments(document);
			
		}
       if(serveurs != null){
			
			Collection<Serveur> serveur = new ArrayList<Serveur>();
			for (Long s : serveurs) {
				Serveur serv = getServeur(s);
				serveur.add(serv);
				serv.setLicenseOs(lo);
			}
			
			lo.setServeur(serveur);;
			
		}
       if(machineVirtuelle != null){
			
			Collection<MachineVirtuelle> mach = new ArrayList<MachineVirtuelle>();
			for (Long mv : machineVirtuelle) {
				MachineVirtuelle machV = getMachineVirtuelle(mv);
				mach.add(machV);
				machV.setLicenseOs(lo); 
			}
			
			lo.setMachineVirtuelle(mach);;
			
		}
        em.persist(lo);
		return lo.getId();
	}

	@Override
	public Long ajouterMachineVirtuelleAll(MachineVirtuelle mv, Long virtualisation, Long license, List<Long> logiciels,
			List<Long> contacts, List<Long> documents, List<Long> solutionsApplicatives, List<Long> interfacesReseaux,
			List<Long> volumesLogiques, List<Long> contrats) {
		
		if(virtualisation !=null){
			
			Virtualisation virt = getVirtualisation(virtualisation);
			mv.setVirtualisation(virt);
		
		}else{
			mv.setVirtualisation(null);
		}
        if(license !=null){
			
        	LicenseOs licenseOs = getLicenseOs(license);
			mv.setLicenseOs(licenseOs);
		
		}else{
			mv.setLicenseOs(null);
		}
        if(logiciels != null){
			
			Collection<LogicielEtApplication> logiciel = new ArrayList<LogicielEtApplication>();
			for (Long l : logiciels) {
				LogicielEtApplication logicielEtApplication = getLogicielEtApplication(l);
				logiciel.add(logicielEtApplication);
				logicielEtApplication.setMachineVirtuelle(mv);
			}
			
			mv.setLogicielEtApplication(logiciel);
					
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			mv.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			mv.setDocuments(document);
			
		}
        if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			mv.setSolutionApplicative(solutionsAppl);
			
		}
       if(interfacesReseaux!=null){
			
			Collection<IntefaceReseau> logique = new ArrayList<IntefaceReseau>();
			for (Long ir : interfacesReseaux) {
				IntefaceReseau log = getInterfaceReseau(ir);
				logique.add(log);
				log.setMachineVirtuelle(mv);
			}
			
			    mv.setIntefaceReseau(logique);
		}
        
       if(volumesLogiques!=null){
			
			Collection<VolumeLogique> volumeslogique = new ArrayList<VolumeLogique>();
			for (Long vl : volumesLogiques) {
				VolumeLogique vol = getVolumeLogique(vl);
				volumeslogique.add(vol);
			}
			
			mv.setVolumelogique(volumeslogique);
		}
       
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			mv.setContrats(contrat);
					
		}
		
		em.persist(mv);
		return mv.getId();
	}

	@Override
	public Long addProcessusMetierAll(ProcessusMetier pm, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives) {
		
			if(contacts != null){
				
				Collection<Contact> contact = new ArrayList<Contact>();
				for (Long cc : contacts) {
					Contact con = getContact(cc);
					contact.add(con);
				}
				
				pm.setContacts(contact);
						
			}
			
			if(documents != null){
				
				Collection<Document> document = new ArrayList<Document>();
				for (Long d : documents) {
					Document doc = getDocument(d);
					document.add(doc);
				}
				
				pm.setDocuments(document);
				
			}
	        if(solutionsApplicatives != null){
				
				Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
				for (Long sa : solutionsApplicatives) {
					SolutionApplicative sol = getSolutionApplicative(sa);
					solutionsAppl.add(sol);
				}
				
				pm.setSolutionApplicative(solutionsAppl);
				
			}
		em.persist(pm);
		return pm.getId();
	}
	
	
	@Override
	public Long addSolutionApplicativeAll(SolutionApplicative sa, List<Long> contacts, List<Long> documents
			, List<Long> processusMetiers, List<Long> contrats) {
	
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			sa.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			sa.setDocuments(document);
			
		}
       
       if(processusMetiers!=null){
			
			Collection<ProcessusMetier> processusMetier = new ArrayList<ProcessusMetier>();
			for (Long pm : processusMetiers) {
				ProcessusMetier pro = getProcessusMetier(pm);
				processusMetier.add(pro);
				
			}
			
			    sa.setProcessusMetier(processusMetier);
		}
      
       
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			sa.setContrats(contrat);
					
		}
		em.persist(sa); 
		return sa.getId();
	}


	@Override
	public Long addEquipementReseauAll(EquipementReseau er, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> document, List<Long> contact,
			List<Long> contrat) {



		if(lieu != null){
			Lieu lie = getLieu(lieu);
			er.setLieu(lie);
		} else {
			er.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			er.setRack(rac);
		}else {
			er.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			er.setChassis(chas);
		}else {
			er.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			er.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			er.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			er.setContrat(contr);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setEquipementReseau(er);
			}
			er.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			er.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			er.setSolutionApplicative(solapp);
		}
		
		

		em.persist(er);
		return er.getId();
	}
	
	@Override
	public Long editEquipementReseauAll(EquipementReseau er, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> document, List<Long> contact,
			List<Long> contrat) {



		if(lieu != null){
			Lieu lie = getLieu(lieu);
			er.setLieu(lie);
		} else {
			er.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			er.setRack(rac);
		}else {
			er.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			er.setChassis(chas);
		}else {
			er.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			er.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			er.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			er.setContrat(contr);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setEquipementReseau(er);
			}
			er.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			er.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			er.setSolutionApplicative(solapp);
		}
		
		

		em.merge(er);
		return er.getId();
	}
	
	@Override
	public Long addSystemeDeStockageAll(SystemeDeStockage sds, Long lieu, Long rack, Long chassis,
			List<Long> sourceelec, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> San, List<Long> volumesLogique, List<Long> document,
			List<Long> contact, List<Long> contrat) {

		if(lieu != null){
			Lieu lie = getLieu(lieu);
			sds.setLieu(lie);
		} else {
			sds.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			sds.setRack(rac);
		}else {
			sds.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			sds.setChassis(chas);
		}else {
			sds.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			sds.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			sds.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			sds.setContrat(contr);
		}
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			sds.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(sds);
			}
			sds.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			sds.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			sds.setSolutionApplicative(solapp);
		}
		
		if(San != null){
			Collection<SwitchSan> switchsan = new ArrayList<SwitchSan>();
			for (Long s : San) {
				switchsan.add(getSwitchSan(s));
			}
			sds.setSwitchSann(switchsan);
		}
		
		if(volumesLogique != null){
			Collection<VolumeLogique> volumelog = new ArrayList<VolumeLogique>();
			for (Long vl : volumesLogique) {
				volumelog.add(getVolumeLogique(vl));
			}
			sds.setVolumelogique(volumelog);
		}

		em.persist(sds);
		return sds.getId();
	}
	
	@Override
	public Long editSystemeDeStockageAll(SystemeDeStockage sds, Long lieu, Long rack, Long chassis,
			List<Long> sourceelec, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> San, List<Long> volumesLogique, List<Long> document,
			List<Long> contact, List<Long> contrat) {

		if(lieu != null){
			Lieu lie = getLieu(lieu);
			sds.setLieu(lie);
		} else {
			sds.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			sds.setRack(rac);
		}else {
			sds.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			sds.setChassis(chas);
		}else {
			sds.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			sds.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			sds.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			sds.setContrat(contr);
		}
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			sds.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(sds);
			}
			sds.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			sds.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			sds.setSolutionApplicative(solapp);
		}
		
		if(San != null){
			Collection<SwitchSan> switchsan = new ArrayList<SwitchSan>();
			for (Long s : San) {
				switchsan.add(getSwitchSan(s));
			}
			sds.setSwitchSann(switchsan);
		}
		
		if(volumesLogique != null){
			Collection<VolumeLogique> volumelog = new ArrayList<VolumeLogique>();
			for (Long vl : volumesLogique) {
				volumelog.add(getVolumeLogique(vl));
			}
			sds.setVolumelogique(volumelog);
		}

		em.merge(sds);
		return sds.getId();
	}
	
	@Override
	public Long editSwitchSanAll(SwitchSan san, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> equipementreseaux,
			List<Long> document, List<Long> contact, List<Long> contrat) {



		if(lieu != null){
			Lieu lie = getLieu(lieu);
			san.setLieu(lie);
		} else {
			san.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			san.setRack(rac);
		}else {
			san.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			san.setChassis(chas);
		}else {
			san.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			san.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			san.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			san.setContrat(contr);
		}
		
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			san.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(san);
			}
			san.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			san.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			san.setSolutionApplicative(solapp);
		}
		
		em.merge(san);
		return san.getId();
	}
	
	
	@Override
	public Long addSwitchSanAll(SwitchSan san, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> equipementreseaux,
			List<Long> document, List<Long> contact, List<Long> contrat) {



		if(lieu != null){
			Lieu lie = getLieu(lieu);
			san.setLieu(lie);
		} else {
			san.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			san.setRack(rac);
		}else {
			san.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			san.setChassis(chas);
		}else {
			san.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			san.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			san.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			san.setContrat(contr);
		}
		
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			san.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(san);
			}
			san.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			san.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			san.setSolutionApplicative(solapp);
		}
		
		em.merge(san);
		return san.getId();
	}
	
	@Override
	public Long addPhysiqueAll(Physique Physique, List<Long> vlans) {
		
		if(vlans != null){
			Collection<Vlan> vlan = new ArrayList<Vlan>();
			for (Long v : vlans) {
				vlan.add(getVlan(v));
			}
			Physique.setVlan(vlan);
		}
		
		em.persist(Physique);
		return Physique.getId();
	}
	
	@Override
	public Long editPhysiqueAll(Physique Physique, List<Long> vlans) {
		
		if(vlans != null){
			Collection<Vlan> vlan = new ArrayList<Vlan>();
			for (Long v : vlans) {
				vlan.add(getVlan(v));
			}
			Physique.setVlan(vlan);
		}
		
		em.merge(Physique);
		return Physique.getId();
	}
	
	@Override
	public Long addSubnetAll(Subnet Subnet, List<Long> vlans) {

		if(vlans != null){
			Collection<Vlan> vlan = new ArrayList<Vlan>();
			for (Long v : vlans) {
				vlan.add(getVlan(v));
			}
			Subnet.setVlan(vlan);
		}
		
		em.persist(Subnet);
		return Subnet.getId();
	}
	
	@Override
	public Long editSubnetAll(Subnet Subnet, List<Long> vlans) {

		if(vlans != null){
			Collection<Vlan> vlan = new ArrayList<Vlan>();
			for (Long v : vlans) {
				vlan.add(getVlan(v));
			}
			Subnet.setVlan(vlan);
		}
		
		em.merge(Subnet);
		return Subnet.getId();
	}
	
	
	@Override
	public Long addCameraAll(Camera Cam, Long lieu, Long dvr, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			Cam.setLieu(lie);
		} else {
			Cam.setLieu(null);
		}
		if(dvr != null){
			Dvr dvrc = getDvr(dvr);
			Cam.setDvr(dvrc);
		} else {
			Cam.setDvr(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			Cam.setDocuments(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			Cam.setContacts(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			Cam.setContrats(contr);
		}
		
		em.persist(Cam);
		return Cam.getId();
	}
	
	@Override
	public Long editCameraAll(Camera Cam, Long lieu, Long dvr, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			Cam.setLieu(lie);
		} else {
			Cam.setLieu(null);
		}
		if(dvr != null){
			Dvr dvrc = getDvr(dvr);
			Cam.setDvr(dvrc);
		} else {
			Cam.setDvr(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			Cam.setDocuments(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			Cam.setContacts(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			Cam.setContrats(contr);
		}
		
		em.merge(Cam);
		return Cam.getId();
	}
	
	@Override
	public Long addVlanAll(Vlan Vlan, List<Long> subnets, List<Long> intefaceReseau) {
		
		if(subnets != null){
			Collection<Subnet> subnet = new ArrayList<Subnet>();
			for (Long s : subnets) {
				subnet.add(getSubnet(s));
			}
			Vlan.setSubnet(subnet);
		}
		
		if(intefaceReseau != null){
			Collection<Physique> ph = new ArrayList<Physique>();
			for (Long i : intefaceReseau) {
				ph.add(getPhysique(i));
			}
			Vlan.setPhysique(ph);
		}
		
		em.persist(Vlan);
		return Vlan.getId();
	}
	
	@Override
	public Long editVlanAll(Vlan Vlan, List<Long> subnets, List<Long> intefaceReseau) {
		
		if(subnets != null){
			Collection<Subnet> subnet = new ArrayList<Subnet>();
			for (Long s : subnets) {
				subnet.add(getSubnet(s));
			}
			Vlan.setSubnet(subnet);
		}
		
		if(intefaceReseau != null){
			Collection<Physique> ph = new ArrayList<Physique>();
			for (Long i : intefaceReseau) {
				ph.add(getPhysique(i));
			}
			Vlan.setPhysique(ph);
		}
		
		em.merge(Vlan);
		return Vlan.getId();
	}
	
	@Override
	public Long addVolumeLogiqueAll(VolumeLogique vl, List<Long> serveurs, List<Long> machinevertuelle) {


		if(serveurs != null){
			Collection<Serveur> serveur = new ArrayList<Serveur>();
			for (Long s : serveurs) {
				serveur.add(getServeur(s));
			}
			vl.setServeur(serveur);
		}
		
		if(machinevertuelle != null){
			Collection<MachineVirtuelle> mv = new ArrayList<MachineVirtuelle>();
			for (Long m : machinevertuelle) {
				mv.add(getMachineVirtuelle(m));
			}
			vl.setMachinevertuelle(mv);
		}
		
		em.persist(vl);
		return vl.getId();
	}
	
	@Override
	public Long editVolumeLogiqueAll(VolumeLogique vl, List<Long> serveurs, List<Long> machinevertuelle) {


		if(serveurs != null){
			Collection<Serveur> serveur = new ArrayList<Serveur>();
			for (Long s : serveurs) {
				serveur.add(getServeur(s));
			}
			vl.setServeur(serveur);
		}
		
		if(machinevertuelle != null){
			Collection<MachineVirtuelle> mv = new ArrayList<MachineVirtuelle>();
			for (Long m : machinevertuelle) {
				mv.add(getMachineVirtuelle(m));
			}
			vl.setMachinevertuelle(mv);
		}
		
		em.merge(vl);
		return vl.getId();
	}
	
	@Override
	public Long addDvrAll(Dvr dvr, Long lieu, Long rack, Long chassis, List<Long> sourceelec, List<Long> cameras,
			List<Long> interfacereseau, List<Long> equipementreseaux, List<Long> document, List<Long> contact,
			List<Long> contrat) {

		if(lieu != null){
			Lieu lie = getLieu(lieu);
			dvr.setLieu(lie);
		} else {
			dvr.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			dvr.setRack(rac);
		}else {
			dvr.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			dvr.setChassis(chas);
		}else {
			dvr.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			dvr.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			dvr.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			dvr.setContrat(contr);
		}
		
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			dvr.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(dvr);
			}
			dvr.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			dvr.setConnexionElectrique(elec);
		}
		
		if(cameras != null){
			Collection<Camera> cam = new ArrayList<Camera>();
			for (Long c : cameras) {
				Camera ca = getCamera(c);
				cam.add(ca);
				ca.setDvr(dvr);
			}
			dvr.setCamera(cam);
		}
		
		em.persist(dvr);
		return dvr.getId();
	}
	
	
	@Override
	public Long editDvrAll(Dvr dvr, Long lieu, Long rack, Long chassis, List<Long> sourceelec, List<Long> cameras,
			List<Long> interfacereseau, List<Long> equipementreseaux, List<Long> document, List<Long> contact,
			List<Long> contrat) {

		if(lieu != null){
			Lieu lie = getLieu(lieu);
			dvr.setLieu(lie);
		} else {
			dvr.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			dvr.setRack(rac);
		}else {
			dvr.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			dvr.setChassis(chas);
		}else {
			dvr.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			dvr.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			dvr.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			dvr.setContrat(contr);
		}
		
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			dvr.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(dvr);
			}
			dvr.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			dvr.setConnexionElectrique(elec);
		}
		
		if(cameras != null){
			Collection<Camera> cam = new ArrayList<Camera>();
			for (Long c : cameras) {
				Camera ca = getCamera(c);
				cam.add(ca);
				ca.setDvr(dvr);
			}
			dvr.setCamera(cam);
		}
		
		em.merge(dvr);
		return dvr.getId();
	}

	public void editPCAll(Ordinateur pc, Long user,Long lieu, Long licenseos, List<Long> logicielEtApplication, List<Long> equipementReseau, 
			List<Long> intefaceReseau, List<Long> peripherique, List<Long> document, List<Long> contact, List<Long> contrat) {
		
		if(user != null){
			User u = getUser(user);
			pc.setUser(u);
		}else {
			pc.setUser(null);
		}
		if(lieu != null){
			Lieu lie = getLieu(lieu);
			pc.setLieu(lie);
		} else {
			pc.setLieu(null);
		}
		if(licenseos != null){
			LicenseOs los = getLicenseOs(licenseos);
			pc.setLicenseOs(los);
		} else {
			pc.setLicenseOs(null);
		}
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			pc.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			pc.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			pc.setContrat(contr);
		}
		if(logicielEtApplication != null){
			Collection<LogicielEtApplication> la = new ArrayList<LogicielEtApplication>();
			for (Long l : logicielEtApplication) {
				LogicielEtApplication log = getLogicielEtApplication(l);
				la.add(log);
			}
			pc.setLogicielEtApplication(la);
		}
		
		if(equipementReseau != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementReseau) {
				er.add(getEquipementReseau(e));
			}
			pc.setEquipementReseau(er);
		}
		
		if(intefaceReseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : intefaceReseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setOrdinateur(pc);
			}
			pc.setIntefaceReseau(ir);
		}
		if(peripherique != null){
			Collection<Peripherique> per = new ArrayList<Peripherique>();
			for (Long p : peripherique) {
				Peripherique periph = getPeriph(p);
				per.add(periph);
				periph.setOrdinateur(pc);
			}
			pc.setPeripherique(per);
		}

		em.merge(pc);
	}

	@Override
	public List<Imprimante> SearchImp(String s) {
		Query req = em.createQuery("select imp from Imprimante imp where imp.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}
	
	@Override
	public List<Imprimante> SearchImpUser(String s,Long user) {
		Query req = em.createQuery("select imp from Imprimante imp join imp.user u where imp.nom LIKE :searchKeyword and u.id = :userid");
		req.setParameter("searchKeyword", "%"+s+"%");
		req.setParameter("userid", user);
		return req.getResultList();
	}

	@Override
	public List<TelephneMobile> SearchTeleMobile(String s) {
		Query req = em.createQuery("select t from TelephneMobile t where t.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}
	
	@Override
	public List<TelephneMobile> SearchTeleMobileUser(String s,Long user) {
		Query req = em.createQuery("select t from TelephneMobile t join t.user u where t.nom LIKE :searchKeyword and u.id = :userid");
		req.setParameter("searchKeyword", "%"+s+"%");
		req.setParameter("userid", user);
		return req.getResultList();
	}
	
	@Override
	public List<Sim> SearchSIM(String s) {
		Query req = em.createQuery("select sim from Sim sim where sim.numero LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}
	
	@Override
	public List<Sim> SearchSIMUser(String s,Long user) {
		Query req = em.createQuery("select sim from Sim sim join sim.user u where sim.nom LIKE :searchKeyword and u.id = :userid");
		req.setParameter("searchKeyword", "%"+s+"%");
		req.setParameter("userid", user);
		return req.getResultList();
	}

	@Override
	public List<Tablette> SearchTablette(String s) {
		Query req = em.createQuery("select t from Tablette t where t.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}
	
	@Override
	public List<Tablette> SearchTabletteUser(String s,Long user) {
		Query req = em.createQuery("select t from Tablette t join t.user u where t.nom LIKE :searchKeyword and u.id = :userid");
		req.setParameter("searchKeyword", "%"+s+"%");
		req.setParameter("userid", user);
		return req.getResultList();
	}

	@Override
	public List<TelephoneFixe> SearchTeleFixe(String s) {
		Query req = em.createQuery("select t from TelephoneFixe t where t.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}
	
	@Override
	public List<TelephoneFixe> SearchTeleFixeUser(String s,Long user) {
		Query req = em.createQuery("select t from TelephoneFixe t join t.user u where t.nom LIKE :searchKeyword and u.id = :userid");
		req.setParameter("searchKeyword", "%"+s+"%");
		req.setParameter("userid", user);
		return req.getResultList();
	}

	@Override
	public List<Peripherique> SearchPeriph(String s) {
		Query req = em.createQuery("select p from Peripherique p where p.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<Vlan> SearchVlan(String s) {
		Query req = em.createQuery("select v from Vlan v where v.vlantag LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<Subnet> SearchSubnet(String s) {
		Query req = em.createQuery("select s from Subnet s where s.nomDeSubnnet LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<Camera> SearchCamera(String s) {
		Query req = em.createQuery("select c from Camera c where c.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<VolumeLogique> SearchVolumeLogique(String s) {
		Query req = em.createQuery("select v from VolumeLogique v where v.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<Dvr> SearchDvr(String s) {
		Query req = em.createQuery("select d from Dvr d where d.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<Rack> SearchRack(String s) {
		Query req = em.createQuery("select r from Rack r where r.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<Chassis> SearchChassis(String s) {
		Query req = em.createQuery("select c from Chassis c where c.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<Bandotheque> SearchBandotheque(String s) {
		Query req = em.createQuery("select b from Bandotheque b where b.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<Serveur> SearchServeur(String s) {
		Query req = em.createQuery("select s from Serveur s where s.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<SystemeDeStockage> SearchSystemeDeStockage(String s) {
		Query req = em.createQuery("select s from SystemeDeStockage s where s.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<SwitchSan> SearchSwitchSan(String s) {
		Query req = em.createQuery("select s from SwitchSan s where s.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<Nas> SearchNas(String s) {
		Query req = em.createQuery("select n from Nas n where n.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<EquipementReseau> SearchEquipementReseau(String s) {
		Query req = em.createQuery("select e from EquipementReseau e where e.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}

	@Override
	public List<IntefaceReseau> SearchInterfaceReseau(String s) {
		Query req = em.createQuery("select i from IntefaceReseau i where i.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+s+"%");
		return req.getResultList();
	}
	
	@Override
	public Long addNasAll(Nas Nas, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SystemedeFichierNAS, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> document, List<Long> contact, List<Long> contrat) {

		if(lieu != null){
			Lieu lie = getLieu(lieu);
			Nas.setLieu(lie);
		} else {
			Nas.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			Nas.setRack(rac);
		}else {
			Nas.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			Nas.setChassis(chas);
		}else {
			Nas.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			Nas.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			Nas.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			Nas.setContrat(contr);
		}
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			Nas.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(Nas);
			}
			Nas.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			Nas.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			Nas.setSolutionApplicative(solapp);
		}
		
		if(SystemedeFichierNAS != null){
			Collection<SystemeDeFicherNas> fichiernas = new ArrayList<SystemeDeFicherNas>();
			for (Long s : SystemedeFichierNAS) {
				SystemeDeFicherNas sysfichiernas = getSystemeDeFicherNas(s);
				fichiernas.add(sysfichiernas);
				sysfichiernas.setNas(Nas);
			}
			Nas.setSystemeDeFicherNas(fichiernas);
		}
		
		
		em.persist(Nas);
		return Nas.getId();
	}
	
	@Override
	public Long editNasAll(Nas Nas, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SystemedeFichierNAS, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> document, List<Long> contact, List<Long> contrat) {

		if(lieu != null){
			Lieu lie = getLieu(lieu);
			Nas.setLieu(lie);
		} else {
			Nas.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			Nas.setRack(rac);
		}else {
			Nas.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			Nas.setChassis(chas);
		}else {
			Nas.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			Nas.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			Nas.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			Nas.setContrat(contr);
		}
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			Nas.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(Nas);
			}
			Nas.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			Nas.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			Nas.setSolutionApplicative(solapp);
		}
		
		if(SystemedeFichierNAS != null){
			Collection<SystemeDeFicherNas> fichiernas = new ArrayList<SystemeDeFicherNas>();
			for (Long s : SystemedeFichierNAS) {
				SystemeDeFicherNas sysfichiernas = getSystemeDeFicherNas(s);
				fichiernas.add(sysfichiernas);
				sysfichiernas.setNas(Nas);
			}
			Nas.setSystemeDeFicherNas(fichiernas);
		}
		
		
		em.merge(Nas);
		return Nas.getId();
	}
	
	
	@Override
	public Long addBandothequeAll(Bandotheque Bandotheque, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> Bandes, List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> equipementreseaux,
			List<Long> document, List<Long> contact, List<Long> contrat) {

		if(lieu != null){
			Lieu lie = getLieu(lieu);
			Bandotheque.setLieu(lie);
		} else {
			Bandotheque.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			Bandotheque.setRack(rac);
		}else {
			Bandotheque.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			Bandotheque.setChassis(chas);
		}else {
			Bandotheque.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			Bandotheque.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			Bandotheque.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			Bandotheque.setContrat(contr);
		}
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			Bandotheque.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(Bandotheque);
			}
			Bandotheque.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			Bandotheque.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			Bandotheque.setSolutionApplicative(solapp);
		}
		
		if(Bandes != null){
			Collection<Bande> bande = new ArrayList<Bande>();
			for (Long b : Bandes) {
				Bande band = getBande(b);
				bande.add(band);
				band.setBandotheque(Bandotheque);
			}
			Bandotheque.setBande(bande);
		}
		
		
		em.persist(Bandotheque);
		return Bandotheque.getId();
	}
	
	@Override
	public Long editBandothequeAll(Bandotheque Bandotheque, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> Bandes, List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> equipementreseaux,
			List<Long> document, List<Long> contact, List<Long> contrat) {

		if(lieu != null){
			Lieu lie = getLieu(lieu);
			Bandotheque.setLieu(lie);
		} else {
			Bandotheque.setLieu(null);
		}
		if(rack != null){
			Rack rac = getRack(rack);
			Bandotheque.setRack(rac);
		}else {
			Bandotheque.setRack(null);
		}
		if(chassis != null){
			Chassis chas = getChassis(chassis);
			Bandotheque.setChassis(chas);
		}else {
			Bandotheque.setChassis(null);
		}
		
		if(document != null){
			Collection<Document> doc = new ArrayList<Document>();
			for (Long d : document) {
				doc.add(getDocument(d));
			}
			Bandotheque.setDocument(doc);
		}
		if(contact != null){
			Collection<Contact> conta = new ArrayList<Contact>();
			for (Long c : contact) {
				conta.add(getContact(c));
			}
			Bandotheque.setContact(conta);
		}
		if(contrat != null){
			Collection<Contrat> contr = new ArrayList<Contrat>();
			for (Long c : contrat) {
				contr.add(getContrat(c));
			}
			Bandotheque.setContrat(contr);
		}
		
		if(equipementreseaux != null){
			Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
			for (Long e : equipementreseaux) {
				er.add(getEquipementReseau(e));
			}
			Bandotheque.setEquipementReseau(er);
		}
		
		if(interfacereseau != null){
			Collection<IntefaceReseau> ir = new ArrayList<IntefaceReseau>();
			for (Long i : interfacereseau) {
				IntefaceReseau inter = getInterfaceReseau(i);
				ir.add(inter);
				inter.setInfrastructure(Bandotheque);
			}
			Bandotheque.setIntefaceReseau(ir);
		}
		if(sourceelec != null){
			Collection<ConnexionElectrique> elec = new ArrayList<ConnexionElectrique>();
			for (Long source : sourceelec) {
				elec.add(getConnexionElectrique(source));
			}
			Bandotheque.setConnexionElectrique(elec);
		}
		
		if(SolutionApplicative != null){
			Collection<SolutionApplicative> solapp = new ArrayList<SolutionApplicative>();
			for (Long sapp : SolutionApplicative) {
				solapp.add(getSolutionApplicative(sapp));
			}
			Bandotheque.setSolutionApplicative(solapp);
		}
		
		if(Bandes != null){
			Collection<Bande> bande = new ArrayList<Bande>();
			for (Long b : Bandes) {
				Bande band = getBande(b);
				bande.add(band);
				band.setBandotheque(Bandotheque);
			}
			Bandotheque.setBande(bande);
		}
		
		
		em.merge(Bandotheque);
		return Bandotheque.getId();
	}


	@Override
	public void modifierAutreLogiciel(AutreLogiciel al, Long serv, Long mach, Long l, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> contrats) {
		
		if(serv !=null){
			
	        Serveur serveur = getServeur(serv);
			al.setServeur(serveur);
				
		}else{
			al.setServeur(null);
		}
		
        if(mach !=null){
			
	        MachineVirtuelle machineVirtuelle = getMachineVirtuelle(mach);
			al.setMachineVirtuelle(machineVirtuelle);
				
		}else{
			al.setMachineVirtuelle(null);
		}
		
		if(l !=null){
					
			        LicenseLogiciel licenseLogiciel = getLicenseLogiciel(l);
					al.setLicenseLogiciel(licenseLogiciel);
				
		}else{
					al.setLicenseLogiciel(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			al.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			al.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			al.setSolutionApplicative(solutionsAppl);
			
		}
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			al.setContrats(contrat);
					
		}
		
		em.merge(al);		
	}

	@Override
	public List<AutreLogiciel> SearchAutreLogiciel(String al) {
		Query req = em.createQuery("select al from AutreLogiciel al where al.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+al+"%");
		return req.getResultList();
	}

	@Override
	public void modifierLogicielPc(LogicielPc lp, Long serv, Long mach, Long l, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> contrats) {
		
		if(serv !=null){
			
	        Serveur serveur = getServeur(serv);
			lp.setServeur(serveur);
				
		}else{
			lp.setServeur(null);
		}
		
        if(mach !=null){
			
	        MachineVirtuelle machineVirtuelle = getMachineVirtuelle(mach);
			lp.setMachineVirtuelle(machineVirtuelle);
				
		}else{
			lp.setMachineVirtuelle(null);
		}
		
		if(l !=null){
			
	        LicenseLogiciel licenseLogiciel = getLicenseLogiciel(l);
			lp.setLicenseLogiciel(licenseLogiciel);
		
		}else{
					lp.setLicenseLogiciel(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			lp.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			lp.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			lp.setSolutionApplicative(solutionsAppl);
			
		}
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			lp.setContrats(contrat);
					
		}
		
		em.merge(lp);
		
	}

	@Override
	public List<LogicielPc> SearchLogicielPc(String lp) {
		Query req = em.createQuery("select lp from LogicielPc lp where lp.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+lp+"%");
		return req.getResultList();
	}

	@Override
	public void modifierServeurWeb(ServeurWeb sw, Long serv, Long mach, Long l, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> applicationWeb, List<Long> contrats) {
		
		if(serv !=null){
			
	        Serveur serveur = getServeur(serv);
			sw.setServeur(serveur);
				
		}else{
			sw.setServeur(null);
		}
		
        if(mach !=null){
			
	        MachineVirtuelle machineVirtuelle = getMachineVirtuelle(mach);
			sw.setMachineVirtuelle(machineVirtuelle);
				
		}else{
			sw.setMachineVirtuelle(null);
		}
		if(l !=null){
			
	        LicenseLogiciel licenseLogiciel = getLicenseLogiciel(l);
			sw.setLicenseLogiciel(licenseLogiciel);
		
		}else{
			sw.setLicenseLogiciel(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			sw.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			sw.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			sw.setSolutionApplicative(solutionsAppl);
			
		}
		
		if(applicationWeb != null){
					
			Collection<ApplicationWeb> applicationWe = new ArrayList<ApplicationWeb>();
			for (Long aw : applicationWeb) {
				ApplicationWeb appl = getApplicationWeb(aw);
				applicationWe.add(appl);
				appl.setServeurWeb(sw); 
			}
			
			sw.setApplicationWeb(applicationWe);
					
		}
		if(contrats != null){
			
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			sw.setContrats(contrat);
					
		}
		
		em.merge(sw);
		
	}

	@Override
	public List<ServeurWeb> SearchServeurWeb(String sw) {
		Query req = em.createQuery("select sw from ServeurWeb sw where sw.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+sw+"%");
		return req.getResultList();
	}

	@Override
	public void modifierMiddleware(Middleware m, Long serv, Long mach, Long l, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> instancesMiddleware,
			List<Long> contrats) {
		
		if(serv !=null){
			
	        Serveur serveur = getServeur(serv);
			m.setServeur(serveur);
				
		}else{
			m.setServeur(null);
		}
		
        if(mach !=null){
			
	        MachineVirtuelle machineVirtuelle = getMachineVirtuelle(mach);
			m.setMachineVirtuelle(machineVirtuelle);
				
		}else{
			m.setMachineVirtuelle(null);
		}
        if(l !=null){
			
	        LicenseLogiciel licenseLogiciel = getLicenseLogiciel(l);
			m.setLicenseLogiciel(licenseLogiciel);
		
		}else{
					m.setLicenseLogiciel(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			m.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			m.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			m.setSolutionApplicative(solutionsAppl);
			
		}
        if(instancesMiddleware != null){
			
			Collection<InstanceMiddleware> instanceMiddleware = new ArrayList<InstanceMiddleware>();
			for (Long im : instancesMiddleware) {
				InstanceMiddleware inst = getInstanceMiddleware(im);
				instanceMiddleware.add(inst);
				inst.setMiddleware(m); 
			}
			
			m.setInstanceMiddleware(instanceMiddleware);
			
		}
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			m.setContrats(contrat);
					
		}
		
		em.merge(m);
		
	}

	@Override
	public List<Middleware> SearchMiddleware(String mi) {
		Query req = em.createQuery("select m from Middleware m where m.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+mi+"%");
		return req.getResultList();
	}

	@Override
	public void modifierServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees sbd, Long serv, Long mach, Long l,
			List<Long> contacts, List<Long> documents, List<Long> solutionsApplicatives, List<Long> instancesBD,
			List<Long> contrats) {
		
		if(serv !=null){
			
	        Serveur serveur = getServeur(serv);
			sbd.setServeur(serveur);
				
		}else{
			sbd.setServeur(null);
		}
		
        if(mach !=null){
			
	        MachineVirtuelle machineVirtuelle = getMachineVirtuelle(mach);
			sbd.setMachineVirtuelle(machineVirtuelle);
				
		}else{
			sbd.setMachineVirtuelle(null);
		}
        if(l !=null){
			
	        LicenseLogiciel licenseLogiciel = getLicenseLogiciel(l);
			sbd.setLicenseLogiciel(licenseLogiciel);
		
		}else{
			sbd.setLicenseLogiciel(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			sbd.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			sbd.setDocuments(document);
			
		}
		
		if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			sbd.setSolutionApplicative(solutionsAppl);
			
		}
		if(instancesBD != null){
			
			Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes = new ArrayList<InstanceDeBasseDeDonnes>();
			for (Long ibd : instancesBD) {
				InstanceDeBasseDeDonnes inst = getInstanceDeBasseDeDonnes(ibd);
				instanceDeBasseDeDonnes.add(inst);
				inst.setServeurDeBasseDeDonnees(sbd);
			}
			
			sbd.setInstanceDeBasseDeDonnes(instanceDeBasseDeDonnes);
			
		}
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			sbd.setContrats(contrat);
					
		}
		
		em.merge(sbd);
		
	}

	@Override
	public List<ServeurDeBasseDeDonnees> SearchServeurDeBasseDeDonnees(String sbd) {
		Query req = em.createQuery("select sbd from ServeurDeBasseDeDonnees sbd where sbd.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+sbd+"%");
		return req.getResultList();
	}

	@Override
	public void modifierContact(Contact c, Long idlieu) {
		
		if(idlieu !=null){
			
			Lieu lieu = getLieu(idlieu);
			c.setLieu(lieu);
		
		}else{
			c.setLieu(null);
		}
		
		
		em.merge(c);
		
	}

	@Override
	public List<Contact> SearchContact(String c) {
		Query req = em.createQuery("select c from Contact c where c.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+c+"%");
		return req.getResultList();
	}

	@Override
	public void modifierContrat(Contrat c, List<Long> contacts, List<Long> documents) {
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			c.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			c.setDocuments(document);
			
		}
		em.merge(c);
		
	}

	@Override
	public List<Contrat> SearchContrat(String c) {
		Query req = em.createQuery("select c from Contrat c where c.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+c+"%");
		return req.getResultList();
	}

	@Override
	public void editProcessusMetier(ProcessusMetier pm, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives) {
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			pm.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			pm.setDocuments(document);
			
		}
        if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			pm.setSolutionApplicative(solutionsAppl);
			
		}
	    em.merge(pm);
		
	}

	@Override
	public List<ProcessusMetier> SearchProcessusMetier(String pm) {
		Query req = em.createQuery("select pm from ProcessusMetier pm where pm.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+pm+"%");
		return req.getResultList();
	}

	@Override
	public void editArriveeElectrique(ArriveeElectrique ae, Long lieu, List<Long> pdus, List<Long> contacts,
			List<Long> documents, List<Long> contrats) {
		
		if(lieu !=null){
			
	        Lieu l = getLieu(lieu);
			ae.setLieu(l);
		
		}else{
			ae.setLieu(null);
		}
	    if(pdus != null){
			
			Collection<PduElectrique> pduElectrique = new ArrayList<PduElectrique>();
			for (Long pdu : pdus) {
				PduElectrique pe = getPduElectrique(pdu);
				pduElectrique.add(pe);
				pe.setArriveeElectrique(ae);
			}
			
			ae.setPduElectrique(pduElectrique);
					
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			ae.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			ae.setDocuments(document);
			
		}
		
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			ae.setContrats(contrat);
					
		}
		
		em.merge(ae);
		
		
	}

	@Override
	public List<ArriveeElectrique> SearchArriveeElectrique(String ae) {
		Query req = em.createQuery("select ae from ArriveeElectrique ae where ae.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+ae+"%");
		return req.getResultList();
	}

	@Override
	public void editPduElectrique(PduElectrique pdue, Long lieu, Long rack, Long arrivee, List<Long> contacts,
			List<Long> documents, List<Long> contrats) {
		
		if(lieu !=null){
			
		    Lieu l = getLieu(lieu);
			pdue.setLieu(l);
		
		}else{
			pdue.setLieu(null);
		}
		
		if(rack !=null){
			
		    Rack r = getRack(rack);
			pdue.setRack(r);
		
		}else{
			pdue.setRack(null);
		}
		
		if(arrivee !=null){
			
			ArriveeElectrique arriveeElectrique = getArriveeElectrique(arrivee);
			pdue.setArriveeElectrique(arriveeElectrique);
		
		}else{
			pdue.setArriveeElectrique(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			pdue.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			pdue.setDocuments(document);
			
		}
		
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			pdue.setContrats(contrat);
					
		}
		
		em.merge(pdue);
			
	}

	@Override
	public List<PduElectrique> SearchPduElectrique(String pdue) {
		Query req = em.createQuery("select pdu from PduElectrique pdu where pdu.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+pdue+"%");
		return req.getResultList();
	}

	@Override
	public void modifierLicenseLogiciel(LicenseLogiciel ll, Long logiciel, List<Long> documents) {
		
		if(logiciel !=null){
			
			LogicielEtApplication logicielEtApplications = getLogicielEtApplication(logiciel);
			ll.setLogicielEtApplications(logicielEtApplications);
		
		}else{
			ll.setLogicielEtApplications(null);
		}
		
       if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			ll.setDocuments(document);
			
		}
        em.merge(ll);
		
	}

	@Override
	public List<LicenseLogiciel> SearchLicenseLogiciel(String ll) {
		Query req = em.createQuery("select ll from LicenseLogiciel ll where ll.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+ll+"%");
		return req.getResultList();
	}

	@Override
	public void modifierLicenseOs(LicenseOs lo, Long versionOs, List<Long> documents, List<Long> serveurs,
			List<Long> machineVirtuelle) {
		
			if(versionOs !=null){
			
	    	   VersionOs vo = getVersionOs(versionOs);
				lo.setVersionOs(vo);
			
			}else{
				lo.setVersionOs(null);
			}
			
	       if(documents != null){
				
				Collection<Document> document = new ArrayList<Document>();
				for (Long d : documents) {
					Document doc = getDocument(d);
					document.add(doc);
				}
				
				lo.setDocuments(document);
				
			}
	       if(serveurs != null){
				
				Collection<Serveur> serveur = new ArrayList<Serveur>();
				for (Long s : serveurs) {
					Serveur serv = getServeur(s);
					serveur.add(serv);
					serv.setLicenseOs(lo);
				}
				
				lo.setServeur(serveur);;
				
			}
	       if(machineVirtuelle != null){
				
				Collection<MachineVirtuelle> mach = new ArrayList<MachineVirtuelle>();
				for (Long mv : machineVirtuelle) {
					MachineVirtuelle machV = getMachineVirtuelle(mv);
					mach.add(machV);
					machV.setLicenseOs(lo); 
				}
				
				lo.setMachineVirtuelle(mach);;
				
			}
	        em.merge(lo); 
		
	}

	@Override
	public List<LicenseOs> SearchLicenseOs(String lo) {
		Query req = em.createQuery("select lo from LicenseOs lo where lo.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+lo+"%");
		return req.getResultList();
	}

	@Override
	public List<VersionOs> SearchVersionOs(String vo) {
		Query req = em.createQuery("select vo from VersionOs vo where vo.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+vo+"%");
		return req.getResultList();
	}

	@Override
	public void modifierMachineVirtuelle(MachineVirtuelle mv, Long virtualisation, Long license, List<Long> logiciels,
			List<Long> contacts, List<Long> documents, List<Long> solutionsApplicatives, List<Long> interfacesReseaux,
			List<Long> volumesLogiques, List<Long> contrats) {
		
		if(virtualisation !=null){
			
			Virtualisation virt = getVirtualisation(virtualisation);
			mv.setVirtualisation(virt);
		
		}else{
			mv.setVirtualisation(null);
		}
        if(license !=null){
			
        	LicenseOs licenseOs = getLicenseOs(license);
			mv.setLicenseOs(licenseOs);
		
		}else{
			mv.setLicenseOs(null);
		}
        if(logiciels != null){
			
			Collection<LogicielEtApplication> logiciel = new ArrayList<LogicielEtApplication>();
			for (Long l : logiciels) {
				LogicielEtApplication logicielEtApplication = getLogicielEtApplication(l);
				logiciel.add(logicielEtApplication);
				logicielEtApplication.setMachineVirtuelle(mv);
			}
			
			mv.setLogicielEtApplication(logiciel);
					
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			mv.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			mv.setDocuments(document);
			
		}
        if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			mv.setSolutionApplicative(solutionsAppl);
			
		}
       if(interfacesReseaux!=null){
			
			Collection<IntefaceReseau> logique = new ArrayList<IntefaceReseau>();
			for (Long ir : interfacesReseaux) {
				IntefaceReseau log = getInterfaceReseau(ir);
				logique.add(log);
				log.setMachineVirtuelle(mv);
			}
			
			    mv.setIntefaceReseau(logique);
		}
        
       if(volumesLogiques!=null){
			
			Collection<VolumeLogique> volumeslogique = new ArrayList<VolumeLogique>();
			for (Long vl : volumesLogiques) {
				VolumeLogique vol = getVolumeLogique(vl);
				volumeslogique.add(vol);
			}
			
			mv.setVolumelogique(volumeslogique);
		}
       
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			mv.setContrats(contrat);
					
		}
		
		em.merge(mv);
		
	}

	@Override
	public List<MachineVirtuelle> SearchMachineVirtuelle(String mv) {
		Query req = em.createQuery("select mv from MachineVirtuelle mv where mv.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+mv+"%");
		return req.getResultList();
	}

	@Override
	public void modifierVcluster(Vcluster v, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> volumesLogiques, List<Long> machinesVirtuelles,
			List<Long> hyperviseurs, List<Long> contrats) {
		
        if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			v.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			v.setDocuments(document);
			
		}
        if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			v.setSolutionApplicative(solutionsAppl);
			
		}
        
       if(volumesLogiques!=null){
			
			Collection<VolumeLogique> volumeslogique = new ArrayList<VolumeLogique>();
			for (Long vl : volumesLogiques) {
				VolumeLogique vol = getVolumeLogique(vl);
				volumeslogique.add(vol);
			}
			
			v.setVolumelogique(volumeslogique);
		}
       
       if(machinesVirtuelles!=null){
			
			Collection<MachineVirtuelle> machineVirtuelle = new ArrayList<MachineVirtuelle>();
			for (Long mv : machinesVirtuelles) {
				MachineVirtuelle mach = getMachineVirtuelle(mv);
				machineVirtuelle.add(mach);
				mach.setVirtualisation(v);
			}
			
			v.setMachineVirtuelle(machineVirtuelle);
		}
       
       if(hyperviseurs != null){
			
			Collection<Hyperviseur> hyperviseur = new ArrayList<Hyperviseur>();
			for (Long h : hyperviseurs) {
				Hyperviseur hyp = getHyperviseur(h);
				hyperviseur.add(hyp);
				hyp.setVcluster(v);
			}
			
			v.setHyperviseur(hyperviseur);
					
		}
		
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			v.setContrats(contrat);
					
		}
		
		em.merge(v);
		
	}

	@Override
	public List<Vcluster> SearchVcluster(String v) {
		Query req = em.createQuery("select v from Vcluster v where v.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+v+"%");
		return req.getResultList();
	}

	@Override
	public void modifierHyperviseur(Hyperviseur h, Long vCluster, Long Serveur, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> volumesLogiques,
			List<Long> machinesVirtuelles, List<Long> contrats) {
		
		if(vCluster !=null){
			
	    	Vcluster vcluster = getVcluster(vCluster );
			h.setVcluster(vcluster);
		
		}else{
			h.setVcluster(null);
		}
        if(Serveur !=null){
			
        	Serveur serveur = getServeur(Serveur );
			h.setServeur(serveur);
		
		}else{
			h.setServeur(null);
		}
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			h.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			h.setDocuments(document);
			
		}
        if(solutionsApplicatives != null){
			
			Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
			for (Long sa : solutionsApplicatives) {
				SolutionApplicative sol = getSolutionApplicative(sa);
				solutionsAppl.add(sol);
			}
			
			h.setSolutionApplicative(solutionsAppl);
			
		}
        
       if(volumesLogiques!=null){
			
			Collection<VolumeLogique> volumeslogique = new ArrayList<VolumeLogique>();
			for (Long vl : volumesLogiques) {
				VolumeLogique vol = getVolumeLogique(vl);
				volumeslogique.add(vol);
			}
			
			h.setVolumelogique(volumeslogique);
		}
       
       if(machinesVirtuelles!=null){
			
			Collection<MachineVirtuelle> machineVirtuelle = new ArrayList<MachineVirtuelle>();
			for (Long mv : machinesVirtuelles) {
				MachineVirtuelle mach = getMachineVirtuelle(mv);
				machineVirtuelle.add(mach);
				mach.setVirtualisation(h);
			}
			
			h.setMachineVirtuelle(machineVirtuelle);
		}
		
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			h.setContrats(contrat);
					
		}
		
		em.merge(h);
		
	}

	@Override
	public List<Hyperviseur> SearchHyperviseur(String h) {
		Query req = em.createQuery("select h from Hyperviseur h where h.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+h+"%");
		return req.getResultList();
	}

	@Override
	public List<DocumentFichier> SearchDocumentFichier(String df) {
		Query req = em.createQuery("select df from DocumentFichier df where df.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+df+"%");
		return req.getResultList();
	}

	@Override
	public List<DocumentWeb> SearchDocumentWeb(String dw) {
		Query req = em.createQuery("select dw from DocumentWeb dw where dw.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+dw+"%");
		return req.getResultList();
	}

	@Override
	public List<DocumentNote> SearchDocumentNote(String dn) {
		Query req = em.createQuery("select dn from DocumentFichier dn where dn.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+dn+"%");
		return req.getResultList();
	}

	@Override
	public void editSolutionApplicative(SolutionApplicative sa, List<Long> contacts, List<Long> documents,
			List<Long> processusMetiers, List<Long> contrats) {
		
		if(contacts != null){
			
			Collection<Contact> contact = new ArrayList<Contact>();
			for (Long cc : contacts) {
				Contact con = getContact(cc);
				contact.add(con);
			}
			
			sa.setContacts(contact);
					
		}
		
		if(documents != null){
			
			Collection<Document> document = new ArrayList<Document>();
			for (Long d : documents) {
				Document doc = getDocument(d);
				document.add(doc);
			}
			
			sa.setDocuments(document);
			
		}
       
       if(processusMetiers!=null){
			
			Collection<ProcessusMetier> processusMetier = new ArrayList<ProcessusMetier>();
			for (Long pm : processusMetiers) {
				ProcessusMetier pro = getProcessusMetier(pm);
				processusMetier.add(pro);
				
			}
			
			    sa.setProcessusMetier(processusMetier);
		}
      
       
		if(contrats != null){
					
			Collection<Contrat> contrat = new ArrayList<Contrat>();
			for (Long cc : contrats) {
				Contrat con = getContrat(cc);
				contrat.add(con);
			}
			
			sa.setContrats(contrat);
					
		}
		em.merge(sa); 
		
	}

	@Override
	public List<SolutionApplicative> SearchSolutionApplicative(String sa) {
		Query req = em.createQuery("select sa from SolutionApplicative sa where sa.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+sa+"%");
		return req.getResultList();
	}

	@Override
	public List<Document> SearchDocument(String d) {
		Query req = em.createQuery("select d from Document d where d.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+d+"%");
		return req.getResultList();
	}

	
	@Override
	public List<ConnexionElectrique> SearchConnexionElectrique(String ce) {
		Query req = em.createQuery("select ce from ConnexionElectrique ce where ce.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+ce+"%");
		return req.getResultList();
	}

	@Override
	public List<Groupe> SearchGroupe(String g) {
		Query req = em.createQuery("select g from Groupe g where g.nom LIKE :searchKeyword");
		req.setParameter("searchKeyword", "%"+g+"%");
		return req.getResultList();
	}

	@Override
	public Long ajouterGroupe(Groupe g, Long id_groupe, List<Long> applicationWeb, List<Long> connexionElectrique,
			List<Long> logiciel, List<Long> infrastructure, List<Long> camera, List<Long> chassis,
			List<Long> equipementreseau, List<Long> virtualisation, List<Long> imprimante,
			List<Long> instanceMiddleware, List<Long> instancedebasededonnees, List<Long> machinevirtuelle,
			List<Long> ordinateur, List<Long> processusmetier, List<Long> peripherique, List<Long> rack,
			List<Long> solutionapplicative, List<Long> tablette, List<Long> telephonefixe, List<Long> telephonemobile) {
		
			if(id_groupe!=null){
			Groupe groupe = getGroupe(id_groupe);
			g.setGroupe_parent(groupe);
			}else{
				g.setGroupe_parent(null);
			}
			if(applicationWeb != null){
				
				Collection<ApplicationWeb> applicationWe = new ArrayList<ApplicationWeb>();
				for (Long aw : applicationWeb) {
					ApplicationWeb appl = getApplicationWeb(aw);
					applicationWe.add(appl); 
				}
				
				g.setApplicationWeb(applicationWe);
						
			}
			if(connexionElectrique != null){
				
				Collection<ConnexionElectrique> conn = new ArrayList<ConnexionElectrique>();
				for (Long c : connexionElectrique ) {
					ConnexionElectrique con = getConnexionElectrique(c);
					conn.add(con); 
				}
				
				g.setConnexionElectrique(conn); 
						
			}
			if(logiciel != null){
				
				Collection<LogicielEtApplication> log = new ArrayList<LogicielEtApplication>();
				for (Long l : logiciel ) {
					LogicielEtApplication la = getLogicielEtApplication(l);
					log.add(la); 
				}
				
				g.setLogicielEtApplication(log);  
						
			}
			if(infrastructure != null){
				
				Collection<Infrastructure> inf = new ArrayList<Infrastructure>();
				for (Long i : infrastructure ) {
					Infrastructure in = getInfrastructure(i);
					inf.add(in); 
				}
				
				g.setInfrastructure(inf);  
						
			}
			if(camera != null){
				Collection<Camera> cam = new ArrayList<Camera>();
				for (Long c : camera) {
					Camera ca = getCamera(c);
					cam.add(ca);
				}
				g.setCamera(cam); 
			}
			if(chassis != null){
				Collection<Chassis> chass = new ArrayList<Chassis>();
				for (Long chas : chassis) {
					Chassis cha = getChassis(chas);
					chass.add(cha);
				}
				g.setChassis(chass);
			}
			if(equipementreseau != null){
				Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
				for (Long e : equipementreseau) {
					er.add(getEquipementReseau(e));
				}
				g.setEquipementReseau(er);
			}
			if(virtualisation != null){
					
					Collection<Virtualisation> virt = new ArrayList<Virtualisation>();
					for (Long v : virtualisation) {
						Virtualisation vir = getVirtualisation(v);
						virt.add(vir);
					}
					
					g.setVirtualisation(virt);
							
			}
			if(imprimante != null){
				
				Collection<Imprimante> impri = new ArrayList<Imprimante>();
				for (Long i : imprimante) {
					Imprimante im = getImp(i);
					impri.add(im);
				}
				
				g.setImprimante(impri); 
						
			}
			if(instancedebasededonnees != null){
				
				Collection<InstanceDeBasseDeDonnes> instanceBD = new ArrayList<InstanceDeBasseDeDonnes>();
				for (Long ibd : instancedebasededonnees) {
					InstanceDeBasseDeDonnes inst = getInstanceDeBasseDeDonnes(ibd);
					instanceBD.add(inst);
				}
				
				g.setInstanceDeBasseDeDonnes(instanceBD);
				
			}
			 if(instanceMiddleware != null){
					
					Collection<InstanceMiddleware> instanceMidd = new ArrayList<InstanceMiddleware>();
					for (Long im : instanceMiddleware) {
						InstanceMiddleware inst = getInstanceMiddleware(im);
						instanceMidd.add(inst); 
					}
					
					g.setInstanceMiddleware(instanceMidd);
					
				}
			 if(machinevirtuelle !=null){
					
					Collection<MachineVirtuelle> machineVirtuelle = new ArrayList<MachineVirtuelle>();
					for (Long mv : machinevirtuelle) {
						MachineVirtuelle mach = getMachineVirtuelle(mv);
						machineVirtuelle.add(mach);
					}
					
					g.setMachineVirtuelle(machineVirtuelle);
				}
			 if(ordinateur != null){
					Collection<Ordinateur> ord = new ArrayList<Ordinateur>();
					for (Long o : ordinateur) {
						Ordinateur pc = getPC(o);
						ord.add(pc);
					}
					g.setOrdinateur(ord); 
				}
			 if(processusmetier!=null){
					
					Collection<ProcessusMetier> processusMetier = new ArrayList<ProcessusMetier>();
					for (Long pm : processusmetier) {
						ProcessusMetier pro = getProcessusMetier(pm);
						processusMetier.add(pro);
						
					}
					
					    g.setProcessusMetier(processusMetier);
				}
			 if(peripherique != null){
					Collection<Peripherique> per = new ArrayList<Peripherique>();
					for (Long p : peripherique) {
						Peripherique periph = getPeriph(p);
						per.add(periph);
					}
					g.setPeripherique(per);
				}
			 if(rack != null){
					Collection<Rack> ra = new ArrayList<Rack>();
					for (Long r : rack) {
						Rack periph = getRack(r);
						ra.add(periph);
					}
					g.setRack(ra);
				}
			 if(solutionapplicative != null){
					
					Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
					for (Long sa : solutionapplicative) {
						SolutionApplicative sol = getSolutionApplicative(sa);
						solutionsAppl.add(sol);
					}
					
					g.setSolutionApplicative(solutionsAppl);
					
				}
			 if(tablette != null){
					Collection<Tablette> tab = new ArrayList<Tablette>();
					for (Long t : tablette) {
						Tablette tabl = getTablette(t);
						tab.add(tabl);
					}
					g.setTablette(tab);
				}
			 if(telephonefixe != null){
					Collection<TelephoneFixe> telfix = new ArrayList<TelephoneFixe>();
					for (Long tf : telephonefixe) {
						TelephoneFixe tel = getTeleFixe(tf);
						telfix.add(tel);
					}
					g.setTelephoneFixe(telfix);
				}
			 if(telephonemobile != null){
					Collection<TelephneMobile> telmobile = new ArrayList<TelephneMobile>();
					for (Long tm : telephonemobile) {
						TelephneMobile tel = getTeleMobile(tm);
						telmobile.add(tel);
					}
					g.setTelephneMobile(telmobile); 
				}
			 
			em.persist(g);
			return g.getId();
	}

	@Override
	public void modifierGroupe(Groupe g, Long id_groupe, List<Long> applicationWeb, List<Long> connexionElectrique,
			List<Long> logiciel, List<Long> infrastructure, List<Long> camera, List<Long> chassis,
			List<Long> equipementreseau, List<Long> virtualisation, List<Long> imprimante,
			List<Long> instanceMiddleware, List<Long> instancedebasededonnees, List<Long> machinevirtuelle,
			List<Long> ordinateur, List<Long> processusmetier, List<Long> peripherique, List<Long> rack,
			List<Long> solutionapplicative, List<Long> tablette, List<Long> telephonefixe, List<Long> telephonemobile) {
		
			if(id_groupe!=null){
			Groupe groupe = getGroupe(id_groupe);
			g.setGroupe_parent(groupe);
			}else{
				g.setGroupe_parent(null);
			}
			if(applicationWeb != null){
				
				Collection<ApplicationWeb> applicationWe = new ArrayList<ApplicationWeb>();
				for (Long aw : applicationWeb) {
					ApplicationWeb appl = getApplicationWeb(aw);
					applicationWe.add(appl); 
				}
				
				g.setApplicationWeb(applicationWe);
						
			}
			if(connexionElectrique != null){
				
				Collection<ConnexionElectrique> conn = new ArrayList<ConnexionElectrique>();
				for (Long c : connexionElectrique ) {
					ConnexionElectrique con = getConnexionElectrique(c);
					conn.add(con); 
				}
				
				g.setConnexionElectrique(conn); 
						
			}
			if(logiciel != null){
				
				Collection<LogicielEtApplication> log = new ArrayList<LogicielEtApplication>();
				for (Long l : logiciel ) {
					LogicielEtApplication la = getLogicielEtApplication(l);
					log.add(la); 
				}
				
				g.setLogicielEtApplication(log);  
						
			}
			if(infrastructure != null){
				
				Collection<Infrastructure> inf = new ArrayList<Infrastructure>();
				for (Long i : infrastructure ) {
					Infrastructure in = getInfrastructure(i);
					inf.add(in); 
				}
				
				g.setInfrastructure(inf);  
						
			}
			if(camera != null){
				Collection<Camera> cam = new ArrayList<Camera>();
				for (Long c : camera) {
					Camera ca = getCamera(c);
					cam.add(ca);
				}
				g.setCamera(cam); 
			}
			if(chassis != null){
				Collection<Chassis> chass = new ArrayList<Chassis>();
				for (Long chas : chassis) {
					Chassis cha = getChassis(chas);
					chass.add(cha);
				}
				g.setChassis(chass);
			}
			if(equipementreseau != null){
				Collection<EquipementReseau> er = new ArrayList<EquipementReseau>();
				for (Long e : equipementreseau) {
					er.add(getEquipementReseau(e));
				}
				g.setEquipementReseau(er);
			}
			if(virtualisation != null){
					
					Collection<Virtualisation> virt = new ArrayList<Virtualisation>();
					for (Long v : virtualisation) {
						Virtualisation vir = getVirtualisation(v);
						virt.add(vir);
					}
					
					g.setVirtualisation(virt);
							
			}
			if(imprimante != null){
				
				Collection<Imprimante> impri = new ArrayList<Imprimante>();
				for (Long i : imprimante) {
					Imprimante im = getImp(i);
					impri.add(im);
				}
				
				g.setImprimante(impri); 
						
			}
			if(instancedebasededonnees != null){
				
				Collection<InstanceDeBasseDeDonnes> instanceBD = new ArrayList<InstanceDeBasseDeDonnes>();
				for (Long ibd : instancedebasededonnees) {
					InstanceDeBasseDeDonnes inst = getInstanceDeBasseDeDonnes(ibd);
					instanceBD.add(inst);
				}
				
				g.setInstanceDeBasseDeDonnes(instanceBD);
				
			}
			 if(instanceMiddleware != null){
					
					Collection<InstanceMiddleware> instanceMidd = new ArrayList<InstanceMiddleware>();
					for (Long im : instanceMiddleware) {
						InstanceMiddleware inst = getInstanceMiddleware(im);
						instanceMidd.add(inst); 
					}
					
					g.setInstanceMiddleware(instanceMidd);
					
				}
			 if(machinevirtuelle !=null){
					
					Collection<MachineVirtuelle> machineVirtuelle = new ArrayList<MachineVirtuelle>();
					for (Long mv : machinevirtuelle) {
						MachineVirtuelle mach = getMachineVirtuelle(mv);
						machineVirtuelle.add(mach);
					}
					
					g.setMachineVirtuelle(machineVirtuelle);
				}
			 if(ordinateur != null){
					Collection<Ordinateur> ord = new ArrayList<Ordinateur>();
					for (Long o : ordinateur) {
						Ordinateur pc = getPC(o);
						ord.add(pc);
					}
					g.setOrdinateur(ord); 
				}
			 if(processusmetier!=null){
					
					Collection<ProcessusMetier> processusMetier = new ArrayList<ProcessusMetier>();
					for (Long pm : processusmetier) {
						ProcessusMetier pro = getProcessusMetier(pm);
						processusMetier.add(pro);
						
					}
					
					    g.setProcessusMetier(processusMetier);
				}
			 if(peripherique != null){
					Collection<Peripherique> per = new ArrayList<Peripherique>();
					for (Long p : peripherique) {
						Peripherique periph = getPeriph(p);
						per.add(periph);
					}
					g.setPeripherique(per);
				}
			 if(rack != null){
					Collection<Rack> ra = new ArrayList<Rack>();
					for (Long r : rack) {
						Rack periph = getRack(r);
						ra.add(periph);
					}
					g.setRack(ra);
				}
			 if(solutionapplicative != null){
					
					Collection<SolutionApplicative> solutionsAppl = new ArrayList<SolutionApplicative>();
					for (Long sa : solutionapplicative) {
						SolutionApplicative sol = getSolutionApplicative(sa);
						solutionsAppl.add(sol);
					}
					
					g.setSolutionApplicative(solutionsAppl);
					
				}
			 if(tablette != null){
					Collection<Tablette> tab = new ArrayList<Tablette>();
					for (Long t : tablette) {
						Tablette tabl = getTablette(t);
						tab.add(tabl);
					}
					g.setTablette(tab);
				}
			 if(telephonefixe != null){
					Collection<TelephoneFixe> telfix = new ArrayList<TelephoneFixe>();
					for (Long tf : telephonefixe) {
						TelephoneFixe tel = getTeleFixe(tf);
						telfix.add(tel);
					}
					g.setTelephoneFixe(telfix);
				}
			 if(telephonemobile != null){
					Collection<TelephneMobile> telmobile = new ArrayList<TelephneMobile>();
					for (Long tm : telephonemobile) {
						TelephneMobile tel = getTeleMobile(tm);
						telmobile.add(tel);
					}
					g.setTelephneMobile(telmobile); 
				}
			 
			em.merge(g);
		
	}

	
}

