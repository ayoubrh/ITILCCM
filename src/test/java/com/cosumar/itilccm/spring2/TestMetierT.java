package com.cosumar.itilccm.spring2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.*;
import com.cosumar.itilccm.metier.AdminMetier;

public class TestMetierT {
	ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
	}
	
	@Test
	public void Lieu() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			
			m.ajouterLieu(new Lieu("DIRECTION AUDIT, RISK MANAGEMENT ET QSE >AUDIT INTERNE", "Actif", "RAFFINERIE", null, null, "casa", "Maroc"));
			m.ajouterLieu(new Lieu("DIRECTION COMMERCIALE>AGENCE CASA", "Actif", "RAFFINERIE", null, null, "casa", "Maroc"));
			m.ajouterLieu(new Lieu("DOUKKALA>ADMINISTRATION", "Actif", "DOUKKALA", null, null, "DOUKKALA", "Maroc"));
			m.ajouterLieu(new Lieu("SUNABEL MBK>ADMINISTRATION", "Actif", "SUNABEL MBK", null, null, "MBK", "Maroc"));
			m.ajouterLieu(new Lieu("SUNABEL MBK>BUREAU DE VENTE", "Actif", "SUNABEL MBK", null, null, "MBK", "Maroc"));
			Lieu li = m.getLieu(1L);
			System.out.println(li.getNom());
			assertTrue(true);
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void Contact() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			
			m.ajouterContact(new Contact("ferhaoui", "toufik", "GROUPE COSUMAR", "Actif", "chef de projet", "1", "toufik.ferhaoui@gmail.com", null, "0637799182"));
			m.ajouterContact(new Contact("RHNABRI", "Ayoub", "GROUPE COSUMAR", "Actif", "chef de projet", "2", null, null, null));
			m.ajouterContact(new Contact("test", "AAAA", "GROUPE COSUMAR", "Actif", "chef de projet", "3", null, null, null));
			assertTrue(true);
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	
	}
	
	@Test
	public void Contrat() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			
			m.ajouterContrat(new Contrat("Contrat", "FERHAOUI", "responsable de service informatique", null, null, 8000, "Derham", null, null, "IT departement", null, "production", "Fournisseur"));
			m.ajouterContrat(new Contrat("Contrat2", "RHNABRI", "responsable de service informatique", null, null, 8000, "Derham", null, null, "IT departement", null, "production", "Fournisseur"));
			assertTrue(true);
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	
		
	}
	/*@Test
	public void Document() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterDocument(new Document("Contrat", "Brouillon", null, "pdf", null,null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	
		
	}*/
	
	@Test
	public void Groupe() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterGroupe(new Groupe("Groupe1", "Production", null, null));
			m.ajouterGroupe(new Groupe("Groupe2", "Production", null, null));
			m.ajouterGroupe(new Groupe("Groupe3", "Production", null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	
		
	}
	
	@Test
	public void ApplicationWeb() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterApplicationWeb(new ApplicationWeb("onlineSales", null,"basse", null, null));
			m.ajouterApplicationWeb(new ApplicationWeb("Open ERP", null,"basse", null, null));
			m.ajouterApplicationWeb(new ApplicationWeb("Sugar CRM", null,"haute", null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}	
	}
				
	@Test
	public void InstanceMiddleware() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterInstanceMiddleware(new InstanceMiddleware("test", "haute", null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void InstanceDeBasseDeDonnes() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterInstanceDeBasseDeDonnes(new InstanceDeBasseDeDonnes("itop demo", "basse", null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void VersionOs() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterVersionOs(new VersionOs("Unbuntu 11.10", "Linux"));
			m.ajouterVersionOs(new VersionOs("Windows 2008 Server", "Windows"));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void LicenseOs() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterLicenseOs(new LicenseOs("License1", null, null, "oui", null, null, null));
			m.ajouterLicenseOs(new LicenseOs("License2", null, null, "oui", null, null, null));
			m.ajouterLicenseOs(new LicenseOs("License3", null, null, "oui", null, null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void LicenseLogiciel() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterLicenseLogiciel(new LicenseLogiciel("license1", null, null, "oui", null, null, null));
			m.ajouterLicenseLogiciel(new LicenseLogiciel("license2", null, null, "oui", null, null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void LogicielPc() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterLogicielPc(new LogicielPc("Office", "Actif", "basse", null, null, null));
			m.ajouterLogicielPc(new LogicielPc("WinRAR", "Actif", "basse", null, null, null));
			m.ajouterLogicielPc(new LogicielPc("ATOM", "Actif", "basse", null, null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void Autrelogiciel() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterAutreLogiciel(new AutreLogiciel("autre1", null, null, null, null, null));
			m.ajouterAutreLogiciel(new AutreLogiciel("autre2", null, null, null, null, null));
			m.ajouterAutreLogiciel(new AutreLogiciel("autre3", null, null, null, null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void ServeurWeb() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterServeurWeb(new ServeurWeb("Apache", null, "basse", null, null, null));
			m.ajouterServeurWeb(new ServeurWeb("IIS", null, "basse", null, null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void Middleware() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterMiddleware(new Middleware("Tomcat", "Actif", "basse", null, null, null));
			m.ajouterMiddleware(new Middleware("JBoss", "Actif", "basse", null, null, null));
			m.ajouterMiddleware(new Middleware("Talend", "Actif", "basse", null, null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void ServeurDeBasseDeDonnees() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterServeurDeBasseDeDonnees(new ServeurDeBasseDeDonnees("MySQL", null, "basse", null, null, null));
			m.ajouterServeurDeBasseDeDonnees(new ServeurDeBasseDeDonnees("	Oracle", null, "basse", null, null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void MachineVirtuelle() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterMachineVirtuelle(new MachineVirtuelle("VM1", "production", "basse", null, null, null, null, null));
			m.ajouterMachineVirtuelle(new MachineVirtuelle("VM2", "production", "basse", null, null, null, null, null));
			m.ajouterMachineVirtuelle(new MachineVirtuelle("VM3", "production", "basse", null, null, null, null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void Vcluster() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterVcluster(new Vcluster("Cluster1", "production", "basse", null, null));
			m.ajouterVcluster(new Vcluster("Cluster2", "production", "basse", null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void Hyperviseur() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.ajouterHyperviseur(new Hyperviseur("ESX1", "production", "basse", null, null));
			m.ajouterHyperviseur(new Hyperviseur("ESX2", "production", "basse", null, null));
			m.ajouterHyperviseur(new Hyperviseur("ESX3", "production", "basse", null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void SolutionApplicative() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.addSolutionApplicative(new SolutionApplicative("SAP", "active", "haute", null, null));
			m.addSolutionApplicative(new SolutionApplicative("itop", "active", "haute", null, null));
			m.addSolutionApplicative(new SolutionApplicative("ERP", "active", "haute", null, null));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void ProcessusMetier() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.addProcessusMetier(new ProcessusMetier("processusMetier1"));
			m.addProcessusMetier(new ProcessusMetier("processusMetier2"));
			m.addProcessusMetier(new ProcessusMetier("processusMetier3"));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void ArriveeElectrique() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.addArriveeElectrique(new ArriveeElectrique("Arrivee1"));
			m.addArriveeElectrique(new ArriveeElectrique("Arrivee2"));
			m.addArriveeElectrique(new ArriveeElectrique("Arrivee3"));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void PduElectrique() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			m.addPduElectrique(new PduElectrique("PDU1"));
			m.addPduElectrique(new PduElectrique("PDU2"));
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	

}
