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
	public void Ticket() {
		try{
			AdminMetier m = (AdminMetier) context.getBean("metier");
			assertTrue(true);
		}catch (Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	
	

}
