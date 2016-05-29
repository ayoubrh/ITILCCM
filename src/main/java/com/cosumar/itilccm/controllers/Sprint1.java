package com.cosumar.itilccm.controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
	private AdminMetier m;
	
	@Autowired
	private UtilisateurMetier mu;
	
	@RequestMapping(value="/index")
	public String index(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		return "sprint1/index";
	}
	
	@RequestMapping(value="/admin/add")
	public String add(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("user", new User());
		model.addAttribute("d", m.listDepartement());
		model.addAttribute("r", m.listRole());
		return "sprint1/add";
	}
	
	@RequestMapping(value="/admin/save")
	public String save(@Valid User user,BindingResult bind,
			Model model,MultipartFile file) throws Exception{
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
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
	    user.setPassword(mu.hashmd5password(password));
	    //System.out.println(hashmd5password(password));
	    String url = "http://localhost:8080/itilccm/valide?m="+user.getMatricule();
	    mu.SendEmail(user.getEmail(),
	    			"Nouveau Compte",
	    			"Matricule : "
	    					+user.getMatricule()
	    					+"<br>Mot de passe : "
	    					+password
	    					+"<br>Pour valid votre compte et pouvoir accder librement "
	    					+"<a href="+url+">Clickez ici</a>."
	    		);
		if(user.getRole().getId() == null){
			m.ajouterUser(user, user.getDepartement().getId());
			
		}
		else {
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
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("users", users);
		model.addAttribute("ids", ids);
		return "sprint1/all";
	}
	
	@RequestMapping(value="/profil")
	public String profil(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("user", m.getUser(id));
		model.addAttribute("pc", m.ListPCUser(id));
		model.addAttribute("imp", m.ListImpUser(id));
		model.addAttribute("telemobile", m.ListTeleMobileUser(id));
		model.addAttribute("telefixe", m.ListTeleFixeUser(id));
		model.addAttribute("tab", m.ListTabletteUser(id));
		model.addAttribute("sim", m.ListSIMUser(id));
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
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
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
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		      String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
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
		System.out.println(password+"length : "+password.length());
		if(password.length() != 0){
		    user.setPassword(mu.hashmd5password(password));
		    System.out.println(mu.hashmd5password(password));
		    mu.SendEmail(user.getEmail(),"Modification de Compte","Matricule : "+user.getMatricule()+"<br>Neauveau mot de passe : "+password);
		}else{
			user.setPassword(u.getPassword());
		}
		
		mu.modifierUser(user);
		return "redirect:/users/profil?id="+user.getId();
	}

	
	@RequestMapping(value="/photo",produces=MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] photo(Long id) throws IOException{
		User u = m.getUser(id);
		return IOUtils.toByteArray(new ByteArrayInputStream(u.getBphoto()));
	}
	
	
	
}
