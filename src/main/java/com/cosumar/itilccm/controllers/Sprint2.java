package com.cosumar.itilccm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cosumar.itilccm.entities.Lieu;
import com.cosumar.itilccm.entities.User;
import com.cosumar.itilccm.metier.AdminMetier;
import com.cosumar.itilccm.metier.UtilisateurMetier;

@Controller
@RequestMapping(value="/config")
public class Sprint2 {
	
	@Autowired
	private AdminMetier m;
	
	@Autowired
	private UtilisateurMetier mu;
	
	@RequestMapping(value="/admin/dashboard")
	public String index(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("Rack", logged);
		model.addAttribute("Chassis", logged);
		model.addAttribute("Serveur", logged);
		model.addAttribute("SwitchSAN", logged);
		model.addAttribute("NAS", logged);
		model.addAttribute("Bandotheque", logged);
		model.addAttribute("ConnectionElectrique", logged);
		model.addAttribute("DVR", logged);
		model.addAttribute("Equipementreseau", logged);
		model.addAttribute("Systemedestockage", logged);
		model.addAttribute("vCluster", logged);
		model.addAttribute("Hyperviseur", logged);
		model.addAttribute("Machinevirtuelle", logged);
		model.addAttribute("Ordinateur", logged);
		model.addAttribute("Telephonefixe", logged);
		model.addAttribute("Telephonemobile", logged);
		model.addAttribute("Tablette", logged);
		model.addAttribute("Imprimante", logged);
		model.addAttribute("Peripherique", logged);
		model.addAttribute("Middleware", logged);
		model.addAttribute("ServeurWeb", logged);
		model.addAttribute("Serveurdebasededonnees", logged);
		model.addAttribute("LogicielPC", logged);
		model.addAttribute("Autrelogiciel", logged);
		model.addAttribute("InstanceMiddleware", logged);
		model.addAttribute("Instancedebasededonnees", logged);
		model.addAttribute("ApplicationWeb", logged);
		model.addAttribute("License", logged);
		model.addAttribute("InterfaceReseau", logged);
		model.addAttribute("Subnet", logged);
		model.addAttribute("VLAN", logged);
		model.addAttribute("Volumelogique", logged);
		model.addAttribute("Processusmetier", logged);
		model.addAttribute("Solutionapplicative", logged);
		model.addAttribute("Groupe", logged);
		model.addAttribute("Camera", logged);

		return "sprint2/dashbord";
	}
	
	
	@RequestMapping(value="/admin/add/pc")
	public String addPC(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		return "sprint2/addPC";
	}
	
	@RequestMapping(value="/admin/add/lieu")
	public String addLieu(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
	    model.addAttribute("logged", logged);
		model.addAttribute("lieu", new Lieu() );
		return "sprint2/addLieu";
	}
}
