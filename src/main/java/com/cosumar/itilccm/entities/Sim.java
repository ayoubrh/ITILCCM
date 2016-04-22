package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Sim implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@Column(nullable=true)
   	@Size(max=16)
   	@Pattern(regexp="(^$|[0-9]{10})")
   private String numero;
	
	@Column(nullable=true)
    @Size(max=5)
    @Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
   private Long pin;
	
	@Column(nullable=true)
    @Size(max=6)
    @Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
   private Long puk;
   private String operateur;
   
   @OneToOne
   private User user;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Long getPin() {
		return pin;
	}
	
	public void setPin(Long pin) {
		this.pin = pin;
	}
	
	public Long getPuk() {
		return puk;
	}
	
	public void setPuk(Long puk) {
		this.puk = puk;
	}
	
	public String getOperateur() {
		return operateur;
	}
	
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	   
   
   
   
   

}