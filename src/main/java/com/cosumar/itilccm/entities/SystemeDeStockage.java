package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class SystemeDeStockage extends Infrastructure implements Serializable{
	
	 @ManyToMany
	 @LazyCollection(LazyCollectionOption.FALSE)
  	 @Column(nullable=true)
	private Collection<SwitchSan> switchSan;
	
	 @OneToMany(mappedBy="systemedestockage")
	 @LazyCollection(LazyCollectionOption.FALSE)
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