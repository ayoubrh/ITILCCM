/***********************************************************************
 * Module:  LicenseLogiciel.java
 * Author:  ayoub
 * Purpose: Defines the Class LicenseLogiciel
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid a2534a9a-f8db-43d2-b5c7-c8772db06a88 */
public class LicenseLogiciel {
   /** @pdOid ec03bff4-6bea-4491-96ee-89b0ea3ad27e */
   private int id;
   /** @pdOid 86ba99e1-1b9c-4807-9934-8aa765eb4c9b */
   private String nom;
   /** @pdOid cf00e1bb-7e18-49c7-a0d1-9f533b525e82 */
   private String limiteD_utilisation;
   /** @pdOid 53b2ae97-7ee3-4e8c-8bfb-8b5b354364ec */
   private String description;
   /** @pdOid 78393774-c8ba-41f3-b9d4-7c45737ae013 */
   private String perpetuelle;
   /** @pdOid b0a0c9dc-a9bd-4108-994d-108173415cec */
   private Date dateDeFinDeValiite;
   /** @pdOid ffc34474-4643-425e-8e17-5a698b8f8200 */
   private Date dateDeDebutDeValidite;
   /** @pdOid 3275fe4a-3b55-4bdf-922d-0925f96d2087 */
   private String cle;
   
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association45 mult=0..* */
   private LogicielEtApplication[] logicielEtApplication;

}