package com.cosumar.itilccm.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
@DiscriminatorValue("Document Web")
public class DocumentWeb extends Document implements Serializable {
	
	     private String url;

		public DocumentWeb() {
			super();
			// TODO Auto-generated constructor stub
		}


		public DocumentWeb(String nom, String statut, String version, String description) {
			super(nom, statut, version, description);
			// TODO Auto-generated constructor stub
		}


		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		} 
	     

}
