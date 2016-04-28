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
            // simply log it and go on...
            System.err.println(ex.getMessage());            
        }
		
		// forwards to the view named "Result"
	}

	@Override
	public Long ajouterLieu(Lieu l) {
		
		return dao.ajouterLieu(l);
	}

	@Override
	public void modifierLieu(Lieu l) {
		dao.modifierLieu(l);
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
	public Long ajouterContact(Contact c) {
		
		return dao.ajouterContact(c);
		
	}

	@Override
	public Long ajouterContactLieu(Contact c, Long idlieu) {
		 
		return dao.ajouterContactLieu(c, idlieu);
	}

	@Override
	public void modifierContact(Contact c) {
		dao.modifierContact(c);
		
	}

	@Override
	public void supprimerContact(Long id) {
		dao.supprimerContact(id);
		
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
	public void modifierContrat(Contrat c) {
		dao.modifierContrat(c);
		
	}

	@Override
	public void supprimerContrat(Long id) {
		dao.supprimerContrat(id);
		
	}

	@Override
	public Long ajouterDocument(Document d) {
		
		return dao.ajouterDocument(d);
	}

	@Override
	public void modifierDocument(Document d) {
		dao.modifierDocument(d);
		
	}

	@Override
	public void supprimerDocument(Long id) {
		dao.supprimerDocument(id);
		
	}

	@Override
	public Long ajouterGroupe(Groupe g) {
		return dao.ajouterGroupe(g);
	}

	@Override
	public void modifierGroupe(Groupe d) {
		dao.modifierGroupe(d);
		
	}

	@Override
	public void supprimerGroupe(Long id) {
		dao.supprimerGroupe(id);
		
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
	public Long ajouterGroupe(Groupe g, Long id_groupe) {
		return dao.ajouterGroupe(g, id_groupe);
	}

	@Override
	public Long ajouterApplicationWeb(ApplicationWeb aw) {
		return dao.ajouterApplicationWeb(aw);
	}

	@Override
	public void modifierApplicationWeb(ApplicationWeb aw) {
		dao.modifierApplicationWeb(aw);
		
	}

	@Override
	public void supprimerApplicationWeb(Long id) {
		dao.supprimerApplicationWeb(id);
		
	}

	@Override
	public Long ajouterInstanceMiddleware(InstanceMiddleware im) {
		return dao.ajouterInstanceMiddleware(im);
	}

	@Override
	public void modifierInstanceMiddleware(InstanceMiddleware im) {
		dao.modifierInstanceMiddleware(im);
		
	}

	@Override
	public void supprimerInstanceMiddleware(Long id) {
		dao.supprimerInstanceMiddleware(id);
		
	}

	@Override
	public Long ajouterInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd) {
		return dao.ajouterInstanceDeBasseDeDonnes(ibd);
	}

	@Override
	public void modifierInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes ibd) {
		dao.modifierInstanceDeBasseDeDonnes(ibd);
		
	}

	@Override
	public void supprimerInstanceDeBasseDeDonnes(Long id) {
		dao.supprimerInstanceDeBasseDeDonnes(id);
		
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
	public void modifierLicenseLogiciel(LicenseLogiciel ll) {
		dao.modifierLicenseLogiciel(ll);
		
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
	public void modifierLicenseOs(LicenseOs lo) {
		dao.modifierLicenseOs(lo);
		
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
	public void modifierAutreLogiciel(AutreLogiciel al) {
		dao.modifierAutreLogiciel(al);
		
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
	public void modifierLogicielPc(LogicielPc lp) {
		dao.modifierLogicielPc(lp);
		
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
	public void modifierServeurWeb(ServeurWeb sw) {
		dao.modifierServeurWeb(sw);
		
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
	public void modifierMiddleware(Middleware m) {
		dao.modifierMiddleware(m);
		
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
	public void modifierServeurDeBasseDeDonnees(ServeurDeBasseDeDonnees sbd) {
		dao.modifierServeurDeBasseDeDonnees(sbd);
		
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
	public void modifierMachineVirtuelle(MachineVirtuelle mv) {
		dao.modifierMachineVirtuelle(mv);
		
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
	public void modifierVcluster(Vcluster v) {
		dao.modifierVcluster(v);
		
	}

	@Override
	public void supprimerVcluster(Long id) {
		dao.supprimerVcluster(id);
		
	}

	@Override
	public Long ajouterHyperviseur(Hyperviseur h) {
		return dao.ajouterHyperviseur(h);
	}

	@Override
	public void modifierHyperviseur(Hyperviseur h) {
		dao.modifierHyperviseur(h);
		
	}

	@Override
	public void supprimerHyperviseur(Long id) {
		dao.supprimerHyperviseur(id);
		
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

	

}

