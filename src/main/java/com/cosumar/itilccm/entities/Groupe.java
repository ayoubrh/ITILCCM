/***********************************************************************
 * Module:  Groupe.java
 * Author:  ayoub
 * Purpose: Defines the Class Groupe
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 8b85505f-8845-4a9b-8eec-4f060d34b6de */
public class Groupe {
   /** @pdOid 4704f87e-5779-42a5-9b17-40eae15d2c75 */
   private int id;
   /** @pdOid 312e99d7-1e7a-4eff-8798-09e3360c8e35 */
   private String nom;
   /** @pdOid 4d6849d2-4c3b-4fc2-aab9-2e6223a2b6f0 */
   private String statut;
   /** @pdOid 6b2c7d0e-bf6f-442e-8370-8f647cfcedfa */
   private String type;
   /** @pdOid cc266637-61e0-437f-b695-5f23f039a57a */
   private String description;
   
   /** @pdRoleInfo migr=no name=Groupe assc=association57 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Groupe> groupeB;
   /** @pdRoleInfo migr=no name=Groupe assc=association57 mult=0..1 side=A */
   private Groupe groupeA;
   
   
   

}