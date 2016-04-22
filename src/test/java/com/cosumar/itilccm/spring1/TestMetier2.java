package com.cosumar.itilccm.spring1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

}
