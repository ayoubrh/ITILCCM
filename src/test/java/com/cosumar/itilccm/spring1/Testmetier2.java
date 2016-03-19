package com.cosumar.itilccm.spring1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.User;
import com.cosumar.itilccm.metier.AdminMetier;

public class Testmetier2 {
	
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
			List<User> u = m.listUser();
			m.supprimerUser(1L);
			m.supprimerUser(2L);
			m.supprimerUser(3L);
			List<User> u2 = m.listUser();
			assertTrue(u.size()-3 == u2.size());
		}catch(Exception e){
			assertTrue(e.getMessage(), false);
		}
	}

}
