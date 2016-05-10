package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Sim implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
   	@Size(max=16)
   	@Pattern(regexp="(^$|[0-9]{10})",message="Doit contenir que des nombres, et sous la forme 05(6) xx xx xx xx")
	@Column(unique=true)
   private String numero;
	
	@Column(nullable=true)
    @Size(max=5)
    @Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
   private String pin;
	
	@Column(nullable=true)
    @Size(max=6)
    @Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
   private String puk;
	
	@NotEmpty
	@Size(min=2,max=20)
   private String operateur;
   
   @OneToOne(cascade = CascadeType.ALL)
   private User user;
   
   
   @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="lieu_id")
  private Lieu lieu;
	
	@ManyToMany(cascade = CascadeType.ALL)
   @Column(nullable = true)
  private Collection<Document> document;
	
	@ManyToMany(cascade = CascadeType.ALL)
   @Column(nullable = true)
  private Collection<Contrat> contrat;
	
	@ManyToMany(cascade = CascadeType.ALL)
   @Column(nullable = true)
  private Collection<Contact> contact;

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
	
	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getPuk() {
		return puk;
	}

	public void setPuk(String puk) {
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

	public Sim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sim(String numero, String operateur) {
		super();
		this.numero = numero;
		this.operateur = operateur;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public Collection<Document> getDocument() {
		return document;
	}

	public void setDocument(Collection<Document> document) {
		this.document = document;
	}

	public Collection<Contrat> getContrat() {
		return contrat;
	}

	public void setContrat(Collection<Contrat> contrat) {
		this.contrat = contrat;
	}

	public Collection<Contact> getContact() {
		return contact;
	}

	public void setContact(Collection<Contact> contact) {
		this.contact = contact;
	}
	
	
	   
   
   
   
   

}