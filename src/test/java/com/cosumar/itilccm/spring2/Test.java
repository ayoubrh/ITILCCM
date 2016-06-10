package com.cosumar.itilccm.spring2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.*;
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
			m.ajouterDocumentFichier(new DocumentFichier("fichier1", null, null, null));
			m.ajouterDocumentWeb(new DocumentWeb("web", null, null, null));
			m.ajouterDocumentNote(new DocumentNote("note", null, null, null, "aaaaaaaaaaaaa"));
			//m.ajouterAutreLogicielAll(new AutreLogiciel("test", null, null, null, null, null), null, 1l, 1l, null, null, null, null);
			
			assertTrue(true);
		
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}

}
