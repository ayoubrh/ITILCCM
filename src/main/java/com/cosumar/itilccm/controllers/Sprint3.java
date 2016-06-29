package com.cosumar.itilccm.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		if(logged.getRole().getNom().equals("ROLE_ADMIN") || logged.getRole().getNom().equals("ROLE_IT_TEAM") ){
		model.addAttribute("ApplicationWeb", m.listApplicationWeb());
	    model.addAttribute("ConnexionElectrique", m.ListConnexionElectrique());
	    model.addAttribute("Logiciel", m.listLogicielEtApplication());
	    model.addAttribute("Infrastructure", m.ListInfrastructure());
	    model.addAttribute("Camera", m.ListCamera());
		model.addAttribute("Chassis", m.ListChassis());
		model.addAttribute("Equipementreseau", m.ListEquipementReseau());
		model.addAttribute("Virtualisation", m.listVirtualisation());
		model.addAttribute("InstanceMiddleware", m.listInstanceMiddleware());
		model.addAttribute("Instancedebasededonnees", m.listInstanceDeBasseDeDonnes());
		model.addAttribute("Machinevirtuelle", m.listMachineVirtuelle());
		model.addAttribute("Processusmetier", m.ListProcessusMetier());
		model.addAttribute("Rack", m.ListRack());
		model.addAttribute("Solutionapplicative", m.ListSolutionApplicative());
		model.addAttribute("Peripherique", m.ListPeriph());
		}else {
		model.addAttribute("Imprimante", m.ListImpUser(logged.getId()));
		model.addAttribute("Ordinateur", m.ListPCUser(logged.getId()));
		model.addAttribute("Sim", m.ListSIMUser(logged.getId())); 
		model.addAttribute("Tablette", m.ListTabletteUser(logged.getId()));
		model.addAttribute("Telephonefixe", m.ListTeleFixeUser(logged.getId()));
		model.addAttribute("Telephonemobile", m.ListTeleMobileUser(logged.getId())); 
		}
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
	public String saveTicket(@Valid TicketIncident t,BindingResult bind,Model model,HttpServletRequest req) throws ParseException {
		
		if(bind.hasErrors()){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String logged_m = auth.getName();
		    User logged = mu.getUserByMatricule(logged_m);
		    model.addAttribute("logged", logged);
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
			model.addAttribute("Sim", m.ListSIM());
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
		System.out.println("Date 0---------- : "+date);
		// Definition du format utilise pour les dates
		  SimpleDateFormat f1 = new SimpleDateFormat ("dd/mm/yyyy"); 
		  String dat = f1.format(date);
		  System.out.println("Date1---------- : "+dat);
		  Date d = (Date)f1.parse(dat);
		  System.out.println("Date---------- : "+d);
		  try {
		      Thread.currentThread().sleep(60 * 1000);
		      }
		    catch (InterruptedException e) {
		      e.printStackTrace();
		      }
		  t.setDateDeDebut(d);  
		t.setStatut("Nouveau");
		t.setPriorite(t.getUrgence()); 
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
				/*if(cis[i].substring(0,3).equals("Cha")){
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
				if(cis[i].substring(0,3).equals("Sim")){
					Sim sim = m.getSIM(Long.parseLong(cis[i].substring(4)));
					t.setSim(sim);  
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
				}*/
		  }
		} 
			m.addTicketIncident(t, logged.getId());
		
		return "redirect:/indexv?save="+true;
	}
	
	@RequestMapping(value="/edit/saveTicket")
	public String saveEditTickets(@Valid TicketIncident t,Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		Date date = new Date();
		 SimpleDateFormat f1 = new SimpleDateFormat ("dd/MM/yyyy"); 
		  String dat = f1.format(date);
		//DateFormat f1 = DateFormat.getDateInstance();
		
		if(t.isValider() ){
			if(t.getEquipeIt().getId() == null){
			//t.setDateDeValidation(dat);
			t.setStatut("En attente");
			}else{
				//t.setDateD_affectation(dat);
				t.setStatut("En cours");
			}
			
		}
		
		if(!t.isValider()){
			
			//t.setDateD_affectation(dat);
			t.setStatut("Rejet");
			
		}
	    if(t.isResolver()){
	    	//t.setDateDeResolution(dat);
	    	t.setStatut("Résolue");
	    }else{
	    	t.setStatut("Abîmé");
	    }
		System.out.println("--------------------------- CCCCCCCCCCCCCCCCCCCCCC");
		m.editTicketIncident(t);
		return "redirect:/incid/view/ticket/ouverts";
	}
	@RequestMapping(value="/edit/ticket")
	public String editTickets(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("ticketIncident", m.getTicketIncident(id));  
		model.addAttribute("equipe", m.listEquipeIT());
		return "sprint3/editTicket";
	}
	@RequestMapping(value="/view/all")
	public String viewAll(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged); 
		model.addAttribute("n", m.nombreTicketNouveau());
		model.addAttribute("c", m.nombreTicketEnCours());
		model.addAttribute("a", m.nombreTicketEnAttente());
		model.addAttribute("r", m.nombreTicketResolue());
		model.addAttribute("f", m.nombreTicketFermee());
		model.addAttribute("agent", m.listNombre());
		return "sprint3/dashboard"; 
	}
	@RequestMapping(value="/view/mesticket")
	public String viewMesTicket(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("ticket", m.listMesIncident(logged.getId())); 
		
		return "sprint3/MesIncidents"; 
	}
	@RequestMapping(value="/view/ticket")
	public String viewTickets(Model model,Long id){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("ticket", m.getTicketIncident(id));
		return "sprint3/viewTicket"; 
	}
	@RequestMapping(value="/view/ticket/ouverts")
	public String viewTicketOuverts(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("ticket", m.listIncidentOuverts()); 
		
		return "sprint3/ticketOuverts"; 
	}
	@RequestMapping(value="/view/ticket/fermees")
	public String viewTicketFermees(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String logged_m = auth.getName();
	    User logged = mu.getUserByMatricule(logged_m);
		model.addAttribute("logged", logged);
		model.addAttribute("ticket", m.listIncidentFermees()); 
		
		return "sprint3/ticketFermees"; 
	}

	
}
