package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class SystemeDeStockage extends Infrastructure implements Serializable{
	
	 @ManyToMany
	 @LazyCollection(LazyCollectionOption.FALSE)
	 @JoinTable(name = "Systemedestokage_Switchsan", joinColumns = @JoinColumn(name = "systemedestockage_id"), inverseJoinColumns = @JoinColumn(name = "switchsan_id"))
  	 @Column(nullable=true)
	private Collection<SwitchSan> switchSann;
	
	 @OneToMany(mappedBy="systemedestockage",cascade = CascadeType.ALL)
	 @LazyCollection(LazyCollectionOption.FALSE)
	private Collection<VolumeLogique> volumelogique;
	

	public Collection<SwitchSan> getSwitchSann() {
		return switchSann;
	}

	public void setSwitchSann(Collection<SwitchSan> switchSann) {
		this.switchSann = switchSann;
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