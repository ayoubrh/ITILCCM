/***********************************************************************
 * Module:  Dvr.java
 * Author:  ayoub
 * Purpose: Defines the Class Dvr
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid c2ce872c-cd3f-44e3-b7cb-2a77b26c720d */
public class Dvr extends Infrastructure {
   /** @pdOid b650bb65-66c9-4297-a799-66aac5ee1b73 */
   private int nbrCaneaux;
   
   /** @pdRoleInfo migr=no name=Camera assc=association15 mult=0..* */
   private Camera[] camera;

}