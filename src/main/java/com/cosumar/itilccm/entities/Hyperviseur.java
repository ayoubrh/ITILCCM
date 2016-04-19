/***********************************************************************
 * Module:  Hyperviseur.java
 * Author:  ayoub
 * Purpose: Defines the Class Hyperviseur
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 538b0d1a-22f9-471e-bbcb-65db8ec90c33 */
public class Hyperviseur extends Virtualisation {
   /** @pdRoleInfo migr=no name=Serveur assc=association26 mult=0..1 */
	private Serveur serveur;
   /** @pdRoleInfo migr=no name=Vcluster assc=association25 mult=0..1 side=A */
	private Vcluster vcluster;

}