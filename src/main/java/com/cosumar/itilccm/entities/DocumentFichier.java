package com.cosumar.itilccm.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Lob;
@DiscriminatorValue("Document Fichier")
public class DocumentFichier extends Document implements Serializable {
	

	
	 private String fichier;
	 @Lob
	 private byte[] bfichier;
	 
	 public DocumentFichier() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public DocumentFichier(String nom, String statut, String version, String description) {
		super(nom, statut, version, description);
		// TODO Auto-generated constructor stub
	}


	public String getFichier() {
			return fichier;
		}

		public void setFichier(String fichier) {
			this.fichier = fichier;
		}
	

		

		public byte[] getBfichier() {
			return bfichier;
		}

		public void setBfichier(byte[] bfichier) {
			this.bfichier = bfichier;
		}

}
