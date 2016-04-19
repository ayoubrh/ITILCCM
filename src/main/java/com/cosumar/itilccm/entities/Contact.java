/***********************************************************************
 * Module:  Contact.java
 * Author:  ayoub
 * Purpose: Defines the Class Contact
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 936b50fb-5263-4a8d-b17d-7030a9e17aac */
public class Contact {
   /** @pdOid 9afccf1c-d575-4cef-ac48-b1c185082118 */
   private int id;
   /** @pdOid 5b2d90da-245c-4534-ad05-5d6384c116a2 */
   private String nom;
   /** @pdOid 383dd813-29ab-4418-b34b-7c35a52e0ff4 */
   private String prenom;
   /** @pdOid 74ecb9a0-e8b4-4de3-a113-d7cb9d84efca */
   private String organisme;
   /** @pdOid d793c016-8b7c-4562-b0db-ce8a53c6d6d2 */
   private String statut;
   /** @pdOid 05f0b564-e3e0-4ee5-bc8e-9805a99773d5 */
   private String fonction;
   /** @pdOid 5d29fd1b-f31c-4e6c-8a45-5bdda5f8b2fb */
   private String numeroD_employe;
   /** @pdOid 0ad721e1-6e82-442f-9f8e-2dda77b15c0c */
   private String email;
   /** @pdOid 1fd3b34c-7f26-4682-97d0-cd83aaacbca2 */
   private String telephoneFixe;
   /** @pdOid 3f6b74f3-e755-45c4-a301-5c4cb2d5b639 */
   private String telephoneMobile;
   
   /** @pdRoleInfo migr=no name=Lieu assc=association58 mult=0..1 side=A */
   private Lieu lieu;
   /** @pdRoleInfo migr=no name=Contrat assc=association59 mult=0..* side=A */
   private Contrat[] contrat;

}