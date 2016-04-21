package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="user")
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
   private int id;
	
	@NotEmpty
	@Size(min=6,max=20)
	@Column(unique = true)
   private String matricule;
	
   private String password;
	
	@Size(min=4,max=10)
	@Column(unique = true)
   private String cin;
   
    @NotEmpty
	@Size(min=4,max=30)
   private String nom;
    
    @NotEmpty
	@Size(min=4,max=30)
   private String prenom;
    
   private String adresse;
    
    @Column(nullable=true)
    @Size(max=10)
   private String codepostale;
    
    @Column(nullable=true)
   private String ville;
    
    @Column(nullable=true)
   private String pays;
    
    @NotEmpty
   	@Email
   	@Column(unique = true)
   private String email;
   	
    @Column(nullable=true)
   	@Size(max=16)
   	@Pattern(regexp="(^$|[0-9]{10})")
   private String tele;
   
    @Column(nullable=true)
   	@Size(max=16)
   	@Pattern(regexp="(^$|[0-9]{10})")
   private String fixe;
   
    @NotEmpty
	@Size(min=4,max=40)
   private String fonction;
    
    @NotEmpty
   private String sexe;
    
    @Column(nullable=true)
    @Size(max=2)
    @Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
   private String age;
    
   private boolean actived = false;
   
   private String photo;
   
   	@Lob
   private byte[] bphoto;
   	
   	
   	 @ManyToOne
	 @JoinColumn(name="role_id")
   	private Role role;
   	
   	 @ManyToOne
	 @JoinColumn(name="departement_id")
   	private Departement departement;
   	
   	 @OneToMany(mappedBy="user")
   	 @Column(nullable = true)
	private Collection<Ordinateur> ordinateur;
   	
   	 @OneToOne(mappedBy="user")
   	 @Column(nullable = true)
	private TelephneMobile telephneMobile;
   	
   	 @OneToOne(mappedBy="user")
   	 @Column(nullable = true)
	private Sim sim;
   	
   	 @OneToOne(mappedBy="user")
   	 @Column(nullable = true)
	private Tablette tablette;
   	
   	 @OneToOne(mappedBy="user")
   	 @Column(nullable = true)
	private TelephoneFixe telephoneFixe;
   	
   	 @OneToMany(mappedBy="user")
   	 @Column(nullable = true)
	private Collection<Imprimante> imprimante;
   	
	public int getId() {
		return id;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public byte[] getBphoto() {
		return bphoto;
	}
	public void setBphoto(byte[] bphoto) {
		this.bphoto = bphoto;
	}
	
	public String getFixe() {
		return fixe;
	}
	public void setFixe(String fixe) {
		this.fixe = fixe;
	}
	
	
	
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public User(){
		super();
		this.actived = false;
	}
	
	public String getCodepostale() {
		return codepostale;
	}
	public void setCodepostale(String codepostale) {
		this.codepostale = codepostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public User(String matricule, String password, String cin, String nom, String prenom, String adresse, String email,
			String tele, String fixe, String fonction, String photo, byte[] bphoto, Role role,
			Departement departement) {
		super();
		this.matricule = matricule;
		this.password = password;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.tele = tele;
		this.fixe = fixe;
		this.fonction = fonction;
		this.photo = photo;
		this.bphoto = bphoto;
		this.role = role;
		this.departement = departement;
		this.actived = false;
	}
	public User(String matricule, String password, String nom, String prenom, String email, String fonction) {
		super();
		this.matricule = matricule;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.fonction = fonction;
		this.actived = false;
	}
	public User(String matricule, String password, String nom, String prenom, String email, String fonction,
			String sexe) {
		super();
		this.matricule = matricule;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.fonction = fonction;
		this.sexe = sexe;
		this.actived = false;
	}
	
	
	public Collection<Ordinateur> getOrdinateur() {
		return ordinateur;
	}
	public void setOrdinateur(Collection<Ordinateur> ordinateur) {
		this.ordinateur = ordinateur;
	}
	public TelephneMobile getTelephneMobile() {
		return telephneMobile;
	}
	public void setTelephneMobile(TelephneMobile telephneMobile) {
		this.telephneMobile = telephneMobile;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public Tablette getTablette() {
		return tablette;
	}
	public void setTablette(Tablette tablette) {
		this.tablette = tablette;
	}
	public TelephoneFixe getTelephoneFixe() {
		return telephoneFixe;
	}
	public void setTelephoneFixe(TelephoneFixe telephoneFixe) {
		this.telephoneFixe = telephoneFixe;
	}
	public Collection<Imprimante> getImprimante() {
		return imprimante;
	}
	public void setImprimante(Collection<Imprimante> imprimante) {
		this.imprimante = imprimante;
	}
	   
}