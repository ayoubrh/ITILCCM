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

