package com.cosumar.itilccm.entities;

import java.util.*;

public class ServeurDeBasseDeDonnees extends LogicielEtApplication {
   /** @pdRoleInfo migr=no name=ApplicationWeb assc=association42 mult=1..1 */
	private ApplicationWeb applicationWeb;

	public ApplicationWeb getApplicationWeb() {
		return applicationWeb;
	}
	
	public void setApplicationWeb(ApplicationWeb applicationWeb) {
		this.applicationWeb = applicationWeb;
	}
   
   

}