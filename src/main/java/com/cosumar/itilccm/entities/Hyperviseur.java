package com.cosumar.itilccm.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@DiscriminatorValue("Hyperviseur")
public class Hyperviseur extends Virtualisation {
	
	        @Column(nullable=true)
			@ManyToOne
			@JoinColumn(name="id_serveur")
			private Serveur serveur;
	        
	        @Column(nullable=true)
			@ManyToOne
			@JoinColumn(name="id_vcluster")
			private Vcluster vcluster;
			
			public Hyperviseur() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Hyperviseur(String nom, String statut, String criticite, Date dateDeMiseEnProduction,
					String description) {
				super(nom, statut, criticite, dateDeMiseEnProduction, description);
				// TODO Auto-generated constructor stub
			}
			public Serveur getServeur() {
				return serveur;
			}
			public void setServeur(Serveur serveur) {
				this.serveur = serveur;
			}
			public Vcluster getVcluster() {
				return vcluster;
			}
			public void setVcluster(Vcluster vcluster) {
				this.vcluster = vcluster;
			}
			
			

}