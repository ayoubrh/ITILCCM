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

}

