/***********************************************************************
 * Module:  TelephneMobile.java
 * Author:  ayoub
 * Purpose: Defines the Class TelephneMobile
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 1a9dc47f-3694-4141-8b31-85f8c166264c */
public class TelephneMobile {
   /** @pdOid 8c2b2d77-add2-4a8a-9f50-031c203b286b */
   private int id;
   /** @pdOid e6c22df4-0d16-487e-af0e-ffe552db005f */
   private String nom;
   /** @pdOid cc238b55-9b09-4d03-a5a0-7a0dc9167153 */
   private String statut;
   /** @pdOid 9bedb379-f85f-46d4-8952-538d09125cd2 */
   private String criticite;
   /** @pdOid 2ed61151-4317-4ddb-bcb0-1ec77242e9df */
   private String marque;
   /** @pdOid b89aaaba-3c1e-4ee0-a7c0-7144173791d0 */
   private String modele;
   /** @pdOid b8b075ab-a394-48f3-a415-c974f735aa2f */
   private String imei;
   /** @pdOid 790fea60-0854-4626-8e7f-84b66977a73e */
   private String numeroDeSerie;
   /** @pdOid 592553c2-2cf4-43df-941f-4514ba5772e4 */
   private String numeroAsset;
   /** @pdOid 712a6717-3855-422b-a909-92943e33f7d2 */
   private Date dateDeMiseEnProduction;
   /** @pdOid 757aad9a-fa1b-41d8-93ac-2ffce3e34ec4 */
   private Date dateD_achat;
   /** @pdOid eb076633-529b-497b-8aa7-d31c9d1e437f */
   private Date dateDeFinGarantie;
   /** @pdOid b20595d5-fe67-484e-b6de-779e6f3da03f */
   private String description;
   
   /** @pdRoleInfo migr=no name=User assc=association34 mult=0..1 */
   private User user;

}