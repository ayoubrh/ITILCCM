/***********************************************************************
 * Module:  Chassis.java
 * Author:  ayoub
 * Purpose: Defines the Class Chassis
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 92ce032a-e6f2-4d25-af05-1bad499f363d */
public class Chassis {
   /** @pdOid ecc8001b-a765-4987-bf0f-7ae6cd92ae9b */
   private int id;
   /** @pdOid 56f67d6b-8599-41df-87aa-babbe6018528 */
   private String nom;
   /** @pdOid 8ebcc735-d9fd-40fd-bfa2-557ec89e4ccd */
   private String statut;
   /** @pdOid 2611a338-9ff9-41ef-8f91-f5995c3a49b6 */
   private String oriticite;
   /** @pdOid 031e7985-c27a-47e1-8363-31e0a73921c7 */
   private String marque;
   /** @pdOid 6cfa19ad-1279-4a9a-b541-089fad543c38 */
   private String modele;
   /** @pdOid 0f9975b8-c4c8-43a6-8610-93253ba394a6 */
   private String nbUnite;
   /** @pdOid 85333920-08ed-4d08-b743-c1176e0339c2 */
   private String numeroDeSerie;
   /** @pdOid dc927752-efc1-42bd-9eca-a6846910a61f */
   private String numeroDeAsset;
   /** @pdOid 8b6adf40-bf39-4563-b590-c1fcdcdba9dd */
   private Date dateDeMiseEnProduction;
   /** @pdOid 38bb114e-d080-492e-a306-81485e3835fa */
   private Date dateD_achat;
   /** @pdOid 5e3bb649-400f-4fdb-8e7c-90a7c9cf9564 */
   private Date dateDeFinDeGarantie;
   /** @pdOid fb86064c-1093-45aa-941c-0387faa174c3 */
   private String description;
   
   /** @pdRoleInfo migr=no name=Rack assc=association1 mult=0..1 side=A */
   private Rack rack;
   /** @pdRoleInfo migr=no name=Infrastructure assc=association3 mult=0..* side=A */
   private Infrastructure[] infrastructure;

}