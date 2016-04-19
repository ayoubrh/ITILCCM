/***********************************************************************
 * Module:  Document.java
 * Author:  ayoub
 * Purpose: Defines the Class Document
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid e0e08295-7666-4d74-a01a-46417ba4e814 */
public class Document {
   /** @pdOid bb46297a-a2d7-4f46-b7f1-a3fef380addc */
   private int id;
   /** @pdOid e55934a5-eb75-4416-97a0-05e6cc075351 */
   private String nom;
   /** @pdOid 88a3ee21-200a-47cc-b2fa-b64db10c553e */
   private String statut;
   /** @pdOid 667ed441-e3e2-43a5-ac30-f972b60bda6d */
   private String version;
   /** @pdOid 82b89c35-605c-45be-a8c4-0b15700d5045 */
   private String type;
   /** @pdOid be789730-882a-492a-9481-62ed1a8ee971 */
   private String description;
   /** @pdOid 28a15525-2c8d-45df-9bc5-f8d7163da708 */
   private String fichier;
   
   /** @pdRoleInfo migr=no name=Contrat assc=association60 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Contrat> contrat;
   
   
   

}