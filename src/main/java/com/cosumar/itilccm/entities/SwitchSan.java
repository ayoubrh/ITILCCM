/***********************************************************************
 * Module:  SwitchSan.java
 * Author:  ayoub
 * Purpose: Defines the Class SwitchSan
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid c1d59374-2584-4b6c-ae27-42e09feb445c */
public class SwitchSan extends Infrastructure {
   /** @pdRoleInfo migr=no name=Serveur assc=association11 mult=0..* side=A */
	private Serveur[] serveur;
   /** @pdRoleInfo migr=no name=SystemeDeStockage assc=association12 mult=0..* side=A */
	private SystemeDeStockage[] systemeDeStockage;

}