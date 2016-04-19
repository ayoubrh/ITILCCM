/***********************************************************************
 * Module:  Contrat.java
 * Author:  ayoub
 * Purpose: Defines the Class Contrat
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 6e287282-f297-445b-99a7-3bb8873dd3a2 */
public class Contrat {
   /** @pdOid ce1c30b6-1c6a-4f5d-967c-e1f2376e95c4 */
   private int id;
   /** @pdOid ca2a7a1a-2eba-48b0-9ceb-4b701deaa9c3 */
   private String nom;
   /** @pdOid 5f2ab32c-3586-4fb3-87f8-1a3de143a245 */
   private String client;
   /** @pdOid 0aa0b9bd-4e31-4445-8345-263bdebd6511 */
   private String description;
   /** @pdOid 5a9352de-81fe-433f-91e9-6c788a798c37 */
   private Date dateDeDebut;
   /** @pdOid d5489fd7-4d70-4162-b88a-065ed4c8c7e4 */
   private Date dateDeFin;
   /** @pdOid dbfe496b-21dc-4f1e-8a73-b516c22bd4ac */
   private String monnaie;
   /** @pdOid 96ca7f30-3ee3-4aa3-8998-5ac493164cd1 */
   private String periodiciteDeFacturation;
   /** @pdOid afa724c7-c395-476b-a14b-beb2830b8972 */
   private String uniteDeCout;
   /** @pdOid dae6e92e-6e73-41f0-805c-4bcc26451c52 */
   private String fournisseur;
   /** @pdOid a7219c43-df08-4dff-a059-c34f65104bce */
   private String niveauDeService;
   /** @pdOid 9054c1bf-3959-47dd-8f1c-6c9828f3133d */
   private String statut;
   /** @pdOid 292fa205-c47c-4f53-9403-7cf6d322e1c8 */
   private String typeDeContrat;
   
   /** @pdRoleInfo migr=no name=Contact assc=association59 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Contact> contact;
   /** @pdRoleInfo migr=no name=Document assc=association60 mult=0..* side=A */
   private Document[] document;
   
   
   

}