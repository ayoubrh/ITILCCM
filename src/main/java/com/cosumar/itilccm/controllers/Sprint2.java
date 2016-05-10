package com.cosumar.itilccm.controllers;

import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
	    dateFormat.setLenient(false);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	

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
		model.addAttribute("ordinateur", new Ordinateur() );
		model.addAttribute("logiciels", m.listLogicielPc());
		model.addAttribute("peripheriques", m.ListPeriph());
		model.addAttribute("interfacereseaux", m.ListPhysique());
		model.addAttribute("equipementreseaux", m.ListEquipementReseau());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("users", m.listUser());
		model.addAttribute("lieus", m.listLieu());
		model.addAttribute("licenseos", m.listLicenseOs());
		return "sprint2/addPC";
	}
	
	@RequestMapping(value="/admin/add/savePC", method = RequestMethod.POST)
	public String savePC(@Valid Ordinateur pc,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("Date : "+pc.getDateD_achat());
		System.out.println("User : "+pc.getUser().getId());
		System.out.println("LocenseOS : "+pc.getLicenseOs().getId());
		System.out.println("Lieu : "+pc.getLieu().getId());
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("logiciels", m.listLogicielPc());
			model.addAttribute("peripheriques", m.ListPeriph());
			model.addAttribute("interfacereseaux", m.ListPhysique());
			model.addAttribute("equipementreseaux", m.ListEquipementReseau());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("users", m.listUser());
			model.addAttribute("lieus", m.listLieu());
			model.addAttribute("licenseos", m.listLicenseOs());
			return "sprint2/addPC";
		}
		System.out.println("Test test 3");
		String[] chLogiciels = req.getParameterValues("chLogiciels");
		System.out.println("Test test 4");
		List<Long> chlog = null;
		System.out.println("---------chLogiciels : "+chLogiciels+" chlog : "+chlog);
		String[] chper = req.getParameterValues("chPeriph");
		List<Long> chp = null;
		System.out.println("---------chper : "+chper+" chp : "+chp);
		String[] chinterfacereseau = req.getParameterValues("chinterfacereseau");
		List<Long> chir = null;
		System.out.println("--------- chinterfacereseau : "+chinterfacereseau+" chir : "+chir);
		String[] chequipementreseaux = req.getParameterValues("chequipementreseaux");
		List<Long> cher = null;
		System.out.println("---------chequipementreseaux : "+chequipementreseaux+" cher : "+cher);
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		if(chLogiciels != null){
			chlog = new ArrayList<Long>();
			for (int i = 0; i < chLogiciels.length; i++) {
				System.out.println("---------chLogiciels"+chLogiciels[i]);
				chlog.add(Long.parseLong(chLogiciels[i]));
			}
			
		}
		if(chper != null){
			chp = new ArrayList<Long>();
			for (int i = 0; i < chper.length; i++) {
				System.out.println("---------chper"+chper[i]);
				chp.add(Long.parseLong(chper[i]));
			}
		}
		if(chinterfacereseau != null){
			chir = new ArrayList<Long>();
			for (int i = 0; i < chinterfacereseau.length; i++) {
				System.out.println("---------chinterfacereseau"+chinterfacereseau[i]);
				chir.add(Long.parseLong(chinterfacereseau[i]));
			}
		}
		if(chequipementreseaux != null){
			cher = new ArrayList<Long>();
			for (int i = 0; i < chequipementreseaux.length; i++) {
				System.out.println("---------chequipementreseaux"+chequipementreseaux[i]);
				cher.add(Long.parseLong(chequipementreseaux[i]));
			}
		}
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument"+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat"+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact"+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		System.out.println("user : "+pc.getUser()+" ID : "+pc.getUser().getId());
		System.out.println("Lieu : "+pc.getLieu()+" ID : "+pc.getLieu().getId());
		System.out.println("Lieu : "+pc.getLicenseOs()+" ID : "+pc.getLicenseOs().getId());
			//m.addPCAll(pc, null, chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		
		m.addPCAll(pc, pc.getUser().getId(), pc.getLieu().getId(), pc.getLicenseOs().getId(),chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboard";
	}
	
	@RequestMapping(value="/admin/add/imp")
	public String addImp(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("imprimante", new Imprimante() );
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("users", m.listUser());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addImp";
	}
	
	

	@RequestMapping(value="/admin/add/saveImp", method = RequestMethod.POST)
	public String saveImp(@Valid Imprimante imp,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("users", m.listUser());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addImp";
		}
		System.out.println("Test test 3");
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument"+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat"+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact"+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		System.out.println("user : "+imp.getUser()+" ID : "+imp.getUser().getId());
		System.out.println("Lieu : "+imp.getLieu()+" ID : "+imp.getLieu().getId());
			//m.addPCAll(pc, null, chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		
		m.addImpAll(imp, imp.getUser().getId(), imp.getLieu().getId(), chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboard";
	}
	
	
	@RequestMapping(value="/admin/add/per")
	public String addper(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("Peripherique", new Peripherique() );
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("users", m.listUser());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addPer";
	}
	
	

	@RequestMapping(value="/admin/add/savePer", method = RequestMethod.POST)
	public String saveper(@Valid Peripherique per,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("pc", m.ListPC());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addPer";
		}
		System.out.println("Test test 3");
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument"+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat"+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact"+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		System.out.println("user : "+per.getOrdinateur()+" ID : "+per.getOrdinateur().getId());
		System.out.println("Lieu : "+per.getLieu()+" ID : "+per.getLieu().getId());
			//m.addPCAll(pc, null, chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		
		m.addPerAll(per, per.getOrdinateur().getId(), per.getLieu().getId(), chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboard";
	}
	
	
	@RequestMapping(value="/admin/add/telemobile")
	public String addTeleMobile(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("telephneMobile", new TelephneMobile() );
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("users", m.listUser());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addTeleMobile";
	}
	
	

	@RequestMapping(value="/admin/add/saveTeleMobile", method = RequestMethod.POST)
	public String saveTeleMobile(@Valid TelephneMobile telem,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("users", m.listUser());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addTeleMobile";
		}
		System.out.println("Test test 3");
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument"+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat"+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact"+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		System.out.println("user : "+telem.getUser()+" ID : "+telem.getUser().getId());
		System.out.println("Lieu : "+telem.getLieu()+" ID : "+telem.getLieu().getId());
			//m.addPCAll(pc, null, chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		
		m.addTeleMobileAll(telem, telem.getUser().getId(), telem.getLieu().getId(), chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboard";
	}
	
	
	@RequestMapping(value="/admin/add/telefixe")
	public String addTeleFixe(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("telephoneFixe", new TelephoneFixe() );
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("users", m.listUser());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addTeleFixe";
	}
	
	

	@RequestMapping(value="/admin/add/saveTeleFixe", method = RequestMethod.POST)
	public String saveTeleFixe(@Valid TelephoneFixe telefixe,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("users", m.listUser());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addTeleFixe";
		}
		System.out.println("Test test 3");
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument"+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat"+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact"+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		System.out.println("user : "+telefixe.getUser()+" ID : "+telefixe.getUser().getId());
		System.out.println("Lieu : "+telefixe.getLieu()+" ID : "+telefixe.getLieu().getId());
			//m.addPCAll(pc, null, chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		
		m.addTeleFixeAll(telefixe, telefixe.getUser().getId(), telefixe.getLieu().getId(), chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboard";
	}
	
	
	@RequestMapping(value="/admin/add/tablette")
	public String addTablette(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("tablette", new Tablette() );
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("users", m.listUser());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addTablette";
	}
	
	

	@RequestMapping(value="/admin/add/saveTablette", method = RequestMethod.POST)
	public String saveTablette(@Valid Tablette tab,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("users", m.listUser());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addTablette";
		}
		System.out.println("Test test 3");
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument"+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat"+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact"+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		System.out.println("user : "+tab.getUser()+" ID : "+tab.getUser().getId());
		System.out.println("Lieu : "+tab.getLieu()+" ID : "+tab.getLieu().getId());
			//m.addPCAll(pc, null, chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		
		m.addTabletteAll(tab, tab.getUser().getId(), tab.getLieu().getId(), chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboard";
	}
	
	
	
	@RequestMapping(value="/admin/add/sim")
	public String addSim(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("sim", new Sim() );
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("users", m.listUser());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addTablette";
	}
	
	

	@RequestMapping(value="/admin/add/saveSim", method = RequestMethod.POST)
	public String saveSim(@Valid Sim sim,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("users", m.listUser());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addTablette";
		}
		System.out.println("Test test 3");
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument"+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat"+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact"+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		System.out.println("user : "+sim.getUser()+" ID : "+sim.getUser().getId());
		System.out.println("Lieu : "+sim.getLieu()+" ID : "+sim.getLieu().getId());
			//m.addPCAll(pc, null, chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		
		m.addSIMAll(sim, sim.getUser().getId(), sim.getLieu().getId(), chdoc, chcontact, chcontrat);
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
