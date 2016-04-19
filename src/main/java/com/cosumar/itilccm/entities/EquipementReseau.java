/***********************************************************************
 * Module:  EquipementReseau.java
 * Author:  ayoub
 * Purpose: Defines the Class EquipementReseau
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid ed9952a2-e9b7-4140-a3c5-156cd13151f4 */
public class EquipementReseau {
   /** @pdOid 5a5a5f3d-5852-49c4-9d19-639c30752552 */
   private int id;
   /** @pdOid 364e269b-4eea-4e31-8f01-ea53b706b918 */
   private String nom;
   /** @pdOid f2080c3b-1499-4ea4-9707-87a304ba99d0 */
   private String statut;
   /** @pdOid 2460d32a-e4d3-495f-b962-cab471d6755d */
   private String criticite;
   /** @pdOid bbc4af26-7336-42d0-9a5f-732abfa53ad0 */
   private String type;
   /** @pdOid 82544d09-a692-4448-a9b6-266b4a3c717c */
   private String marque;
   /** @pdOid e3e538c7-ec78-4f33-8a4c-99d6f398ccb5 */
   private String modele;
   /** @pdOid 7a7912b3-6ba9-4cd0-9ec8-f467940e6f65 */
   private String versionIso;
   /** @pdOid 128460e6-2698-42e8-acb6-e9eb17023d8a */
   private String ip;
   /** @pdOid 5661f682-616f-421e-96cd-d2cee566b732 */
   private String ram;
   /** @pdOid 2d612cef-c346-4a3b-b533-6c1e987e1bea */
   private String nbUnite;
   /** @pdOid 61ce03c8-25fe-4957-a645-42980991f23a */
   private String numeroDeSerie;
   /** @pdOid 9ccdc269-99e7-4f6f-8b8b-dda5723ee1a2 */
   private String numeroAsset;
   /** @pdOid 2b532cf1-7f0e-40d1-8304-f1d1f5c764eb */
   private Date dateDeMiseEnProduction;
   /** @pdOid e48b00e3-e1bd-4317-9b97-f89e8ee8a905 */
   private Date dateD_ahat;
   /** @pdOid b57f2e31-6d39-40f1-8625-a510a328a3b5 */
   private Date dateDeFinDeGarantie;
   /** @pdOid 7b34b9d7-053d-431e-9ceb-6e7c16aba7ad */
   private String description;
   
   /** @pdRoleInfo migr=no name=ConnexionElectrique assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   private java.util.Collection<ConnexionElectrique> connexionElectrique;
   /** @pdRoleInfo migr=no name=Infrastructure assc=association14 mult=0..* side=A */
   private Infrastructure[] infrastructure;
   /** @pdRoleInfo migr=no name=IntefaceReseau assc=association23 mult=0..* side=A */
   private IntefaceReseau[] intefaceReseau;
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association24 mult=0..* side=A */
   private SolutionApplicative[] solutionApplicative;
   /** @pdRoleInfo migr=no name=Ordinateur assc=association40 mult=0..* side=A */
   private Ordinateur[] ordinateur;
   
   
   

}