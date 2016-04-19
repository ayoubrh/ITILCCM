/***********************************************************************
 * Module:  Subnet.java
 * Author:  ayoub
 * Purpose: Defines the Class Subnet
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid d700b146-8d95-46bd-b68b-d826f92ed3bd */
public class Subnet {
   /** @pdOid 6e2f49fa-4f1d-466a-943f-cdf731dbd053 */
   private int id;
   /** @pdOid 1145fa41-5ef8-4a10-a813-08b8638647e0 */
   private String ip;
   /** @pdOid 94b44c5e-850b-4cad-b0b4-999440cae3a4 */
   private String masqueIp;
   /** @pdOid d7f53d14-b4c1-4567-80ff-57732d882f5a */
   private String nomDeSubnnet;
   /** @pdOid 032eced9-cd23-48f0-8cfe-0d2a63dcbf1d */
   private String organisation;
   /** @pdOid 06e65913-cbdd-4e58-9c39-52c29119299f */
   private String description;
   
   /** @pdRoleInfo migr=no name=Vlan assc=association17 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Vlan> vlan;
   
   
   

}