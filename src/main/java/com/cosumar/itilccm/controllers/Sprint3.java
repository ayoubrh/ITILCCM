package com.cosumar.itilccm.controllers;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cosumar.itilccm.entities.*;
import com.cosumar.itilccm.entities.Groupe;
import com.cosumar.itilccm.entities.Peripherique;
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
		model.addAttribute("ticketIncident", new TicketIncident());
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
		return "sprint3/addTicket";
	}
	@RequestMapping(value="/search/ticket")
	public String searchTicket(Model model,String ti,String delete){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
	    model.addAttribute("ticket", ti);
		model.addAttribute("logged", logged);
		if(ti == null){
			model.addAttribute("cis", m.listTicketIncident());
		} else {
			model.addAttribute("cis",m.SearchTicketIncident(ti));      
		}
		if(delete == null){
			model.addAttribute("delete", false ); 
		} else {
			model.addAttribute("delete", delete );
		}
		return "sprint3/SearchTicket"; 
	}
	
	@RequestMapping(value="/add/saveTicket", method = RequestMethod.POST)
	public String saveGroupe(@Valid TicketIncident t,BindingResult bind,Model model,HttpServletRequest req) {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
		    model.addAttribute("g", m.listGroupe());
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
			if(t.getId()==null)
			return "sprint3/addTicket";
			else return "sprint3/editTicket";
		}
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		Date date = new Date();
		t.setDateDeDebut(date); 
		t.setStatut("Nouveau");
		String[] cis = req.getParameterValues("ckCIs");
		if(cis != null){
			
			for (int i = 0; i < cis.length; i++) {
				
				if(cis[i].substring(0,3).equals("App")){
					ApplicationWeb aw =  m.getApplicationWeb(Long.parseLong(cis[i].substring(4)));
					t.setApplicationWeb(aw);		 
				}
				if(cis[i].substring(0,3).equals("Con")){
					ConnexionElectrique ce = m.getConnexionElectrique(Long.parseLong(cis[i].substring(4)));
					t.setConnexionElectrique(ce); 
				}
				if(cis[i].substring(0,3).equals("Log")){
					LogicielEtApplication l = m.getLogicielEtApplication(Long.parseLong(cis[i].substring(4)));
					t.setLogicielEtApplication(l); 
				}
				if(cis[i].substring(0,3).equals("Inf")){
					Infrastructure inf = m.getInfrastructure(Long.parseLong(cis[i].substring(4))); 
					t.setInfrastructure(inf); 
				}
				if(cis[i].substring(0,3).equals("Cam")){
					Camera cam = m.getCamera(Long.parseLong(cis[i].substring(4)));
					t.setCamera(cam); 
				}
				if(cis[i].substring(0,3).equals("Cha")){
					Chassis ch = m.getChassis(Long.parseLong(cis[i].substring(4)));
					t.setChassis(ch); 
				}
				if(cis[i].substring(0,3).equals("Equ")){
					EquipementReseau er = m.getEquipementReseau(Long.parseLong(cis[i].substring(4)));
					t.setEquipementReseau(er); 
				}
				if(cis[i].substring(0,3).equals("Vir")){
					Virtualisation v = m.getVirtualisation(Long.parseLong(cis[i].substring(4)));
					t.setVirtualisation(v); 
				}
				if(cis[i].substring(0,3).equals("Imp")){
					Imprimante imp = m.getImp(Long.parseLong(cis[i].substring(4)));
					t.setImprimante(imp); 
				}
				if(cis[i].substring(0,3).equals("InM")){
					InstanceMiddleware im = m.getInstanceMiddleware(Long.parseLong(cis[i].substring(4)));
					t.setInstanceMiddleware(im); 
				}
				if(cis[i].substring(0,3).equals("Ibd")){
					InstanceDeBasseDeDonnes ibd = m.getInstanceDeBasseDeDonnes(Long.parseLong(cis[i].substring(4)));
					t.setInstanceDeBasseDeDonnes(ibd); 
				}
				if(cis[i].substring(0,3).equals("Mac")){
					MachineVirtuelle mv = m.getMachineVirtuelle(Long.parseLong(cis[i].substring(4)));
					t.setMachineVirtuelle(mv); 
				}
				if(cis[i].substring(0,3).equals("Ord")){
					Ordinateur ord = m.getPC(Long.parseLong(cis[i].substring(4)));
					t.setOrdinateur(ord); 
				}
				if(cis[i].substring(0,3).equals("Pro")){
					ProcessusMetier pm = m.getProcessusMetier(Long.parseLong(cis[i].substring(4)));
					t.setProcessusMetier(pm); 
				}
				if(cis[i].substring(0,3).equals("Per")){
					Peripherique per = m.getPeriph(Long.parseLong(cis[i].substring(4)));
					t.setPeripherique(per); 
				}
				if(cis[i].substring(0,3).equals("Rac")){
					Rack r = m.getRack(Long.parseLong(cis[i].substring(4)));
					t.setRack(r); 
				}
				if(cis[i].substring(0,3).equals("Sol")){
					SolutionApplicative sa = m.getSolutionApplicative(Long.parseLong(cis[i].substring(4)));
					t.setSolutionApplicative(sa); 
				}
				if(cis[i].substring(0,3).equals("Tab")){
					Tablette tab = m.getTablette(Long.parseLong(cis[i].substring(4)));
					t.setTablette(tab); 
				}
				if(cis[i].substring(0,3).equals("Tef")){
					TelephoneFixe tf = m.getTeleFixe(Long.parseLong(cis[i].substring(4)));
					t.setTelephoneFixe(tf); 
				}
				if(cis[i].substring(0,3).equals("Tem")){
					TelephneMobile tm = m.getTeleMobile(Long.parseLong(cis[i].substring(4)));
					t.setTelephneMobile(tm); 
				}
		  }
			
		}
		
			m.addTicketIncident(t, logged.getId());
		
		return "redirect:/config/admin/dashboards?save="+true;
	}
	

	
}
