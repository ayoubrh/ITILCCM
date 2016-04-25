package com.cosumar.itilccm.spring2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.Ordinateur;
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

}
