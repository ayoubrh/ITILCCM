/***********************************************************************
 * Module:  TelephoneFixe.java
 * Author:  ayoub
 * Purpose: Defines the Class TelephoneFixe
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 9578ad4d-d923-4517-9ba7-95106d71221e */
public class TelephoneFixe {
   /** @pdOid 805a50b6-09bf-4377-8646-902b47ca0e49 */
   private int id;
   /** @pdOid 1b38efa6-7032-4274-ba78-7672b672b35f */
   private String nom;
   /** @pdOid 5c7dd3b8-3c27-47dc-9a3d-a98c25f7725c */
   private String staut;
   /** @pdOid 77b982e4-c785-4890-b97c-f937147d650b */
   private String criticite;
   /** @pdOid 605beacf-3175-44f6-b24a-8869eda7e37f */
   private String marque;
   /** @pdOid 130ea614-121c-4671-80d7-0be5d51c4dc7 */
   private String modele;
   /** @pdOid 8ccc51ce-305f-4bda-a451-660389336b47 */
   private String numeroDeSerie;
   /** @pdOid f7e496d9-096b-4f98-b6af-1da317d352d2 */
   private String numeroAsset;
   /** @pdOid c8be83ce-7c2d-43cf-aecd-93e2efe1f9b2 */
   private Date dateDeMiseEnProduction;
   /** @pdOid 2b51d2fe-d794-4901-8287-25be2176ba2f */
   private Date dateDachat;
   /** @pdOid e80125db-2baf-4ac3-9414-cbdce17ac25b */
   private Date dateDeFinDeGarantie;
   /** @pdOid 549bec8a-3a5c-442e-bffc-3e88287ec934 */
   private String description;
   
   /** @pdRoleInfo migr=no name=User assc=association37 mult=0..1 */
   private User user;

}