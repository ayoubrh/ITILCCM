package com.cosumar.itilccm.entities;

import java.util.*;

public class Sim {
      private int id;
      private String numero;
      private int pin;
      private int puk;
      private String operateur;
      private String limitation;
   
   /** @pdRoleInfo migr=no name=User assc=association35 mult=0..1 */
      private User user;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public int getPuk() {
		return puk;
	}
	
	public void setPuk(int puk) {
		this.puk = puk;
	}
	
	public String getOperateur() {
		return operateur;
	}
	
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	
	public String getLimitation() {
		return limitation;
	}
	
	public void setLimitation(String limitation) {
		this.limitation = limitation;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
   
   

}