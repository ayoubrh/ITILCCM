/***********************************************************************
 * Module:  Physique.java
 * Author:  ayoub
 * Purpose: Defines the Class Physique
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 0791344d-4b9a-4d60-89b1-9f1dfa546c93 */
public class Physique extends IntefaceReseau {
   /** @pdOid 31c825cf-82af-4e18-961c-2e9e8ef9b3a4 */
   private String nom;
   /** @pdOid 0fd57a15-9ab1-44a1-9240-e4cb6e39035b */
   private String materiel;
   /** @pdOid c898d09a-c1e7-4e40-99f0-c96fe55ebc17 */
   private String adresseIp;
   /** @pdOid 3c4f6b17-ae35-4670-8ffb-fb338ccd12fc */
   private String adresseMac;
   /** @pdOid f19c5c01-d421-444c-a64b-39cf5bcfc40e */
   private String commentaire;
   /** @pdOid 3242fedc-3809-40da-9cbc-9d1d76ccbf34 */
   private String passerelle;
   /** @pdOid d74b0273-7c1f-412f-b781-054417700380 */
   private String masqueDeSousReseau;
   /** @pdOid d2921354-4254-41b4-93b0-f651533fd9ea */
   private String vitesse;
   
   /** @pdRoleInfo migr=no name=Vlan assc=association16 mult=0..* side=A */
   private Vlan[] vlan;

}