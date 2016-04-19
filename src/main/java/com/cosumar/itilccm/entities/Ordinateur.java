/***********************************************************************
 * Module:  Ordinateur.java
 * Author:  ayoub
 * Purpose: Defines the Class Ordinateur
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 61ceeb5e-04ea-4240-9a41-4f0ce08770ae */
public class Ordinateur {
   /** @pdOid 2621762e-cde9-4692-87a0-52ba167e7f5b */
   private int id;
   /** @pdOid bc5245b2-d8a1-45e7-80f8-5f5ae984c994 */
   private String nom;
   /** @pdOid a7521243-35fe-4cf1-a7ad-bf87de883a08 */
   private String statut;
   /** @pdOid 505506c6-7864-4530-b42c-13f470097812 */
   private String criticite;
   /** @pdOid cadc5ab0-e831-4efc-91a7-a1021fbcb7ab */
   private String marque;
   /** @pdOid 517438ab-8434-4ed6-98f8-749da3181105 */
   private String type;
   /** @pdOid 018337d0-8b16-43bb-86d8-8f09edb23f81 */
   private String cpu;
   /** @pdOid 4a7f6541-4460-4518-b609-f07483a8cba7 */
   private String ram;
   /** @pdOid 52c94197-f745-443a-8516-f70d38e83932 */
   private String numeroDeSerie;
   /** @pdOid d868c313-9f29-4f21-9bdf-514a3ef32f8d */
   private String numeroAsset;
   /** @pdOid 16f9033b-1e10-442c-8c10-eb44d84bb481 */
   private Date dateDeMiseEnProduction;
   /** @pdOid c8cd8790-4355-4e82-a8e0-8cda4ee85336 */
   private Date dateD_achat;
   /** @pdOid e1e02a1e-0c39-4c3c-9731-f84cf37f462a */
   private Date dateDeFinDeGarantie;
   /** @pdOid 4402cff1-5514-4ac4-a2ca-ab5483374563 */
   private String description;
   
   /** @pdRoleInfo migr=no name=User assc=association33 mult=0..1 */
   private User user;
   /** @pdRoleInfo migr=no name=EquipementReseau assc=association40 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<EquipementReseau> equipementReseau;
   /** @pdRoleInfo migr=no name=IntefaceReseau assc=association41 mult=0..* */
   private IntefaceReseau[] intefaceReseau;
   /** @pdRoleInfo migr=no name=Peripherique assc=association39 mult=0..* side=A */
   private Peripherique[] peripherique;
   /** @pdRoleInfo migr=no name=LicenseOs assc=association47 mult=0..1 side=A */
   private LicenseOs licenseOs;
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association48 mult=0..* side=A */
   private LogicielEtApplication[] logicielEtApplication;
   
   
   

}