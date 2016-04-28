package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class SystemeDeStockage extends Infrastructure implements Serializable{
	
	 @ManyToMany
  	 @Column(nullable=true)
	private Collection<SwitchSan> switchSan;
	
	 @OneToMany(mappedBy="systemedestockage")
	private Collection<VolumeLogique> volumelogique;

	public Collection<SwitchSan> getSwitchSan() {
		return switchSan;
	}

	public void setSwitchSan(Collection<SwitchSan> switchSan) {
		this.switchSan = switchSan;
	}

	public Collection<VolumeLogique> getVolumelogique() {
		return volumelogique;
	}

	public void setVolumelogique(Collection<VolumeLogique> volumelogique) {
		this.volumelogique = volumelogique;
	}

	public SystemeDeStockage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SystemeDeStockage(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
		
   
   
   

}