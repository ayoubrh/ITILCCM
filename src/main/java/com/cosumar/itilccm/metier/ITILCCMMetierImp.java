package com.cosumar.itilccm.metier;

import java.security.MessageDigest;
import java.util.Collection;
import java.util.List;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.transaction.annotation.Transactional;

import com.cosumar.itilccm.dao.ITILCCMDAO;
import com.cosumar.itilccm.entities.*;

@Transactional
public class ITILCCMMetierImp implements UtilisateurMetier,AdminMetier,EquipeITMetier {

	private ITILCCMDAO dao;
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void setDao(ITILCCMDAO dao) {
		this.dao = dao;
	}

	@Override
	public Long ajouterUser(User u, Long idDep) {
		return dao.ajouterUser(u, idDep);
	}

	@Override
	public Long ajouterUserRole(User u, Long idDep, Long idR) {
		return dao.ajouterUserRole(u, idDep, idR);
	}

	@Override
	public void supprimerUser(Long id) {
		dao.supprimerUser(id);
	}

	@Override
	public List<User> listUser() {
		return dao.listUser();
	}
	
	@Override
	public List<User> listUserSim() {
		return dao.listUserSim();
	}
	
	@Override
	public List<User> listUserTeleMobile() {
		return dao.listUserTeleMobile();
	}
	
	@Override
	public List<User> listUserTeleFixe() {
		return dao.listUserTeleFixe();
	}
	
	@Override
	public List<User> listUserTablette() {
		return dao.listUserTablette();
	}

	@Override
	public Long ajouterDepartement(Departement d) {
		return dao.ajouterDepartement(d);
	}

	@Override
	public void modifierDepartement(Departement d) {
		dao.modifierDepartement(d);
	}

	@Override
	public void supprimerDepatement(Long id) {
		dao.supprimerDepatement(id);
	}

	@Override
	public List<Departement> listDepartement() {
		return dao.listDepartement();
	}

	@Override
	public Departement getDepartement(Long id) {
		return dao.getDepartement(id);
	}

	@Override
	public Long ajouterRole(Role r) {
		return dao.ajouterRole(r);
	}

	@Override
	public void modifierRole(Role r) {
		dao.modifierRole(r);
	}

	@Override
	public void supprimerRole(Long id) {
		dao.supprimerRole(id);
	}

	@Override
	public List<Role> listRole() {
		return dao.listRole();
	}

	@Override
	public Role getRole(Long id) {
		return dao.getRole(id);
	}

	@Override
	public void attribuerRole(Role r, User u) {
		dao.attribuerRole(r, u);
	}

	@Override
	public void modifierUser(User u) {
		dao.modifierUser(u);
	}

	@Override
	public User getUser(Long id) {
		return dao.getUser(id);
	}

	@Override
	public User getUserByMatricule(String matricule) {
		return dao.getUserByMatricule(matricule);
	}
	
	@Override
	public Long addPC(Ordinateur pc) {
		return dao.addPC(pc);
	}
	
	@Override
	public Long addPCAll(Ordinateur pc, Long user,Long lieu, Long licenseos, List<Long> logicielEtApplication, List<Long> equipementReseau, 
			List<Long> intefaceReseau, List<Long> peripherique, List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.addPCAll(pc, user, lieu, licenseos, logicielEtApplication, equipementReseau, intefaceReseau, peripherique, document, contact, contrat);
	}

	@Override
	public Long addPCUser(Ordinateur pc, Long u) {
		return dao.addPCUser(pc, u);
	}

	@Override
	public void editPC(Ordinateur pc) {
		dao.editPC(pc);
	}

	@Override
	public void deletePC(Long id) {
		dao.deletePC(id);
	}

	@Override
	public List<Ordinateur> ListPC() {
		return dao.ListPC();
	}

	@Override
	public Ordinateur getPC(Long id) {
		return dao.getPC(id);
	}
	
	@Override
	public Long addImp(Imprimante imp) {
		return dao.addImp(imp);
	}

	@Override
	public Long addImpUser(Imprimante imp, Long u) {
		return dao.addImpUser(imp, u);
	}

	@Override
	public void editImp(Imprimante imp) {
		dao.editImp(imp);
	}

	@Override
	public void deleteImp(Long id) {
		dao.deleteImp(id);
	}
	
	@Override
	public List<Imprimante> ListImp() {
		return dao.ListImp();
	}

	@Override
	public Imprimante getImp(Long id) {
		return dao.getImp(id);
	}

	@Override
	public Long addTeleMobile(TelephneMobile telem) {
		return dao.addTeleMobile(telem);
	}

	@Override
	public Long addTeleMobileUser(TelephneMobile telem, Long u) {
		return dao.addTeleMobileUser(telem, u);
	}

	@Override
	public void editTeleMobile(TelephneMobile telem) {
		dao.editTeleMobile(telem);
		
	}

	@Override
	public void deleteTeleMobile(Long id) {
		dao.deleteTeleMobile(id);
		
	}

	@Override
	public List<TelephneMobile> ListTeleMobile() {
		return dao.ListTeleMobile();
	}

	@Override
	public TelephneMobile getTeleMobile(Long id) {
		return dao.getTeleMobile(id);
	}
	
	@Override
	public Long addSIM(Sim sim) {
		return dao.addSIM(sim);
	}

	@Override
	public Long addSIMUser(Sim sim, Long u) {
		return dao.addSIMUser(sim, u);
	}

	@Override
	public void editSIM(Sim sim) {
		dao.editSIM(sim);
		
	}

	@Override
	public void deleteSIM(Long id) {
		dao.deleteSIM(id);
		
	}

	@Override
	public List<Sim> ListSIM() {
		return dao.ListSIM();
	}

	@Override
	public Sim getSIM(Long id) {
		return dao.getSIM(id);
	}
	
	
	public String hashmd5password(String password) throws Exception{
		//String password = "123456";
    	
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        
        byte byteData[] = md.digest();
        
        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
    	for (int i=0;i<byteData.length;i++) {
    		String hex=Integer.toHexString(0xff & byteData[i]);
   	     	if(hex.length()==1) hexString.append('0');
   	     	hexString.append(hex);
    	}
    	//System.out.println("Digest(in hex format):: " + hexString.toString());
    	return hexString.toString();
	}
	
	
	public void SendEmail(final String recipientAddress, final String subject, final String message) {
		// takes input from e-mail form
				
		// prints debug info
		System.out.println("To: " + recipientAddress);
		System.out.println("Subject: " + subject);
		System.out.println("Message: " + message);
		
		// creates a simple e-mail object
		//SimpleMailMessage email = new SimpleMailMessage();
		//email.setTo(recipientAddress);
		//email.setSubject(subject);
		//email.setText(message, "UTF-8", "html");
		
		MimeMessagePreparator preparator = new MimeMessagePreparator() {
	        
            public void prepare(MimeMessage mimeMessage) throws Exception {
        
                mimeMessage.setRecipient(Message.RecipientType.TO, 
                        new InternetAddress(recipientAddress));
                //mimeMessage.setFrom(new InternetAddress("mail@mycompany.com"));
                mimeMessage.setSubject(subject);
                mimeMessage.setText(message, "UTF-8", "html");
            }
        };
		
		// sends the e-mail
		//mailSender.send(email);
		try {
            this.mailSender.send(preparator);
        }
        catch (MailException ex) {
            System.err.println(ex.getMessage());            
        }
	}

	@Override
	public Long addTablette(Tablette tab) {
		return dao.addTablette(tab);
	}

	@Override
	public Long addTabletteUser(Tablette tab, Long u) {
		return dao.addTabletteUser(tab, u);
	}

	@Override
	public void editTablette(Tablette tab) {
		dao.editTablette(tab);
		
	}

	@Override
	public void deleteTablette(Long id) {
		dao.deleteTablette(id);
		
	}

	@Override
	public Long ajouterLieu(Lieu l) {
		
		return dao.ajouterLieu(l);
	}
	@Override
	public Long ajouterLieuCont(Lieu l, List<Long> contacts) {
		
		return dao.ajouterLieuCont(l, contacts); 
	}
	@Override
	public void modifierLieu(Lieu l,List<Long> contacts) {
		dao.modifierLieu(l, contacts); 
	}

