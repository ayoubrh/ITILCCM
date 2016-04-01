package com.cosumar.itilccm;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.cosumar.itilccm.entities.User;
import com.cosumar.itilccm.metier.UtilisateurMetier;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController implements HandlerExceptionResolver {
	
	@Autowired
	private UtilisateurMetier mu;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home1( Model model) {
		return "redirect:/index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home( Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
	    return "index";
	}
	
	@RequestMapping(value = "/indexv")
	public String indexv( Model model, String v) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("v", v);
	    return "index";
	}
	
	@RequestMapping(value="/valide")
	public String valide(String m){
		User u = mu.getUserByMatricule(m);
		u.setActived(true);
		mu.modifierUser(u);
		return "redirect:/indexv?v=true";
	}
	
	@RequestMapping(value="/login")
	public String login(HttpServletRequest req) {
		return "login";
	}
	
	@RequestMapping(value="/forgot")
	public String forgot(HttpServletRequest req) {
		return "forgot";
	}
	
	@RequestMapping(value="/recop")
	public String recop(HttpServletRequest req,Model model){
		
		String matricule = req.getParameter("signup_name");
		String mail = req.getParameter("signup_email");
		System.out.println("m : "+matricule+"\n mail : "+mail);
		User u;
		try{
			u = mu.getUserByMatricule(matricule);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return "redirect:/forgot?error2="+true;
		}
		if(u.getEmail() == mail) {
			String url = "http://localhost:8080/itilccm/password?id="+u.getId();
			mu.SendEmail(mail, "Récupiration de mot de passee", "Vous avez demander de récuperer votre mot de passe.<br>"
					+"Pour récuprer le mot de passe "
					+"<a href="+url+">Clickez ici</a>."
					+"Si ce n'est pas vous, oublier ce message !"
					);
		}
		else{
			//model.addAttribute("error", arg1)
			return "redirect:forgot?error="+true;
		}
		
		
		return "info";
	}
	
	
	@RequestMapping(value="/photo",produces=MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] photo(Long id) throws IOException{
		User u = mu.getUser(id);
		return IOUtils.toByteArray(new ByteArrayInputStream(u.getBphoto()));
	}
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex",ex.getMessage());
		mv.setViewName("page-500");
		return mv;
	}
	
}
