package com.cosumar.itilccm.controllers;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
		model.addAttribute("sim", m.ListSIM().size());
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
		model.addAttribute("save", false);
		return "sprint2/dashbord";
	}
	
	
	@RequestMapping(value="/admin/dashboards")
	public String index(Model model, String save){
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
		model.addAttribute("sim", m.ListSIM().size());
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
		model.addAttribute("save", save);
		return "sprint2/dashbord";
	}
	
	@RequestMapping(value="/admin/add/neveauCI")
	public String neveauCI(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		return "sprint2/TypeCI_fonctionnel";
	}
	
	@RequestMapping(value="/admin/add/neveauCIdirect")
	public String neveauCIdirect(Model model,HttpServletRequest req){
		String[] neveauCI = req.getParameterValues("type");
		
		return "redirect:"+neveauCI[0];
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
		System.out.println("Ordinateur ID : "+pc.getId());
		if(pc.getId() == null){
			m.addPCAll(pc, pc.getUser().getId(), pc.getLieu().getId(), pc.getLicenseOs().getId(),chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		} else {
			m.editPCAll(pc, pc.getUser().getId(), pc.getLieu().getId(), pc.getLicenseOs().getId(),chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
			return "redirect:/config/view/pc?id="+pc.getId()+"&save="+true;
		}
		return "redirect:/config/admin/dashboards?save="+true;
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
		return "redirect:/config/admin/dashboards?save="+true;
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
		return "redirect:/config/admin/dashboards?save="+true;
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
		model.addAttribute("users", m.listUserTeleMobile());
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
			model.addAttribute("users", m.listUserTeleMobile());
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
		return "redirect:/config/admin/dashboards?save="+true;
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
		model.addAttribute("users", m.listUserTeleFixe());
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
			model.addAttribute("users", m.listUserTeleFixe());
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
		return "redirect:/config/admin/dashboards?save="+true;
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
		model.addAttribute("users", m.listUserTablette());
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
			model.addAttribute("users", m.listUserTablette());
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
		return "redirect:/config/admin/dashboards?save="+true;
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
		model.addAttribute("users", m.listUserSim());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addSim";
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
			model.addAttribute("users", m.listUserSim());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addSim";
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
			//m.addPCAll(pc, null, chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		
		m.addSIMAll(sim, sim.getUser().getId(), chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	
	
	@RequestMapping(value="/admin/add/rack")
	public String addRack(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("rack", new Rack() );
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("lieus", m.listLieu());
		model.addAttribute("chasiss", m.ListChassis());
		model.addAttribute("materiels", m.ListInfrastructure());
		model.addAttribute("pduelect", m.ListPduElectrique());
		return "sprint2/addRack";
	}
	
	@RequestMapping(value="/admin/add/saveRack", method = RequestMethod.POST)
	public String saveRack(@Valid Rack rack,BindingResult bind,HttpServletRequest req,Model model) {
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
			model.addAttribute("lieus", m.listLieu());
			model.addAttribute("chasiss", m.ListChassis());
			model.addAttribute("materiels", m.ListInfrastructure());
			model.addAttribute("pduelect", m.ListPduElectrique());
			return "sprint2/addRack";
		}
		System.out.println("Test test 3");
		String[] chchassis = req.getParameterValues("chchassis");
		System.out.println("Test test 4");
		List<Long> chchas = null;
		System.out.println("---------chchassis : "+chchassis+" chchas : "+chchas);
		String[] chMateriel = req.getParameterValues("chMateriel");
		List<Long> chmat = null;
		List<Long> pdu = null;
		System.out.println("---------chMateriel : "+chMateriel+" chmat : "+chmat);
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		if(chchassis != null){
			chchas = new ArrayList<Long>();
			for (int i = 0; i < chchassis.length; i++) {
				System.out.println("---------chchassis"+chchassis[i]);
				chchas.add(Long.parseLong(chchassis[i]));
			}
			
		}
		if(chMateriel != null){
			chmat = new ArrayList<Long>();
			pdu = new ArrayList<Long>();
			for (int i = 0; i < chMateriel.length; i++) {
				System.out.println("---------chMateriel"+chMateriel[i]);
				//chmat.add(Long.parseLong(chMateriel[i]));
				System.out.println("---------chMateriel id : "+chMateriel[i].substring(4));
				System.out.println("---------chMateriel Class : "+chMateriel[i].substring(0,3));
				if(chMateriel[i].substring(0,3).equals("Mat")){
					chmat.add(Long.parseLong(chMateriel[i].substring(4)));
					System.out.println("--------- Mat : "+chmat);
				}else {
					pdu.add(Long.parseLong(chMateriel[i].substring(4)));
					System.out.println("--------- PDU : "+pdu);
				}
			}
			if(chmat.size() == 0) chmat=null;
			if(pdu.size() == 0) pdu = null;
			
		}
		System.out.println("---------pdu : "+pdu+" chmat : "+chmat);
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
		System.out.println("Lieu : "+rack.getLieu()+" ID : "+rack.getLieu().getId());
			//m.addPCAll(pc, null, chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		
		//m.addRackAll(rack, rack.getLieu().getId(), chchassis, chmateriels, chdoc, chcontact, chcontrat);
		m.addRackAll(rack, rack.getLieu().getId(), chchas, chmat, pdu, chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	
	@RequestMapping(value="/admin/add/chassis")
	public String addChassis(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("chassis", new Chassis() );
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("lieus", m.listLieu());
		model.addAttribute("racks", m.ListRack());
		model.addAttribute("materiels", m.ListInfrastructure());
		return "sprint2/addChassis";
	}
	
	@RequestMapping(value="/admin/add/saveChassis", method = RequestMethod.POST)
	public String saveChassis(@Valid Chassis chassis,BindingResult bind,HttpServletRequest req,Model model) {
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
			model.addAttribute("lieus", m.listLieu());
			model.addAttribute("racks", m.ListRack());
			model.addAttribute("materiels", m.ListInfrastructure());
			return "sprint2/addChassis";
		}
		System.out.println("Test test 3");
		String[] chMateriel = req.getParameterValues("chMateriel");
		List<Long> chmat = null;
		System.out.println("---------chMateriel : "+chMateriel+" chmat : "+chmat);
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		if(chMateriel != null){
			chmat = new ArrayList<Long>();
			for (int i = 0; i < chMateriel.length; i++) {
				System.out.println("---------chMateriel"+chMateriel[i]);
				chmat.add(Long.parseLong(chMateriel[i]));
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
		System.out.println("Lieu : "+chassis.getLieu()+" ID : "+chassis.getLieu().getId());
		System.out.println("Rack : "+chassis.getRack()+" ID : "+chassis.getRack().getId());

		//m.addPCAll(pc, null, chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		
		m.addChassisAll(chassis, chassis.getLieu().getId(), chassis.getRack().getId(), chmat, chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	
	
	@RequestMapping(value="/admin/add/serveur")
	public String addServeur(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("serveur", new Serveur() );
		model.addAttribute("logiciels", m.listLogicielEtApplication());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("interfacereseaux", m.ListPhysique());
		model.addAttribute("equipementreseaux", m.ListEquipementReseau());
		model.addAttribute("sans", m.ListSwitchSan());
		model.addAttribute("volumesLogiques", m.ListVolumeLogique());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("racks", m.ListRack());
		model.addAttribute("chassiss", m.ListChassis());
		model.addAttribute("sourceelec", m.ListConnexionElectrique());
		model.addAttribute("lieus", m.listLieu());
		model.addAttribute("licenseos", m.listLicenseOs());
		return "sprint2/addServeur";
	}
	
	@RequestMapping(value="/admin/add/saveServeur", method = RequestMethod.POST)
	public String saveServeur(@Valid Serveur serveur,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("logiciels", m.listLogicielEtApplication());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("interfacereseaux", m.ListPhysique());
			model.addAttribute("equipementreseaux", m.ListEquipementReseau());
			model.addAttribute("sans", m.ListSwitchSan());
			model.addAttribute("volumesLogiques", m.ListVolumeLogique());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("racks", m.ListRack());
			model.addAttribute("chassiss", m.ListChassis());
			model.addAttribute("sourceelec", m.ListConnexionElectrique());
			model.addAttribute("lieus", m.listLieu());
			model.addAttribute("licenseos", m.listLicenseOs());
			return "sprint2/addServeur";
		}
		System.out.println("Test test 3");
		String[] chLogiciels = req.getParameterValues("chLogiciels");
		List<Long> chlog = null;
		System.out.println("---------chLogiciels : "+chLogiciels+" chlog : "+chlog);
		
		String[] chSolutionApplicative = req.getParameterValues("chSolutionApplicative");
		List<Long> chsolapp = null;
		System.out.println("---------chSolutionApplicative : "+chSolutionApplicative+" chsolapp : "+chsolapp);
		
		String[] chinterfacereseau = req.getParameterValues("chinterfacereseau");
		List<Long> chir = null;
		System.out.println("--------- chinterfacereseau : "+chinterfacereseau+" chir : "+chir);
		
		String[] chequipementreseaux = req.getParameterValues("chequipementreseaux");
		List<Long> cher = null;
		System.out.println("---------chequipementreseaux : "+chequipementreseaux+" cher : "+cher);

		String[] chSan = req.getParameterValues("chSan");
		List<Long> chSanlong = null;
		System.out.println("---------chSan : "+chSan+" chSanlong : "+chSanlong);
		
		String[] volumesLogiques = req.getParameterValues("volumesLogiques");
		List<Long> chvl = null;
		System.out.println("---------volumesLogiques : "+volumesLogiques+" chvl : "+chvl);
		
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
				System.out.println("---------chLogiciels "+chLogiciels[i]);
				chlog.add(Long.parseLong(chLogiciels[i]));
			}
			
		}
		
		if(chSolutionApplicative != null){
			chsolapp = new ArrayList<Long>();
			for (int i = 0; i < chSolutionApplicative.length; i++) {
				System.out.println("---------chSolutionApplicative "+chSolutionApplicative[i]);
				chsolapp.add(Long.parseLong(chSolutionApplicative[i]));
			}
			
		}
		
		if(chinterfacereseau != null){
			chir = new ArrayList<Long>();
			for (int i = 0; i < chinterfacereseau.length; i++) {
				System.out.println("---------chinterfacereseau "+chinterfacereseau[i]);
				chir.add(Long.parseLong(chinterfacereseau[i]));
			}
		}
		if(chequipementreseaux != null){
			cher = new ArrayList<Long>();
			for (int i = 0; i < chequipementreseaux.length; i++) {
				System.out.println("---------chequipementreseaux "+chequipementreseaux[i]);
				cher.add(Long.parseLong(chequipementreseaux[i]));
			}
		}
		
		if(chSan != null){
			chSanlong = new ArrayList<Long>();
			for (int i = 0; i < chSan.length; i++) {
				System.out.println("---------chSan "+chSan[i]);
				chSanlong.add(Long.parseLong(chSan[i]));
			}
		}
		
		if(volumesLogiques != null){
			chvl = new ArrayList<Long>();
			for (int i = 0; i < volumesLogiques.length; i++) {
				System.out.println("---------volumesLogiques "+volumesLogiques[i]);
				chvl.add(Long.parseLong(volumesLogiques[i]));
			}
		}
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument "+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat "+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact "+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		
		List<Long> chsourceelec = null;
		String[] sourceelecA = req.getParameterValues("sourceelecA");
		System.out.println(" sourceelecA : "+sourceelecA+"sourceelecA[0]"+sourceelecA[0]);
		String[] sourceelecB = req.getParameterValues("sourceelecB");
		System.out.println(" sourceelecB : "+sourceelecB+"sourceelecB[0]"+sourceelecB[0]);
		
		if(sourceelecA[0] != ""){
			chsourceelec = new ArrayList<Long>();
			chsourceelec.add(Long.parseLong(sourceelecA[0]));
		}
		if(sourceelecB[0] != ""){
			if(chsourceelec.size() == 0){
				chsourceelec = new ArrayList<Long>();
			}
			
			chsourceelec.add(Long.parseLong(sourceelecB[0]));
		}
		System.out.println("######### chsourceelec : "+chsourceelec);
		System.out.println("Rack : "+serveur.getRack()+" ID : "+serveur.getRack().getId());
		System.out.println("Chassis : "+serveur.getChassis()+" ID : "+serveur.getChassis().getId());
		System.out.println("Lieu : "+serveur.getLieu()+" ID : "+serveur.getLieu().getId());
		System.out.println("LicenseOs : "+serveur.getLicenseOs()+" ID : "+serveur.getLicenseOs().getId());
		
		//m.addServeurAll(serveur, pc.getLieu().getId(), pc.getLicenseOs().getId(),chlog, cher, chir, chp, chdoc, chcontact, chcontrat);
		m.addServeurAll(serveur, serveur.getLieu().getId(), serveur.getRack().getId(), serveur.getChassis().getId(), serveur.getLicenseOs().getId(), chsourceelec, chlog, chsolapp, chir, cher, chSanlong, chvl, chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	

	@RequestMapping(value="/admin/add/systemedestockage")
	public String addSystemedestockage(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("systemeDeStockage", new SystemeDeStockage() );
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("interfacereseaux", m.ListPhysique());
		model.addAttribute("equipementreseaux", m.ListEquipementReseau());
		model.addAttribute("sans", m.ListSwitchSan());
		model.addAttribute("volumesLogiques", m.ListVolumeLogique());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("racks", m.ListRack());
		model.addAttribute("chassiss", m.ListChassis());
		model.addAttribute("sourceelec", m.ListConnexionElectrique());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addSystemedestockage";
	}
	
	@RequestMapping(value="/admin/add/saveSystemedestokage", method = RequestMethod.POST)
	public String saveSystemedestokage(@Valid SystemeDeStockage sds,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("interfacereseaux", m.ListPhysique());
			model.addAttribute("equipementreseaux", m.ListEquipementReseau());
			model.addAttribute("sans", m.ListSwitchSan());
			model.addAttribute("volumesLogiques", m.ListVolumeLogique());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("racks", m.ListRack());
			model.addAttribute("chassiss", m.ListChassis());
			model.addAttribute("sourceelec", m.ListConnexionElectrique());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addSystemedestockage";
		}
		System.out.println("Test test 3");
		
		String[] chSolutionApplicative = req.getParameterValues("chSolutionApplicative");
		List<Long> chsolapp = null;
		System.out.println("---------chSolutionApplicative : "+chSolutionApplicative+" chsolapp : "+chsolapp);
		
		String[] chinterfacereseau = req.getParameterValues("chinterfacereseau");
		List<Long> chir = null;
		System.out.println("--------- chinterfacereseau : "+chinterfacereseau+" chir : "+chir);
		
		String[] chequipementreseaux = req.getParameterValues("chequipementreseaux");
		List<Long> cher = null;
		System.out.println("---------chequipementreseaux : "+chequipementreseaux+" cher : "+cher);

		String[] chSan = req.getParameterValues("chSan");
		List<Long> chSanlong = null;
		System.out.println("---------chSan : "+chSan+" chSanlong : "+chSanlong);
		
		String[] volumesLogiques = req.getParameterValues("volumesLogiques");
		List<Long> chvl = null;
		System.out.println("---------volumesLogiques : "+volumesLogiques+" chvl : "+chvl);
		
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		
		
		
		if(chSolutionApplicative != null){
			chsolapp = new ArrayList<Long>();
			for (int i = 0; i < chSolutionApplicative.length; i++) {
				System.out.println("---------chSolutionApplicative "+chSolutionApplicative[i]);
				chsolapp.add(Long.parseLong(chSolutionApplicative[i]));
			}
			
		}
		
		if(chinterfacereseau != null){
			chir = new ArrayList<Long>();
			for (int i = 0; i < chinterfacereseau.length; i++) {
				System.out.println("---------chinterfacereseau "+chinterfacereseau[i]);
				chir.add(Long.parseLong(chinterfacereseau[i]));
			}
		}
		if(chequipementreseaux != null){
			cher = new ArrayList<Long>();
			for (int i = 0; i < chequipementreseaux.length; i++) {
				System.out.println("---------chequipementreseaux "+chequipementreseaux[i]);
				cher.add(Long.parseLong(chequipementreseaux[i]));
			}
		}
		
		if(chSan != null){
			chSanlong = new ArrayList<Long>();
			for (int i = 0; i < chSan.length; i++) {
				System.out.println("---------chSan "+chSan[i]);
				chSanlong.add(Long.parseLong(chSan[i]));
			}
		}
		
		if(volumesLogiques != null){
			chvl = new ArrayList<Long>();
			for (int i = 0; i < volumesLogiques.length; i++) {
				System.out.println("---------volumesLogiques "+volumesLogiques[i]);
				chvl.add(Long.parseLong(volumesLogiques[i]));
			}
		}
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument "+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat "+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact "+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		
		List<Long> chsourceelec = null;
		String[] sourceelecA = req.getParameterValues("sourceelecA");
		System.out.println(" sourceelecA : "+sourceelecA+"sourceelecA[0]"+sourceelecA[0]);
		String[] sourceelecB = req.getParameterValues("sourceelecB");
		System.out.println(" sourceelecB : "+sourceelecB+"sourceelecB[0]"+sourceelecB[0]);
		
		if(sourceelecA[0] != ""){
			chsourceelec = new ArrayList<Long>();
			chsourceelec.add(Long.parseLong(sourceelecA[0]));
		}
		if(sourceelecB[0] != ""){
			if(chsourceelec.size() == 0){
				chsourceelec = new ArrayList<Long>();
			}
			
			chsourceelec.add(Long.parseLong(sourceelecB[0]));
		}
		System.out.println("######### chsourceelec : "+chsourceelec);
		System.out.println("Rack : "+sds.getRack()+" ID : "+sds.getRack().getId());
		System.out.println("Chassis : "+sds.getChassis()+" ID : "+sds.getChassis().getId());
		System.out.println("Lieu : "+sds.getLieu()+" ID : "+sds.getLieu().getId());
		
		m.addSystemeDeStockageAll(sds, sds.getLieu().getId(), sds.getRack().getId(), sds.getChassis().getId(), chsourceelec, chsolapp, chir, cher, chSanlong, chvl, chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	@RequestMapping(value="/admin/add/nas")
	public String addNAS(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("nas", new Nas() );
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("interfacereseaux", m.ListPhysique());
		model.addAttribute("equipementreseaux", m.ListEquipementReseau());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("racks", m.ListRack());
		model.addAttribute("chassiss", m.ListChassis());
		model.addAttribute("sourceelec", m.ListConnexionElectrique());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addNAS";
	}
	
	@RequestMapping(value="/admin/add/bandotheque")
	public String addBandotheque(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("bandotheque", new Bandotheque() );
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("interfacereseaux", m.ListPhysique());
		model.addAttribute("equipementreseaux", m.ListEquipementReseau());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("racks", m.ListRack());
		model.addAttribute("chassiss", m.ListChassis());
		model.addAttribute("sourceelec", m.ListConnexionElectrique());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addbandotheque";
	}
	
	@RequestMapping(value="/admin/add/dvr")
	public String addDvr(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("dvr", new Dvr() );
		model.addAttribute("cameras", m.ListCamera());
		model.addAttribute("interfacereseaux", m.ListPhysique());
		model.addAttribute("equipementreseaux", m.ListEquipementReseau());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("racks", m.ListRack());
		model.addAttribute("chassiss", m.ListChassis());
		model.addAttribute("sourceelec", m.ListConnexionElectrique());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addDVR";
	}
	
	

	@RequestMapping(value="/admin/add/saveDvr", method = RequestMethod.POST)
	public String saveDvr(@Valid Dvr dvr,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			model.addAttribute("cameras", m.ListCamera());
			model.addAttribute("interfacereseaux", m.ListPhysique());
			model.addAttribute("equipementreseaux", m.ListEquipementReseau());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("racks", m.ListRack());
			model.addAttribute("chassiss", m.ListChassis());
			model.addAttribute("sourceelec", m.ListConnexionElectrique());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addDVR";
		}
		System.out.println("Test test 3");
		
		String[] chCamera = req.getParameterValues("chCamera");
		List<Long> cam = null;
		System.out.println("---------chSolutionApplicative : "+chCamera+" chsolapp : "+cam);
		
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
		
		
		
		if(chCamera != null){
			cam = new ArrayList<Long>();
			for (int i = 0; i < chCamera.length; i++) {
				System.out.println("---------chCamera "+chCamera[i]);
				cam.add(Long.parseLong(chCamera[i]));
			}
			
		}
		
		if(chinterfacereseau != null){
			chir = new ArrayList<Long>();
			for (int i = 0; i < chinterfacereseau.length; i++) {
				System.out.println("---------chinterfacereseau "+chinterfacereseau[i]);
				chir.add(Long.parseLong(chinterfacereseau[i]));
			}
		}
		if(chequipementreseaux != null){
			cher = new ArrayList<Long>();
			for (int i = 0; i < chequipementreseaux.length; i++) {
				System.out.println("---------chequipementreseaux "+chequipementreseaux[i]);
				cher.add(Long.parseLong(chequipementreseaux[i]));
			}
		}
		
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument "+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat "+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact "+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		
		List<Long> chsourceelec = null;
		String[] sourceelecA = req.getParameterValues("sourceelecA");
		System.out.println(" sourceelecA : "+sourceelecA+"sourceelecA[0]"+sourceelecA[0]);
		String[] sourceelecB = req.getParameterValues("sourceelecB");
		System.out.println(" sourceelecB : "+sourceelecB+"sourceelecB[0]"+sourceelecB[0]);
		
		if(sourceelecA[0] != ""){
			chsourceelec = new ArrayList<Long>();
			chsourceelec.add(Long.parseLong(sourceelecA[0]));
		}
		if(sourceelecB[0] != ""){
			if(chsourceelec.size() == 0){
				chsourceelec = new ArrayList<Long>();
			}
			
			chsourceelec.add(Long.parseLong(sourceelecB[0]));
		}
		System.out.println("######### chsourceelec : "+chsourceelec);
		System.out.println("Rack : "+dvr.getRack()+" ID : "+dvr.getRack().getId());
		System.out.println("Chassis : "+dvr.getChassis()+" ID : "+dvr.getChassis().getId());
		System.out.println("Lieu : "+dvr.getLieu()+" ID : "+dvr.getLieu().getId());
		
		m.addDvrAll(dvr, dvr.getLieu().getId(), dvr.getRack().getId(), dvr.getChassis().getId(), chsourceelec, cam, chir, cher, chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboards?save="+true;
	}

	@RequestMapping(value="/admin/add/switchsan")
	public String addSwitchsan(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("switchSan", new SwitchSan() );
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("interfacereseaux", m.ListPhysique());
		model.addAttribute("equipementreseaux", m.ListEquipementReseau());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("racks", m.ListRack());
		model.addAttribute("chassiss", m.ListChassis());
		model.addAttribute("sourceelec", m.ListConnexionElectrique());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addSwitchSAN";
	}
	

	
	@RequestMapping(value="/admin/add/saveSwitchSan", method = RequestMethod.POST)
	public String saveSwitchSan(@Valid SwitchSan san,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			//model.addAttribute("pc", pc );
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("interfacereseaux", m.ListPhysique());
			model.addAttribute("equipementreseaux", m.ListEquipementReseau());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("racks", m.ListRack());
			model.addAttribute("chassiss", m.ListChassis());
			model.addAttribute("sourceelec", m.ListConnexionElectrique());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addSwitchSAN";
		}
		System.out.println("Test test 3");
		
		String[] chSolutionApplicative = req.getParameterValues("chSolutionApplicative");
		List<Long> chsolapp = null;
		System.out.println("---------chSolutionApplicative : "+chSolutionApplicative+" chsolapp : "+chsolapp);
		
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
		
		
		
		if(chSolutionApplicative != null){
			chsolapp = new ArrayList<Long>();
			for (int i = 0; i < chSolutionApplicative.length; i++) {
				System.out.println("---------chSolutionApplicative "+chSolutionApplicative[i]);
				chsolapp.add(Long.parseLong(chSolutionApplicative[i]));
			}
			
		}
		
		if(chinterfacereseau != null){
			chir = new ArrayList<Long>();
			for (int i = 0; i < chinterfacereseau.length; i++) {
				System.out.println("---------chinterfacereseau "+chinterfacereseau[i]);
				chir.add(Long.parseLong(chinterfacereseau[i]));
			}
		}
		if(chequipementreseaux != null){
			cher = new ArrayList<Long>();
			for (int i = 0; i < chequipementreseaux.length; i++) {
				System.out.println("---------chequipementreseaux "+chequipementreseaux[i]);
				cher.add(Long.parseLong(chequipementreseaux[i]));
			}
		}
		
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument "+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat "+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact "+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		
		List<Long> chsourceelec = null;
		String[] sourceelecA = req.getParameterValues("sourceelecA");
		System.out.println(" sourceelecA : "+sourceelecA+"sourceelecA[0]"+sourceelecA[0]);
		String[] sourceelecB = req.getParameterValues("sourceelecB");
		System.out.println(" sourceelecB : "+sourceelecB+"sourceelecB[0]"+sourceelecB[0]);
		
		if(sourceelecA[0] != ""){
			chsourceelec = new ArrayList<Long>();
			chsourceelec.add(Long.parseLong(sourceelecA[0]));
		}
		if(sourceelecB[0] != ""){
			if(chsourceelec.size() == 0){
				chsourceelec = new ArrayList<Long>();
			}
			
			chsourceelec.add(Long.parseLong(sourceelecB[0]));
		}
		System.out.println("######### chsourceelec : "+chsourceelec);
		System.out.println("Rack : "+san.getRack()+" ID : "+san.getRack().getId());
		System.out.println("Chassis : "+san.getChassis()+" ID : "+san.getChassis().getId());
		System.out.println("Lieu : "+san.getLieu()+" ID : "+san.getLieu().getId());
		
		m.addSwitchSanAll(san, san.getLieu().getId(), san.getRack().getId(), san.getChassis().getId(), chsourceelec, chsolapp, chir, cher, chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	
	@RequestMapping(value="/admin/add/equipementreseau")
	public String addEquipementreseau(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("equipementReseau", new EquipementReseau() );
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("interfacereseaux", m.ListPhysique());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("racks", m.ListRack());
		model.addAttribute("chassiss", m.ListChassis());
		model.addAttribute("sourceelec", m.ListConnexionElectrique());
		model.addAttribute("lieus", m.listLieu());
		return "sprint2/addEquipementreseau";
	}
	
	@RequestMapping(value="/admin/add/saveEquipementreseau", method = RequestMethod.POST)
	public String saveEquipementreseau(@Valid EquipementReseau er,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("interfacereseaux", m.ListPhysique());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("racks", m.ListRack());
			model.addAttribute("chassiss", m.ListChassis());
			model.addAttribute("sourceelec", m.ListConnexionElectrique());
			model.addAttribute("lieus", m.listLieu());
			return "sprint2/addEquipementreseau";
		}
		System.out.println("Test test 3");
		
		
		String[] chSolutionApplicative = req.getParameterValues("chSolutionApplicative");
		List<Long> chsolapp = null;
		System.out.println("---------chSolutionApplicative : "+chSolutionApplicative+" chsolapp : "+chsolapp);
		
		String[] chinterfacereseau = req.getParameterValues("chinterfacereseau");
		List<Long> chir = null;
		System.out.println("--------- chinterfacereseau : "+chinterfacereseau+" chir : "+chir);
		
		String[] chdocument = req.getParameterValues("chdocument");
		List<Long> chdoc = null;
		System.out.println("---------chdocument : "+chdocument+" chdoc : "+chdoc);
		
		String[] chContrat = req.getParameterValues("chContrat");
		List<Long> chcontrat = null;
		System.out.println("---------chContrat : "+chContrat+" chcontrat : "+chcontrat);
		
		String[] chContact = req.getParameterValues("chContact");
		List<Long> chcontact = null;
		System.out.println("---------chContact : "+chContact+" chcontact : "+chcontact);
		
		
		if(chSolutionApplicative != null){
			chsolapp = new ArrayList<Long>();
			for (int i = 0; i < chSolutionApplicative.length; i++) {
				System.out.println("---------chSolutionApplicative "+chSolutionApplicative[i]);
				chsolapp.add(Long.parseLong(chSolutionApplicative[i]));
			}
			
		}
		
		if(chinterfacereseau != null){
			chir = new ArrayList<Long>();
			for (int i = 0; i < chinterfacereseau.length; i++) {
				System.out.println("---------chinterfacereseau "+chinterfacereseau[i]);
				chir.add(Long.parseLong(chinterfacereseau[i]));
			}
		}
		
		if(chdocument != null){
			chdoc = new ArrayList<Long>();
			for (int i = 0; i < chdocument.length; i++) {
				System.out.println("---------chdocument "+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat "+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact "+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		
		List<Long> chsourceelec = null;
		String[] sourceelecA = req.getParameterValues("sourceelecA");
		System.out.println(" sourceelecA : "+sourceelecA+"sourceelecA[0]"+sourceelecA[0]);
		String[] sourceelecB = req.getParameterValues("sourceelecB");
		System.out.println(" sourceelecB : "+sourceelecB+"sourceelecB[0]"+sourceelecB[0]);
		
		if(sourceelecA[0] != ""){
			chsourceelec = new ArrayList<Long>();
			chsourceelec.add(Long.parseLong(sourceelecA[0]));
		}
		if(sourceelecB[0] != ""){
			if(chsourceelec.size() == 0){
				chsourceelec = new ArrayList<Long>();
			}
			
			chsourceelec.add(Long.parseLong(sourceelecB[0]));
		}
		System.out.println("######### chsourceelec : "+chsourceelec);
		System.out.println("Rack : "+er.getRack()+" ID : "+er.getRack().getId());
		System.out.println("Chassis : "+er.getChassis()+" ID : "+er.getChassis().getId());
		System.out.println("Lieu : "+er.getLieu()+" ID : "+er.getLieu().getId());
		
		m.addEquipementReseauAll(er, er.getLieu().getId(), er.getRack().getId(), er.getChassis().getId(), chsourceelec, chsolapp, chir, chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	
	@RequestMapping(value="/admin/add/lieu")
	public String addLieu(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("lieu", new Lieu());
		model.addAttribute("contacts", m.listContact());
		return "sprint2/addLieu";
	}
	@RequestMapping(value="/admin/edit/lieu")
	public String searchLieu(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("lieu", m.getLieu(id) );
		model.addAttribute("contacts", m.listContact());
		return "sprint2/editLieu";
	}
	@RequestMapping(value="/search/lieu")
	public String searchLieu(Model model,String l,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("lieu", l);
		model.addAttribute("logged", logged);
		if(l == null){
			model.addAttribute("cis", m.listLieu());
		} else {
			model.addAttribute("cis",m.SearchLieu(l));
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchLieu";
	}

	@RequestMapping(value="/view/lieu")
	public String viewLieu(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("lieu", m.getLieu(id) );
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewLieu";
	}
	
	@RequestMapping(value="/admin/delete/lieu")
	public String deleteLieu(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerLieu(id);
		return "redirect:/config/search/lieu?delete="+true;
	}
	@RequestMapping(value="/admin/add/saveLieu", method = RequestMethod.POST)
	public String saveLieu(@Valid Lieu l,BindingResult bind,Model model,HttpServletRequest req) {
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			model.addAttribute("contacts", m.listContact());
			return "sprint2/addLieu";
		}
		List<Long> cont = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		
		
		if(Contacts != null ){
			for (int i = 0; i < Contacts.length; i++) {
				System.out.println("---------Contact"+Contacts[i]);
				cont.add(Long.parseLong(Contacts[i]));
			}
		}
		
		if(l.getId() == null){
			m.ajouterLieuCont(l, cont);
		} else {
			m.modifierLieu(l, cont);
			return "redirect:/config/view/lieu?id="+l.getId()+"&save="+true;
		}
		
		return "redirect:/index?save="+true;
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
	@RequestMapping(value="/admin/edit/contact")
	public String editContact(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("contact",m.getContact(id));
		model.addAttribute("l", m.listLieu());
		model.addAttribute("contrat", m.listContrat());
		return "sprint2/editContact";
	}
	@RequestMapping(value="/search/contact")
	public String searchContact(Model model,String c,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("contact",c);
		model.addAttribute("logged", logged);
		if(c == null){
			model.addAttribute("cis", m.listContact());
		} else {
			model.addAttribute("cis",m.SearchContact(c));          
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchContact";
	}

	@RequestMapping(value="/view/contact")
	public String viewContact(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("contact", m.getContact(id));         
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewContact";
	}
	
	@RequestMapping(value="/admin/delete/contact")
	public String deleteContact(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerContact(id);           
		return "redirect:/config/search/contact?delete="+true;
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
		if(c.getId() == null){
			m.ajouterContactAll(c, c.getLieu().getId());
		} else {
			m.modifierContact(c, c.getLieu().getId());        
			return "redirect:/config/view/contact?id="+c.getId()+"&save="+true;
		}
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/contrat")
	public String editContrat(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("contrat",m.getContrat(id));
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		return "sprint2/editContrat";
	}
	@RequestMapping(value="/search/contrat")
	public String searchContrat(Model model,String c,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("contrat",c);
		model.addAttribute("logged", logged);
		if(c == null){
			model.addAttribute("cis", m.listContrat());
		} else {
			model.addAttribute("cis",m.SearchContrat(c));          
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchContrat";
	}

	@RequestMapping(value="/view/contrat")
	public String viewContrat(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("contrat", m.getContrat(id));         
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewContrat";
	}
	
	@RequestMapping(value="/admin/delete/contrat")
	public String deleteContrat(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerContrat(id);           
		return "redirect:/config/search/contrat?delete="+true;
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
		if(c.getId() == null){
			m.ajouterContratAll(c, cont, doc);
		} else {
			m.modifierContrat(c, cont, doc);       
			return "redirect:/config/view/contrat?id="+c.getId()+"&save="+true;
		}
		
		
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	@RequestMapping(value="/admin/add/groupe")
	public String addGroupe(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("groupe", new Groupe());
		model.addAttribute("g", m.listGroupe());
		 model.addAttribute("ApplicationWeb", m.listApplicationWeb());
		    model.addAttribute("ArriveeElectrique", m.ListArriveeElectrique());
		    model.addAttribute("Autrelogiciel", m.listAutreLogiciel());
		    model.addAttribute("Bandotheque", m.ListBandotheque());
		    model.addAttribute("Camera", m.ListCamera());
			model.addAttribute("Chassis", m.ListChassis());
			model.addAttribute("DVR", m.ListDvr());
			model.addAttribute("Equipementreseau", m.ListEquipementReseau());
			model.addAttribute("Hyperviseur", m.listHyperviseur());
			model.addAttribute("Imprimante", m.ListImp());
			model.addAttribute("InstanceMiddleware", m.listInstanceMiddleware());
			model.addAttribute("Instancedebasededonnees", m.listInstanceDeBasseDeDonnes());
			model.addAttribute("LogicielPC", m.listLogicielPc());
			model.addAttribute("Machinevirtuelle", m.listMachineVirtuelle());
			model.addAttribute("Middleware", m.listMiddleware());
			model.addAttribute("NAS", m.ListNas());
			model.addAttribute("Ordinateur", m.ListPC());
			model.addAttribute("PDU", m.ListPduElectrique());
			model.addAttribute("Processusmetier", m.ListProcessusMetier());
			model.addAttribute("Peripherique", m.ListPeriph());
			model.addAttribute("Rack", m.ListRack());
			model.addAttribute("Serveur", m.ListServeur());
			model.addAttribute("ServeurWeb", m.listServeurWeb());
			model.addAttribute("Serveurdebasededonnees", m.listServeurDeBasseDeDonnees());
			model.addAttribute("sim", m.ListSIM());
			model.addAttribute("Solutionapplicative", m.ListSolutionApplicative());
			model.addAttribute("SwitchSAN", m.ListSwitchSan());
			model.addAttribute("Systemedestockage", m.ListSystemeDeStockage());
			model.addAttribute("Tablette", m.ListTablette());
			model.addAttribute("Telephonefixe", m.ListTeleFixe());
			model.addAttribute("Telephonemobile", m.ListTeleMobile());
			model.addAttribute("vCluster", m.listVcluster());
		return "sprint2/addGroupe";
	}
	@RequestMapping(value="/admin/add/saveGroupe", method = RequestMethod.POST)
	public String saveGroupe(@Valid Groupe g,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("g", m.listGroupe());
		    model.addAttribute("ApplicationWeb", m.listApplicationWeb());
		    model.addAttribute("ArriveeElectrique", m.ListArriveeElectrique());
		    model.addAttribute("Autrelogiciel", m.listAutreLogiciel());
		    model.addAttribute("Bandotheque", m.ListBandotheque());
		    model.addAttribute("Camera", m.ListCamera());
			model.addAttribute("Chassis", m.ListChassis());
			model.addAttribute("DVR", m.ListDvr());
			model.addAttribute("Equipementreseau", m.ListEquipementReseau());
			model.addAttribute("Hyperviseur", m.listHyperviseur());
			model.addAttribute("Imprimante", m.ListImp());
			model.addAttribute("InstanceMiddleware", m.listInstanceMiddleware());
			model.addAttribute("Instancedebasededonnees", m.listInstanceDeBasseDeDonnes());
			model.addAttribute("LogicielPC", m.listLogicielPc());
			model.addAttribute("Machinevirtuelle", m.listMachineVirtuelle());
			model.addAttribute("Middleware", m.listMiddleware());
			model.addAttribute("NAS", m.ListNas());
			model.addAttribute("Ordinateur", m.ListPC());
			model.addAttribute("PDU", m.ListPduElectrique());
			model.addAttribute("Processusmetier", m.ListProcessusMetier());
			model.addAttribute("Peripherique", m.ListPeriph());
			model.addAttribute("Rack", m.ListRack());
			model.addAttribute("Serveur", m.ListServeur());
			model.addAttribute("ServeurWeb", m.listServeurWeb());
			model.addAttribute("Serveurdebasededonnees", m.listServeurDeBasseDeDonnees());
			model.addAttribute("sim", m.ListSIM());
			model.addAttribute("Solutionapplicative", m.ListSolutionApplicative());
			model.addAttribute("SwitchSAN", m.ListSwitchSan());
			model.addAttribute("Systemedestockage", m.ListSystemeDeStockage());
			model.addAttribute("Tablette", m.ListTablette());
			model.addAttribute("Telephonefixe", m.ListTeleFixe());
			model.addAttribute("Telephonemobile", m.ListTeleMobile());
			model.addAttribute("vCluster", m.listVcluster());
			return "sprint2/addGroupe";
		}
		m.ajouterGroupe(g, g.getGroupe_parent().getId());
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/add/saveSolutionApplicative", method = RequestMethod.POST)
	public String saveSolutionApplicative(@Valid SolutionApplicative sa,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("processusMetiers", m.ListProcessusMetier());
			return "sprint2/addSolutionApplicative";
		}
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> pro = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] processusMetiers = req.getParameterValues("ckProcessusMetiers");
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
		
		if(processusMetiers != null ){
			for (int i = 0; i < processusMetiers.length; i++) {
				
				pro.add(Long.parseLong(processusMetiers[i]));
			}
		}
		
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
			
		m.addSolutionApplicativeAll(sa, cont, doc, null, pro, contr);
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/processusMetier")
	public String editProcessusMetier(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("processusMetier",m.getProcessusMetier(id));
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		return "sprint2/editProcessusMetier";
	}
	@RequestMapping(value="/search/processusMetier")
	public String searchProcessusMetier(Model model,String pm,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("processusMetier",pm);
		model.addAttribute("logged", logged);
		if(pm == null){
			model.addAttribute("cis", m.ListProcessusMetier());
		} else {
			model.addAttribute("cis",m.SearchProcessusMetier(pm));         
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchProcessusMetier";
	}

	@RequestMapping(value="/view/processusMetier")
	public String viewProcessusMetier(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("processusMetier", m.getProcessusMetier(id));         
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewProcessusMetier";
	}
	
	@RequestMapping(value="/admin/delete/processusMetier")
	public String deleteProcessusMetier(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.deleteProcessusMetier(id);          
		return "redirect:/config/search/processusMetier?delete="+true;
	}
	@RequestMapping(value="/admin/add/saveProcessusMetier", method = RequestMethod.POST)
	public String saveProcessusMetier(@Valid ProcessusMetier pm,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			return "sprint2/addProcessusMetier";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		
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
		if(pm.getId() == null){
			m.addProcessusMetierAll(pm, cont, doc, sol);
		} else {
			m.editProcessusMetier(pm, cont, doc, sol);      
			return "redirect:/config/view/processusMetier?id="+pm.getId()+"&save="+true;
		}
		
		return "redirect:/config/admin/dashboards?save="+true;
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
		model.addAttribute("licenseLogiciel", new LicenseLogiciel());
		model.addAttribute("la", m.listLogicielEtApplication());
		model.addAttribute("documents", m.listDocument());
		return "sprint2/addLicenceLogiciel";
	}
	@RequestMapping(value="/admin/edit/licenceLogiciel")
	public String editLicenceLogiciel(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("licenseLogiciel", m.getLicenseLogiciel(id)); 
		model.addAttribute("la", m.listLogicielEtApplication());
		model.addAttribute("documents", m.listDocument());
		return "sprint2/editLicenceLogiciel";
	}
	@RequestMapping(value="/search/licenceLogiciel")
	public String searchLicenceLogiciel(Model model,String ll,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("licenceLogiciel",ll);
		model.addAttribute("logged", logged);
		if(ll == null){
			model.addAttribute("cis", m.listLicenseLogiciel());
		} else {
			model.addAttribute("cis",m.SearchLicenseLogiciel(ll));        
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchLicenceLogiciel";
	}

	@RequestMapping(value="/view/licenceLogiciel")
	public String viewLicenceLogiciel(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("licenceLogiciel", m.getLicenseLogiciel(id));         
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewLicenceLogiciel";
	}
	
	@RequestMapping(value="/admin/delete/licenceLogiciel")
	public String deleteLicenceLogiciel(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerLicenseLogiciel(id);         
		return "redirect:/config/search/licenceLogiciel?delete="+true;
	}
	@RequestMapping(value="/admin/add/saveLicenseLogiciel", method = RequestMethod.POST)
	public String saveLicenseLogiciel(@Valid LicenseLogiciel ll,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("la", m.listLogicielEtApplication());
			model.addAttribute("documents", m.listDocument());
			return "sprint2/addLicenceLogiciel";
		}
		
		List<Long> doc = new ArrayList<Long>();
		String[] documents = req.getParameterValues("ckDocuments");
		
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				doc.add(Long.parseLong(documents[i]));
			}
		}
		if(ll.getId() == null){
			m.ajouterLicenseLogicielAll(ll, ll.getLogicielEtApplications().getId(), doc);
		} else {
			m.modifierLicenseLogiciel(ll, ll.getLogicielEtApplications().getId(), doc);      
			return "redirect:/config/view/licenceLogiciel?id="+ll.getId()+"&save="+true;
		}
		
		return "redirect:/config/admin/dashboards?save="+true;
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
		model.addAttribute("serveurs", m.ListServeur());
		model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
		return "sprint2/addLicenseOs";
	}
	@RequestMapping(value="/admin/edit/licenseOs")
	public String editLicenseOs(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("licenseOs",m.getLicenseOs(id));
		model.addAttribute("v", m.listVersionOs());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("serveurs", m.ListServeur());
		model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
		return "sprint2/editLicenseOs";
	}
	@RequestMapping(value="/search/licenseOs")
	public String searchLicenseOs(Model model,String lo,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("licenseOs",lo);
		model.addAttribute("logged", logged);
		if(lo == null){
			model.addAttribute("cis", m.listLicenseOs());
		} else {
			model.addAttribute("cis",m.SearchLicenseOs(lo));       
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchLicenseOs";
	}

	@RequestMapping(value="/view/licenseOs")
	public String viewLicenseOs(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("licenseOs", m.getLicenseOs(id));         
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewLicenseOs";
	}
	
	@RequestMapping(value="/admin/delete/licenseOs")
	public String deleteLicenseOs(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerLicenseOs(id);        
		return "redirect:/config/search/licenseOs?delete="+true;
	}
	@RequestMapping(value="/admin/add/saveLicenseOs", method = RequestMethod.POST)
	public String saveLicenseOs(@Valid LicenseOs lo,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("v", m.listVersionOs());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("serveurs", m.ListServeur());
			model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
			return "sprint2/addLicenseOs";
		}
		
		List<Long> doc = new ArrayList<Long>();
		List<Long> serv = new ArrayList<Long>();
		List<Long> mach = new ArrayList<Long>();
		String[] documents = req.getParameterValues("ckDocuments");
		String[] serveurs = req.getParameterValues("ckServeurs");
		String[] machineVirtuelle = req.getParameterValues("ckMachinesVirtuelles");
		
		if(documents != null ){
			for (int i = 0; i < documents.length; i++) {
				doc.add(Long.parseLong(documents[i]));
			}
		}
		if(serveurs != null ){
			for (int i = 0; i < serveurs.length; i++) {
				serv.add(Long.parseLong(serveurs[i]));
			}
		}
		if(machineVirtuelle != null ){
			for (int i = 0; i < machineVirtuelle.length; i++) {
				mach.add(Long.parseLong(machineVirtuelle[i]));
			}
		}
		if(lo.getId() == null){
			m.ajouterLicenseOsAll(lo, lo.getVersionOs().getId(), doc, serv, mach);
		} else {
			m.modifierLicenseOs(lo, lo.getVersionOs().getId(), doc, serv, mach);     
			return "redirect:/config/view/licenseOs?id="+lo.getId()+"&save="+true;
		}
		
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/versionOs")
	public String editVersionOs(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("versionOs",m.getVersionOs(id));
		return "sprint2/editVersionOs";
	}
	@RequestMapping(value="/search/versionOs")
	public String searchVersionOs(Model model,String vo,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("versionOs",vo);
		model.addAttribute("logged", logged);
		if(vo == null){
			model.addAttribute("cis", m.listVersionOs());
		} else {
			model.addAttribute("cis",m.SearchVersionOs(vo));       
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchVersionOs";
	}

	@RequestMapping(value="/view/versionOs")
	public String viewVersionOs(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("versionOs", m.getVersionOs(id));        
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewVersionOs";
	}
	
	@RequestMapping(value="/admin/delete/versionOs")
	public String deleteVersionOs(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerVersionOs(id);       
		return "redirect:/config/search/versionOs?delete="+true;
	}
	@RequestMapping(value="/admin/add/saveVersionOs")
	public String saveVersionOs(@Valid VersionOs vo,BindingResult bind,Model model){
		if(bind.hasErrors()){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		return "sprint2/addVersionOs";
		}
		if(vo.getId() == null){
			m.ajouterVersionOs(vo);
		} else {
			m.modifierVersionOs(vo);    
			return "redirect:/config/view/versionOs?id="+vo.getId()+"&save="+true;
		}
		
		return "redirect:/config/admin/dashboards?save="+true;
	}
	@RequestMapping(value="/admin/add/machineVirtuelle")
	public String addMachineVirtuelle(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("machineVirtuelle", new MachineVirtuelle());
		model.addAttribute("v", m.listVirtualisation());
		model.addAttribute("licenseos", m.listLicenseOs());
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
	@RequestMapping(value="/admin/edit/machineVirtuelle")
	public String editMachineVirtuelle(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("machineVirtuelle",m.getMachineVirtuelle(id));
		model.addAttribute("v", m.listVirtualisation());
		model.addAttribute("licenseos", m.listLicenseOs());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("volumesLogiques", m.ListVolumeLogique());
		model.addAttribute("interfacereseaux", m.ListLogique());
		model.addAttribute("logiciels", m.listLogicielEtApplication());
		return "sprint2/editMachineVirtuelle";
	}
	@RequestMapping(value="/search/machineVirtuelle")
	public String searchMachineVirtuelle(Model model,String mv,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("machineVirtuelle",mv);
		model.addAttribute("logged", logged);
		if(mv == null){
			model.addAttribute("cis", m.listMachineVirtuelle());
		} else {
			model.addAttribute("cis",m.SearchMachineVirtuelle(mv));       
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchMachineVirtuelle";
	}

	@RequestMapping(value="/view/machineVirtuelle")
	public String viewMachineVirtuelle(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("machineVirtuelle", m.getMachineVirtuelle(id));        
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewMachineVirtuelle";
	}
	
	@RequestMapping(value="/admin/delete/machineVirtuelle")
	public String deleteMachineVirtuelle(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerMachineVirtuelle(id);       
		return "redirect:/config/search/machineVirtuelle?delete="+true;
	}
	@RequestMapping(value="/admin/add/saveMachineVirtuelle", method = RequestMethod.POST)
	public String saveMachineVirtuelle(@Valid MachineVirtuelle mv,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("v", m.listVirtualisation());
			model.addAttribute("licenseos", m.listLicenseOs());
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
		List<Long> log = new ArrayList<Long>();
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		List<Long> vol = new ArrayList<Long>();
		List<Long> inter = new ArrayList<Long>();
		String[] logiciels = req.getParameterValues("ckLogiciel");
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		String[] volumesLogiques = req.getParameterValues("ckVolumesLogiques");
		String[] interfacesReseaux = req.getParameterValues("ckInterfacesReseaux");
		
		if(logiciels != null ){
			for (int i = 0; i < logiciels.length; i++) {
				log.add(Long.parseLong(logiciels[i]));
			}
		}
		
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
		if(interfacesReseaux != null ){
			for (int i = 0; i < interfacesReseaux.length; i++) {
				
				inter.add(Long.parseLong(interfacesReseaux[i]));
			}
		}	
		if(mv.getId() == null){
			m.ajouterMachineVirtuelleAll(mv, mv.getVirtualisation().getId(), mv.getLicenseOs().getId(), log, cont, doc, sol, inter, vol, contr);
		} else {
			m.modifierMachineVirtuelle(mv, mv.getVirtualisation().getId(), mv.getLicenseOs().getId(), log, cont, doc, sol, inter, vol, contr);     
			return "redirect:/config/view/machineVirtuelle?id="+mv.getId()+"&save="+true;
		}
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/hyperviseur")
	public String editHyperviseur(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("hyperviseur",m.getHyperviseur(id));
		model.addAttribute("v", m.listVcluster());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("volumesLogiques", m.ListVolumeLogique());
		model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
		return "sprint2/editHyperviseur";
	}
	@RequestMapping(value="/search/hyperviseur")
	public String searchHyperviseur(Model model,String h,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("hyperviseur",h);
		model.addAttribute("logged", logged);
		if(h == null){
			model.addAttribute("cis", m.listHyperviseur());
		} else {
			model.addAttribute("cis",m.SearchHyperviseur(h));        
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchHyperviseur";
	}

	@RequestMapping(value="/view/hyperviseur")
	public String viewHyperviseur(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("hyperviseur", m.getHyperviseur(id));         
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewHyperviseur";
	}
	
	@RequestMapping(value="/admin/delete/hyperviseur")
	public String deleteHyperviseur(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerHyperviseur(id);        
		return "redirect:/config/search/hyperviseur?delete="+true;
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
		if(h.getId() == null){
			m.ajouterHyperviseurAll(h, h.getVcluster().getId(), h.getServeur().getId(), cont, doc, sol, vol, mach, contr);
		} else {
			m.modifierHyperviseur(h, h.getVcluster().getId(), h.getServeur().getId(), cont, doc, sol, vol, mach, contr);     
			return "redirect:/config/view/hyperviseur?id="+h.getId()+"&save="+true;
		}
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/vcluster")
	public String editVcluster(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("vcluster",m.getVcluster(id));
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("volumesLogiques", m.ListVolumeLogique());
		model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
		model.addAttribute("hyperviseurs", m.listHyperviseur());
		return "sprint2/editVcluster";
	}
	@RequestMapping(value="/search/vcluster")
	public String searchVcluster(Model model,String v,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("vcluster",v);
		model.addAttribute("logged", logged);
		if(v == null){
			model.addAttribute("cis", m.listVcluster());
		} else {
			model.addAttribute("cis",m.SearchVcluster(v));         
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchVcluster";
	}

	@RequestMapping(value="/view/vcluster")
	public String viewVcluster(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("vcluster", m.getVcluster(id));         
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewVcluster";
	}
	
	@RequestMapping(value="/admin/delete/vcluster")
	public String deleteVcluster(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerVcluster(id);        
		return "redirect:/config/search/vcluster?delete="+true;
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
		if(v.getId() == null){
			m.ajouterVclusterAll(v, cont, doc, sol, vol, mach, hyp, contr);
		} else {
			m.modifierVcluster(v, cont, doc, sol, vol, mach, hyp, contr);     
			return "redirect:/config/view/vcluster?id="+v.getId()+"&save="+true;
		}
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/arriveeElectrique")
	public String editArriveeElectrique(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("arriveeElectrique", m.getArriveeElectrique(id));
		model.addAttribute("l", m.listLieu());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("pdus", m.ListPduElectrique());
		return "sprint2/editArriveeElectrique";
	}
	@RequestMapping(value="/search/arriveeElectrique")
	public String searchArriveeElectrique(Model model,String ae,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("arriveeElectrique",ae);
		model.addAttribute("logged", logged);
		if(ae == null){
			model.addAttribute("cis", m.ListArriveeElectrique());
		} else {
			model.addAttribute("cis",m.SearchArriveeElectrique(ae));      
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchArriveeElectrique";
	}

	@RequestMapping(value="/view/arriveeElectrique")
	public String viewArriveeElectrique(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("arriveeElectrique", m.getArriveeElectrique(id));        
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewArriveeElectrique";
	}
	
	@RequestMapping(value="/admin/delete/arriveeElectrique")
	public String deleteArriveeElectrique(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.deleteArriveeElectrique(id);      
		return "redirect:/config/search/arriveeElectrique?delete="+true;
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
		if(ae.getId() == null){
			m.addArriveeElectriqueAll(ae, ae.getLieu().getId(), pdu, cont, doc, contr);
		} else {
			m.editArriveeElectrique(ae, ae.getLieu().getId(), pdu, cont, doc, contr);   
			return "redirect:/config/view/arriveeElectrique?id="+ae.getId()+"&save="+true;
		}
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/pduElectrique")
	public String editPduElectrique(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("pduElectrique", m.getPduElectrique(id));
		model.addAttribute("r", m.ListRack());
		model.addAttribute("a", m.ListArriveeElectrique());
		model.addAttribute("l", m.listLieu());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/editPduElectrique";
	}
	@RequestMapping(value="/search/pduElectrique")
	public String searchPduElectrique(Model model,String pdue,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("pduElectrique", pdue);
		model.addAttribute("logged", logged);
		if(pdue == null){
			model.addAttribute("cis", m.ListPduElectrique());
		} else {
			model.addAttribute("cis",m.SearchPduElectrique(pdue));      
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchPduElectrique";
	}

	@RequestMapping(value="/view/pduElectrique")
	public String viewPduElectrique(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("pduElectrique", m.getPduElectrique(id));        
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewPduElectrique";
	}
	
	@RequestMapping(value="/admin/delete/pduElectrique")
	public String deletePduElectrique(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.deletePduElectrique(id);      
		return "redirect:/config/search/pduElectrique?delete="+true;
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
		if(pe.getId() == null){
			m.addPduElectriqueAll(pe, pe.getLieu().getId(),pe.getRack().getId(),pe.getArriveeElectrique().getId(), cont, doc, contr);
		} else {
			m.editPduElectrique(pe, pe.getLieu().getId(), pe.getRack().getId(), pe.getArriveeElectrique().getId(), cont, doc, contr);     
			return "redirect:/config/view/pduElectrique?id="+pe.getId()+"&save="+true;
		}
			
		
		return "redirect:/config/admin/dashboards?save="+true;
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
		model.addAttribute("documentFichier", new DocumentFichier());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/addDocumentFichier";
	}
	@RequestMapping(value="/fichier",produces=MediaType.ALL_VALUE)
	@ResponseBody
	public byte[] fichier(Long id) throws IOException{
		DocumentFichier f = m.getDocumentFichier(id); 
		return IOUtils.toByteArray(new ByteArrayInputStream(f.getBfichier()));
	}
	@RequestMapping(value="/admin/add/saveFichier", method = RequestMethod.POST)
	public String saveFichier(@Valid DocumentFichier df,BindingResult bind,Model model,HttpServletRequest req,MultipartFile file) throws IOException {
		String[] fich = req.getParameterValues("file");
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("contrats", m.listContrat());
			return "sprint2/addDocumentFichier";
		}
		if(!file.isEmpty()){
			BufferedInputStream reader = new BufferedInputStream(file.getInputStream());
			df.setBfichier(file.getBytes());
			df.setFichier(file.getOriginalFilename());
		}
		m.ajouterDocumentFichier(df);
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/add/saveWeb", method = RequestMethod.POST)
	public String saveFichier(@Valid DocumentWeb dw,BindingResult bind,Model model,HttpServletRequest req){
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
			return "sprint2/addDocumentFichier";
		}
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/autreLogiciel")
	public String editAutreLogiciel(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("autreLogiciel",m.getAutreLogiciel(id));
		model.addAttribute("lg", m.listLicenseLogiciel());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("mv", m.listMachineVirtuelle());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/editAutreLogiciel";
	}
	@RequestMapping(value="/search/autreLogiciel")
	public String searchAutreLogiciel(Model model,String al,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("autreLogiciel", al);
		model.addAttribute("logged", logged);
		if(al == null){
			model.addAttribute("cis", m.listAutreLogiciel());
		} else {
			model.addAttribute("cis",m.SearchAutreLogiciel(al));      
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchAutreLogiciel";
	}

	@RequestMapping(value="/view/autreLogiciel")
	public String viewAutreLogiciel(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("autreLogiciel", m.getAutreLogiciel(id));       
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewAutreLogiciel";
	}
	
	@RequestMapping(value="/admin/delete/autreLogiciel")
	public String deleteAutreLogiciel(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerAutreLogiciel(id);     
		return "redirect:/config/search/autreLogiciel?delete="+true;
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
		Long serv = null;
		Long mach = null;
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("chSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		String[] systeme = req.getParameterValues("systeme");
		
		if(systeme != null){
			
			for (int i = 0; i < systeme.length; i++) {
				
				if(systeme[i].substring(0,4).equals("serv")){
					serv = Long.parseLong(systeme[i].substring(5));
					System.out.println("--------- serv : "+serv);
				}else {
					mach = Long.parseLong(systeme[i].substring(5));
					System.out.println("--------- mach : "+mach);
				}
		  }
			
		}
		
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
		if(al.getId() == null){
			m.ajouterAutreLogicielAll(al, serv, mach, al.getLicenseLogiciel().getId(), cont, doc, sol, contr);
		} else {
			m.modifierAutreLogiciel(al, serv, mach, al.getLicenseLogiciel().getId(), cont, doc, sol, contr);    
			return "redirect:/config/view/autreLogiciel?id="+al.getId()+"&save="+true;
		}
		
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/logicielPc")
	public String editLogicielPc(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("logicielPc",m.getLogicielPc(id));
		model.addAttribute("lg", m.listLicenseLogiciel());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("mv", m.listMachineVirtuelle());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/editLogicielPc";
	}
	@RequestMapping(value="/search/logicielPc")
	public String searchLogicielPc(Model model,String lp,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logicielPc", lp);
		model.addAttribute("logged", logged);
		if(lp == null){
			model.addAttribute("cis", m.listLogicielPc());
		} else {
			model.addAttribute("cis",m.SearchLogicielPc(lp));     
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchLogicielPc";
	}

	@RequestMapping(value="/view/logicielPc")
	public String viewLogicielPc(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("logicielPc", m.getLogicielPc(id));      
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewLogicielPc";
	}
	
	@RequestMapping(value="/admin/delete/logicielPc")
	public String deleteLogicielPc(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerLogicielPc(id);    
		return "redirect:/config/search/logicielPc?delete="+true;
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
		Long serv = null;
		Long mach = null;
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
        String[] systeme = req.getParameterValues("systeme");
		
		if(systeme != null){
			
			for (int i = 0; i < systeme.length; i++) {
				
				if(systeme[i].substring(0,4).equals("serv")){
					serv = Long.parseLong(systeme[i].substring(5));
					System.out.println("--------- serv : "+serv);
				}else {
					mach = Long.parseLong(systeme[i].substring(5));
					System.out.println("--------- mach : "+mach);
				}
		  }
			
		}
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
		if(lp.getId() == null){
			m.ajouterLogicielPcAll(lp, serv, mach, lp.getLicenseLogiciel().getId(), cont, doc, sol, contr);
		} else {
			m.modifierLogicielPc(lp, serv, mach, lp.getLicenseLogiciel().getId(), cont, doc, sol, contr);   
			return "redirect:/config/view/logicielPc?id="+lp.getId()+"&save="+true;
		}
		
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/serveurWeb")
	public String editServeurWeb(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("serveurWeb", m.getServeurWeb(id));
		model.addAttribute("lg", m.listLicenseLogiciel());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("mv", m.listMachineVirtuelle());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("applicationWeb", m.listApplicationWeb());
		return "sprint2/editServeurWeb";
	}
	@RequestMapping(value="/search/serveurWeb")
	public String searchServeurWeb(Model model,String sw,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("serveurWeb", sw);
		model.addAttribute("logged", logged);
		if(sw == null){
			model.addAttribute("cis", m.listServeurWeb());
		} else {
			model.addAttribute("cis",m.SearchServeurWeb(sw));    
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchServeurWeb";
	}

	@RequestMapping(value="/view/serveurWeb")
	public String viewServeurWeb(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("serveurWeb", m.getServeurWeb(id) );     
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewServeurWeb";
	}
	
	@RequestMapping(value="/admin/delete/serveurWeb")
	public String deleteServeurWeb(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerServeurWeb(id);   
		return "redirect:/config/search/serveurWeb?delete="+true;
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
			model.addAttribute("applicationWeb", m.listApplicationWeb());
			return "sprint2/addServeurWeb";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		List<Long> appl = new ArrayList<Long>();
		Long serv = null;
		Long mach = null;
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		String[] applicationWeb = req.getParameterValues("ckApplicationWeb");
        String[] systeme = req.getParameterValues("systeme");
		
		if(systeme != null){
			
			for (int i = 0; i < systeme.length; i++) {
				
				if(systeme[i].substring(0,4).equals("serv")){
					serv = Long.parseLong(systeme[i].substring(5));
					System.out.println("--------- serv : "+serv);
				}else {
					mach = Long.parseLong(systeme[i].substring(5));
					System.out.println("--------- mach : "+mach);
				}
		  }
			
		}
		
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
		if(applicationWeb != null ){
			for (int i = 0; i < applicationWeb.length; i++) {
				
				appl.add(Long.parseLong(applicationWeb[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		if(sw.getId() == null){
			m.ajouterServeurWebAll(sw, serv, mach, sw.getLicenseLogiciel().getId(), cont, doc, sol, appl, contr);
		} else {
			m.modifierServeurWeb(sw, serv, mach, sw.getLicenseLogiciel().getId(), cont, doc, sol, appl, contr);  
			return "redirect:/config/view/serveurWeb?id="+sw.getId()+"&save="+true;
		}
		 	
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/middleware")
	public String editMiddleware(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("middleware",m.getMiddleware(id));
		model.addAttribute("lg", m.listLicenseLogiciel());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("mv", m.listMachineVirtuelle());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("instanceMiddleware", m.listInstanceMiddleware());
		return "sprint2/editMiddleware";
	}
	@RequestMapping(value="/search/middleware")
	public String searchMiddleware(Model model,String mi,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("middleware", mi);
		model.addAttribute("logged", logged);
		if(mi == null){
			model.addAttribute("cis", m.listMiddleware());
		} else {
			model.addAttribute("cis",m.SearchMiddleware(mi));   
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchMiddleware";
	}

	@RequestMapping(value="/view/middleware")
	public String viewMiddleware(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("middleware", m.getMiddleware(id) );    
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewMiddleware";
	}
	
	@RequestMapping(value="/admin/delete/middleware")
	public String deleteMiddleware(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerMiddleware(id);   
		return "redirect:/config/search/middleware?delete="+true;
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
			model.addAttribute("instanceMiddleware", m.listInstanceMiddleware());
			return "sprint2/addMiddleware";
			
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		List<Long> midl = new ArrayList<Long>();
		Long serv = null;
		Long mach = null;
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		String[] instanceMiddleware = req.getParameterValues("ckInstanceMiddleware");
        String[] systeme = req.getParameterValues("systeme");
		
		if(systeme != null){
			
			for (int i = 0; i < systeme.length; i++) {
				
				if(systeme[i].substring(0,4).equals("serv")){
					serv = Long.parseLong(systeme[i].substring(5));
					System.out.println("--------- serv : "+serv);
				}else {
					mach = Long.parseLong(systeme[i].substring(5));
					System.out.println("--------- mach : "+mach);
				}
		  }
			
		}
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
		if(instanceMiddleware != null ){
			for (int i = 0; i < instanceMiddleware.length; i++) {
				
				midl.add(Long.parseLong(instanceMiddleware[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		if(mi.getId() == null){
			m.ajouterMiddlewareAll(mi, serv, mach, mi.getLicenseLogiciel().getId(), cont, doc, sol, midl, contr);
		} else {
			m.modifierMiddleware(mi, serv, mach, mi.getLicenseLogiciel().getId(), cont, doc, sol, midl, contr);  
			return "redirect:/config/view/middleware?id="+mi.getId()+"&save="+true;
		}
		
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/serveurBD")
	public String editServeurBD(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("serveurBD", m.getServeurDeBasseDeDonnees(id));
		model.addAttribute("lg", m.listLicenseLogiciel());
		model.addAttribute("s", m.ListServeur());
		model.addAttribute("mv", m.listMachineVirtuelle());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("instanceBD", m.listInstanceDeBasseDeDonnes());
		return "sprint2/editServeurBD";
	}
	@RequestMapping(value="/search/serveurBD")
	public String searchServeurBD(Model model,String sbd,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("serveurBD", sbd);
		model.addAttribute("logged", logged);
		if(sbd == null){
			model.addAttribute("cis", m.listServeurDeBasseDeDonnees());
		} else {
			model.addAttribute("cis",m.SearchServeurDeBasseDeDonnees(sbd));   
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchServeurBD";
	}

	@RequestMapping(value="/view/serveurBD")
	public String viewServeurBD(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("serveurBD", m.getServeurDeBasseDeDonnees(id) );   
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewServeurBD";
	}
	
	@RequestMapping(value="/admin/delete/serveurBD")
	public String deleteServeurBD(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerServeurDeBasseDeDonnees(id);   
		return "redirect:/config/search/serveurBD?delete="+true;
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
			model.addAttribute("instanceBD", m.listInstanceDeBasseDeDonnes());
			return "sprint2/addServeurBD";
		}
		
		List<Long> cont = new ArrayList<Long>();
		List<Long> doc = new ArrayList<Long>();
		List<Long> sol = new ArrayList<Long>();
		List<Long> contr = new ArrayList<Long>();
		List<Long> ser = new ArrayList<Long>();
		Long serv = null;
		Long mach = null;
		
		String[] Contacts = req.getParameterValues("ckContacts");
		String[] documents = req.getParameterValues("ckDocuments");
		String[] solutionsApplicatives = req.getParameterValues("ckSolutionApplicative");
		String[] contrats = req.getParameterValues("ckContrats");
		String[] instanceBD = req.getParameterValues("ckInstanceBD");
        String[] systeme = req.getParameterValues("systeme");
		
		if(systeme != null){
			
			for (int i = 0; i < systeme.length; i++) {
				
				if(systeme[i].substring(0,4).equals("serv")){
					serv = Long.parseLong(systeme[i].substring(5));
					System.out.println("--------- serv : "+serv);
				}else {
					mach = Long.parseLong(systeme[i].substring(5));
					System.out.println("--------- mach : "+mach);
				}
		  }
			
		}
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
		if(instanceBD != null ){
			for (int i = 0; i < instanceBD.length; i++) {
				
				ser.add(Long.parseLong(instanceBD[i]));
			}
		}
		if(contrats  != null ){
			for (int i = 0; i < contrats.length; i++) {
				
				contr.add(Long.parseLong(contrats[i]));
			}
		}
		if(sbd.getId() == null){
			m.ajouterServeurDeBasseDeDonneesAll(sbd, serv, mach, sbd.getLicenseLogiciel().getId(), cont, doc, sol, ser, contr);
		} else {
			m.modifierServeurDeBasseDeDonnees(sbd, serv, mach, sbd.getLicenseLogiciel().getId(), cont, doc, sol, ser, contr);  
			return "redirect:/config/view/serveurBD?id="+sbd.getId()+"&save="+true;
		}
		
		
		return "redirect:/config/admin/dashboards?save="+true;
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
		model.addAttribute("serveurWeb", m.listServeurWeb());
		return "sprint2/addApplicationWeb";
	}
	@RequestMapping(value="/admin/edit/applicationWeb")
	public String editApplicationWeb(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("applicationWeb", m.getApplicationWeb(id));
		model.addAttribute("sw", m.listServeurWeb());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("serveurWeb", m.listServeurWeb());
		return "sprint2/editApplicationWeb";
	}
	@RequestMapping(value="/search/applicationWeb")
	public String searchApplicationWeb(Model model,String aw,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("applicationWeb", aw);
		model.addAttribute("logged", logged);
		if(aw == null){
			model.addAttribute("cis", m.listApplicationWeb());
		} else {
			model.addAttribute("cis",m.SearchApplicationWeb(aw)); 
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchApplicationWeb";
	}

	@RequestMapping(value="/view/applicationWeb")
	public String viewApplicationWeb(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println("------------------"+id);
		model.addAttribute("logged", logged);
		model.addAttribute("aw", m.getApplicationWeb(id) );
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewApplicationWeb";
	}
	
	@RequestMapping(value="/admin/delete/applicationWeb")
	public String deleteApplicationWeb(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerApplicationWeb(id); 
		return "redirect:/config/search/applicationWeb?delete="+true;
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
			model.addAttribute("serveurWeb", m.listServeurWeb());
			
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
		if(aw.getId() == null){
			m.ajouterApplicationWebAll(aw, aw.getServeurWeb().getId(), cont, doc, sol, contr);
		} else {
			m.modifierApplicationWeb(aw, aw.getServeurWeb().getId(), cont, doc, sol, contr); 
			return "redirect:/config/view/applicationWeb?id="+aw.getId()+"&save="+true;
		}
		
		
		return "redirect:/config/admin/dashboards?save="+true;
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
	@RequestMapping(value="/admin/edit/instanceMiddleware")
	public String editInstanceMiddleware(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("instanceMiddleware", m.getInstanceMiddleware(id));
		model.addAttribute("m", m.listMiddleware());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		return "sprint2/editInstanceMiddleware";
	}
	@RequestMapping(value="/search/instanceMiddleware")
	public String searchInstanceMiddleware(Model model,String im,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("instanceMiddleware", im);
		model.addAttribute("logged", logged);
		if(im == null){
			model.addAttribute("cis", m.listInstanceMiddleware());
		} else {
			model.addAttribute("cis",m.SearchInstanceMiddleware(im));  
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchInstanceMiddleware";
	}

	@RequestMapping(value="/view/instanceMiddleware")
	public String viewInstanceMiddleware(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println("------------------"+id);
		model.addAttribute("logged", logged);
		model.addAttribute("instanceMiddleware", m.getInstanceMiddleware(id) ); 
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewInstanceMiddleware";
	}
	
	@RequestMapping(value="/admin/delete/instanceMiddleware")
	public String deleteInstanceMiddleware(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerInstanceMiddleware(id); 
		return "redirect:/config/search/instanceMiddleware?delete="+true;
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
			model.addAttribute("middleware", m.listMiddleware());
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
		if(im.getId() == null){
			m.ajouterInstanceMiddlewareAll(im, im.getMiddleware().getId(), cont, doc, sol, contr);
		} else {
			m.modifierInstanceMiddleware(im, im.getMiddleware().getId(), cont, doc, sol, contr);  
			return "redirect:/config/view/instanceMiddleware?id="+im.getId()+"&save="+true;
		}
		
		
		return "redirect:/config/admin/dashboards?save="+true;
	}
	@RequestMapping(value="/admin/add/instanceBD")
	public String addInstanceDeBasseDeDonnes(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("instanceDeBasseDeDonnes", new InstanceDeBasseDeDonnes());
		model.addAttribute("sbd", m.listServeurDeBasseDeDonnees());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("serveurDeBasseDeDonnees", m.listServeurDeBasseDeDonnees());
		return "sprint2/addInstanceBD";
	}
	@RequestMapping(value="/admin/edit/instanceBD")
	public String editInstanceDeBasseDeDonnes(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
	    model.addAttribute("instanceDeBasseDeDonnes", m.getInstanceDeBasseDeDonnes(id)); 
		model.addAttribute("sbd", m.listServeurDeBasseDeDonnees());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("serveurDeBasseDeDonnees", m.listServeurDeBasseDeDonnees());
		return "sprint2/editInstanceBD";
	}
	@RequestMapping(value="/search/instanceBD")
	public String searchInstanceDeBasseDeDonnes(Model model,String ibd,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("instanceBD", ibd);
		model.addAttribute("logged", logged);
		if(ibd == null){
			model.addAttribute("cis", m.listInstanceDeBasseDeDonnes());
		} else {
			model.addAttribute("cis",m.SearchInstanceDeBasseDeDonnes(ibd));  
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchInstanceBD";
	}

	@RequestMapping(value="/view/instanceBD")
	public String viewInstanceDeBasseDeDonnes(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println("------------------"+id);
		model.addAttribute("logged", logged);
		model.addAttribute("instanceBD", m.getInstanceDeBasseDeDonnes(id) );  
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		return "sprint2/viewInstanceBD";
	}
	
	@RequestMapping(value="/admin/delete/instanceBD")
	public String deleteInstanceDeBasseDeDonnes(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		m.supprimerInstanceDeBasseDeDonnes(id);  
		return "redirect:/config/search/instanceBD?delete="+true;
	}
	@RequestMapping(value="/admin/add/saveInstanceBD", method = RequestMethod.POST)
	public String saveInstanceBD(@Valid InstanceDeBasseDeDonnes ibd,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
			model.addAttribute("sbd", m.listServeurDeBasseDeDonnees());
			model.addAttribute("contacts", m.listContact());
			model.addAttribute("documents", m.listDocument());
			model.addAttribute("solutionsApplicatives", m.ListSolutionApplicative());
			model.addAttribute("contrats", m.listContrat());
			model.addAttribute("serveurDeBasseDeDonnees", m.listServeurDeBasseDeDonnees());
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
		if(ibd.getId() == null){
			m.ajouterInstanceDeBasseDeDonnesAll(ibd, ibd.getServeurDeBasseDeDonnees().getId(), cont, doc, sol, contr);
		} else {
			m.modifierInstanceDeBasseDeDonnes(ibd, ibd.getServeurDeBasseDeDonnees().getId(), cont, doc, sol, contr);   
			return "redirect:/config/view/instanceBD?id="+ibd.getId()+"&save="+true;
		}
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	@RequestMapping(value="/admin/add/interfacereseau")
	public String interfacereseau(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		return "sprint2/TypeInterfaceReseau";
	}
	
	@RequestMapping(value="/admin/add/typeinterfacereseau")
	public String typeinterfacereseau(Model model,HttpServletRequest req){
		String[] interfacereseau = req.getParameterValues("type");
		
		return "redirect:"+interfacereseau[0];
	}
	
	@RequestMapping(value="/admin/add/fibre")
	public String addFibre(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("fibre", new Fibre());
		model.addAttribute("infra", m.ListServeur());
		model.addAttribute("equip", m.ListEquipementReseau());
		model.addAttribute("error", false);
		return "sprint2/addInterfaceFibre";
	}
	

	@RequestMapping(value="/admin/add/saveFibre", method = RequestMethod.POST)
	public String saveFibre(@Valid Fibre fibre,BindingResult bind,HttpServletRequest req,Model model) {
		
		String[] Materiel = req.getParameterValues("materiel");
		if(bind.hasErrors() || Materiel[0].equals("")){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			model.addAttribute("infra", m.ListServeur());
			model.addAttribute("equip", m.ListEquipementReseau());
			if(Materiel[0].equals("")){
				model.addAttribute("error", true);
			} else {
				model.addAttribute("error", false);
			}
			return "sprint2/addInterfaceFibre";
		}
		if(Materiel[0].substring(0,2).equals("IN")){
			Long infra = Long.parseLong(Materiel[0].substring(3));
			System.out.println("---------infra : "+infra);
			fibre.setInfrastructure(m.getInfrastructure(infra));
		} else {
			Long er = Long.parseLong(Materiel[0].substring(3));
			System.out.println("--------- er : "+er);
			fibre.setEquipementReseau(m.getEquipementReseau(er));
		}
		
		m.addFibre(fibre);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	
	
	
	@RequestMapping(value="/admin/add/logique")
	public String addLogique(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("logique", new Logique());
		model.addAttribute("mv", m.listMachineVirtuelle());
		model.addAttribute("error", false);
		return "sprint2/addInterfaceLogique";
	}
	

	@RequestMapping(value="/admin/add/saveLogique", method = RequestMethod.POST)
	public String saveLogique(@Valid Logique log,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("--------- Nom : "+log.getNom());
		String[] mv = req.getParameterValues("machinevirtuelle");
		System.out.println("------------ MV : "+mv[0]);
		if(bind.hasErrors() || mv[0].equals("")){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			model.addAttribute("logique", new Logique());
			model.addAttribute("mv", m.listMachineVirtuelle());
			if(mv[0].equals("")){
				model.addAttribute("error", true);
			} else {
				model.addAttribute("error", false);
			}
			return "sprint2/addInterfaceLogique";
		}
		System.out.println("--------- fvdfvdfvdfvdfv ");
		log.setMachineVirtuelle(m.getMachineVirtuelle(Long.parseLong(mv[0])));
		
		m.addLogique(log);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	@RequestMapping(value="/admin/add/physique")
	public String addPhysique(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("physique", new Physique());
		model.addAttribute("vlans", m.ListVlan());
		model.addAttribute("infra", m.ListServeur());
		model.addAttribute("equip", m.ListEquipementReseau());
		model.addAttribute("error", false);
		return "sprint2/addInterfacePhysique";
	}
	

	@RequestMapping(value="/admin/add/savePhysique", method = RequestMethod.POST)
	public String savePhysique(@Valid Physique physique,BindingResult bind,HttpServletRequest req,Model model) {
		String[] Materiel = req.getParameterValues("materiel");
		if(bind.hasErrors() || Materiel[0].equals("")){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			model.addAttribute("vlans", m.ListVlan());
			model.addAttribute("infra", m.ListServeur());
			model.addAttribute("equip", m.ListEquipementReseau());
			if(Materiel[0].equals("")){
				model.addAttribute("error", true);
			} else {
				model.addAttribute("error", false);
			}
			return "sprint2/addInterfacePhysique";
		}
		if(Materiel[0].substring(0,2).equals("IN")){
			Long infra = Long.parseLong(Materiel[0].substring(3));
			System.out.println("---------infra : "+infra);
			physique.setInfrastructure(m.getInfrastructure(infra));
		} else {
			Long er = Long.parseLong(Materiel[0].substring(3));
			System.out.println("--------- er : "+er);
			physique.setEquipementReseau(m.getEquipementReseau(er));
		}
		
		String[] chvlan = req.getParameterValues("ckVlans");
		List<Long> vlan = null;
		System.out.println("---------chvlan : "+chvlan+" vlan : "+vlan);
		
		
		if(chvlan != null){
			vlan = new ArrayList<Long>();
			for (int i = 0; i < chvlan.length; i++) {
				System.out.println("---------chvlan "+chvlan[i]);
				vlan.add(Long.parseLong(chvlan[i]));
			}
			
		}
		
		m.addPhysiqueAll(physique, vlan);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	
	@RequestMapping(value="/admin/add/subnet")
	public String addSubnet(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("subnet", new Subnet());
		model.addAttribute("vlans", m.ListVlan());
		return "sprint2/addSubnet";
	}
	
	@RequestMapping(value="/admin/add/saveSubnet", method = RequestMethod.POST)
	public String saveSubnet(@Valid Subnet subnet,BindingResult bind,HttpServletRequest req,Model model) {
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			model.addAttribute("vlans", m.ListVlan());
			
			return "sprint2/addSubnet";
		}
		
		
		String[] chvlan = req.getParameterValues("ckVlans");
		List<Long> vlan = null;
		System.out.println("---------chvlan : "+chvlan+" vlan : "+vlan);
		
		
		if(chvlan != null){
			vlan = new ArrayList<Long>();
			for (int i = 0; i < chvlan.length; i++) {
				System.out.println("---------chvlan "+chvlan[i]);
				vlan.add(Long.parseLong(chvlan[i]));
			}
			
		}
		
		m.addSubnetAll(subnet, vlan);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	
	@RequestMapping(value="/admin/add/volumeLogique")
	public String addVolumeLogique(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("volumeLogique", new VolumeLogique());
		model.addAttribute("serveurs", m.ListServeur());
		model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
		model.addAttribute("ss", m.ListSystemeDeStockage());
		model.addAttribute("error", false);
		return "sprint2/addVolumeLogique";
	}

	@RequestMapping(value="/admin/add/saveVolumeLogique", method = RequestMethod.POST)
	public String saveVolumeLogique(@Valid VolumeLogique vl,BindingResult bind,HttpServletRequest req,Model model) {
		System.out.println("ftghn : "+vl.getSystemedestockage().getId());
		if(bind.hasErrors() || vl.getSystemedestockage().getId() == null){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			model.addAttribute("serveurs", m.ListServeur());
			model.addAttribute("machinesVirtuelles", m.listMachineVirtuelle());
			model.addAttribute("ss", m.ListSystemeDeStockage());
			if(vl.getSystemedestockage().getId() == null){
				model.addAttribute("error", true);
			} else {
				model.addAttribute("error", false);
			}
			return "sprint2/addVolumeLogique";
		}
		
		
		String[] chserver = req.getParameterValues("ckServeurs");
		List<Long> server = null;
		System.out.println("---------chserver : "+chserver+" server : "+server);
		
		
		if(chserver != null){
			server = new ArrayList<Long>();
			for (int i = 0; i < chserver.length; i++) {
				System.out.println("---------chserver "+chserver[i]);
				server.add(Long.parseLong(chserver[i]));
			}
		}
		

		String[] chmv = req.getParameterValues("ckMachinesVirtuelles");
		List<Long> mv = null;
		System.out.println("---------chmv : "+chmv+" mv : "+mv);
		
		
		if(chmv != null){
			mv = new ArrayList<Long>();
			for (int i = 0; i < chmv.length; i++) {
				System.out.println("---------chmv "+chmv[i]);
				mv.add(Long.parseLong(chmv[i]));
			}
		}
		m.addVolumeLogiqueAll(vl, server, mv);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	@RequestMapping(value="/admin/add/vlan")
	public String addVlan(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("logged", logged);
		model.addAttribute("vlan", new Vlan());
		model.addAttribute("subnets", m.ListSubnet());
		model.addAttribute("interfacereseaux", m.ListPhysique());
		return "sprint2/addVlan";
	}
	

	@RequestMapping(value="/admin/add/saveVlan", method = RequestMethod.POST)
	public String saveVlan(@Valid Vlan vlan,BindingResult bind,HttpServletRequest req,Model model) {
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
			model.addAttribute("logged", logged);
			model.addAttribute("subnets", m.ListSubnet());
			model.addAttribute("interfacereseaux", m.ListPhysique());
			return "sprint2/addVlan";
		}
		
		
		String[] chsubnet = req.getParameterValues("ckSubnets");
		List<Long> subnet = null;
		System.out.println("---------chsubnet : "+chsubnet+" subnet : "+subnet);
		
		
		if(chsubnet != null){
			subnet = new ArrayList<Long>();
			for (int i = 0; i < chsubnet.length; i++) {
				System.out.println("---------chsubnet "+chsubnet[i]);
				subnet.add(Long.parseLong(chsubnet[i]));
			}
			
		}
		

		String[] chinter_res = req.getParameterValues("chinterfacereseau");
		List<Long> inter_res = null;
		System.out.println("---------chinter_res : "+chinter_res+" inter_res : "+inter_res);
		
		
		if(chinter_res != null){
			inter_res = new ArrayList<Long>();
			for (int i = 0; i < chinter_res.length; i++) {
				System.out.println("---------chinter_res "+chinter_res[i]);
				inter_res.add(Long.parseLong(chinter_res[i]));
			}
			
		}
		m.addVlanAll(vlan, subnet, inter_res);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	
	@RequestMapping(value="/admin/add/camera")
	public String addCamera(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("camera", new Camera() );
		model.addAttribute("documents", m.listDocument());
		model.addAttribute("contrats", m.listContrat());
		model.addAttribute("contacts", m.listContact());
		model.addAttribute("lieus", m.listLieu());
		model.addAttribute("dvr", m.ListDvr());
		return "sprint2/addCamera";
	}
	
	
	@RequestMapping(value="/admin/add/saveCamera", method = RequestMethod.POST)
	public String saveCamera(@Valid Camera camera,BindingResult bind,HttpServletRequest req,Model model) {
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
			model.addAttribute("lieus", m.listLieu());
			model.addAttribute("dvr", m.ListDvr());
			return "sprint2/addCamera";
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
				System.out.println("---------chdocument "+chdocument[i]);
				chdoc.add(Long.parseLong(chdocument[i]));
			}
		}
		if(chContrat != null){
			chcontrat = new ArrayList<Long>();
			for (int i = 0; i < chContrat.length; i++) {
				System.out.println("---------chContrat "+chContrat[i]);
				chcontrat.add(Long.parseLong(chContrat[i]));
			}
		}
		if(chContact != null){
			chcontact = new ArrayList<Long>();
			for (int i = 0; i < chContact.length; i++) {
				System.out.println("---------chContact "+chContact[i]);
				chcontact.add(Long.parseLong(chContact[i]));
			}
		}
		
		System.out.println("Chassis : "+camera.getDvr()+" ID : "+camera.getDvr().getId());
		System.out.println("Lieu : "+camera.getLieu()+" ID : "+camera.getLieu().getId());
		
		m.addCameraAll(camera, camera.getLieu().getId(), camera.getDvr().getId(), chdoc, chcontact, chcontrat);
		return "redirect:/config/admin/dashboards?save="+true;
	}
	
	
	@RequestMapping(value="/search/pc")
	public String searchPC(Model model,String s,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    //String[] s = req.getParameterValues("s");
	    System.out.println("Search : "+s);
	    model.addAttribute("s", s);
		model.addAttribute("logged", logged);
		if(s == null){
			model.addAttribute("cis", m.ListPC());
		} else {
			model.addAttribute("cis",m.SearchPC(s));
		}
		if(delete == null){
			model.addAttribute("delete", false );
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint2/SearchPC";
	}

	
	@RequestMapping(value="/view/pc")
	public String viewPC(Model model,Long id,String save){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("ordinateur", m.getPC(id) );
		if(save == null){
			model.addAttribute("save", false );
		} else {
			model.addAttribute("save", save );
		}
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		return "sprint2/viewPC";
	}
	
	@RequestMapping(value="/admin/delete/pc")
	public String deletePC(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		m.deletePC(id);
		return "redirect:/config/search/pc?delete="+true;
	}
	
	@RequestMapping(value="/admin/edit/pc")
	public String editPC(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    System.out.println(logged_m);
	    User logged = mu.getUserByMatricule(logged_m);
	    System.out.println(logged.getNom());
		model.addAttribute("logged", logged);
		model.addAttribute("ordinateur",  m.getPC(id) );
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
		return "sprint2/editPC";
	}
	
	
}
