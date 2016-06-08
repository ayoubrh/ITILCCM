package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Subnet implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
	@Pattern(regexp="^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$",message="Entrez une Adress IP")
   private String ip;

	@NotEmpty
	@Pattern(regexp="^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$",message="Entrez une Adress IP")
   private String masqueIp;
   private String nomDeSubnnet;
   private String description;
   
   	@ManyToMany(mappedBy="subnet",cascade = CascadeType.ALL)
   	@LazyCollection(LazyCollectionOption.FALSE)
  	@Column(nullable = true)
   private Collection<Vlan> vlan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMasqueIp() {
		return masqueIp;
	}

	public void setMasqueIp(String masqueIp) {
		this.masqueIp = masqueIp;
	}

	public String getNomDeSubnnet() {
		return nomDeSubnnet;
	}

	public void setNomDeSubnnet(String nomDeSubnnet) {
		this.nomDeSubnnet = nomDeSubnnet;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Vlan> getVlan() {
		return vlan;
	}

	public void setVlan(Collection<Vlan> vlan) {
		this.vlan = vlan;
	}

	public Subnet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subnet(String ip, String masqueIp) {
		super();
		this.ip = ip;
		this.masqueIp = masqueIp;
	}
   
   	
   

}