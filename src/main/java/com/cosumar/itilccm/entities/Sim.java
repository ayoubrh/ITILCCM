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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
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
	@Size(max=20)
   private String operateur;
	
	private Date dateDeMiseEnProduction;
	private Date dateD_achat;
	private Date dateDeFinDeGarantie;
	private String description;
   
   @OneToOne(cascade = CascadeType.ALL)
   private User user;
   
	
	@ManyToMany
	@LazyCollection(LazyCollectionOption.FALSE)
    @Column(nullable = true)
  private Collection<Document> document;
	
	@ManyToMany
	@LazyCollection(LazyCollectionOption.FALSE)
    @Column(nullable = true)
  private Collection<Contrat> contrat;
	
	@ManyToMany
	@LazyCollection(LazyCollectionOption.FALSE)
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

	public Date getDateDeMiseEnProduction() {
		return dateDeMiseEnProduction;
	}

	public void setDateDeMiseEnProduction(Date dateDeMiseEnProduction) {
		this.dateDeMiseEnProduction = dateDeMiseEnProduction;
	}

	public Date getDateD_achat() {
		return dateD_achat;
	}

	public void setDateD_achat(Date dateD_achat) {
		this.dateD_achat = dateD_achat;
	}

	public Date getDateDeFinDeGarantie() {
		return dateDeFinDeGarantie;
	}

	public void setDateDeFinDeGarantie(Date dateDeFinDeGarantie) {
		this.dateDeFinDeGarantie = dateDeFinDeGarantie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
  

}