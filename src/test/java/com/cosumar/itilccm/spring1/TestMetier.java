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
			AdminMetier m = (AdminMetier) context.getBean("metier");
			Long d1 = m.ajouterDepartement(new Departement("Service Qualité"));
			Long d2 = m.ajouterDepartement(new Departement("Service Helpdesk"));
			Long d3 = m.ajouterDepartement(new Departement("Service Réseau"));
			Long d4 = m.ajouterDepartement(new Departement("Service Exploitation"));
			Long d5 = m.ajouterDepartement(new Departement("Service Développement"));
			System.out.println(d1);
			
			Long r2 = m.ajouterRole(new Role("ROLE_USER", "Employe"));
			Long r3 = m.ajouterRole(new Role("ROLE_IT_TEAM", "Equipe IT"));
			Long r1 = m.ajouterRole(new Role("ROLE_ADMIN", "Administrateur"));
			List<User> u1 = m.listUser();
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			//m.ajouterUser(new User("EEEEEEEE", s.hashmd5password("0000000000"), "RHNABRI", "Ayoub", "ayoub0@gmail.com","Technicien"), d1);
			m.ajouterUserRole(new User("admin", m.hashmd5password("adminpass"), "Admin", "Admin", "soumaya@gmail.com","Chef de Département","M"), d2, r1);
			m.ajouterUserRole(new User("employee", m.hashmd5password("employeepass"), "Employee", "Employee", "soumaya2@gmail.com","Ingénieur","M"), d2, r2);
			Long id = m.ajouterUserRole(new User("equipeit", m.hashmd5password("equipeitpass"), "Equipe IT", "Equipe IT", "soumaya3@gmail.com","Technicien","M"), d2, r3);


			User um = m.getUser(id);
			um.setAge("30");
			m.modifierUser(um);
			List<User> u2 = m.listUser();
			assertTrue(u1.size()+3 == u2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}

}
