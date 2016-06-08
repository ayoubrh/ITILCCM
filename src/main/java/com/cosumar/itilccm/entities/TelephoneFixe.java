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
public class TelephoneFixe implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
   
   	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String statut;
   private String criticite;
   
    @NotEmpty
  	@Size(max=16)
  	@Pattern(regexp="(^$|[0-9]{10})",message="Doit contenir que des nombres, et sous la forme 05(6) xx xx xx xx")
   private String numero;
   private String marque;
   private String modele;
   private String numeroDeSerie;
   private String numeroAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_achat;
   private Date dateDeFinDeGarantie;
   private String description;
   
    @ManyToOne
 	@JoinColumn(name="lieu_id")
   private Lieu lieu;
 	
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

   	@OneToOne(cascade = CascadeType.ALL)
   private User user;
   	
   	@Column(nullable=true)
	@ManyToMany(mappedBy="telephoneFixe",cascade = CascadeType.ALL)
	private Collection<Groupe> groupe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getCriticite() {
		return criticite;
	}

	public void setCriticite(String criticite) {
		this.criticite = criticite;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public String getNumeroAsset() {
		return numeroAsset;
	}

	public void setNumeroAsset(String numeroAsset) {
		this.numeroAsset = numeroAsset;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TelephoneFixe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TelephoneFixe(String nom) {
		super();
		this.nom = nom;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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

	public TelephoneFixe(String nom, String numero) {
		super();
		this.nom = nom;
		this.numero = numero;
	}

	public Collection<Groupe> getGroupe() {
		return groupe;
	}

	public void setGroupe(Collection<Groupe> groupe) {
		this.groupe = groupe;
	}
	
	
   	
   	

}