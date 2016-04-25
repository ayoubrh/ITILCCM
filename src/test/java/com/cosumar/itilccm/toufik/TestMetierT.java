package com.cosumar.itilccm.toufik;

import static org.junit.Assert.*;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.Lieu;
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
			/*Long l = m.ajouterLieu(new Lieu("nom1", "Actif", "Cosumar", "aaaaa", "55555", "casa", "Maroc"));
			Long l2 = m.ajouterLieu(new Lieu("nom2", "Actif", "Cosumar", "aaaaa", "55555", "casa", "Maroc"));
			Long l3 = m.ajouterLieu(new Lieu("nom3", "Actif", "Cosumar", "aaaaa", "55555", "casa", "Maroc"));
			
			m.supprimerLieu(5L);
			m.supprimerLieu(6L);*/
			//m.modifierLieu(new Lieu("nom3", "Actif", "Cosumar", "8, rue Mouatamid Ibn Abbad , Oukacha	CASABLANCA", "55555", "casa", "Maroc"));
			Lieu l = m.getLieu(1L);
			System.out.println(l.getNom());
			assertTrue(true);
		}catch(Exception e){
			assertTrue(e.getMessage(), false);
		}
	}

}
