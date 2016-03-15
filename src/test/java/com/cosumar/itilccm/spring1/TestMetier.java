package com.cosumar.itilccm.spring1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.controllers.Sprint1;
import com.cosumar.itilccm.entities.*;
import com.cosumar.itilccm.metier.AdminMetier;

public class TestMetier {

	ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		AdminMetier m = (AdminMetier) context.getBean("metier");
	}

	@Test
	public void test() {
		try{
			Sprint1 s = new Sprint1();
			AdminMetier m = (AdminMetier) context.getBean("metier");
			Long d1 = m.ajouterDepartement(new Departement("Informatique"));
			System.out.println(d1);
			
			Long r2 = m.ajouterRole(new Role("ROLE_USER", "Utilisateur"));
			Long r3 = m.ajouterRole(new Role("ROLE_IT_TEAM", "Equipe IT"));
			Long r1 = m.ajouterRole(new Role("ROLE_ADMIN", "Administrateur"));
			List<User> u1 = m.listUser();
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			//m.ajouterUser(new User("EEEEEEEE", s.hashmd5password("0000000000"), "RHNABRI", "Ayoub", "ayoub0@gmail.com","Technicien"), d1);
			System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			m.ajouterUserRole(new User("AAAAAAA", s.hashmd5password("123456789"), "RHNABRI", "Ayoub", "ayoub@gmail.com","Chef de Département"), d1, r1);
			System.out.println("ccccccccccccccccccccccccccccccccccc");
			m.ajouterUserRole(new User("BBBBBBB", s.hashmd5password("014725836"), "RHNABRI", "Ayoub", "ayoub2@gmail.com","Ingénieur"), d1, r2);
			m.ajouterUserRole(new User("CCCCCCC", s.hashmd5password("124759630"), "RHNABRI", "Ayoub", "ayoub3@gmail.com","Technicien"), d1, r3);
			List<User> u2 = m.listUser();
			assertTrue(u1.size()+3 == u2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}

}
