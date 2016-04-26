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
	
	

	
	
	
	
	
	

}

