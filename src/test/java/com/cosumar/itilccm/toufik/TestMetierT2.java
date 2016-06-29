package com.cosumar.itilccm.toufik;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosumar.itilccm.entities.*;
import com.cosumar.itilccm.metier.AdminMetier;

public class TestMetierT2 {
	ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
	}
	
	@Test
	public void Rack() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Rack> imp1 = m.ListRack();
			m.addRack(new Rack("Rack 1"));
			m.addRack(new Rack("Rack 2"));
			m.addRack(new Rack("Rack 3"));
			m.addRack(new Rack("Rack 4"));
			List<Rack> imp2 = m.ListRack();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	
	@Test
	public void Chassis() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			List<Chassis> imp1 = m.ListChassis();
			m.addChassis(new Chassis("Chassis 1"));
			m.addChassis(new Chassis("Chassis 2"));
			m.addChassis(new Chassis("Chassis 3"));
			m.addChassis(new Chassis("Chassis 4"));
			List<Chassis> imp2 = m.ListChassis();
			assertTrue(imp1.size()+4 == imp2.size());
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	

}
