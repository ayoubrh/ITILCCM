package com.cosumar.itilccm.metier;

import java.security.MessageDigest;
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
	public void deletePeriph(Long id) {
		dao.deletePeriph(id);
		
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
	public Long addVlan(Vlan Vlan) {
		return dao.addVlan(Vlan);
	}

	@Override
	public void editVlan(Vlan Vlan) {
		dao.editVlan(Vlan);
		
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
	public void editProcessusMetier(ProcessusMetier pm) {
		dao.editProcessusMetier(pm);
		
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
	public void editSolutionApplicative(SolutionApplicative sa) {
		dao.editSolutionApplicative(sa);
		
	}

	@Override
	public void deleteSolutionApplicative(Long id) {
		dao.deleteSolutionApplicative(id);
		
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
	public void deleteVolumeLogique(Long id) {
		dao.deleteVolumeLogique(id);
		
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
	public void deleteDvr(Long id) {
		dao.deleteDvr(id);
		
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
	public void editArriveeElectrique(ArriveeElectrique ae) {
		dao.editArriveeElectrique(ae);
		
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
	public void editPduElectrique(PduElectrique pdue) {
		dao.editPduElectrique(pdue);
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
	
	

	
	
	
	
	
	

}

