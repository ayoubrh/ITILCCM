package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Document implements Serializable {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   @NotEmpty
	   private String nom;
	   
	   private String statut;
	   private String version;
	   private String description;
	   
	  
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="documents")
	   private Collection<Contrat> contrats;
	   
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Ordinateur> ordinateur;
	   	
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Imprimante> imprimante;
	   	
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<TelephneMobile> telephonemobile;
	   	
	   	
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Peripherique> peripherique;
	   	
	   	
	   	@ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<TelephoneFixe> telephonefixe;
	    
	    @ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Tablette> tablette;
	    
	    @ManyToMany(mappedBy="document")
	   	@Column(nullable = true)
	   private Collection<Sim> sim;

		public Document() {
			super();
			// TODO Auto-generated constructor stub
		}
   
		public Document(String nom, String statut, String version, String description) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.version = version;
			this.description = description;
			
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

		public String getStatut() {
			return statut;
		}

		public void setStatut(String statut) {
			this.statut = statut;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Collection<Contrat> getContrats() {
			return contrats;
		}

		public void setContrats(Collection<Contrat> contrats) {
			this.contrats = contrats;
		}

		public Collection<Ordinateur> getOrdinateur() {
			return ordinateur;
		}

		public void setOrdinateur(Collection<Ordinateur> ordinateur) {
			this.ordinateur = ordinateur;
		}

		public Collection<Imprimante> getImprimante() {
			return imprimante;
		}

		public void setImprimante(Collection<Imprimante> imprimante) {
			this.imprimante = imprimante;
		}

		public Collection<Peripherique> getPeripherique() {
			return peripherique;
		}

		public void setPeripherique(Collection<Peripherique> peripherique) {
			this.peripherique = peripherique;
		}

		public Collection<TelephneMobile> getTelephonemobile() {
			return telephonemobile;
		}

		public void setTelephonemobile(Collection<TelephneMobile> telephonemobile) {
			this.telephonemobile = telephonemobile;
		}

		public Collection<TelephoneFixe> getTelephonefixe() {
			return telephonefixe;
		}

		public void setTelephonefixe(Collection<TelephoneFixe> telephonefixe) {
			this.telephonefixe = telephonefixe;
		}

		public Collection<Tablette> getTablette() {
			return tablette;
		}

		public void setTablette(Collection<Tablette> tablette) {
			this.tablette = tablette;
		}

		public Collection<Sim> getSim() {
			return sim;
		}

		public void setSim(Collection<Sim> sim) {
			this.sim = sim;
		}

		
		   
		   
   
   

}