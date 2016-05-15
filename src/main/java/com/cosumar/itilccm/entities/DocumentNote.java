package com.cosumar.itilccm.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@DiscriminatorValue("Document Note")
public class DocumentNote extends Document implements Serializable {

	   @NotEmpty
	   private String texte;
	   
	public DocumentNote() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public DocumentNote(String nom, String statut, String version, String description) {
		super(nom, statut, version, description);
		// TODO Auto-generated constructor stub
	}


	public DocumentNote(String nom, String statut, String version, String description, String texte) {
		super(nom, statut, version, description);
		this.texte = texte;
	}


	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	   

}
