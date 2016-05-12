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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_Virtualisation")
public class Virtualisation implements Serializable {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
	   @NotEmpty
	   private String nom;
	   
	   private String statut;
	   private String criticite;
	   private Date dateDeMiseEnProduction;
	   private String description;
	   
	   @Column(nullable=true)
	   @OneToMany(mappedBy="virtualisation")
	   private Collection<MachineVirtuelle> machineVirtuelle;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   private java.util.Collection<VolumeLogique> volumelogique;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   private Collection<SolutionApplicative> solutionApplicative;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   private Collection<Contact> contacts;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   private Collection<Contrat> contrats;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   private Collection<Document> documents;
		   
		public Virtualisation() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Virtualisation(String nom, String statut, String criticite, Date dateDeMiseEnProduction,
				String description) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.criticite = criticite;
			this.dateDeMiseEnProduction = dateDeMiseEnProduction;
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
		public String getCriticite() {
			return criticite;
		}
		public void setCriticite(String criticite) {
			this.criticite = criticite;
		}
		public Date getDateDeMiseEnProduction() {
			return dateDeMiseEnProduction;
		}
		public void setDateDeMiseEnProduction(Date dateDeMiseEnProduction) {
			this.dateDeMiseEnProduction = dateDeMiseEnProduction;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Collection<MachineVirtuelle> getMachineVirtuelle() {
			return machineVirtuelle;
		}
		public void setMachineVirtuelle(Collection<MachineVirtuelle> machineVirtuelle) {
			this.machineVirtuelle = machineVirtuelle;
		}
		public java.util.Collection<VolumeLogique> getVolumelogique() {
			return volumelogique;
		}
		public void setVolumelogique(java.util.Collection<VolumeLogique> volumelogique) {
			this.volumelogique = volumelogique;
		}
		public Collection<SolutionApplicative> getSolutionApplicative() {
			return solutionApplicative;
		}
		public void setSolutionApplicative(Collection<SolutionApplicative> solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}
		public Collection<Contact> getContacts() {
			return contacts;
		}
		public void setContacts(Collection<Contact> contacts) {
			this.contacts = contacts;
		}
		public Collection<Contrat> getContrats() {
			return contrats;
		}
		public void setContrats(Collection<Contrat> contrats) {
			this.contrats = contrats;
		}
		public Collection<Document> getDocuments() {
			return documents;
		}
		public void setDocuments(Collection<Document> documents) {
			this.documents = documents;
		}
		

}