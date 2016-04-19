package com.cosumar.itilccm.entities;

import java.util.*;

public class ArriveeElectrique extends ConnexionElectrique {
   /** @pdRoleInfo migr=no name=PduElectrique assc=association6 mult=0..1 side=A */
	private PduElectrique pduElectrique;

public PduElectrique getPduElectrique() {
	return pduElectrique;
}

public void setPduElectrique(PduElectrique pduElectrique) {
	this.pduElectrique = pduElectrique;
}
   
   
	
   
   

}