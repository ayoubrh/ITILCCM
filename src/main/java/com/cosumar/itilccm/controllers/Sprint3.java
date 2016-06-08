package com.cosumar.itilccm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cosumar.itilccm.entities.Groupe;
import com.cosumar.itilccm.entities.TicketIncident;
import com.cosumar.itilccm.entities.User;
import com.cosumar.itilccm.metier.AdminMetier;
import com.cosumar.itilccm.metier.UtilisateurMetier;

@Controller
@RequestMapping(value="/incid")
public class Sprint3 {
	@Autowired
	private AdminMetier m;
	
	@Autowired
	private UtilisateurMetier mu;
	
	@RequestMapping(value="/add/ticket")
	public String addTicketIncident(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("ticket", new TicketIncident());
		model.addAttribute("ApplicationWeb", m.listApplicationWeb());
	    model.addAttribute("ConnexionElectrique", m.ListConnexionElectrique());
	    model.addAttribute("Logiciel", m.listLogicielEtApplication());
	    model.addAttribute("Infrastructure", m.ListInfrastructure());
	    model.addAttribute("Camera", m.ListCamera());
		model.addAttribute("Chassis", m.ListChassis());
		model.addAttribute("Equipementreseau", m.ListEquipementReseau());
		model.addAttribute("Virtualisation", m.listVirtualisation());
		model.addAttribute("Imprimante", m.ListImp());
		model.addAttribute("InstanceMiddleware", m.listInstanceMiddleware());
		model.addAttribute("Instancedebasededonnees", m.listInstanceDeBasseDeDonnes());
		model.addAttribute("Machinevirtuelle", m.listMachineVirtuelle());
		model.addAttribute("Ordinateur", m.ListPC());
		model.addAttribute("Processusmetier", m.ListProcessusMetier());
		model.addAttribute("Peripherique", m.ListPeriph());
		model.addAttribute("Rack", m.ListRack());
		model.addAttribute("Solutionapplicative", m.ListSolutionApplicative());
		model.addAttribute("Tablette", m.ListTablette());
		model.addAttribute("Telephonefixe", m.ListTeleFixe());
		model.addAttribute("Telephonemobile", m.ListTeleMobile()); 
		return "sprint3/ticket";
	}
}
