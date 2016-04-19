/***********************************************************************
 * Module:  LicenseOs.java
 * Author:  ayoub
 * Purpose: Defines the Class LicenseOs
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 2dc8359e-be5b-45b3-a12f-5e4cb543f96b */
public class LicenseOs {
   /** @pdOid 0a45130b-c0b9-4c8f-afa6-f05673b340c6 */
   private int id;
   /** @pdOid b54c36ca-3233-442d-ad4c-8b126b390643 */
   private String nom;
   /** @pdOid a1a534af-27f6-4e08-b63f-7ed8e8be1a7a */
   private String limiteD_utilisation;
   /** @pdOid 5aa90309-3f6b-41f0-b723-16815fae92ee */
   private String description;
   /** @pdOid 8287fb08-41e3-44bc-9c9e-6c19cf219b81 */
   private String perprtuelle;
   /** @pdOid df19b9f6-e90c-49c6-b3c3-36a9e442d6a6 */
   private Date dateDeDebutDeValidite;
   /** @pdOid 665075d4-057c-42fc-84ec-4b57ab68a13f */
   private Date dateDeFinDeValiite;
   /** @pdOid a234932f-6d9b-4620-8b5f-9a3e64538ed9 */
   private String cle;
   
   /** @pdRoleInfo migr=no name=VersionOs assc=association46 mult=1..1 type=Composition */
   private VersionOs versionOs;
   /** @pdRoleInfo migr=no name=Ordinateur assc=association47 mult=0..* */
   private Ordinateur[] ordinateur;
   /** @pdRoleInfo migr=no name=Serveur assc=association50 mult=0..* */
   private Serveur[] serveur;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association51 mult=0..* */
   private MachineVirtuelle[] machineVirtuelle;

}