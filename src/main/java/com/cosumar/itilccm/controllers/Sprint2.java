package com.cosumar.itilccm.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
		if(chLogiciels != null){
			for (int i = 0; i < chLogiciels.length; i++) {
				//String[] chLogicielsvalue = req.getParameterValues(chLogiciels[i]);
				System.out.println("---------"+chLogiciels[i]);
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
	@RequestMapping(value="/admin/add/saveLieu", method = RequestMethod.POST)
	public String saveLieu(@Valid Lieu l,BindingResult bind,Model model) {
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			return "sprint2/addLieu";
		}
		m.ajouterLieu(l);
		return "redirect:/index";
	}
	@RequestMapping(value="/admin/add/contact")
	public String addContact(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("contact", new Contact());
		model.addAttribute("l", m.listLieu());
		model.addAttribute("contrat", m.listContrat());
		return "sprint2/addContact";
	}
	
	@RequestMapping(value="/admin/add/saveContact", method = RequestMethod.POST)
	public String saveContact(@Valid Contact c,BindingResult bind,Model model,HttpServletRequest req) {
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			model.addAttribute("l", m.listLieu());
			model.addAttribute("contrat", m.listContrat());
			System.out.println(bind.getAllErrors());
			
			return "sprint2/addContact";
		}
		List<Long> cont = null;
		String[] Contrats = req.getParameterValues("ckContrats");
		System.out.println(Contrats.length);
		for(int i=0;i<Contrats.length; i++){
			
		    System.out.println("--------------"+Contrats[i]);}
		
		if(Contrats != null ){
			cont = new ArrayList<Long>();
			for (int i = 0; i < Contrats.length; i++) {
				
				cont.add(Long.parseLong(Contrats[i]));
			}
		}
		m.ajouterContactAll(c, c.getLieu().getId(), cont);
		return "redirect:/index";
	}
	
	@RequestMapping(value="/admin/add/contrat")
	public String addContrat(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("contrat", new Contrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		return "sprint2/addContrat";
	}
	
	@RequestMapping(value="/admin/add/saveContrat", method = RequestMethod.POST)
	public String saveContrat(@Valid Contrat c,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			return "sprint2/addContrat";
		}
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				System.out.println("Contact--------------"+Contacts[i]);
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				System.out.println("Doc--------------"+documents[i]);
				doc.add(Long.parseLong(documents[i]));
			}
		}
		m.ajouterContratAll(c, cont, doc);
		
		return "redirect:/index";
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
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("processusMetiers", m.ListProcessusMetier());
		return "sprint2/addSolutionApplicative";
	}
	@RequestMapping(value="/admin/add/processusMetier")
	public String addProcessusMetier(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("processusMetier", new ProcessusMetier());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
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
		model.addAttribute("documents", m.listDocument());
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
		model.addAttribute("documents", m.listDocument());
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
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("volumesLogiques", m.ListVolumeLogique());
		model.addAttribute("interfacereseaux", m.ListLogique());
		model.addAttribute("logiciels", m.listLogicielEtApplication());
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
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("volumesLogiques", m.ListVolumeLogique());
		model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
		return "sprint2/addHyperviseur";
	}
	@RequestMapping(value="/admin/add/saveHyperviseur", method = RequestMethod.POST)
	public String saveHyperviseur(@Valid Hyperviseur h,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("v", m.listVcluster());
			model.addAttribute("s", m.ListServeur());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("volumesLogiques", m.ListVolumeLogique());
			model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
			return "sprint2/addHyperviseur";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		List<Long> vol = new ArrayList<Long>();
		List<Long> mach = new ArrayList<Long>();
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		String[] volumesLogiques = req.getParameterValues("ckVolumesLogiques");
		String[] machinesVirtuelles = req.getParameterValues("ckMachinesVirtuelles");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(solutionsApplicatives != null ){
			for (int i = 0; i < solutionsApplicatives.length; i++) {
				
				sol.add(Long.parseLong(solutionsApplicatives[i]));
			}
		}
		
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		if(volumesLogiques  != null ){
			for (int i = 0; i < volumesLogiques.length; i++) {
				
				vol.add(Long.parseLong(volumesLogiques[i]));
			}
		}
		if(machinesVirtuelles != null ){
			for (int i = 0; i < machinesVirtuelles.length; i++) {
				
				mach.add(Long.parseLong(machinesVirtuelles[i]));
			}
		}	
		m.ajouterHyperviseurAll(h, h.getVcluster().getId(), h.getServeur().getId(), cont, doc, sol, vol, mach, contr);
		return "redirect:/config/admin/dashboard";
	}
	@RequestMapping(value="/admin/add/vCluster")
	public String addVcluster(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("vcluster", new Vcluster());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("volumesLogiques", m.ListVolumeLogique());
		model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
		model.addAttribute("hyperviseurs", m.listHyperviseur());
		return "sprint2/addVcluster";
	}
	@RequestMapping(value="/admin/add/saveVcluster", method = RequestMethod.POST)
	public String saveVcluster(@Valid Vcluster v,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("volumesLogiques", m.ListVolumeLogique());
			model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
			model.addAttribute("hyperviseurs", m.listHyperviseur());
			return "sprint2/addVcluster";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		List<Long> vol = new ArrayList<Long>();
		List<Long> mach = new ArrayList<Long>();
		List<Long> hyp = new ArrayList<Long>();
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		String[] volumesLogiques = req.getParameterValues("ckVolumesLogiques");
		String[] machinesVirtuelles = req.getParameterValues("ckMachinesVirtuelles");
		String[] hyperviseurs = req.getParameterValues("ckHyperviseurs");
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(solutionsApplicatives != null ){
			for (int i = 0; i < solutionsApplicatives.length; i++) {
				
				sol.add(Long.parseLong(solutionsApplicatives[i]));
			}
		}
		
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		if(volumesLogiques  != null ){
			for (int i = 0; i < volumesLogiques.length; i++) {
				
				vol.add(Long.parseLong(volumesLogiques[i]));
			}
		}
		if(machinesVirtuelles != null ){
			for (int i = 0; i < machinesVirtuelles.length; i++) {
				
				mach.add(Long.parseLong(machinesVirtuelles[i]));
			}
		}
		if(hyperviseurs != null ){
			for (int i = 0; i < hyperviseurs.length; i++) {
				
				hyp.add(Long.parseLong(hyperviseurs[i]));
			}
		}
		m.ajouterVclusterAll(v, cont, doc, sol, vol, mach, hyp, contr);
		return "redirect:/config/admin/dashboard";
	}
	@RequestMapping(value="/admin/add/typeConnexionElectrique")
	public String typeConnexionElectrique(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		return "sprint2/TypeConnexionElectrique";
	}
	
	@RequestMapping(value="/admin/add/typeConnexionElectriquedirect")
	public String typeConnexionElectriqueredirect(Model model,HttpServletRequest req){
		String[] typeConnexionElectrique = req.getParameterValues("type");
		
		return "redirect:"+typeConnexionElectrique[0];
	}
	@RequestMapping(value="/admin/add/arriveeElectrique")
	public String addArriveeElectrique(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("arriveeElectrique", new ArriveeElectrique());
		model.addAttribute("l", m.listLieu());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("pdus", m.ListPduElectrique());
		return "sprint2/addArriveeElectrique";
	}
	@RequestMapping(value="/admin/add/saveArriveeElectrique", method = RequestMethod.POST)
	public String saveArriveeElectrique(@Valid ArriveeElectrique ae,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("l", m.listLieu());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("pdus", m.ListPduElectrique());
			return "sprint2/addArriveeElectrique";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		List<Long> pdu = new ArrayList<Long>();
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] contrats = req.getParameterValues("ckContrats");
		String[] pdus = req.getParameterValues("ckPDUs");
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		if(pdus  != null ){
			for (int i = 0; i < pdus.length; i++) {
				
				pdu.add(Long.parseLong(pdus[i]));
			}
		}
		
		m.addArriveeElectriqueAll(ae, ae.getLieu().getId(), pdu, cont, doc, contr);	
		
		return "redirect:/config/admin/dashboard";
	}
	@RequestMapping(value="/admin/add/pduElectrique")
	public String addPduElectrique(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("pduElectrique", new PduElectrique());
		model.addAttribute("r", m.ListRack());
		model.addAttribute("a", m.ListArriveeElectrique());
		model.addAttribute("l", m.listLieu());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/addPduElectrique";
	}
	@RequestMapping(value="/admin/add/savePduElectrique", method = RequestMethod.POST)
	public String savePduElectrique(@Valid PduElectrique pe,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("r", m.ListRack());
			model.addAttribute("a", m.ListArriveeElectrique());
			model.addAttribute("l", m.listLieu());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			return "sprint2/addPduElectrique";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] contrats = req.getParameterValues("ckContrats");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				
				doc.add(Long.parseLong(documents[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats [i]));
			}
		}
		
		m.addPduElectriqueAll(pe, pe.getLieu().getId(),pe.getRack().getId(),pe.getArriveeElectrique().getId(), cont, doc, contr);	
		
		return "redirect:/config/admin/dashboard";
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
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/addAutreLogiciel";
	}
	@RequestMapping(value="/admin/add/saveAutreLogiciel", method = RequestMethod.POST)
	public String saveAutreLogiciel(@Valid AutreLogiciel al,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("lg", m.listLicenseLogiciel());
			model.addAttribute("s", m.ListServeur());
			model.addAttribute("mv", m.listMachineVirtuelle());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			return "sprint2/addAutreLogiciel";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("chSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				System.out.println("Contact--------------"+Contacts[i]);
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				System.out.println("Doc--------------"+documents[i]);
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(solutionsApplicatives != null ){
			for (int i = 0; i < solutionsApplicatives.length; i++) {
				
				System.out.println("solutionsApplicatives--------------"+solutionsApplicatives[i]);
				
				sol.add(Long.parseLong(solutionsApplicatives[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				System.out.println("contrats--------------"+contrats[i]);
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		
		m.ajouterAutreLogicielAll(al,al.getLicenseLogiciel().getId(), cont, doc, sol, contr);
		
		return "redirect:/config/admin/dashboard";
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
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/addLogicielPc";
	}
	@RequestMapping(value="/admin/add/saveLogicielPc", method = RequestMethod.POST)
	public String saveLogicielPc(@Valid LogicielPc lp,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("lg", m.listLicenseLogiciel());
			model.addAttribute("s", m.ListServeur());
			model.addAttribute("mv", m.listMachineVirtuelle());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			return "sprint2/addLogicielPc";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				System.out.println("Contact--------------"+Contacts[i]);
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				System.out.println("Doc--------------"+documents[i]);
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(solutionsApplicatives != null ){
			for (int i = 0; i < solutionsApplicatives.length; i++) {
				
				System.out.println("solutionsApplicatives--------------"+solutionsApplicatives[i]);
				
				sol.add(Long.parseLong(solutionsApplicatives[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				System.out.println("contrats--------------"+contrats[i]);
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		
		m.ajouterLogicielPcAll(lp, lp.getLicenseLogiciel().getId(), cont, doc, sol, contr);
		
		return "redirect:/config/admin/dashboard";
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
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("applicationWeb", m.listApplicationWeb());
		return "sprint2/addServeurWeb";
	}
	@RequestMapping(value="/admin/add/saveServeurWeb", method = RequestMethod.POST)
	public String saveServeurWeb(@Valid ServeurWeb sw,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("lg", m.listLicenseLogiciel());
			model.addAttribute("s", m.ListServeur());
			model.addAttribute("mv", m.listMachineVirtuelle());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			//model.addAttribute("applicationWeb", m.listApplicationWeb());
			return "sprint2/addServeurWeb";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(solutionsApplicatives != null ){
			for (int i = 0; i < solutionsApplicatives.length; i++) {
				
				sol.add(Long.parseLong(solutionsApplicatives[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		
		m.ajouterServeurWebAll(sw, sw.getLicenseLogiciel().getId(), cont, doc, sol, null, contr);	
		
		return "redirect:/config/admin/dashboard";
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
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("instanceMiddleware", m.listInstanceMiddleware());
		return "sprint2/addMiddleware";
	}
	@RequestMapping(value="/admin/add/saveMiddleware", method = RequestMethod.POST)
	public String saveMiddleware(@Valid Middleware mi,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
			model.addAttribute("lg", m.listLicenseLogiciel());
			model.addAttribute("s", m.ListServeur());
			model.addAttribute("mv", m.listMachineVirtuelle());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			//model.addAttribute("instanceMiddleware", m.listInstanceMiddleware());
			return "sprint2/addMiddleware";
			
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(solutionsApplicatives != null ){
			for (int i = 0; i < solutionsApplicatives.length; i++) {
				
				sol.add(Long.parseLong(solutionsApplicatives[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		
		m.ajouterMiddlewareAll(mi, mi.getLicenseLogiciel().getId(), cont, doc, sol, null, contr);
		
		return "redirect:/config/admin/dashboard";
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
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("instanceBD", m.listInstanceDeBasseDeDonnes());
		return "sprint2/addServeurBD";
	}
	@RequestMapping(value="/admin/add/saveServeurBD", method = RequestMethod.POST)
	public String saveServeurBD(@Valid ServeurDeBasseDeDonnees sbd,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("lg", m.listLicenseLogiciel());
			model.addAttribute("s", m.ListServeur());
			model.addAttribute("mv", m.listMachineVirtuelle());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			//model.addAttribute("instanceBD", m.listInstanceDeBasseDeDonnes());
			return "sprint2/addServeurBD";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(solutionsApplicatives != null ){
			for (int i = 0; i < solutionsApplicatives.length; i++) {
				
				sol.add(Long.parseLong(solutionsApplicatives[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		m.ajouterServeurDeBasseDeDonneesAll(sbd, sbd.getLicenseLogiciel().getId(), cont, doc, sol, null, contr);
		
		return "redirect:/config/admin/dashboard";
	}
	@RequestMapping(value="/admin/add/applicationWeb")
	public String addApplicationWeb(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("applicationWeb", new ApplicationWeb());
		model.addAttribute("sw", m.listServeurWeb());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/addApplicationWeb";
	}
	@RequestMapping(value="/admin/add/saveApplicationWeb", method = RequestMethod.POST)
	public String saveApplicationWeb(@Valid ApplicationWeb aw,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("sw", m.listServeurWeb());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			return "sprint2/addApplicationWeb";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(solutionsApplicatives != null ){
			for (int i = 0; i < solutionsApplicatives.length; i++) {
				
				sol.add(Long.parseLong(solutionsApplicatives[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		m.ajouterApplicationWebAll(aw, aw.getServeurWeb().getId(), cont, doc, sol, contr);
		
		return "redirect:/config/admin/dashboard";
	}
	@RequestMapping(value="/admin/add/instanceMiddleware")
	public String addInstanceMiddleware(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("instanceMiddleware", new InstanceMiddleware());
		model.addAttribute("m", m.listMiddleware());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/addInstanceMiddleware";
	}
	@RequestMapping(value="/admin/add/saveInstanceMiddleware", method = RequestMethod.POST)
	public String saveInstanceMiddleware(@Valid InstanceMiddleware im,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("m", m.listMiddleware());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			return "sprint2/addInstanceMiddleware";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(solutionsApplicatives != null ){
			for (int i = 0; i < solutionsApplicatives.length; i++) {
				
				sol.add(Long.parseLong(solutionsApplicatives[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		m.ajouterInstanceMiddlewareAll(im, im.getMiddleware().getId(), cont, doc, sol, contr);
		
		return "redirect:/config/admin/dashboard";
	}
	@RequestMapping(value="/admin/add/instanceBD")
	public String addInstanceDeBasseDeDonnes(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("instanceBD", new InstanceDeBasseDeDonnes());
		model.addAttribute("sbd", m.listServeurDeBasseDeDonnees());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/addInstanceBD";
	}
	@RequestMapping(value="/admin/add/saveInstanceBD", method = RequestMethod.POST)
	public String saveInstanceBD(@Valid InstanceDeBasseDeDonnes ibd,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("instanceBD", new InstanceDeBasseDeDonnes());
			model.addAttribute("sbd", m.listServeurDeBasseDeDonnees());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			return "sprint2/addInstanceBD";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				
				doc.add(Long.parseLong(documents[i]));
			}
		}
		
		if(solutionsApplicatives != null ){
			for (int i = 0; i < solutionsApplicatives.length; i++) {
				
				sol.add(Long.parseLong(solutionsApplicatives[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		m.ajouterInstanceDeBasseDeDonnesAll(ibd, ibd.getServeurDeBasseDeDonnees().getId(), cont, doc, sol, contr);
		
		return "redirect:/config/admin/dashboard";
	}
	
}
