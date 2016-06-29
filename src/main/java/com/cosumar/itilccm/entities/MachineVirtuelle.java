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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class MachineVirtuelle implements Serializable {
	
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
       
       @NotEmpty
	   private String nom;
       
	   private String statut;
	   private String criticite;
	   private String ip;
	   private String cpu;
	   private String ram;
	   private Date dateDeMiseEnProduction;
	   private String description;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<VolumeLogique> volumelogique;
	   
	   @Column(nullable=true)
	   @OneToMany(mappedBy="machineVirtuelle",cascade = CascadeType.ALL) 
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<IntefaceReseau> intefaceReseau;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<SolutionApplicative> solutionApplicative;
	   
	   @ManyToOne
	   @JoinColumn(name="id_virtualisation")
	   private Virtualisation virtualisation;
	   
	   @ManyToOne
	   @JoinColumn(name="id_licenseOs")
	   private LicenseOs licenseOs;
	   
	   @Column(nullable=true)
	   @OneToMany(mappedBy="machineVirtuelle",cascade = CascadeType.REMOVE, orphanRemoval = true)
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<LogicielEtApplication> logicielEtApplication;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Contact> contacts;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Contrat> contrats;
	   
	   @Column(nullable=true)
	   @ManyToMany
	   @LazyCollection(LazyCollectionOption.FALSE)
	   private Collection<Document> documents;
	   
	   @Column(nullable=true)
	   @ManyToMany(mappedBy="machineVirtuelle",cascade = CascadeType.ALL)
	   private Collection<Groupe> groupe;
	   
	    @Column(nullable=true)
	    @JsonIgnore
	    @OneToMany(mappedBy="machineVirtuelle",cascade = CascadeType.ALL)
	    @LazyCollection(LazyCollectionOption.FALSE)
	    private Collection<TicketIncident> ticketsIncident;
		   
		public MachineVirtuelle() {
			super();
			// TODO Auto-generated constructor stub
		}
		public MachineVirtuelle(String nom, String statut, String criticite, String ip, String cpu, String ram,
				Date dateDeMiseEnProduction, String description) {
			super();
			this.nom = nom;
			this.statut = statut;
			this.criticite = criticite;
			this.ip = ip;
			this.cpu = cpu;
			this.ram = ram;
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
		public String getIp() {
			return ip;
		}
		public void setIp(String ip) {
			this.ip = ip;
		}
		public String getCpu() {
			return cpu;
		}
		public void setCpu(String cpu) {
			this.cpu = cpu;
		}
		public String getRam() {
			return ram;
		}
		public void setRam(String ram) {
			this.ram = ram;
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
		public Collection<VolumeLogique> getVolumelogique() {
			return volumelogique;
		}
		public void setVolumelogique(Collection<VolumeLogique> volumelogique) {
			this.volumelogique = volumelogique;
		}
		public Collection<IntefaceReseau> getIntefaceReseau() {
			return intefaceReseau;
		}
		public void setIntefaceReseau(Collection<IntefaceReseau> intefaceReseau) {
			this.intefaceReseau = intefaceReseau;
		}
		public Collection<SolutionApplicative> getSolutionApplicative() {
			return solutionApplicative;
		}
		public void setSolutionApplicative(Collection<SolutionApplicative> solutionApplicative) {
			this.solutionApplicative = solutionApplicative;
		}
		public Virtualisation getVirtualisation() {
			return virtualisation;
		}
		public void setVirtualisation(Virtualisation virtualisation) {
			this.virtualisation = virtualisation;
		}
		public LicenseOs getLicenseOs() {
			return licenseOs;
		}
		public void setLicenseOs(LicenseOs licenseOs) {
			this.licenseOs = licenseOs;
		}
		public Collection<LogicielEtApplication> getLogicielEtApplication() {
			return logicielEtApplication;
		}
		public void setLogicielEtApplication(Collection<LogicielEtApplication> logicielEtApplication) {
			this.logicielEtApplication = logicielEtApplication;
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
		public Collection<Groupe> getGroupe() {
			return groupe;
		}
		public void setGroupe(Collection<Groupe> groupe) {
			this.groupe = groupe;
		}
		public Collection<TicketIncident> getTicketsIncident() {
			return ticketsIncident;
		}
		public void setTicketsIncident(Collection<TicketIncident> ticketsIncident) {
			this.ticketsIncident = ticketsIncident;
		}
	     
}