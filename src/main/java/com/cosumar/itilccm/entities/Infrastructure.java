/***********************************************************************
 * Module:  Infrastructure.java
 * Author:  ayoub
 * Purpose: Defines the Class Infrastructure
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 6fade5ac-abbe-4010-9730-908eb5f5bdf3 */
public class Infrastructure {
   /** @pdOid 6acc9e51-9d9f-4c18-be6f-4974f3fdb404 */
   private int id;
   /** @pdOid cfeacf3c-c69c-4bd4-b5c4-4e5445f67961 */
   private String nom;
   /** @pdOid dab768e2-7baa-4b75-ba5f-f4d6d1a20169 */
   private String statut;
   /** @pdOid 443d004d-762c-45e0-a55b-9e741ddd2647 */
   private String criticite;
   /** @pdOid 737cf76d-e531-4520-9d74-6f66acc8cf92 */
   private String marque;
   /** @pdOid 08490571-0af0-463b-b2a9-20dd3972e5ad */
   private String modele;
   /** @pdOid 309790f7-be28-4b90-be8f-e140f0e1a72e */
   private String nbUnite;
   /** @pdOid 492e9330-b748-4c85-8c23-e9bbd26d6ff3 */
   private String ip;
   /** @pdOid 3b15f78b-34c0-4902-93cf-02a0bdf799e0 */
   private String numeroDeSerie;
   /** @pdOid 4c94d47c-19e4-411d-b130-06d7cedec275 */
   private String numeroAsset;
   /** @pdOid ce18d225-5c01-4261-9562-093c78245030 */
   private Date dateDeMiseEnProduction;
   /** @pdOid 174ce4ac-8c29-4bed-ae38-b23deb5ea549 */
   private Date dateD_achat;
   /** @pdOid eb8f6632-560c-4acd-a65a-96d26192a0d4 */
   private Date dateDeFinDeGarantie;
   /** @pdOid 1a2b7b04-e8f3-4e79-8f9a-3dbbc4c75004 */
   private String description;
   
   /** @pdRoleInfo migr=no name=Rack assc=association2 mult=0..1 */
   private Rack rack;
   /** @pdRoleInfo migr=no name=Chassis assc=association3 mult=0..1 */
   private Chassis chassis;
   /** @pdRoleInfo migr=no name=ConnexionElectrique assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   private java.util.Collection<ConnexionElectrique> connexionElectrique;
   /** @pdRoleInfo migr=no name=EquipementReseau assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<EquipementReseau> equipementReseau;
   /** @pdRoleInfo migr=no name=IntefaceReseau assc=association21 mult=0..* side=A */
   private IntefaceReseau[] intefaceReseau;
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association22 mult=0..* side=A */
   private SolutionApplicative[] solutionApplicative;
   
   
   

}