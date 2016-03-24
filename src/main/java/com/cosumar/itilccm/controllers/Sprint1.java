package com.cosumar.itilccm.controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.cosumar.itilccm.entities.*;
import com.cosumar.itilccm.metier.AdminMetier;
import com.cosumar.itilccm.metier.UtilisateurMetier;

@Controller
@RequestMapping(value="/users")
@SessionAttributes("edituser")
public class Sprint1 {

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private AdminMetier m;
	
	@Autowired
	private UtilisateurMetier mu;
	
	@RequestMapping(value="/index")
	public String index(Model model){
		return "sprint1/index";
	}
	
	@RequestMapping(value="/admin/add")
	public String add(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("d", m.listDepartement());
		model.addAttribute("r", m.listRole());
		return "sprint1/add";
	}
	
	@RequestMapping(value="/admin/save")
	public String save(@Valid User user,BindingResult bind,
			Model model,MultipartFile file) throws Exception{
		if(bind.hasErrors()){
			model.addAttribute("d", m.listDepartement());
			model.addAttribute("r", m.listRole());
			return "sprint1/add";
		}
		if(!file.isEmpty()){
			BufferedImage bi = ImageIO.read(file.getInputStream());
			user.setBphoto(file.getBytes());
			user.setPhoto(file.getOriginalFilename());
		}
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	    String password = "";
	    for(int x=0;x<7;x++)
	    {
	       int i = (int)Math.floor(Math.random() * chars.length()); 
	       password += chars.charAt(i);
	    }
	    //System.out.println(password);
	    user.setPassword(hashmd5password(password));
	    //System.out.println(hashmd5password(password));
	    SendEmail(user.getEmail(),"Nouveau Compte","Matricule : "+user.getMatricule()+"\n Mot de passe : "+password);
		//System.out.println("000000000000000000000000000000 : "+user.getRole().getId());
		if(user.getRole().getId() == null){
			//System.out.println("aaaaaaaaaaaaaaaaaaa");
			m.ajouterUser(user, user.getDepartement().getId());
			
		}
		else {
			//System.out.println("bbbbbbbbbbbbbbbbbbbb");
			m.ajouterUserRole(user, user.getDepartement().getId(), user.getRole().getId());
		}
		return "redirect:/users/index";
	}

	@RequestMapping(value="/admin/all")
	public String all(Model model){
		ArrayList<Long> ids = new ArrayList<Long>();
		List<User> users = m.listUser();
		for (User user : users) {
			ids.add(user.getId());
		}
		System.out.println(ids.get(0));
		System.out.println(ids);
		model.addAttribute("users", users);
		model.addAttribute("ids", ids);
		return "sprint1/all";
	}
	
	@RequestMapping(value="/profil")
	public String profil(Model model,Long id){
		model.addAttribute("user", m.getUser(id));
		//User t = m.getUser(id);
		//System.out.println(t.getBphoto()+"\n"+t.getPhoto());
		return "sprint1/profil";
	}
	
	@RequestMapping(value="/admin/delete", method = RequestMethod.GET) 
	public String delete(@RequestParam(value = "ids", required = true) String[] t){
		for (String s : t) {
			Long id = Long.parseLong(s);
			m.supprimerUser(id);
		}
		return "redirect:/users/admin/all";
	}
	
	@RequestMapping(value="/edit") 
	public String edit(Long id, Model model){
		model.addAttribute("edituser", mu.getUser(id));
		model.addAttribute("user", mu.getUser(id));
		model.addAttribute("d", mu.listDepartement());
		model.addAttribute("r", mu.listRole());
		return "sprint1/edit";
	}

	
	
	@RequestMapping(value="/editsave")
	public String editsave(@Valid User user,BindingResult bind,HttpServletRequest req,
			Model model,MultipartFile file) throws Exception{
		User u = (User) model.asMap().get("edituser");
		System.out.println("AAAAAAAAAAAA : "+user.getId());
		if(bind.hasErrors()){
			model.addAttribute("d", mu.listDepartement());
			model.addAttribute("r", mu.listRole());
			return "sprint1/edit";
		}
		if(!file.isEmpty()){
			BufferedImage bi = ImageIO.read(file.getInputStream());
			user.setBphoto(file.getBytes());
			user.setPhoto(file.getOriginalFilename());
		}else{
			if(model.asMap().get("edituser")!=null){
				user.setPhoto(u.getPhoto());
				user.setBphoto(u.getBphoto());
			}
		}
		String password = req.getParameter("jq-validation-password");
		System.out.println(password+"length"+password.length());
		if(password.length() != 0){
		    user.setPassword(hashmd5password(password));
		    System.out.println(hashmd5password(password));
		    SendEmail(user.getEmail(),"Modification de Compte","Matricule : "+user.getMatricule()+"\n Neauveau mot de passe : "+password);
		}else{
			user.setPassword(u.getPassword());
		}
		
		mu.modifierUser(user);
		return "redirect:/users/profil?id="+user.getId();
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
	
	
	public void SendEmail(String recipientAddress, String subject, String message) {
		// takes input from e-mail form
				
		// prints debug info
		System.out.println("To: " + recipientAddress);
		System.out.println("Subject: " + subject);
		System.out.println("Message: " + message);
		
		// creates a simple e-mail object
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(recipientAddress);
		email.setSubject(subject);
		email.setText(message);
		
		// sends the e-mail
		mailSender.send(email);
		
		// forwards to the view named "Result"
	}
	
	@RequestMapping(value="/photo",produces=MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] photo(Long id) throws IOException{
		User u = mu.getUser(id);
		System.out.println(IOUtils.toByteArray(new ByteArrayInputStream(u.getBphoto())));
		return IOUtils.toByteArray(new ByteArrayInputStream(u.getBphoto()));
	}
	
	
	
}
