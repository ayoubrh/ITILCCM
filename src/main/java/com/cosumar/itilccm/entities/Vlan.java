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
import javax.validation.constraints.Size;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Vlan implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String vlantag;
   private String description;
   
   	@ManyToMany(mappedBy="vlan",cascade = CascadeType.ALL)
   	@LazyCollection(LazyCollectionOption.FALSE)
   	@Column(nullable = true)
   private Collection<Physique> physique;
   	
   	@ManyToMany
   	@LazyCollection(LazyCollectionOption.FALSE)
   	@Column(nullable = true)
   private Collection<Subnet> subnet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVlantag() {
		return vlantag;
	}

	public void setVlantag(String vlantag) {
		this.vlantag = vlantag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Physique> getPhysique() {
		return physique;
	}

	public void setPhysique(Collection<Physique> physique) {
		this.physique = physique;
	}

	public Collection<Subnet> getSubnet() {
		return subnet;
	}

	public void setSubnet(Collection<Subnet> subnet) {
		this.subnet = subnet;
	}

	public Vlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vlan(String vlantag) {
		super();
		this.vlantag = vlantag;
	}
   	
   	
   
   
   

}