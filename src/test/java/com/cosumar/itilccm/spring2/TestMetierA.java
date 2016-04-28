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
			List<Ordinateur> pc2 = m.ListPC();
			assertTrue(pc1.size()+4 == pc2.size());
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

}
