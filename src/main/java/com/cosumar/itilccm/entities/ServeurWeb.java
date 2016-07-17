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
@DiscriminatorValue("ServeurWeb")
public class ServeurWeb extends LogicielEtApplication implements Serializable {
	
			@Column(nullable=true)
			@OneToMany(mappedBy="serveurWeb",cascade = CascadeType.ALL)
			@LazyCollection(LazyCollectionOption.FALSE)
			private Collection<ApplicationWeb> applicationWeb;
			

			public ServeurWeb() {
				super();
				// TODO Auto-generated constructor stub
			}
		
			public ServeurWeb(String nom, String statut, String criticite, String cheminD_installation,
					Date dateDeMiseEnProduction, String description) {
				super(nom, statut, criticite, cheminD_installation, dateDeMiseEnProduction, description);
				// TODO Auto-generated constructor stub
			}
		
			public Collection<ApplicationWeb> getApplicationWeb() {
				return applicationWeb;
			}
		
			public void setApplicationWeb(Collection<ApplicationWeb> applicationWeb) {
				this.applicationWeb = applicationWeb;
			}

	
	

}