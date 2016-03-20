package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
	@Size(min=4,max=20)
	@Column(unique = true)
   private String nom;
	
	@NotEmpty
	@Size(min=4,max=20)
	@Column(unique = true)
   private String libelle;
	
	@OneToMany(mappedBy="role",fetch= FetchType.EAGER,cascade= CascadeType.ALL)
	private Collection<User> users;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	
	public Role() {
		super();
	}
	public Role(String libelle) {
		super();
		this.libelle = libelle;
	}
	public Role(String nom, String libelle) {
		super();
		this.nom = nom;
		this.libelle = libelle;
	}
	
	
	
	
}