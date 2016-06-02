package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@DiscriminatorValue("ServeurDeBasseDeDonnees")
public class ServeurDeBasseDeDonnees extends LogicielEtApplication implements Serializable {
	
			@Column(nullable=true)
			@OneToMany(mappedBy="serveurDeBasseDeDonnees",cascade = CascadeType.ALL)
			@LazyCollection(LazyCollectionOption.FALSE)
			private Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes;
			
			@Column(nullable=true)
			@ManyToMany(mappedBy="serveurDeBasseDeDonnees",cascade = CascadeType.ALL)
			private Collection<Groupe> groupe;
			
		
			public ServeurDeBasseDeDonnees() {
				super();
				// TODO Auto-generated constructor stub
			}
		
			public ServeurDeBasseDeDonnees(String nom, String statut, String criticite, String cheminD_installation,
					Date dateDeMiseEnProduction, String description) {
				super(nom, statut, criticite, cheminD_installation, dateDeMiseEnProduction, description);
				// TODO Auto-generated constructor stub
			}
		
			public Collection<InstanceDeBasseDeDonnes> getInstanceDeBasseDeDonnes() {
				return instanceDeBasseDeDonnes;
			}
		
			public void setInstanceDeBasseDeDonnes(Collection<InstanceDeBasseDeDonnes> instanceDeBasseDeDonnes) {
				this.instanceDeBasseDeDonnes = instanceDeBasseDeDonnes;
			}

			public Collection<Groupe> getGroupe() {
				return groupe;
			}

			public void setGroupe(Collection<Groupe> groupe) {
				this.groupe = groupe;
			}
			
	

}