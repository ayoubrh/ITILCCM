package com.cosumar.itilccm.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Serveur extends Infrastructure {
   
		   private String familleOs;
		   
		   private String versionOs;
		   
		   private String cpu;
		   
		   private String ram;
		   
		  
		   private SwitchSan switchSan;
		   
		   private Nas[] nas;
		   
		   private VolumeLogique[] volumelogique;
		   
		   @Column(nullable=true)
		   @OneToMany(mappedBy="serveur")
		   private Collection<Hyperviseur> hyperviseur;
		   
		   @Column(nullable=true)
		   @ManyToOne
		   @JoinColumn(name="id_licenseOs")
		   private LicenseOs licenseOs;
		   
		   @Column(nullable=true)
		   @ManyToMany(mappedBy="serveur")
		   private Collection<LogicielEtApplication> logicielEtApplication;

}