	@Override
	public void supprimerLieu(Long id) {
		dao.supprimerLieu(id);
		
	}

	@Override
	public Lieu getLieu(Long id) {
		
		return dao.getLieu(id);
	}

	@Override
	public List<Lieu> listLieu() {
		
		return dao.listLieu();
	}
	
	@Override
	public List<Lieu> SearchLieu(String l) {
		return dao.SearchLieu(l); 
	}
	@Override
	public Long ajouterContact(Contact c) {
		
		return dao.ajouterContact(c);
	}
	
	@Override
	public List<Tablette> ListTablette() {
		return dao.ListTablette();
	}

	@Override
	public Tablette getTablette(Long id) {
		return dao.getTablette(id);
	}

	@Override
	public Long addTeleFixe(TelephoneFixe fixe) {
		return dao.addTeleFixe(fixe);
	}

	@Override
	public Long addTeleFixeUser(TelephoneFixe fixe, Long u) {
		return dao.addTeleFixeUser(fixe, u);
	}

	@Override
	public void editTeleFixe(TelephoneFixe fixe) {
		dao.editTeleFixe(fixe);
		
	}

	@Override
	public void deleteTeleFixe(Long id) {
		dao.deleteTeleFixe(id);
	}

	@Override
	public Long ajouterContactAll(Contact c, Long idlieu){
		 
		return dao.ajouterContactAll(c, idlieu);
		
	}

	
	@Override
	public List<TelephoneFixe> ListTeleFixe() {
		return dao.ListTeleFixe();
	}

	@Override
	public TelephoneFixe getTeleFixe(Long id) {
		return dao.getTeleFixe(id);
	}

	@Override
	public Long addPeriph(Peripherique per) {
		return dao.addPeriph(per);
	}

	@Override
	public Long addPeriphPC(Peripherique per, Long pc) {
		return dao.addPeriphPC(per, pc);
	}

	@Override
	public void editPeriph(Peripherique per) {
		dao.editPeriph(per);
	}

	@Override
	public void supprimerContact(Long id) {
		dao.supprimerContact(id);
	}
		
	@Override
	public void deletePeriph(Long id) {
		dao.deletePeriph(id);
		
	}

	@Override
	public List<Contact> listContact() {
		
		return dao.listContact();
	}

	@Override
	public Contact getContact(Long id) {
		
		return dao.getContact(id);
	}

	@Override
	public Long ajouterContrat(Contrat c) { 
		return dao.ajouterContrat(c);
	}

	@Override
	public Long ajouterContratAll(Contrat c, List<Long> contacts, List<Long> documents) {
		return dao.ajouterContratAll(c, contacts, documents);
		
	}

	@Override
	public List<Peripherique> ListPeriph() {
		return dao.ListPeriph();
	}

	@Override
	public Peripherique getPeriph(Long id) {
		return dao.getPeriph(id);
	}

	@Override
	public Long addFibre(Fibre f) {
		return dao.addFibre(f);
	}

	@Override
	public void editFibre(Fibre f) {
		dao.editFibre(f);
		
	}

	@Override
	public void deleteFibre(Long id) {
		dao.deleteFibre(id);
		
	}

	@Override
	public Long addLogique(Logique logique) {
		return dao.addLogique(logique);
	}

	@Override
	public void editLogique(Logique logique) {
		dao.editLogique(logique);
		
	}

	@Override
	public void supprimerContrat(Long id) {
		dao.supprimerContrat(id);
	}
	
	@Override
	public void deleteLogique(Long id) {
		dao.deleteLogique(id);
		
	}

	@Override
	public Long addPhysique(Physique Physique) {
		return dao.addPhysique(Physique);
	}

	@Override
	public void editPhysique(Physique Physique) {
		dao.editPhysique(Physique);
		
	}
	
	@Override
	public void deletePhysique(Long id) {
		dao.deletePhysique(id);
		
	}

	@Override
	public Long ajouterGroupe(Groupe g) {
		return dao.ajouterGroupe(g);
	}

	
	@Override
	public Long addVlan(Vlan Vlan) {
		return dao.addVlan(Vlan);
	}

	@Override
	public void editVlan(Vlan Vlan) {
		dao.editVlan(Vlan);
		
	}

	@Override
	public void supprimerGroupe(Long id) {
		dao.supprimerGroupe(id);
	}
	
	@Override
	public void deleteVlan(Long id) {
		dao.deleteVlan(id);
		
	}

	@Override
	public Long addSubnet(Subnet Subnet) {
		return dao.addSubnet(Subnet);
	}

	@Override
	public void editSubnet(Subnet Subnet) {
		dao.editSubnet(Subnet);
		
	}

	@Override
	public List<Contrat> listContrat() {
		return dao.listContrat();
	}

	@Override
	public Contrat getContrat(Long id) {
		return dao.getContrat(id);
	}

	@Override
	public List<Document> listDocument() {
		return dao.listDocument();
	}

	@Override
	public Document getDocument(Long id) {
		return dao.getDocument(id);
	}

	@Override
	public List<Groupe> listGroupe() {
		return dao.listGroupe();
	}

	@Override
	public Groupe getGroupe(Long id) {
		return dao.getGroupe(id);
	}

	@Override
	public Long ajouterApplicationWeb(ApplicationWeb aw) {
		return dao.ajouterApplicationWeb(aw);
	}

	@Override
	public void deleteSubnet(Long id) {
		dao.deleteSubnet(id);
		
	}

	@Override
	public Long addCamera(Camera Cam) {
		return dao.addCamera(Cam);
	}

	@Override
	public void editCamera(Camera Cam) {
		dao.editCamera(Cam);
		
	}

	@Override
	public void deleteCamera(Long id) {
		dao.deleteCamera(id);
		
	}

	@Override
	public Long addProcessusMetier(ProcessusMetier pm) {
		return dao.addProcessusMetier(pm);
	}

	@Override
	public void deleteProcessusMetier(Long id) {
		dao.deleteProcessusMetier(id);
		
	}

	@Override
	public Long addSolutionApplicative(SolutionApplicative sa) {
		return dao.addSolutionApplicative(sa);
	}

	@Override
	public void supprimerApplicationWeb(Long id) {
		dao.supprimerApplicationWeb(id);
	}
	
	@Override
	public void deleteSolutionApplicative(Long id) {
		dao.deleteSolutionApplicative(id);
		
	}

	@Override
	public Long ajouterInstanceMiddleware(InstanceMiddleware im) {
		return dao.ajouterInstanceMiddleware(im);
	}

	@Override
	public Long addVolumeLogique(VolumeLogique vl) {
		return dao.addVolumeLogique(vl);
	}

	@Override
	public void editVolumeLogique(VolumeLogique vl) {
		dao.editVolumeLogique(vl);
		
	}

	@Override
	public void supprimerInstanceMiddleware(Long id) {
		dao.supprimerInstanceMiddleware(id);
	}
	
	@Override
	public void deleteVolumeLogique(Long id) {
		dao.deleteVolumeLogique(id);
		
	}

