/***********************************************************************
 * Module:  Lieu.java
 * Author:  ayoub
 * Purpose: Defines the Class Lieu
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 677d7edc-2d08-4c88-9969-9b22aeb9dc6c */
public class Lieu {
   /** @pdOid f2853ef4-c194-4f96-84aa-55ad4bf85a88 */
   private int id;
   /** @pdOid 3700de1d-478c-409b-a46c-019bccca9adc */
   private String statut;
   /** @pdOid 50ab337e-e43d-44e1-bca6-d635a73dbf6f */
   private String organisme;
   /** @pdOid 993e5b88-2520-4f1f-99b5-66a8a6c4b0f2 */
   private String adresse;
   /** @pdOid e310a05d-e966-4dcf-956c-e0f41f495ab0 */
   private String codePostale;
   /** @pdOid 2ff79887-ad52-4b2c-8be0-d16f8b093678 */
   private String ville;
   /** @pdOid bd9bd1b3-3141-4886-99ae-db905118ab52 */
   private String pays;
   
   /** @pdRoleInfo migr=no name=Contact assc=association58 mult=0..* */
   private Contact[] contact;

}