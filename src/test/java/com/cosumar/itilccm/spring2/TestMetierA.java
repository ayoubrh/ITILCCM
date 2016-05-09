package com.cosumar.itilccm.spring2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.*;
import com.cosumar.itilccm.metier.AdminMetier;


public class TestMetierA {
	
	ClassPathXmlApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
	}

	@Test
	public void Ordinateur() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Ordinateur> pc1 = m.ListPC();
			m.addPC(new Ordinateur("HP", "Poste"));
			m.addPC(new Ordinateur("Acer", "Portable"));
			m.addPCUser(new Ordinateur("DELL", "Poste"),1L);
			m.addPCUser(new Ordinateur("Mac", "Portable"),2L);
			m.addPCAll(new Ordinateur("HP 2", "Poste"), null, null, null, null, null, null, null, null, null, null);
			m.addPCAll(new Ordinateur("HP 3", "Poste"), null, null, null, null, null, null, null, null, null, null);
			List<Ordinateur> pc2 = m.ListPC();
			assertTrue(pc1.size()+6 == pc2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	
		
	}
	
	
	@Test
	public void Imprimante() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Imprimante> imp1 = m.ListImp();
			m.addImp(new Imprimante("Lasert"));
			m.addImp(new Imprimante("Lasert Color"));
			m.addImpUser(new Imprimante("Lasert color user"),1L);
			m.addImpUser(new Imprimante("Lasert color user2"), 2L);
			List<Imprimante> imp2 = m.ListImp();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void TeleMobile() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<TelephneMobile> imp1 = m.ListTeleMobile();
			m.addTeleMobile(new TelephneMobile("Nokia"));
			m.addTeleMobile(new TelephneMobile("Samsung"));
			m.addTeleMobileUser(new TelephneMobile("LG"),1L);
			m.addTeleMobileUser(new TelephneMobile("Iphone"), 2L);
			List<TelephneMobile> imp2 = m.ListTeleMobile();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void SIM() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Sim> imp1 = m.ListSIM();
			m.addSIM(new Sim("0613711113", "IAM"));
			m.addSIM(new Sim("0613711114", "INWI"));
			m.addSIMUser(new Sim("0615138450", "IAM"), 1L);
			m.addSIMUser(new Sim("0615138451", "IAM"), 2L);
			List<Sim> imp2 = m.ListSIM();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void Tablette() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Tablette> imp1 = m.ListTablette();
			m.addTablette(new Tablette("Tab1"));
			m.addTablette(new Tablette("Tab2"));
			m.addTabletteUser(new Tablette("Tab3"), 1L);
			m.addTabletteUser(new Tablette("Tab4"), 2L);
			List<Tablette> imp2 = m.ListTablette();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void TeleFixe() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<TelephoneFixe> imp1 = m.ListTeleFixe();
			m.addTeleFixe(new TelephoneFixe("Fixe 1"));
			m.addTeleFixe(new TelephoneFixe("Fixe 2"));
			m.addTeleFixeUser(new TelephoneFixe("Fixe 3"), 1L);
			m.addTeleFixeUser(new TelephoneFixe("Fixe 4"), 2L);
			List<TelephoneFixe> imp2 = m.ListTeleFixe();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void Peripherique() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Peripherique> imp1 = m.ListPeriph();
			m.addPeriph(new Peripherique("periph 1"));
			m.addPeriph(new Peripherique("periph 2"));
			m.addPeriphPC(new Peripherique("Periph 3"), 1L);
			m.addPeriphPC(new Peripherique("Periph 4"), 2L);
			List<Peripherique> imp2 = m.ListPeriph();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void IntefaceReseau() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<IntefaceReseau> imp1 = m.ListInterfaceReseau();
			m.addFibre(new Fibre("IntefaceReseau 1"));
			m.addLogique(new Logique("IntefaceReseau 2"));
			m.addPhysique(new Physique("IntefaceReseau 3"));
			List<IntefaceReseau> imp2 = m.ListInterfaceReseau();
			for (IntefaceReseau intefaceReseau : imp2) {
				System.out.println("***** "+intefaceReseau.getId()+"*********");
			}
			assertTrue(imp1.size()+3 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Fibre() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Fibre> imp1 = m.ListFibre();
			m.addFibre(new Fibre("Fibre 1"));
			m.addFibre(new Fibre("Fibre 2"));
			m.addFibre(new Fibre("Fibre 3"));
			m.addFibre(new Fibre("Fibre 4"));
			List<Fibre> imp2 = m.ListFibre();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void Logique() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Logique> imp1 = m.ListLogique();
			m.addLogique(new Logique("Logique 1"));
			m.addLogique(new Logique("Logique 2"));
			m.addLogique(new Logique("Logique 3"));
			m.addLogique(new Logique("Logique 4"));
			List<Logique> imp2 = m.ListLogique();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Physique() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Physique> imp1 = m.ListPhysique();
			m.addPhysique(new Physique("Physique 1"));
			m.addPhysique(new Physique("Physique 2"));
			m.addPhysique(new Physique("Physique 3"));
			m.addPhysique(new Physique("Physique 4"));
			List<Physique> imp2 = m.ListPhysique();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Vlan() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Vlan> imp1 = m.ListVlan();
			m.addVlan(new Vlan("Vlan 1"));
			m.addVlan(new Vlan("Vlan 2"));
			m.addVlan(new Vlan("Vlan 3"));
			m.addVlan(new Vlan("Vlan 4"));
			List<Vlan> imp2 = m.ListVlan();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Subnet() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Subnet> imp1 = m.ListSubnet();
			m.addSubnet(new Subnet("11.22.33.45", "2.3.6.0"));
			m.addSubnet(new Subnet("11.22.33.46", "2.3.6.3"));
			m.addSubnet(new Subnet("11.22.33.47", "2.3.6.5"));
			m.addSubnet(new Subnet("11.22.33.48", "2.3.6.6"));
			List<Subnet> imp2 = m.ListSubnet();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Camera() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Camera> imp1 = m.ListCamera();
			m.addCamera(new Camera("Camera 1"));
			m.addCamera(new Camera("Camera 2"));
			m.addCamera(new Camera("Camera 3"));
			m.addCamera(new Camera("Camera 4"));
			List<Camera> imp2 = m.ListCamera();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void ProcessusMetier() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<ProcessusMetier> imp1 = m.ListProcessusMetier();
			m.addProcessusMetier(new ProcessusMetier("ProcessusMetier 1"));
			m.addProcessusMetier(new ProcessusMetier("ProcessusMetier 2"));
			m.addProcessusMetier(new ProcessusMetier("ProcessusMetier 3"));
			m.addProcessusMetier(new ProcessusMetier("ProcessusMetier 4"));
			List<ProcessusMetier> imp2 = m.ListProcessusMetier();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void VolumeLogique() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<VolumeLogique> imp1 = m.ListVolumeLogique();
			m.addVolumeLogique(new VolumeLogique("VolumeLogique 1", "lundip 1"));
			m.addVolumeLogique(new VolumeLogique("VolumeLogique 2", "lundip 2"));
			m.addVolumeLogique(new VolumeLogique("VolumeLogique 3", "lundip 3"));
			m.addVolumeLogique(new VolumeLogique("VolumeLogique 4", "lundip 4"));
			List<VolumeLogique> imp2 = m.ListVolumeLogique();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void Dvr() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Dvr> imp1 = m.ListDvr();
			m.addDvr(new Dvr("Dvr 1", "12"));
			m.addDvr(new Dvr("Dvr 2", "16"));
			m.addDvr(new Dvr("Dvr 3", "11"));
			m.addDvr(new Dvr("Dvr 4", "13"));
			List<Dvr> imp2 = m.ListDvr();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Rack() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Rack> imp1 = m.ListRack();
			m.addRack(new Rack("Rack 1"));
			m.addRack(new Rack("Rack 2"));
			m.addRack(new Rack("Rack 3"));
			m.addRack(new Rack("Rack 4"));
			List<Rack> imp2 = m.ListRack();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Chassis() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Chassis> imp1 = m.ListChassis();
			m.addChassis(new Chassis("Chassis 1"));
			m.addChassis(new Chassis("Chassis 2"));
			m.addChassis(new Chassis("Chassis 3"));
			m.addChassis(new Chassis("Chassis 4"));
			List<Chassis> imp2 = m.ListChassis();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Infrastructure() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Infrastructure> imp1 = m.ListInfrastructure();
			m.addBandotheque(new Bandotheque("Infrastructure 1"));
			m.addServeur(new Serveur("Infrastructure 2"));
			m.addSystemeDeStockage(new SystemeDeStockage("Infrastructure 3"));
			m.addSwitchSan(new SwitchSan("Infrastructure 4"));
			m.addNas(new Nas("Infrastructur5"));
			
			List<Infrastructure> imp2 = m.ListInfrastructure();
			for (Infrastructure infrastructure : imp2) {
				System.out.println("*******"+infrastructure.getNom()+"*******"+infrastructure.getId());
			}
			assertTrue(imp1.size()+5== imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Bandotheque() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Bandotheque> imp1 = m.ListBandotheque();
			m.addBandotheque(new Bandotheque("Bandotheque 1"));
			m.addBandotheque(new Bandotheque("Bandotheque 2"));
			m.addBandotheque(new Bandotheque("Bandotheque 3"));
			m.addBandotheque(new Bandotheque("Bandotheque 4"));
			List<Bandotheque> imp2 = m.ListBandotheque();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Bande() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Bande> imp1 = m.ListBande();
			m.addBande(new Bande("Bande 1"));
			m.addBande(new Bande("Bande 2"));
			m.addBande(new Bande("Bande 3"));
			m.addBande(new Bande("Bande 4"));
			List<Bande> imp2 = m.ListBande();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Serveur() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Serveur> imp1 = m.ListServeur();
			m.addServeur(new Serveur("Serveur 1"));
			m.addServeur(new Serveur("Serveur 2"));
			m.addServeur(new Serveur("Serveur 3"));
			m.addServeur(new Serveur("Serveur 4"));
			List<Serveur> imp2 = m.ListServeur();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void SystemeDeStockage() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<SystemeDeStockage> imp1 = m.ListSystemeDeStockage();
			m.addSystemeDeStockage(new SystemeDeStockage("SystemeDeStockage 1"));
			m.addSystemeDeStockage(new SystemeDeStockage("SystemeDeStockage 2"));
			m.addSystemeDeStockage(new SystemeDeStockage("SystemeDeStockage 3"));
			m.addSystemeDeStockage(new SystemeDeStockage("SystemeDeStockage 4"));
			List<SystemeDeStockage> imp2 = m.ListSystemeDeStockage();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void SwitchSan() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<SwitchSan> imp1 = m.ListSwitchSan();
			m.addSwitchSan(new SwitchSan("SwitchSan 1"));
			m.addSwitchSan(new SwitchSan("SwitchSan 2"));
			m.addSwitchSan(new SwitchSan("SwitchSan 3"));
			m.addSwitchSan(new SwitchSan("SwitchSan 4"));
			List<SwitchSan> imp2 = m.ListSwitchSan();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Nas() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Nas> imp1 = m.ListNas();
			m.addNas(new Nas("Nas 1"));
			m.addNas(new Nas("Nas 2"));
			m.addNas(new Nas("Nas 3"));
			m.addNas(new Nas("Nas 4"));
			List<Nas> imp2 = m.ListNas();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void SystemeDeFicherNas() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<SystemeDeFicherNas> imp1 = m.ListSystemeDeFicherNas();
			m.addSystemeDeFicherNas(new SystemeDeFicherNas("SystemeDeFicherNas 1", "1256"));
			m.addSystemeDeFicherNas(new SystemeDeFicherNas("SystemeDeFicherNas 2", "1256"));
			m.addSystemeDeFicherNas(new SystemeDeFicherNas("SystemeDeFicherNas 3", "1256"));
			m.addSystemeDeFicherNas(new SystemeDeFicherNas("SystemeDeFicherNas 4", "1256"));
			List<SystemeDeFicherNas> imp2 = m.ListSystemeDeFicherNas();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void EquipementReseau() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<EquipementReseau> imp1 = m.ListEquipementReseau();
			m.addEquipementReseau(new EquipementReseau("EquipementReseau 1", "Type 1"));
			m.addEquipementReseau(new EquipementReseau("EquipementReseau 2", "Type 2"));
			m.addEquipementReseau(new EquipementReseau("EquipementReseau 3", "Type 3"));
			m.addEquipementReseau(new EquipementReseau("EquipementReseau 4", "Type 4"));
			List<EquipementReseau> imp2 = m.ListEquipementReseau();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	

}
