package com.cosumar.itilccm.sprint2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.LogicielEtApplication;
import com.cosumar.itilccm.entities.Ordinateur;
import com.cosumar.itilccm.metier.AdminMetier;

public class TestMetierA2 {

	ClassPathXmlApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
	}

	@Test
	public void test() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Ordinateur> pc1 = m.ListPC();
			List<Long> log = Arrays.asList(1L,2L,3L);
			List<Long> er = Arrays.asList(1L,2L,3L);
			List<Long> ir = Arrays.asList(1L,2L,3L);
			List<Long> per = Arrays.asList(1L,2L,3L);
			LogicielEtApplication logapp = m.getLogicielEtApplication(1L);
			System.out.println("*Test test : "+logapp.getNom());
			System.out.println("AAAAAAAAAAAAAAAAAAAAAA");
			m.addPCAll(new Ordinateur("HP 10", "Poste"), null,  null, null,log, er, ir, per, null, null, null);
			System.out.println("BBBBBBBBBBBBBBBBBBBBBB");
			m.addPCAll(new Ordinateur("HP 11", "Poste"), null, null, null, log, er, ir, per, null, null, null);
			System.out.println("CCCCCCCCCCCCCCCCCCCCCC");
			List<Ordinateur> pc2 = m.ListPC();
			assertTrue(pc1.size()+2 == pc2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void Ordinateur() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Ordinateur> pc1 = m.ListPC();

			m.addPCAll(new Ordinateur("HP 20", "Poste"), null, null, null, null, null, null, null, null, null, null);
			m.addPCAll(new Ordinateur("HP 30", "Poste"), null, null, null, null, null, null, null, null, null, null);
			List<Ordinateur> pc2 = m.ListPC();
			assertTrue(pc1.size()+2 == pc2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	
		
	}
	

}
