package com.cosumar.itilccm.toufik;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.LogicielEtApplication;
import com.cosumar.itilccm.metier.AdminMetier;

public class Test {
	ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
	}

	/*@org.junit.Test
	public void LogicielEtApplication() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<LogicielEtApplication>  list = m.listLogicielEtApplication();
			for(LogicielEtApplication l : list ){
				System.out.println(l.getNom()+"----"+l.getId()+"-----");
			}
			
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}*/
	@org.junit.Test
	public void DocumentFichier() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			//m.ajouterDocumentFichier(new com.cosumar.itilccm.entities.DocumentFichier("fichier1", null, null, null));			
			
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}

}
