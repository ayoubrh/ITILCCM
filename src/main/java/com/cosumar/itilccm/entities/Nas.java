/***********************************************************************
 * Module:  Nas.java
 * Author:  ayoub
 * Purpose: Defines the Class Nas
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 5e5f2dc8-6cf8-4fab-93a3-e5097bf72432 */
public class Nas extends Infrastructure {
   /** @pdRoleInfo migr=no name=SystemeDeFicherNas assc=association4 mult=1..1 type=Composition */
	private SystemeDeFicherNas systemeDeFicherNas;
   /** @pdRoleInfo migr=no name=Serveur assc=association10 mult=0..1 */
	private Serveur serveur;
   /** @pdRoleInfo migr=no name=SystemeDeStockage assc=association13 mult=0..* side=A */
	private SystemeDeStockage[] systemeDeStockage;

}