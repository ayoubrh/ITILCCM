package com.cosumar.itilccm.spring1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
			AdminMetier m = (AdminMetier) context.getBean("metier");
			Long d1 = m.ajouterDepartement(new Departement("Informatique"));
			System.out.println(d1);
			Long r1 = m.ajouterRole(new Role("ROLE_ADMIN", "Administrateur"));
			System.out.println(r1);
			Long r2 = m.ajouterRole(new Role("ROLE_USER", "Utilisateur"));
			System.out.println(r2);
			Long r3 = m.ajouterRole(new Role("ROLE_IT_TEAM", "Equipe IT"));
			List<User> u1 = m.listUser();
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			m.ajouterUser(new User("EEEEEEEE", "0000000000", "RHNABRI", "Ayoub", "ayoub0@gmail.com","Technicien"), d1);
			System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			m.ajouterUserRole(new User("AAAAAAA", "123456789", "RHNABRI", "Ayoub", "ayoub@gmail.com","Chef de D�partement"), d1, r1);
			System.out.println("ccccccccccccccccccccccccccccccccccc");
			m.ajouterUserRole(new User("BBBBBBB", "014725836", "RHNABRI", "Ayoub", "ayoub2@gmail.com","Ing�nieur"), d1, r2);
			m.ajouterUserRole(new User("CCCCCCC", "124759630", "RHNABRI", "Ayoub", "ayoub3@gmail.com","Technicien"), d1, r3);
			List<User> u2 = m.listUser();
			assertTrue(u1.size()+4 == u2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}

}
