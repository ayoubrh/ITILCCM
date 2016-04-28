package com.cosumar.itilccm.toufik;

import static org.junit.Assert.*;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.ApplicationWeb;
import com.cosumar.itilccm.entities.AutreLogiciel;
import com.cosumar.itilccm.entities.Contact;
import com.cosumar.itilccm.entities.Contrat;
import com.cosumar.itilccm.entities.Document;
import com.cosumar.itilccm.entities.Groupe;
import com.cosumar.itilccm.entities.Hyperviseur;
import com.cosumar.itilccm.entities.InstanceDeBasseDeDonnes;
import com.cosumar.itilccm.entities.InstanceMiddleware;
import com.cosumar.itilccm.entities.LicenseOs;
import com.cosumar.itilccm.entities.Lieu;
import com.cosumar.itilccm.entities.LogicielPc;
import com.cosumar.itilccm.entities.MachineVirtuelle;
import com.cosumar.itilccm.entities.Middleware;
import com.cosumar.itilccm.entities.ServeurDeBasseDeDonnees;
import com.cosumar.itilccm.entities.ServeurWeb;
import com.cosumar.itilccm.entities.Vcluster;
import com.cosumar.itilccm.entities.VersionOs;
import com.cosumar.itilccm.metier.AdminMetier;
public class TestMetierT {
	ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		AdminMetier m = (AdminMetier) context.getBean("metier");
	}

	@org.junit.Test
	public void test() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			
			// lieu
			Long l = m.ajouterLieu(new Lieu("DIRECTION AUDIT, RISK MANAGEMENT ET QSE >AUDIT INTERNE", "Actif", "RAFFINERIE", null, null, "casa", "Maroc"));
			Long l2 = m.ajouterLieu(new Lieu("DIRECTION COMMERCIALE>AGENCE CASA", "Actif", "RAFFINERIE", null, null, "casa", "Maroc"));
			Long l3 = m.ajouterLieu(new Lieu("DOUKKALA>ADMINISTRATION", "Actif", "DOUKKALA", null, null, "DOUKKALA", "Maroc"));
			Long l4 = m.ajouterLieu(new Lieu("SUNABEL MBK>ADMINISTRATION", "Actif", "SUNABEL MBK", null, null, "MBK", "Maroc"));
			Long l5 = m.ajouterLieu(new Lieu("SUNABEL MBK>BUREAU DE VENTE", "Actif", "SUNABEL MBK", null, null, "MBK", "Maroc"));
			
			// Contact
			Long c = m.ajouterContact(new Contact("ferhaoui", "toufik", "GROUPE COSUMAR", "Actif", "chef de projet", "1", "toufik.ferhaoui@gmail.com", null, "0637799182"));
			Long c2 = m.ajouterContact(new Contact("RHNABRI", "Ayoub", "GROUPE COSUMAR", "Actif", "chef de projet", "2", null, null, null));
			Long c3 = m.ajouterContact(new Contact("test", "AAAA", "GROUPE COSUMAR", "Actif", "chef de projet", "3", null, null, null));
			
			// Contrat
			Long cc = m.ajouterContrat(new Contrat("Travail", "FERHAOUI", "responsable de service informatique", null, null, 8000, "Derham", null, null, "IT departement", null, "production", "Fournisseur"));
			Long cc2 = m.ajouterContrat(new Contrat("Travail2", "RHNABRI", "responsable de service informatique", null, null, 8000, "Derham", null, null, "IT departement", null, "production", "Fournisseur"));
			
			//// Document
			Long d = m.ajouterDocument(new Document("Contrat", "Brouillon", null, "pdf", null,null, null));
			 
			// Groupe
			
			Long g = m.ajouterGroupe(new Groupe("Groupe1", "Production", null, null));
			Long g2 = m.ajouterGroupe(new Groupe("Groupe2", "Production", null, null));
			Long g3 = m.ajouterGroupe(new Groupe("Groupe3", "Production", null, null));
			
			// Application Web
			
			Long aw = m.ajouterApplicationWeb(new ApplicationWeb("onlineSales", null,"basse", null, null));
			Long aw2 = m.ajouterApplicationWeb(new ApplicationWeb("Open ERP", null,"basse", null, null));
			Long aw3 = m.ajouterApplicationWeb(new ApplicationWeb("Sugar CRM", null,"haute", null, null));
			
			//Instance Middleware
			
			Long mi = m.ajouterInstanceMiddleware(new InstanceMiddleware("test", "haute", null, null));
			
			// Instance de basse de donnes
			
			m.ajouterInstanceDeBasseDeDonnes(new InstanceDeBasseDeDonnes("itop demo", "basse", null, null));
			
			// Version OS
			m.ajouterVersionOs(new VersionOs("Unbuntu 11.10", "Linux"));
			m.ajouterVersionOs(new VersionOs("Windows 2008 Server", "Windows"));
			
			// Logiciel PC
			
			m.ajouterLogicielPc(new LogicielPc("Office", "Actif", "basse", null, null, null));
			m.ajouterLogicielPc(new LogicielPc("WinRAR", "Actif", "basse", null, null, null));
			m.ajouterLogicielPc(new LogicielPc("ATOM", "Actif", "basse", null, null, null));
			
			// Serveur Web
			
			m.ajouterServeurWeb(new ServeurWeb("Apache", null, "basse", null, null, null));
			m.ajouterServeurWeb(new ServeurWeb("IIS", null, "basse", null, null, null));
			
			// Middleware
			
			m.ajouterMiddleware(new Middleware("Tomcat", "Actif", "basse", null, null, null));
			m.ajouterMiddleware(new Middleware("JBoss", "Actif", "basse", null, null, null));
			m.ajouterMiddleware(new Middleware("Talend", "Actif", "basse", null, null, null));
			
			// //Serveur de basse de donnees
			
			m.ajouterServeurDeBasseDeDonnees(new ServeurDeBasseDeDonnees("MySQL", null, "basse", null, null, null));
			m.ajouterServeurDeBasseDeDonnees(new ServeurDeBasseDeDonnees("	Oracle", null, "basse", null, null, null));
			
			//// Machine Virtuelle
			
			m.ajouterMachineVirtuelle(new MachineVirtuelle("VM1", "production", "basse", null, null, null, null, null));
			m.ajouterMachineVirtuelle(new MachineVirtuelle("VM2", "production", "basse", null, null, null, null, null));
			m.ajouterMachineVirtuelle(new MachineVirtuelle("VM3", "production", "basse", null, null, null, null, null));
			
			//// Vcluster
			m.ajouterVcluster(new Vcluster("Cluster1", "production", "basse", null, null));
			m.ajouterVcluster(new Vcluster("Cluster2", "production", "basse", null, null));
			
			// Hyperviseur
			m.ajouterHyperviseur(new Hyperviseur("ESX1", "production", "basse", null, null));
			m.ajouterHyperviseur(new Hyperviseur("ESX2", "production", "basse", null, null));
			m.ajouterHyperviseur(new Hyperviseur("ESX3", "production", "basse", null, null));
			
			Lieu li = m.getLieu(1L);
			System.out.println(li.getNom());
			
			assertTrue(true);
		}catch(Exception e){
			assertTrue(e.getMessage(), false);
		}
	}

}
