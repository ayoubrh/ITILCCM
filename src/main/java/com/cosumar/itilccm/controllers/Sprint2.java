package com.cosumar.itilccm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cosumar.itilccm.entities.*;
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
	    model.addAttribute("logged", logged);
		model.addAttribute("lieu", new Lieu() );
		return "sprint2/addLieu";
	}
	@RequestMapping(value="/admin/add/contact")
	public String addContact(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("contact", new Contact());
		model.addAttribute("l", m.listLieu());
		return "sprint2/addContact";
	}
	@RequestMapping(value="/admin/add/contrat")
	public String addContrat(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("contrat", new Contrat());
		//model.addAttribute("l", m.listLieu());
		return "sprint2/addContrat";
	}
	@RequestMapping(value="/admin/add/groupe")
	public String addGroupe(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("groupe", new Groupe());
		model.addAttribute("g", m.listGroupe());
		return "sprint2/addGroupe";
	}
	@RequestMapping(value="/admin/add/solutionApplicative")
	public String addSolutionApplicative(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("solutionApplicative", new SolutionApplicative());
		return "sprint2/addSolutionApplicative";
	}
	@RequestMapping(value="/admin/add/processusMetier")
	public String addProcessusMetier(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("processusMetier", new ProcessusMetier());
		return "sprint2/addProcessusMetier";
	}
	@RequestMapping(value="/admin/add/licenceLogiciel")
	public String addLicenceLogiciel(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("licenceLogiciel", new LicenseLogiciel());
		model.addAttribute("la", m.listLogicielEtApplication());
		return "sprint2/addLicenceLogiciel";
	}
	@RequestMapping(value="/admin/add/licenceOs")
	public String addLicenceOs(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("licenceOs", new LicenseOs());
		model.addAttribute("v", m.listVersionOs());
		return "sprint2/addLicenceOs";
	}
	@RequestMapping(value="/admin/add/versionOs")
	public String addVersionOs(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("versionOs", new VersionOs());
		return "sprint2/addVersionOs";
	}
	@RequestMapping(value="/admin/add/machineVirtuelle")
	public String addMachineVirtuelle(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("machineVirtuelle", new MachineVirtuelle());
		model.addAttribute("v", m.listVirtualisation());
		model.addAttribute("l", m.listLicenseOs());
		//model.addAttribute("vo", m.listVersionOs());
		return "sprint2/addMachineVirtuelle";
	}
	@RequestMapping(value="/admin/add/hyperviseur")
	public String addHyperviseur(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("hyperviseur", new Hyperviseur());
		model.addAttribute("v", m.listVcluster());
		model.addAttribute("s", m.ListServeur());
		return "sprint2/addHyperviseur";
	}
	@RequestMapping(value="/admin/add/vCluster")
	public String addVcluster(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("vCluster", new Vcluster());
		return "sprint2/addVcluster";
	}
	@RequestMapping(value="/admin/add/arrivee")
	public String addArriveeElectrique(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("arrivee", new ArriveeElectrique());
		return "sprint2/addArriveeElectrique";
	}
	@RequestMapping(value="/admin/add/pdu")
	public String addPduElectrique(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("pdu", new PduElectrique());
		model.addAttribute("r", m.ListRack());
		model.addAttribute("a", m.ListArriveeElectrique());
		return "sprint2/addPduElectrique";
	}
	@RequestMapping(value="/admin/add/middleware")
	public String addMiddleware(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("middleware", new Middleware());
		model.addAttribute("lg", m.listLicenseLogiciel());
		//model.addAttribute("s", m.ListServeur());
		//model.addAttribute("mv", m.listMachineVirtuelle());
		return "sprint2/addMiddleware";
	}
	
}
