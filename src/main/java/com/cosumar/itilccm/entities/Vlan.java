/***********************************************************************
 * Module:  Vlan.java
 * Author:  ayoub
 * Purpose: Defines the Class Vlan
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid bad842c6-6cb1-4cb4-bc48-cb5aa8658970 */
public class Vlan {
   /** @pdOid 1424286e-37d9-484f-bc22-8284d5cddead */
   private int id;
   /** @pdOid c2654bd2-5f64-4824-a5e8-a932171e0c44 */
   private String vlantag;
   /** @pdOid 9b43cd79-288e-41d2-b1c2-0ede33fdb960 */
   private String description;
   
   /** @pdRoleInfo migr=no name=Physique assc=association16 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Physique> physique;
   /** @pdRoleInfo migr=no name=Subnet assc=association17 mult=0..* side=A */
   private Subnet[] subnet;
   
   
   

}