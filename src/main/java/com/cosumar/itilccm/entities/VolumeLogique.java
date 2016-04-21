package com.cosumar.itilccm.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class VolumeLogique {
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
		   private int id;
		   private String nom;
		   private String lunId;
		   private String description;
		   private String systemeDeStockage;
		   private String niveauRaid;
		   private String taille;
		   
		   private java.util.Collection<Serveur> serveur;
		   private SystemeDeStockage systemedestockage;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="volumelogique")
		   private Collection<MachineVirtuelle> machinevertuelle;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="volumelogique")
		   private Collection<Virtualisation> virtualisation;
   
   

}