/***********************************************************************
 * Module:  PduElectrique.java
 * Author:  ayoub
 * Purpose: Defines the Class PduElectrique
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid aeba28cc-0e73-4ffd-bca9-846965dddc48 */
public class PduElectrique extends ConnexionElectrique {
   /** @pdRoleInfo migr=no name=ArriveeElectrique assc=association6 mult=0..1 */
	private ArriveeElectrique arriveeElectrique;
   /** @pdRoleInfo migr=no name=Rack assc=association7 mult=0..1 side=A */
	private Rack rack;

}