	@Override
	public Long ajouterInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd) {
		return dao.ajouterInstanceDeBasseDeDonnes(ibd);
	}

	@Override
	public Long addDvr(Dvr dvr) {
		return dao.addDvr(dvr);
	}

	@Override
	public void editDvr(Dvr dvr) {
		dao.editDvr(dvr);
		
	}

	@Override
	public void supprimerInstanceDeBasseDeDonnes(Long id) {
		dao.supprimerInstanceDeBasseDeDonnes(id);
	}
	
	@Override
	public void deleteDvr(Long id) {
		dao.deleteDvr(id);
		
	}

	@Override
	public List<ApplicationWeb> listApplicationWeb() {
		return dao.listApplicationWeb();
	}

	@Override
	public ApplicationWeb getApplicationWeb(Long id) {
		return dao.getApplicationWeb(id);
	}

	@Override
	public List<InstanceMiddleware> listInstanceMiddleware() {
		return dao.listInstanceMiddleware();
	}

	@Override
	public InstanceMiddleware getInstanceMiddleware(Long id) {
		return dao.getInstanceMiddleware(id);
	}

	@Override
	public List<InstanceDeBasseDeDonnes> listInstanceDeBasseDeDonnes() {
		return dao.listInstanceDeBasseDeDonnes();
	}

	@Override
	public InstanceDeBasseDeDonnes getInstanceDeBasseDeDonnes(Long id) {
		return dao.getInstanceDeBasseDeDonnes(id);
	}

	@Override
	public Long ajouterLicenseLogiciel(LicenseLogiciel ll) {
		return dao.ajouterLicenseLogiciel(ll);
	}

	@Override
	public void supprimerLicenseLogiciel(Long id) {
		dao.supprimerLicenseLogiciel(id);
		
	}

	@Override
	public Long ajouterLicenseOs(LicenseOs lo) {
		return dao.ajouterLicenseOs(lo);
	}

	@Override
	public void supprimerLicenseOs(Long id) {
		dao.supprimerLicenseOs(id);
		
	}

	@Override
	public Long ajouterVersionOs(VersionOs vo) {
		return dao.ajouterVersionOs(vo);
	}

	@Override
	public void modifierVersionOs(VersionOs vo) {
		dao.modifierVersionOs(vo);
		
	}

	@Override
	public void supprimerVersionOs(Long id) {
		dao.supprimerVersionOs(id);
		
	}

	@Override
	public List<LicenseLogiciel> listLicenseLogiciel() {
		return dao.listLicenseLogiciel();
	}

	@Override
	public LicenseLogiciel getLicenseLogiciel(Long id) {
		return dao.getLicenseLogiciel(id);
	}

	@Override
	public List<LicenseOs> listLicenseOs() {
		return dao.listLicenseOs();
	}

	@Override
	public LicenseOs getLicenseOs(Long id) {
		return dao.getLicenseOs(id);
	}

	@Override
	public List<VersionOs> listVersionOs() {
		return dao.listVersionOs();
	}

	@Override
	public VersionOs getVersionOs(Long id) {
		return dao.getVersionOs(id);
	}

	@Override
	public Long ajouterAutreLogiciel(AutreLogiciel al) {
		return dao.ajouterAutreLogiciel(al);
	}


	@Override
	public void supprimerAutreLogiciel(Long id) {
		dao.supprimerAutreLogiciel(id);
		
	}

	@Override
	public Long ajouterLogicielPc(LogicielPc lp) {
		return dao.ajouterLogicielPc(lp);
	}

	
	
	@Override
	public List<IntefaceReseau> ListInterfaceReseau() {
		return dao.ListInterfaceReseau();
	}

	@Override
	public IntefaceReseau getInterfaceReseau(Long id) {
		return dao.getInterfaceReseau(id);
	}

	@Override
	public List<Fibre> ListFibre() {
		return dao.ListFibre();
	}

	@Override
	public Fibre getFibre(Long id) {
		return dao.getFibre(id);
	}

	@Override
	public List<Logique> ListLogique() {
		return dao.ListLogique();
	}

	@Override
	public Logique getLogique(Long id) {
		return dao.getLogique(id);
	}

	@Override
	public List<Physique> ListPhysique() {
		return dao.ListPhysique();
	}

	@Override
	public Physique getPhysique(Long id) {
		return dao.getPhysique(id);
	}

	@Override
	public List<Vlan> ListVlan() {
		return dao.ListVlan();
	}

	@Override
	public Vlan getVlan(Long id) {
		return dao.getVlan(id);
	}

	@Override
	public List<Subnet> ListSubnet() {
		return dao.ListSubnet();
	}

	@Override
	public Subnet getSubnet(Long id) {
		return dao.getSubnet(id);
	}

	@Override
	public List<Camera> ListCamera() {
		return dao.ListCamera();
	}

	@Override
	public Camera getCamera(Long id) {
		return dao.getCamera(id);
	}

	@Override
	public List<ProcessusMetier> ListProcessusMetier() {
		return dao.ListProcessusMetier();
	}

	@Override
	public ProcessusMetier getProcessusMetier(Long id) {
		return dao.getProcessusMetier(id);
	}

	@Override
	public List<SolutionApplicative> ListSolutionApplicative() {
		return dao.ListSolutionApplicative();
	}

	@Override
	public SolutionApplicative getSolutionApplicative(Long id) {
		return dao.getSolutionApplicative(id);
	}

	@Override
	public List<VolumeLogique> ListVolumeLogique() {
		return dao.ListVolumeLogique();
	}

	@Override
	public VolumeLogique getVolumeLogique(Long id) {
		return dao.getVolumeLogique(id);
	}

	@Override
	public List<Dvr> ListDvr() {
		return dao.ListDvr();
	}

	@Override
	public Dvr getDvr(Long id) {
		return dao.getDvr(id);
	}

	@Override
	public List<ConnexionElectrique> ListConnexionElectrique() {
		return dao.ListConnexionElectrique();
	}

	@Override
	public ConnexionElectrique getConnexionElectrique(Long id) {
		return dao.getConnexionElectrique(id);
	}

	@Override
	public Long addArriveeElectrique(ArriveeElectrique ae) {
		return dao.addArriveeElectrique(ae);
	}

	@Override
	public void supprimerLogicielPc(Long id) {
		dao.supprimerLogicielPc(id);
		
	}

	@Override
	public Long ajouterServeurWeb(ServeurWeb sw) {
		return dao.ajouterServeurWeb(sw);
	}


	@Override
	public void supprimerServeurWeb(Long id) {
		dao.supprimerServeurWeb(id);
		
	}

	@Override
	public Long ajouterMiddleware(Middleware m) {
		return dao.ajouterMiddleware(m);
	}


	@Override
	public void supprimerMiddleware(Long id) {
		dao.supprimerMiddleware(id);
		
	}

	@Override
	public Long ajouterServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees sbd) {
		return dao.ajouterServeurDeBasseDeDonnees(sbd);
	}

	@Override
	public void supprimerServeurDeBasseDeDonnees(Long id) {
		dao.supprimerServeurDeBasseDeDonnees(id);
		
	}

	@Override
	public Long ajouterMachineVirtuelle(MachineVirtuelle mv) {
		return dao.ajouterMachineVirtuelle(mv);
	}

	@Override
	public void supprimerMachineVirtuelle(Long id) {
		dao.supprimerMachineVirtuelle(id);
		
	}

	@Override
	public Long ajouterVcluster(Vcluster v) {
		dao.ajouterVcluster(v);
		return null;
	}

	@Override
	public List<ArriveeElectrique> ListArriveeElectrique() {
		return dao.ListArriveeElectrique();
	}

	@Override
	public ArriveeElectrique getArriveeElectrique(Long id) {
		return dao.getArriveeElectrique(id);
	}

	@Override
	public void deleteArriveeElectrique(Long id) {
		dao.deleteArriveeElectrique(id);
	}

	@Override
	public Long addPduElectrique(PduElectrique pdue) {
		return dao.addPduElectrique(pdue);
	}

	@Override
	public List<PduElectrique> ListPduElectrique() {
		return dao.ListPduElectrique();
	}

	@Override
	public PduElectrique getPduElectrique(Long id) {
		return dao.getPduElectrique(id);
	}

	@Override
	public void deletePduElectrique(Long id) {
		dao.deletePduElectrique(id);
	}

	@Override
	public Long addRack(Rack Rack) {
		return dao.addRack(Rack);
	}

	@Override
	public void editRack(Rack Rack) {
		dao.editRack(Rack);
	}

	@Override
	public List<Rack> ListRack() {
		return dao.ListRack();
	}

	@Override
	public Rack getRack(Long id) {
		return dao.getRack(id);
	}

	@Override
	public void deleteRack(Long id) {
		dao.deleteRack(id);
	}

	@Override
	public Long addChassis(Chassis Chassis) {
		return dao.addChassis(Chassis);
	}

	@Override
	public void editChassis(Chassis Chassis) {
		dao.editChassis(Chassis);
		
	}

	@Override
	public void supprimerVcluster(Long id) {
		dao.supprimerVcluster(id);
	}
	
	@Override
	public List<Chassis> ListChassis() {
		return dao.ListChassis();
	}

	@Override
	public Chassis getChassis(Long id) {
		return dao.getChassis(id);
	}

	@Override
	public void deleteChassis(Long id) {
		dao.deleteChassis(id);
		
	}

	@Override
	public Long ajouterHyperviseur(Hyperviseur h) {
		return dao.ajouterHyperviseur(h);
	}

	@Override
	public List<Infrastructure> ListInfrastructure() {
		return dao.ListInfrastructure();
	}

	@Override
	public Infrastructure getInfrastructure(Long id) {
		return dao.getInfrastructure(id);
	}

	@Override
	public Long addBandotheque(Bandotheque Bandotheque) {
		return dao.addBandotheque(Bandotheque);
	}

	@Override
	public void editBandotheque(Bandotheque Bandotheque) {
		dao.editBandotheque(Bandotheque);
		
	}

	@Override
	public void supprimerHyperviseur(Long id) {
		dao.supprimerHyperviseur(id);
	}
	
	@Override
	public List<Bandotheque> ListBandotheque() {
		return dao.ListBandotheque();
	}

	@Override
	public Bandotheque getBandotheque(Long id) {
		return dao.getBandotheque(id);
	}

	@Override
	public void deleteBandotheque(Long id) {
		dao.deleteBandotheque(id);
		
	}

	@Override
	public List<LogicielEtApplication> listLogicielEtApplication() {
		return dao.listLogicielEtApplication();
	}

	@Override
	public LogicielEtApplication getLogicielEtApplication(Long id) {
		return dao.getLogicielEtApplication(id);
	}

	@Override
	public List<AutreLogiciel> listAutreLogiciel() {
		return dao.listAutreLogiciel();
	}

	@Override
	public AutreLogiciel getAutreLogiciel(Long id) {
		return dao.getAutreLogiciel(id);
	}

	@Override
	public List<LogicielPc> listLogicielPc() {
		return dao.listLogicielPc();
	}

	@Override
	public LogicielPc getLogicielPc(Long id) {
		return dao.getLogicielPc(id);
	}

	@Override
	public List<ServeurWeb> listServeurWeb() {
		return dao.listServeurWeb();
	}

	@Override
	public ServeurWeb getServeurWeb(Long id) {
		return dao.getServeurWeb(id);
	}

	@Override
	public List<Middleware> listMiddleware() {
		return dao.listMiddleware();
	}

	@Override
	public Middleware getMiddleware(Long id) {
		return dao.getMiddleware(id);
	}

	@Override
	public List<ServeurDeBasseDeDonnees> listServeurDeBasseDeDonnees() {
		return dao.listServeurDeBasseDeDonnees();
	}

	@Override
	public ServeurDeBasseDeDonnees getServeurDeBasseDeDonnees(Long id) {
		return dao.getServeurDeBasseDeDonnees(id);
	}

	@Override
	public List<MachineVirtuelle> listMachineVirtuelle() {
		return dao.listMachineVirtuelle();
	}

	@Override
	public MachineVirtuelle getMachineVirtuelle(Long id) {
		return dao.getMachineVirtuelle(id);
	}

	@Override
	public List<Virtualisation> listVirtualisation() {
		return dao.listVirtualisation();
	}

	@Override
	public Virtualisation getVirtualisation(Long id) {
		return dao.getVirtualisation(id);
	}

	@Override
	public List<Vcluster> listVcluster() {
		return dao.listVcluster();
	}

	@Override
	public Vcluster getVcluster(Long id) {
		return dao.getVcluster(id);
	}

	@Override
	public List<Hyperviseur> listHyperviseur() {
		return dao.listHyperviseur();
	}

	@Override
	public Hyperviseur getHyperviseur(Long id) {
		return dao.getHyperviseur(id);
	}

	@Override
	public Long addBande(Bande Bande) {
		return dao.addBande(Bande);
	}

	@Override
	public void editBande(Bande Bande) {
		dao.editBande(Bande);
	}

	@Override
	public List<Bande> ListBande() {
		return dao.ListBande();
	}

	@Override
	public Bande getBande(Long id) {
		return dao.getBande(id);
	}

	@Override
	public void deleteBande(Long id) {
		dao.deleteBande(id);
	}

	@Override
	public Long addServeur(Serveur Serveur) {
		return dao.addServeur(Serveur);
	}

	@Override
	public void editServeur(Serveur Serveur) {
		dao.editServeur(Serveur);
	}

	@Override
	public List<Serveur> ListServeur() {
		return dao.ListServeur();
	}

	@Override
	public Serveur getServeur(Long id) {
		return dao.getServeur(id);
	}

	@Override
	public void deleteServeur(Long id) {
		dao.deleteServeur(id);
	}

	@Override
	public Long addSystemeDeStockage(SystemeDeStockage sds) {
		return dao.addSystemeDeStockage(sds);
	}

	@Override
	public void editSystemeDeStockage(SystemeDeStockage sds) {
		dao.editSystemeDeStockage(sds);
	}

	@Override
	public List<SystemeDeStockage> ListSystemeDeStockage() {
		return dao.ListSystemeDeStockage();
	}

	@Override
	public SystemeDeStockage getSystemeDeStockage(Long id) {
		return dao.getSystemeDeStockage(id);
	}

	@Override
	public void deleteSystemeDeStockage(Long id) {
		dao.deleteSystemeDeStockage(id);
	}

	@Override
	public Long addSwitchSan(SwitchSan san) {
		return dao.addSwitchSan(san);
	}

	@Override
	public void editSwitchSan(SwitchSan san) {
		dao.editSwitchSan(san);
	}

	@Override
	public List<SwitchSan> ListSwitchSan() {
		return dao.ListSwitchSan();
	}

	@Override
	public SwitchSan getSwitchSan(Long id) {
		return dao.getSwitchSan(id);
	}

	@Override
	public void deleteSwitchSan(Long id) {
		dao.deleteSwitchSan(id);
	}

	@Override
	public Long addNas(Nas Nas) {
		return dao.addNas(Nas);
	}

	@Override
	public void editNas(Nas Nas) {
		dao.editNas(Nas);
	}

	@Override
	public List<Nas> ListNas() {
		return dao.ListNas();
	}

	@Override
	public Nas getNas(Long id) {
		return dao.getNas(id);
	}

	@Override
	public void deleteNas(Long id) {
		dao.deleteNas(id);
	}

	@Override
	public Long addSystemeDeFicherNas(SystemeDeFicherNas sdnas) {
		return dao.addSystemeDeFicherNas(sdnas);
	}

	@Override
	public void editSystemeDeFicherNas(SystemeDeFicherNas sdnas) {
		dao.editSystemeDeFicherNas(sdnas);
	}

	@Override
	public List<SystemeDeFicherNas> ListSystemeDeFicherNas() {
		return dao.ListSystemeDeFicherNas();
	}

	@Override
	public SystemeDeFicherNas getSystemeDeFicherNas(Long id) {
		return dao.getSystemeDeFicherNas(id);
	}

	@Override
	public void deleteSystemeDeFicherNas(Long id) {
		dao.deleteSystemeDeFicherNas(id);
	}

	@Override
	public Long addEquipementReseau(EquipementReseau er) {
		return dao.addEquipementReseau(er);
	}

	@Override
	public void editEquipementReseau(EquipementReseau er) {
		dao.editEquipementReseau(er);
	}

	@Override
	public List<EquipementReseau> ListEquipementReseau() {
		return dao.ListEquipementReseau();
	}

	@Override
	public EquipementReseau getEquipementReseau(Long id) {
		return dao.getEquipementReseau(id);
	}

	@Override
	public void deleteEquipementReseau(Long id) {
		dao.deleteEquipementReseau(id);
	}

	@Override
	public Long ajouterDocumentFichier(DocumentFichier df) {
		return dao.ajouterDocumentFichier(df);
	}

	@Override
	public void modifierDocumentFichier(DocumentFichier df) {
		dao.modifierDocumentFichier(df);
		
	}

	@Override
	public void supprimerDocumentFichier(Long id) {
		dao.supprimerDocumentFichier(id);
		
	}

	@Override
	public Long ajouterDocumentWeb(DocumentWeb dw) {
		return dao.ajouterDocumentWeb(dw);
	}

	@Override
	public void modifierDocumentWeb(DocumentWeb dw) {
		dao.modifierDocumentWeb(dw);
		
	}

	@Override
	public void supprimerDocumentWeb(Long id) {
		dao.supprimerDocumentWeb(id);
		
	}

	@Override
	public Long ajouterDocumentNote(DocumentNote dn) {
		return dao.ajouterDocumentNote(dn);
	}

	@Override
	public void modifierDocumentNote(DocumentNote dn) {
		dao.modifierDocumentNote(dn);
		
	}

	@Override
	public void supprimerDocumentNote(Long id) {
		dao.supprimerDocumentNote(id);
		
	}

	@Override
	public List<DocumentFichier> listDocumentFichier() {
		return dao.listDocumentFichier();
	}

	@Override
	public DocumentFichier getDocumentFichier(Long id) {
		return dao.getDocumentFichier(id);
	}

	@Override
	public List<DocumentWeb> listDocumentWeb() {
		return dao.listDocumentWeb();
	}

	@Override
	public DocumentWeb getDocumentWeb(Long id) {
		return dao.getDocumentWeb(id);
	}

	@Override
	public List<DocumentNote> listDocumentNote() {
		return dao.listDocumentNote();
	}

	@Override
	public DocumentNote getDocumentNote(Long id) {
		return dao.getDocumentNote(id);
	}

	@Override
	public Long addImpAll(Imprimante imp, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.addImpAll(imp, user, lieu, document, contact, contrat);
	}

	@Override
	public Long addPerAll(Peripherique per, Long pc, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.addPerAll(per, pc, lieu, document, contact, contrat);
	}

	@Override
	public Long addTeleMobileAll(TelephneMobile telem, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.addTeleMobileAll(telem, user, lieu, document, contact, contrat);
	}
	
	
	@Override
	public Long addTabletteAll(Tablette tab, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.addTabletteAll(tab, user, lieu, document, contact, contrat);
	}
	
	@Override
	public Long addTeleFixeAll(TelephoneFixe fixe, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.addTeleFixeAll(fixe, user, lieu, document, contact, contrat);
	}
	
	@Override
	public Long addSIMAll(Sim sim, Long user, List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.addSIMAll(sim, user, document, contact, contrat);
	}
	
	@Override
	public Long addRackAll(Rack rack, Long lieu, List<Long> chassis, List<Long> materiels, List<Long> pdu,
			List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.addRackAll(rack, lieu, chassis, materiels, pdu, document, contact, contrat);
	}
	
	@Override
	public Long addChassisAll(Chassis Chassis, Long lieu, Long rack, List<Long> materiels, List<Long> document,
			List<Long> contact, List<Long> contrat) {
		return dao.addChassisAll(Chassis, lieu, rack, materiels, document, contact, contrat);
	}
	
	public Long ajouterAutreLogicielAll(AutreLogiciel al,Long serv,Long mach,Long l, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		return dao.ajouterAutreLogicielAll(al, serv, mach, l, contacts, documents, solutionsApplicatives, contrats);
		
	}

	@Override
	public Long ajouterLogicielPcAll(LogicielPc lp,Long serv,Long mach, Long l, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		return dao.ajouterLogicielPcAll(lp, serv, mach, l, contacts, documents, solutionsApplicatives, contrats);
		 
	}

	@Override
	public Long ajouterServeurWebAll(ServeurWeb sw,Long serv,Long mach, Long l, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> applicationWeb, List<Long> contrats) {
		return dao.ajouterServeurWebAll(sw, serv, mach, l, contacts, documents, solutionsApplicatives, applicationWeb, contrats);
		
	}

	@Override
	public Long ajouterMiddlewareAll(Middleware m,Long serv,Long mach, Long l, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> instancesMiddleware, List<Long> contrats) {
		return dao.ajouterMiddlewareAll(m, serv, mach, l, contacts, documents, solutionsApplicatives, instancesMiddleware, contrats);
		
	} 

	@Override
	public Long ajouterServeurDeBasseDeDonneesAll(ServeurDeBasseDeDonnees sbd,Long serv,Long mach, Long l, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> instancesBD, List<Long> contrats) {
		return dao.ajouterServeurDeBasseDeDonneesAll(sbd, serv, mach, l, contacts, documents, solutionsApplicatives, instancesBD, contrats);
		 
	}

	@Override
	public Long ajouterApplicationWebAll(ApplicationWeb aw, Long sw, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		return dao.ajouterApplicationWebAll(aw, sw, contacts, documents, solutionsApplicatives, contrats);
	}

	@Override
	public Long ajouterInstanceMiddlewareAll(InstanceMiddleware im, Long m, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		return dao.ajouterInstanceMiddlewareAll(im, m, contacts, documents, solutionsApplicatives, contrats);
		
	}

	@Override
	public Long ajouterInstanceDeBasseDeDonnesAll(InstanceDeBasseDeDonnes ibd, Long sbd, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> contrats) {
		return dao.ajouterInstanceDeBasseDeDonnesAll(ibd, sbd, contacts, documents, solutionsApplicatives, contrats);
		
	}

	@Override
	public Long ajouterHyperviseurAll(Hyperviseur h, Long vCluster, Long Serveur, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> volumesLogiques,
			List<Long> machinesVirtuelles, List<Long> contrats) {
		return dao.ajouterHyperviseurAll(h, vCluster, Serveur, contacts, documents, solutionsApplicatives, volumesLogiques, machinesVirtuelles, contrats);
		
	}

	@Override
	public Long ajouterVclusterAll(Vcluster v, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> volumesLogiques, List<Long> machinesVirtuelles,
			List<Long> hyperviseurs, List<Long> contrats) {
		return dao.ajouterVclusterAll(v, contacts, documents, solutionsApplicatives, volumesLogiques, machinesVirtuelles, hyperviseurs, contrats);
		
	}

	@Override
	public Long addArriveeElectriqueAll(ArriveeElectrique ae, Long lieu, List<Long> pdus, List<Long> contacts,
			List<Long> documents, List<Long> contrats) {
		return dao.addArriveeElectriqueAll(ae, lieu, pdus, contacts, documents, contrats);
		
	}

	@Override
	public Long addPduElectriqueAll(PduElectrique pdue, Long lieu, Long rack, Long arrivee, List<Long> contacts,
			List<Long> documents, List<Long> contrats) {
		return dao.addPduElectriqueAll(pdue, lieu, rack, arrivee, contacts, documents, contrats);
	}
	
	@Override
	public Long addServeurAll(Serveur Serveur, Long lieu, Long rack, Long chassis, Long licenseos,
			List<Long> sourceelec, List<Long> Logiciel, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> San, List<Long> volumesLogique, List<Long> document,
			List<Long> contact, List<Long> contrat) {
		return dao.addServeurAll(Serveur, lieu, rack, chassis, licenseos, sourceelec, Logiciel, SolutionApplicative, interfacereseau, equipementreseaux, San, volumesLogique, document, contact, contrat);
	}
	
	@Override
	public Long addEquipementReseauAll(EquipementReseau er, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.addEquipementReseauAll(er, lieu, rack, chassis, sourceelec, SolutionApplicative, interfacereseau, document, contact, contrat);
	}
	
	@Override
	public Long addSystemeDeStockageAll(SystemeDeStockage sds, Long lieu, Long rack, Long chassis,
			List<Long> sourceelec, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> San, List<Long> volumesLogique, List<Long> document,
			List<Long> contact, List<Long> contrat) {
		return dao.addSystemeDeStockageAll(sds, lieu, rack, chassis, sourceelec, SolutionApplicative, interfacereseau, equipementreseaux, San, volumesLogique, document, contact, contrat);
	}
	
	@Override
	public Long addSwitchSanAll(SwitchSan san, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> equipementreseaux,
			List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.addSwitchSanAll(san, lieu, rack, chassis, sourceelec, SolutionApplicative, interfacereseau, equipementreseaux, document, contact, contrat);
	}

	@Override
	public Long ajouterLicenseLogicielAll(LicenseLogiciel ll, Long logiciel, List<Long> documents) {
		return dao.ajouterLicenseLogicielAll(ll, logiciel, documents); 
	}

	@Override
	public Long ajouterLicenseOsAll(LicenseOs lo, Long versionOs, List<Long> documents, List<Long> serveurs,
			List<Long> machineVirtuelle) {
		return dao.ajouterLicenseOsAll(lo, versionOs, documents, serveurs, machineVirtuelle); 
	}

	@Override
	public Long ajouterMachineVirtuelleAll(MachineVirtuelle mv, Long virtualisation, Long license, List<Long> logiciels,
			List<Long> contacts, List<Long> documents, List<Long> solutionsApplicatives, List<Long> interfacesReseaux,
			List<Long> volumesLogiques, List<Long> contrats) {
		return dao.ajouterMachineVirtuelleAll(mv, virtualisation, license, logiciels, contacts, documents, solutionsApplicatives, interfacesReseaux, volumesLogiques, contrats);
	}

	@Override
	public Long addProcessusMetierAll(ProcessusMetier pm, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives) {
		return dao.addProcessusMetierAll(pm, contacts, documents, solutionsApplicatives); 
	}

	@Override
	public Long addSolutionApplicativeAll(SolutionApplicative sa, List<Long> contacts, List<Long> documents
			, List<Long> processusMetiers, List<Long> contrats) {
		return dao.addSolutionApplicativeAll(sa, contacts, documents, processusMetiers, contrats); 
	}
	
	@Override
	public Long addPhysiqueAll(Physique Physique, List<Long> vlans) {
		return dao.addPhysiqueAll(Physique, vlans);
	}
	
	@Override
	public Long addSubnetAll(Subnet Subnet, List<Long> vlans) {
		return dao.addSubnetAll(Subnet, vlans);
	}
	
	@Override
	public Long addCameraAll(Camera Cam, Long lieu, Long dvr, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.addCameraAll(Cam, lieu, dvr, document, contact, contrat);
	}
	
	@Override
	public Long addVlanAll(Vlan Vlan, List<Long> subnets, List<Long> intefaceReseau) {
		return dao.addVlanAll(Vlan, subnets, intefaceReseau);
	}
	
	@Override
	public Long addVolumeLogiqueAll(VolumeLogique vl, List<Long> serveurs, List<Long> machinevertuelle) {
		return dao.addVolumeLogiqueAll(vl, serveurs, machinevertuelle);
	}
	
	@Override
	public Long addDvrAll(Dvr dvr, Long lieu, Long rack, Long chassis, List<Long> sourceelec, List<Long> cameras,
			List<Long> interfacereseau, List<Long> equipementreseaux, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.addDvrAll(dvr, lieu, rack, chassis, sourceelec, cameras, interfacereseau, equipementreseaux, document, contact, contrat);
	}
	
	@Override
	public List<Ordinateur> SearchPC(String s) {
		return dao.SearchPC(s);
	}


	@Override
	public void editPCAll(Ordinateur pc, Long user, Long lieu, Long licenseos, List<Long> logicielEtApplication,
			List<Long> equipementReseau, List<Long> intefaceReseau, List<Long> peripherique, List<Long> document,
			List<Long> contact, List<Long> contrat) {
		dao.editPCAll(pc, user, lieu, licenseos, logicielEtApplication, equipementReseau, intefaceReseau, peripherique, document, contact, contrat);
	}

	@Override
	public Long editImpAll(Imprimante imp, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.editImpAll(imp, user, lieu, document, contact, contrat);
	}

	@Override
	public Long editTeleMobileAll(TelephneMobile telem, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.editTeleMobileAll(telem, user, lieu, document, contact, contrat);
	}

	@Override
	public Long editSIMAll(Sim sim, Long user, List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.editSIMAll(sim, user, document, contact, contrat);
	}

	@Override
	public Long editTabletteAll(Tablette tab, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.editTabletteAll(tab, user, lieu, document, contact, contrat);
	}

	@Override
	public Long editTeleFixeAll(TelephoneFixe fixe, Long user, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.editTeleFixeAll(fixe, user, lieu, document, contact, contrat);
	}

	@Override
	public Long editPerAll(Peripherique per, Long pc, Long lieu, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.editPerAll(per, pc, lieu, document, contact, contrat);
	}

	@Override
	public Long editVlanAll(Vlan Vlan, List<Long> subnets, List<Long> intefaceReseau) {
		return dao.editVlanAll(Vlan, subnets, intefaceReseau);
	}

	@Override
	public Long editSubnetAll(Subnet Subnet, List<Long> vlans) {
		return dao.editSubnetAll(Subnet, vlans);
	}

	@Override
	public Long editCameraAll(Camera Cam, Long lieu, Long dvr, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.editCameraAll(Cam, lieu, dvr, document, contact, contrat);
	}

	@Override
	public Long editVolumeLogiqueAll(VolumeLogique vl, List<Long> serveurs, List<Long> machinevertuelle) {
		return dao.editVolumeLogiqueAll(vl, serveurs, machinevertuelle);
	}

	@Override
	public Long editDvrAll(Dvr dvr, Long lieu, Long rack, Long chassis, List<Long> sourceelec, List<Long> cameras,
			List<Long> interfacereseau, List<Long> equipementreseaux, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.editDvrAll(dvr, lieu, rack, chassis, sourceelec, cameras, interfacereseau, equipementreseaux, document, contact, contrat);
	}

	@Override
	public Long editRackAll(Rack rack, Long lieu, List<Long> chassis, List<Long> materiels, List<Long> pdu,
			List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.editRackAll(rack, lieu, chassis, materiels, pdu, document, contact, contrat);
	}

	@Override
	public Long editChassisAll(Chassis Chassis, Long lieu, Long rack, List<Long> materiels, List<Long> document,
			List<Long> contact, List<Long> contrat) {
		return dao.editChassisAll(Chassis, lieu, rack, materiels, document, contact, contrat);
	}

	@Override
	public Long editServeurAll(Serveur Serveur, Long lieu, Long rack, Long chassis, Long licenseos,
			List<Long> sourceelec, List<Long> Logiciel, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> San, List<Long> volumesLogique, List<Long> document,
			List<Long> contact, List<Long> contrat) {
		return dao.editServeurAll(Serveur, lieu, rack, chassis, licenseos, sourceelec, Logiciel, SolutionApplicative, interfacereseau, equipementreseaux, San, volumesLogique, document, contact, contrat);
	}

	@Override
	public Long editSystemeDeStockageAll(SystemeDeStockage sds, Long lieu, Long rack, Long chassis,
			List<Long> sourceelec, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> San, List<Long> volumesLogique, List<Long> document,
			List<Long> contact, List<Long> contrat) {
		return dao.editSystemeDeStockageAll(sds, lieu, rack, chassis, sourceelec, SolutionApplicative, interfacereseau, equipementreseaux, San, volumesLogique, document, contact, contrat);
	}

	@Override
	public Long editSwitchSanAll(SwitchSan san, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> equipementreseaux,
			List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.editSwitchSanAll(san, lieu, rack, chassis, sourceelec, SolutionApplicative, interfacereseau, equipementreseaux, document, contact, contrat);
	}

	@Override
	public Long editEquipementReseauAll(EquipementReseau er, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> document, List<Long> contact,
			List<Long> contrat) {
		return dao.editEquipementReseauAll(er, lieu, rack, chassis, sourceelec, SolutionApplicative, interfacereseau, document, contact, contrat);
	}

	@Override
	public List<Imprimante> SearchImp(String s) {
		return dao.SearchImp(s);
	}

	@Override
	public List<TelephneMobile> SearchTeleMobile(String s) {
		return dao.SearchTeleMobile(s);
	}

	@Override
	public List<Sim> SearchSIM(String s) {
		return dao.SearchSIM(s);
	}

	@Override
	public List<Tablette> SearchTablette(String s) {
		return dao.SearchTablette(s);
	}

	@Override
	public List<TelephoneFixe> SearchTeleFixe(String s) {
		return dao.SearchTeleFixe(s);
	}

	@Override
	public List<Peripherique> SearchPeriph(String s) {
		return dao.SearchPeriph(s);
	}

	@Override
	public List<Vlan> SearchVlan(String s) {
		return dao.SearchVlan(s);
	}

	@Override
	public List<Subnet> SearchSubnet(String s) {
		return dao.SearchSubnet(s);
	}

	@Override
	public List<Camera> SearchCamera(String s) {
		return dao.SearchCamera(s);
	}

	@Override
	public List<VolumeLogique> SearchVolumeLogique(String s) {
		return dao.SearchVolumeLogique(s);
	}

	@Override
	public List<Dvr> SearchDvr(String s) {
		return dao.SearchDvr(s);
	}

	@Override
	public List<Rack> SearchRack(String s) {
		return dao.SearchRack(s);
	}

	@Override
	public List<Chassis> SearchChassis(String s) {
		return dao.SearchChassis(s);
	}

	@Override
	public List<Bandotheque> SearchBandotheque(String s) {
		return dao.SearchBandotheque(s);
	}

	@Override
	public List<Serveur> SearchServeur(String s) {
		return dao.SearchServeur(s);
	}

	@Override
	public List<SystemeDeStockage> SearchSystemeDeStockage(String s) {
		return dao.SearchSystemeDeStockage(s);
	}

	@Override
	public List<SwitchSan> SearchSwitchSan(String s) {
		return dao.SearchSwitchSan(s);
	}

	@Override
	public List<Nas> SearchNas(String s) {
		return dao.SearchNas(s);
	}

	@Override
	public List<EquipementReseau> SearchEquipementReseau(String s) {
		return dao.SearchEquipementReseau(s);
	}
	
	@Override
	public List<IntefaceReseau> SearchInterfaceReseau(String s) {
		return dao.SearchInterfaceReseau(s);
	}
	
	@Override
	public Long addBandothequeAll(Bandotheque Bandotheque, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> Bandes, List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> equipementreseaux,
			List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.addBandothequeAll(Bandotheque, lieu, rack, chassis, sourceelec, Bandes, SolutionApplicative, interfacereseau, equipementreseaux, document, contact, contrat);
	}
	
	@Override
	public Long addNasAll(Nas Nas, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SystemedeFichierNAS, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.addNasAll(Nas, lieu, rack, chassis, sourceelec, SystemedeFichierNAS, SolutionApplicative, interfacereseau, equipementreseaux, document, contact, contrat);
	}

	@Override
	public Long editBandothequeAll(Bandotheque Bandotheque, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> Bandes, List<Long> SolutionApplicative, List<Long> interfacereseau, List<Long> equipementreseaux,
			List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.editBandothequeAll(Bandotheque, lieu, rack, chassis, sourceelec, Bandes, SolutionApplicative, interfacereseau, equipementreseaux, document, contact, contrat);
	}
	
	@Override
	public Long editNasAll(Nas Nas, Long lieu, Long rack, Long chassis, List<Long> sourceelec,
			List<Long> SystemedeFichierNAS, List<Long> SolutionApplicative, List<Long> interfacereseau,
			List<Long> equipementreseaux, List<Long> document, List<Long> contact, List<Long> contrat) {
		return dao.editNasAll(Nas, lieu, rack, chassis, sourceelec, SystemedeFichierNAS, SolutionApplicative, interfacereseau, equipementreseaux, document, contact, contrat);
	}
	
	@Override
	public List<Ordinateur> ListPCUser(Long id) {
		return dao.ListPCUser(id);
	}
	
	@Override
	public List<Imprimante> ListImpUser(Long id) {
		return dao.ListImpUser(id);
	}
	
	@Override
	public List<Sim> ListSIMUser(Long id) {
		return dao.ListSIMUser(id);
	}
	
	@Override
	public List<Tablette> ListTabletteUser(Long id) {
		return dao.ListTabletteUser(id);
	}
	
	@Override
	public List<TelephoneFixe> ListTeleFixeUser(Long id) {
		return dao.ListTeleFixeUser(id);
	}
	
	@Override
	public List<TelephneMobile> ListTeleMobileUser(Long id) {
		return dao.ListTeleMobileUser(id);
	}
	
	@Override
	public Long editPhysiqueAll(Physique Physique, List<Long> vlans) {
		return dao.editPhysiqueAll(Physique, vlans);
	}
	
	public void modifierApplicationWeb(ApplicationWeb aw, Long sw, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		dao.modifierApplicationWeb(aw, sw, contacts, documents, solutionsApplicatives, contrats); 
	}

	@Override
	public List<ApplicationWeb> SearchApplicationWeb(String aw) {
		return dao.SearchApplicationWeb(aw); 
	}

	@Override
	public void modifierInstanceMiddleware(InstanceMiddleware im, Long m, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> contrats) {
		dao.modifierInstanceMiddleware(im, m, contacts, documents, solutionsApplicatives, contrats); 
		
	}

	@Override
	public List<InstanceMiddleware> SearchInstanceMiddleware(String im) {
		return dao.SearchInstanceMiddleware(im); 
	}

	@Override
	public void modifierInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd, Long sbd, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> contrats) {
		dao.modifierInstanceDeBasseDeDonnes(ibd, sbd, contacts, documents, solutionsApplicatives, contrats); 
		
	}

	@Override
	public List<InstanceDeBasseDeDonnes> SearchInstanceDeBasseDeDonnes(String ibd) {
		return dao.SearchInstanceDeBasseDeDonnes(ibd); 
	}

	@Override
	public void modifierAutreLogiciel(AutreLogiciel al, Long serv, Long mach, Long l, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> contrats) {
		dao.modifierAutreLogiciel(al, serv, mach, l, contacts, documents, solutionsApplicatives, contrats); 
		
	}

	@Override
	public List<AutreLogiciel> SearchAutreLogiciel(String al) {
		return dao.SearchAutreLogiciel(al); 
	}

	@Override
	public void modifierLogicielPc(LogicielPc lp, Long serv, Long mach, Long l, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> contrats) {
		dao.modifierLogicielPc(lp, serv, mach, l, contacts, documents, solutionsApplicatives, contrats); 
		
	}

	@Override
	public List<LogicielPc> SearchLogicielPc(String lp) {
		return dao.SearchLogicielPc(lp); 
	}

	@Override
	public void modifierServeurWeb(ServeurWeb sw, Long serv, Long mach, Long l, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> applicationWeb, List<Long> contrats) {
		dao.modifierServeurWeb(sw, serv, mach, l, contacts, documents, solutionsApplicatives, applicationWeb, contrats); 
		
	}

	@Override
	public List<ServeurWeb> SearchServeurWeb(String sw) {
		return dao.SearchServeurWeb(sw); 
	}

	@Override
	public void modifierMiddleware(Middleware m, Long serv, Long mach, Long l, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> instancesMiddleware,
			List<Long> contrats) {
		dao.modifierMiddleware(m, serv, mach, l, contacts, documents, solutionsApplicatives, instancesMiddleware, contrats); 
		
	}

	@Override
	public List<Middleware> SearchMiddleware(String mi) {
		return dao.SearchMiddleware(mi); 
	}

	@Override
	public void modifierServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees sbd, Long serv, Long mach, Long l,
			List<Long> contacts, List<Long> documents, List<Long> solutionsApplicatives, List<Long> instancesBD,
			List<Long> contrats) {
		dao.modifierServeurDeBasseDeDonnees(sbd, serv, mach, l, contacts, documents, solutionsApplicatives, instancesBD, contrats); 
		
	}

	@Override
	public List<ServeurDeBasseDeDonnees> SearchServeurDeBasseDeDonnees(String sbd) {
		return dao.SearchServeurDeBasseDeDonnees(sbd); 
	}

	@Override
	public void modifierContact(Contact c, Long idlieu) {
		dao.modifierContact(c, idlieu); 
		
	}

	@Override
	public List<Contact> SearchContact(String c) {
		return dao.SearchContact(c); 
	}

	@Override
	public void modifierContrat(Contrat c, List<Long> contacts, List<Long> documents) {
		dao.modifierContrat(c, contacts, documents); 
		
	}

	@Override
	public List<Contrat> SearchContrat(String c) {
		return dao.SearchContrat(c);
	}

	@Override
	public void modifierLicenseLogiciel(LicenseLogiciel ll, Long logiciel, List<Long> documents) {
		dao.modifierLicenseLogiciel(ll, logiciel, documents); 
		
	}

	@Override
	public List<LicenseLogiciel> SearchLicenseLogiciel(String ll) {
		return dao.SearchLicenseLogiciel(ll); 
	}

	@Override
	public void modifierLicenseOs(LicenseOs lo, Long versionOs, List<Long> documents, List<Long> serveurs,
			List<Long> machineVirtuelle) {
		dao.modifierLicenseOs(lo, versionOs, documents, serveurs, machineVirtuelle); 
		
	}

	@Override
	public List<LicenseOs> SearchLicenseOs(String lo) {
		return dao.SearchLicenseOs(lo); 
	}

	@Override
	public List<VersionOs> SearchVersionOs(String vo) {
		return dao.SearchVersionOs(vo); 
	}

	@Override
	public void editProcessusMetier(ProcessusMetier pm, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives) {
		dao.editProcessusMetier(pm, contacts, documents, solutionsApplicatives); 
	}

	@Override
	public List<ProcessusMetier> SearchProcessusMetier(String pm) {
		return dao.SearchProcessusMetier(pm); 
	}

	@Override
	public void editArriveeElectrique(ArriveeElectrique ae, Long lieu, List<Long> pdus, List<Long> contacts,
			List<Long> documents, List<Long> contrats) {
		dao.editArriveeElectrique(ae, lieu, pdus, contacts, documents, contrats); 
		
	}

	@Override
	public List<ArriveeElectrique> SearchArriveeElectrique(String ae) {
		return dao.SearchArriveeElectrique(ae); 
	}

	@Override
	public void editPduElectrique(PduElectrique pdue, Long lieu, Long rack, Long arrivee, List<Long> contacts,
			List<Long> documents, List<Long> contrats) {
		dao.editPduElectrique(pdue, lieu, rack, arrivee, contacts, documents, contrats); 
		
	}

	@Override
	public List<PduElectrique> SearchPduElectrique(String pdue) {
		return dao.SearchPduElectrique(pdue); 
	}

	@Override
	public void modifierMachineVirtuelle(MachineVirtuelle mv, Long virtualisation, Long license, List<Long> logiciels,
			List<Long> contacts, List<Long> documents, List<Long> solutionsApplicatives, List<Long> interfacesReseaux,
			List<Long> volumesLogiques, List<Long> contrats) {
		dao.modifierMachineVirtuelle(mv, virtualisation, license, logiciels, contacts, documents, solutionsApplicatives, interfacesReseaux, volumesLogiques, contrats); 
		
	}

	@Override
	public List<MachineVirtuelle> SearchMachineVirtuelle(String mv) {
		return dao.SearchMachineVirtuelle(mv); 
	}

	@Override
	public void modifierVcluster(Vcluster v, List<Long> contacts, List<Long> documents,
			List<Long> solutionsApplicatives, List<Long> volumesLogiques, List<Long> machinesVirtuelles,
			List<Long> hyperviseurs, List<Long> contrats) {
		dao.modifierVcluster(v, contacts, documents, solutionsApplicatives, volumesLogiques, machinesVirtuelles, hyperviseurs, contrats); 
		
	}

	@Override
	public List<Vcluster> SearchVcluster(String v) {
		return dao.SearchVcluster(v);
	}

	@Override
	public void modifierHyperviseur(Hyperviseur h, Long vCluster, Long Serveur, List<Long> contacts,
			List<Long> documents, List<Long> solutionsApplicatives, List<Long> volumesLogiques,
			List<Long> machinesVirtuelles, List<Long> contrats) {
		dao.modifierHyperviseur(h, vCluster, Serveur, contacts, documents, solutionsApplicatives, volumesLogiques, machinesVirtuelles, contrats); 
		
	}

	@Override
	public List<Hyperviseur> SearchHyperviseur(String h) {
		return dao.SearchHyperviseur(h); 
	}

	@Override
	public List<DocumentFichier> SearchDocumentFichier(String df) {
		return dao.SearchDocumentFichier(df);
	}

	@Override
	public List<DocumentWeb> SearchDocumentWeb(String dw) {
		return dao.SearchDocumentWeb(dw);
	}

	@Override
	public List<DocumentNote> SearchDocumentNote(String dn) {
		return dao.SearchDocumentNote(dn); 
	}

	@Override
	public void editSolutionApplicative(SolutionApplicative sa, List<Long> contacts, List<Long> documents,
			List<Long> processusMetiers, List<Long> contrats) {
		dao.editSolutionApplicative(sa, contacts, documents, processusMetiers, contrats); 
		
	}

	@Override
	public List<SolutionApplicative> SearchSolutionApplicative(String sa) {
		return dao.SearchSolutionApplicative(sa); 
	}

	@Override
	public List<Document> SearchDocument(String d) {
		return dao.SearchDocument(d); 
	}

	@Override
	public List<Ordinateur> SearchPCUser(String s, Long user) {
		return dao.SearchPCUser(s, user);
	}

	@Override
	public List<Imprimante> SearchImpUser(String s, Long user) {
		return dao.SearchImpUser(s, user);
	}

	@Override
	public List<TelephneMobile> SearchTeleMobileUser(String s, Long user) {
		return dao.SearchTeleMobileUser(s, user);
	}

	@Override
	public List<Sim> SearchSIMUser(String s, Long user) {
		return dao.SearchSIMUser(s, user);
	}

	@Override
	public List<Tablette> SearchTabletteUser(String s, Long user) {
		return dao.SearchTabletteUser(s, user);
	}

	@Override
	public List<TelephoneFixe> SearchTeleFixeUser(String s, Long user) {
		return dao.SearchTeleFixeUser(s, user);
	}

	@Override
	public List<Groupe> SearchGroupe(String g) {
		return dao.SearchGroupe(g); 
	}

	@Override
	public List<ConnexionElectrique> SearchConnexionElectrique(String ce) {
		return dao.SearchConnexionElectrique(ce); 
	}

	@Override
	public Long ajouterGroupe(Groupe g, Long id_groupe, List<Long> applicationWeb, List<Long> connexionElectrique,
			List<Long> logiciel, List<Long> infrastructure, List<Long> camera, List<Long> chassis,
			List<Long> equipementreseau, List<Long> virtualisation, List<Long> imprimante,
			List<Long> instanceMiddleware, List<Long> instancedebasededonnees, List<Long> machinevirtuelle,
			List<Long> ordinateur, List<Long> processusmetier, List<Long> peripherique, List<Long> rack,
			List<Long> solutionapplicative, List<Long> tablette, List<Long> telephonefixe, List<Long> telephonemobile) {
		return dao.ajouterGroupe(g, id_groupe, applicationWeb, connexionElectrique, logiciel, infrastructure, camera, chassis,
				equipementreseau, virtualisation, imprimante, instanceMiddleware, instancedebasededonnees, machinevirtuelle,
				ordinateur, processusmetier, peripherique, rack, solutionapplicative, tablette, telephonefixe, telephonemobile);
	}

	@Override
	public void modifierGroupe(Groupe g, Long id_groupe, List<Long> applicationWeb, List<Long> connexionElectrique,
			List<Long> logiciel, List<Long> infrastructure, List<Long> camera, List<Long> chassis,
			List<Long> equipementreseau, List<Long> virtualisation, List<Long> imprimante,
			List<Long> instanceMiddleware, List<Long> instancedebasededonnees, List<Long> machinevirtuelle,
			List<Long> ordinateur, List<Long> processusmetier, List<Long> peripherique, List<Long> rack,
			List<Long> solutionapplicative, List<Long> tablette, List<Long> telephonefixe, List<Long> telephonemobile) {
		dao.modifierGroupe(g, id_groupe, applicationWeb, connexionElectrique, logiciel, infrastructure, camera, chassis,
				equipementreseau, virtualisation, imprimante, instanceMiddleware, instancedebasededonnees, machinevirtuelle,
				ordinateur, processusmetier, peripherique, rack, solutionapplicative, tablette, telephonefixe, telephonemobile);
		
	}


	@Override
	public void editTicketIncident(TicketIncident t) {
		dao.editTicketIncident(t); 
		
	}

	@Override
	public void deleteTicketIncident(Long id) {
		dao.deleteTicketIncident(id); 
		
	}

	@Override
	public List<TicketIncident> SearchTicketIncident(String ti) {
		return dao.SearchTicketIncident(ti); 
	}

	@Override
	public List<TicketIncident> listTicketIncident() {
		return dao.listTicketIncident();
	}

	@Override
	public TicketIncident getTicketIncident(Long id) {
		return dao.getTicketIncident(id); 
	}

	@Override
	public Long addTicketIncident(TicketIncident t, Long demandeur) {
		return dao.addTicketIncident(t, demandeur); 
	}
	
	@Override
	public List<TicketIncident> listTicketIncidentUser(Long u) {
		return dao.listTicketIncidentUser(u);
	}
	
	@Override
	public List<TicketIncident> SearchTicketIncidentUser(Long u, String ti) {
		return dao.SearchTicketIncidentUser(u, ti);
	}


}

