package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Middleware")
public class Middleware extends LogicielEtApplication implements Serializable {
	
			@Column(nullable=true)
			@OneToMany(mappedBy="middleware")
			private Collection<InstanceMiddleware> instanceMiddleware;
		
			public Middleware() {
				super();
				// TODO Auto-generated constructor stub
			}
		
			public Middleware(String nom, String statut, String criticite, String cheminD_installation,
					Date dateDeMiseEnProduction, String description) {
				super(nom, statut, criticite, cheminD_installation, dateDeMiseEnProduction, description);
				// TODO Auto-generated constructor stub
			}
		
			public Collection<InstanceMiddleware> getInstanceMiddleware() {
				return instanceMiddleware;
			}
		
			public void setInstanceMiddleware(Collection<InstanceMiddleware> instanceMiddleware) {
				this.instanceMiddleware = instanceMiddleware;
			}
			
	

}