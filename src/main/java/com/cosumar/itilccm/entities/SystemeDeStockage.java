/***********************************************************************
 * Module:  SystemeDeStockage.java
 * Author:  ayoub
 * Purpose: Defines the Class SystemeDeStockage
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid bb99e8c1-6e50-4e79-b0b6-1517e8f85e7b */
public class SystemeDeStockage extends Infrastructure {
   /** @pdRoleInfo migr=no name=SwitchSan assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<SwitchSan> switchSan;
   /** @pdRoleInfo migr=no name=Nas assc=association13 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<Nas> nas;
   /** @pdRoleInfo migr=no name=VolumeLogique assc=association20 mult=0..* side=A */
	private VolumeLogique[] volumelogique;
   
   
   

}