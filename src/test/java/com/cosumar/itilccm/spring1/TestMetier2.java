package com.cosumar.itilccm.spring1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.Bandotheque;
import com.cosumar.itilccm.entities.Fibre;
import com.cosumar.itilccm.entities.Infrastructure;
import com.cosumar.itilccm.entities.IntefaceReseau;
import com.cosumar.itilccm.entities.Logique;
import com.cosumar.itilccm.entities.Nas;
import com.cosumar.itilccm.entities.Physique;
import com.cosumar.itilccm.entities.Serveur;
import com.cosumar.itilccm.entities.SwitchSan;
import com.cosumar.itilccm.entities.SystemeDeStockage;
import com.cosumar.itilccm.entities.User;
import com.cosumar.itilccm.metier.AdminMetier;

public class TestMetier2 {

	ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		AdminMetier m = (AdminMetier) context.getBean("metier");
	}

	@Test
	public void test() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			User u1 = m.getUser(1L);
			User u2 = m.getUser(2L);
			User u3 = m.getUser(3L);
			u1.setAdresse("aazrrvguyg tygyhg ygiyubn");
			u1.setAge("20");
			u1.setTele("0915234422");
			u1.setActived(true);
			u2.setAge("19");
			u2.setFixe("0511223366");
			u2.setActived(true);
			u3.setAdresse("dfvdv dvdv tbdtb bdtbdtbtd");
			u3.setActived(true);
			m.modifierUser(u1);
			m.modifierUser(u2);
			m.modifierUser(u3);
			assertTrue(true);
		}catch(Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	/*
	@Test
	public void IntefaceReseau() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<IntefaceReseau> imp1 = m.ListInterfaceReseau();
			m.addFibre(new Fibre("IntefaceReseau 4"));
			m.addLogique(new Logique("IntefaceReseau 5"));
			m.addPhysique(new Physique("IntefaceReseau 6"));
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
	public void Infrastructure() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Infrastructure> imp1 = m.ListInfrastructure();
			m.addBandotheque(new Bandotheque("Infrastructure 6"));
			m.addServeur(new Serveur("Infrastructure 7"));
			m.addSystemeDeStockage(new SystemeDeStockage("Infrastructure 8"));
			m.addSwitchSan(new SwitchSan("Infrastructure 9"));
			m.addNas(new Nas("Infrastructur 10"));
			
			List<Infrastructure> imp2 = m.ListInfrastructure();
			for (Infrastructure infrastructure : imp2) {
				System.out.println("*******"+infrastructure.getNom()+"*******"+infrastructure.getId());
			}
			assertTrue(imp1.size()+5== imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
*/
}
