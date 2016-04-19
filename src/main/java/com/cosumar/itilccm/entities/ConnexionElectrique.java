/***********************************************************************
 * Module:  ConnexionElectrique.java
 * Author:  ayoub
 * Purpose: Defines the Class ConnexionElectrique
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 045b7862-4087-4606-8ee3-73c790f8489c */
public class ConnexionElectrique {
   /** @pdOid 337f976e-97fd-48d6-9ec5-e575bbe9749f */
   private int id;
   /** @pdOid 76bc2589-dc47-4a4d-9919-aa05874f8ccd */
   private String nom;
   /** @pdOid c20ff22a-54f3-4827-b212-4efa3b3b99a6 */
   private String statut;
   /** @pdOid 7fa51111-aaa4-4aed-ad45-22ff1efde5a2 */
   private String criticite;
   /** @pdOid c98a7c76-d3f8-4c55-8fa0-e4b1a1e56cc3 */
   private String marque;
   /** @pdOid 4b008f2d-96c6-415f-9a59-040fe6cbeb4c */
   private String modele;
   /** @pdOid 0be159af-d7d2-4b90-a8ed-e0fe9f5ece78 */
   private String nbUnite;
   /** @pdOid 4535d659-fc3f-43d5-9c98-25b5ecfab7ca */
   private String numeroDeSerie;
   /** @pdOid 557cbc22-707c-42d3-b049-52e9d0e19853 */
   private String numeroAsset;
   /** @pdOid 78a1b032-ecc5-4f3c-b115-0cf8776f159f */
   private Date dateDeMiseEnProduction;
   /** @pdOid 5fd55d25-c87d-42ac-a228-341d487d7df3 */
   private Date dateD_achat;
   /** @pdOid ab3c5db2-bbdd-48f4-818b-3443a40f3178 */
   private Date dateDeFinDeGarantie;
   /** @pdOid 0d2daff4-0021-426a-a0c1-9003a6c43eb4 */
   private String description;
   
   /** @pdRoleInfo migr=no name=Infrastructure assc=association8 mult=0..* side=A */
   private Infrastructure[] infrastructure;
   /** @pdRoleInfo migr=no name=EquipementReseau assc=association9 mult=0..* side=A */
   private EquipementReseau[] equipementReseau;

}