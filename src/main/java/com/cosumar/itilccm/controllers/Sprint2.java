package com.cosumar.itilccm.controllers;

import java.awt.image.BufferedImage;
import java.util.Collection;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;


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
		model.addAttribute("Rack", m.ListRack().size());
		model.addAttribute("Chassis", m.ListChassis().size());
		model.addAttribute("Serveur", m.ListServeur().size());
		model.addAttribute("SwitchSAN", m.ListSwitchSan().size());
		model.addAttribute("NAS", m.ListNas().size());
		model.addAttribute("Bandotheque", m.ListBandotheque().size());
		model.addAttribute("ConnectionElectrique", m.ListConnexionElectrique().size());
		model.addAttribute("DVR", m.ListDvr().size());
		model.addAttribute("Equipementreseau", m.ListEquipementReseau().size());
		model.addAttribute("Systemedestockage", m.ListSystemeDeStockage().size());
		model.addAttribute("vCluster", m.listVcluster().size());
		model.addAttribute("Hyperviseur", m.listHyperviseur().size());
		model.addAttribute("Machinevirtuelle", m.listMachineVirtuelle().size());
		model.addAttribute("Ordinateur", m.ListPC().size());
		model.addAttribute("Telephonefixe", m.ListTeleFixe().size());
		model.addAttribute("Telephonemobile", m.ListTeleMobile().size());
		model.addAttribute("Tablette", m.ListTablette().size());
		model.addAttribute("Imprimante", m.ListImp().size());
		model.addAttribute("Peripherique", m.ListPeriph().size());
		model.addAttribute("Middleware", m.listMiddleware().size());
		model.addAttribute("ServeurWeb", m.listServeurWeb().size());
		model.addAttribute("Serveurdebasededonnees", m.listServeurDeBasseDeDonnees().size());
		model.addAttribute("LogicielPC", m.listLogicielPc().size());
		model.addAttribute("Autrelogiciel", m.listAutreLogiciel().size());
		model.addAttribute("InstanceMiddleware", m.listInstanceMiddleware().size());
		model.addAttribute("Instancedebasededonnees", m.listInstanceDeBasseDeDonnes().size());
		model.addAttribute("ApplicationWeb", m.listApplicationWeb().size());
		model.addAttribute("License", m.listLicenseLogiciel().size()+m.listLicenseOs().size());
		model.addAttribute("InterfaceReseau", m.ListInterfaceReseau().size());
		model.addAttribute("Subnet", m.ListSubnet().size());
		model.addAttribute("VLAN", m.ListVlan().size());
		model.addAttribute("Volumelogique", m.ListVolumeLogique().size());
		model.addAttribute("Processusmetier", m.ListProcessusMetier().size());
		model.addAttribute("Solutionapplicative", m.ListSolutionApplicative().size());
		model.addAttribute("Groupe", m.listGroupe().size());
		model.addAttribute("Camera", m.ListCamera().size());

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
		model.addAttribute("pc", new Ordinateur() );
		model.addAttribute("logiciels", m.listLogicielPc());
		model.addAttribute("peripheriques", m.ListPeriph());
		return "sprint2/addPC";
	}
	
	@RequestMapping(value="/admin/add/savePC", method = RequestMethod.POST)
	public String savePC(@Valid Ordinateur pc,BindingResult bind,HttpServletRequest req,Model model) {
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("logiciels", m.listLogicielPc());
			return "sprint2/addPC";
		}
		System.out.println("Test test 3");
		String[] chLogiciels = req.getParameterValues("chLogiciels");
		String[] chper = req.getParameterValues("chPeriph");
		if(chLogiciels != null){
			for (int i = 0; i < chLogiciels.length; i++) {
				//String[] chLogicielsvalue = req.getParameterValues(chLogiciels[i]);
				System.out.println("---------"+chLogiciels[i]);
			}
			if(chper != null){
				for (int i = 0; i < chper.length; i++) {
					System.out.println("---------"+chper[i]);
				}
			}
		}else {
			if(pc.getUser() != null){
				System.out.println("Ajout ordi avec user");
			}else {
				m.addPC(pc);
			}
		}
		return "redirect:/config/admin/dashboard";
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
	@RequestMapping(value="/admin/add/typeLicense")
	public String typeLicense(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		return "sprint2/TypeLicense";
	}
	
	@RequestMapping(value="/admin/add/typelicenseredirect")
	public String typelicenseredirect(Model model,HttpServletRequest req){
		String[] typelicense = req.getParameterValues("type");
		
		return "redirect:"+typelicense[0];
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
	@RequestMapping(value="/admin/add/licenseOs")
	public String addLicenseOs(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("licenseOs", new LicenseOs());
		model.addAttribute("v", m.listVersionOs());
		return "sprint2/addLicenseOs";
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
	@RequestMapping(value="/admin/add/typeDocument")
	public String typeDocument(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		return "sprint2/TypeDocument";
	}
	
	@RequestMapping(value="/admin/add/typeDocumentRedirect")
	public String typeDocumentRedirect(Model model,HttpServletRequest req){
		String[] typeDocument = req.getParameterValues("type");
		
		return "redirect:"+typeDocument[0];
	}
	@RequestMapping(value="/admin/add/fichier")
	public String addDocumentFichier(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("fichier", new DocumentFichier());
		return "sprint2/addDocumentFichier";
	}
	@RequestMapping(value="/admin/add/web")
	public String addDocumentWeb(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("web", new DocumentWeb());
		return "sprint2/addDocumentWeb";
	}
	@RequestMapping(value="/admin/add/note")
	public String addDocumentNote(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("note", new DocumentNote());
		return "sprint2/addDocumentNote";
	}
	
	@RequestMapping(value="/admin/add/autreLogiciel")
	public String addAutreLogiciel(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("autreLogiciel", new AutreLogiciel());
		model.addAttribute("lg", m.listLicenseLogiciel());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("mv", m.listMachineVirtuelle());
		return "sprint2/addAutreLogiciel";
	}
	@RequestMapping(value="/admin/add/logicielPc")
	public String addLogicielPc(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("logicielPc", new LogicielPc());
		model.addAttribute("lg", m.listLicenseLogiciel());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("mv", m.listMachineVirtuelle());
		return "sprint2/addLogicielPc";
	}
	@RequestMapping(value="/admin/add/serveurWeb")
	public String addServeurWeb(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("serveurWeb", new ServeurWeb());
		model.addAttribute("lg", m.listLicenseLogiciel());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("mv", m.listMachineVirtuelle());
		return "sprint2/addServeurWeb";
	}
	@RequestMapping(value="/admin/add/middleware")
	public String addMiddleware(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("middleware", new Middleware());
		model.addAttribute("lg", m.listLicenseLogiciel());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("mv", m.listMachineVirtuelle());
		return "sprint2/addMiddleware";
	}
	@RequestMapping(value="/admin/add/serveurBD")
	public String addServeurBD(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("serveurBD", new ServeurDeBasseDeDonnees());
		model.addAttribute("lg", m.listLicenseLogiciel());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("mv", m.listMachineVirtuelle());
		return "sprint2/addServeurBD";
	}
	@RequestMapping(value="/admin/add/applicationWeb")
	public String addApplicationWeb(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("applicationWeb", new ApplicationWeb());
		model.addAttribute("sw", m.listServeurWeb());
		return "sprint2/addApplicationWeb";
	}
	@RequestMapping(value="/admin/add/instanceMiddleware")
	public String addInstanceMiddleware(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("instanceMiddleware", new InstanceMiddleware());
		model.addAttribute("m", m.listMiddleware());
		return "sprint2/addInstanceMiddleware";
	}
	@RequestMapping(value="/admin/add/instanceBD")
	public String addInstanceDeBasseDeDonnes(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("instanceBD", new InstanceDeBasseDeDonnes());
		model.addAttribute("m", m.listServeurDeBasseDeDonnees());
		return "sprint2/addInstanceBD";
	}
	
}
