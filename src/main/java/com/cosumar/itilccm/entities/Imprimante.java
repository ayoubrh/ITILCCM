/***********************************************************************
 * Module:  Imprimante.java
 * Author:  ayoub
 * Purpose: Defines the Class Imprimante
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid aacb069a-952e-4037-a043-44e48299ea78 */
public class Imprimante {
   /** @pdOid 59c85c42-1585-4e3b-b5fb-9ed4cc5c4dd8 */
   private int id;
   /** @pdOid 97a1b443-cc74-4da6-aaf3-c04e989bee9b */
   private String nom;
   /** @pdOid 00a2891a-c30f-4d7d-9b13-d619452de6e2 */
   private String statut;
   /** @pdOid 4b123acf-e1f6-4b93-a6cc-d879e5de20dd */
   private String criticite;
   /** @pdOid e4c53961-26e2-4abd-a7ed-23ca841e00b9 */
   private String numeroDeSerie;
   /** @pdOid 9e699503-9bf0-4570-b7d0-84284ae0bb1d */
   private String numeroAsset;
   /** @pdOid a8472d11-5e08-4eef-b67b-f829805e961e */
   private Date dateDeMiseEnProduction;
   /** @pdOid 95870bf2-4edd-444b-9995-8f1957b04a1d */
   private Date dateD_achat;
   /** @pdOid 300c11b3-130b-4b12-bce3-81c77db40862 */
   private Date dateDeFinDeGarantie;
   /** @pdOid a7ea7dc3-29b9-4938-b400-d6fb97c36950 */
   private String description;
   
   /** @pdRoleInfo migr=no name=User assc=association38 mult=0..1 */
   private User user;

}