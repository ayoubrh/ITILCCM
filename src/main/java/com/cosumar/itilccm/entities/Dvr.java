package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Dvr extends Infrastructure implements Serializable{
	
	@Column(nullable=true)
	@Size(max=2)
   	@Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
   private Long nbrCaneaux;
   
	@OneToMany(mappedBy="dvr")
   	@Column(nullable = true)
   private Collection<Camera> camera;

	public Long getNbrCaneaux() {
		return nbrCaneaux;
	}

	public void setNbrCaneaux(Long nbrCaneaux) {
		this.nbrCaneaux = nbrCaneaux;
	}

	public Collection<Camera> getCamera() {
		return camera;
	}

	public void setCamera(Collection<Camera> camera) {
		this.camera = camera;
	}
	
	

}