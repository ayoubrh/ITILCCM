package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Contact implements Serializable {
	
			   @Id
			   @GeneratedValue(strategy=GenerationType.IDENTITY)
			   private Long id;
			   
			   @NotEmpty
			   @Size(min=4,max=25)
			   private String nom;
			   
			   @NotEmpty
			   @Size(min=4,max=25)
			   private String prenom;
			   
			   @NotEmpty
			   @Size(min=4,max=30)
			   private String organisme;
	
			   @NotEmpty
			   private String statut;
			   
			   private String fonction;
			   private String numeroD_employe;
			   private String email;
			   private String telephoneFixe;
			   private String telephoneMobile;
			   
			   @ManyToOne
			   @JoinColumn(name="id_lieu")
			   private Lieu lieu;
			   
			   @Column(nullable=true)
			   @ManyToMany
			   @JoinTable(name="Contact_Contrat",joinColumns=
			   @JoinColumn(name="id_Contact"),
			   inverseJoinColumns=@JoinColumn(name="id_Contrat"))
			   private Collection<Contrat> contrats;
   
			public Contact() {
				super();
				// TODO Auto-generated constructor stub
			}
			
			public Contact(String nom, String prenom, String organisme, String statut, String fonction, String numeroD_employe,
					String email, String telephoneFixe, String telephoneMobile) {
				super();
				this.nom = nom;
				this.prenom = prenom;
				this.organisme = organisme;
				this.statut = statut;
				this.fonction = fonction;
				this.numeroD_employe = numeroD_employe;
				this.email = email;
				this.telephoneFixe = telephoneFixe;
				this.telephoneMobile = telephoneMobile;
			}
			
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
			public String getPrenom() {
				return prenom;
			}
			public void setPrenom(String prenom) {
				this.prenom = prenom;
			}
			public String getOrganisme() {
				return organisme;
			}
			public void setOrganisme(String organisme) {
				this.organisme = organisme;
			}
			public String getStatut() {
				return statut;
			}
			public void setStatut(String statut) {
				this.statut = statut;
			}
			public String getFonction() {
				return fonction;
			}
			public void setFonction(String fonction) {
				this.fonction = fonction;
			}
			public String getNumeroD_employe() {
				return numeroD_employe;
			}
			public void setNumeroD_employe(String numeroD_employe) {
				this.numeroD_employe = numeroD_employe;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getTelephoneFixe() {
				return telephoneFixe;
			}
			public void setTelephoneFixe(String telephoneFixe) {
				this.telephoneFixe = telephoneFixe;
			}
			public String getTelephoneMobile() {
				return telephoneMobile;
			}
			public void setTelephoneMobile(String telephoneMobile) {
				this.telephoneMobile = telephoneMobile;
			}
			public Lieu getLieu() {
				return lieu;
			}
			public void setLieu(Lieu lieu) {
				this.lieu = lieu;
			}
			public Collection<Contrat> getContrat() {
				return contrats;
			}
			public void setContrat(Collection<Contrat> contrat) {
				this.contrats = contrat;
			}
			   

}