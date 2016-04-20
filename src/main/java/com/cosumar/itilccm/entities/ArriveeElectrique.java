/***********************************************************************
 * Module:  ArriveeElectrique.java
 * Author:  ayoub
 * Purpose: Defines the Class ArriveeElectrique
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 4bd69490-cbd3-4d5c-8bb7-3287i26f59682 */
public class ArriveeElectrique extends ConnexionElectrique {
   /** @pdRoleInfo migr=no name=PduElectrique assc=association6 mult=0..* side=A */
	private PduElectrique[] pduElectrique;

}