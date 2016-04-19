/***********************************************************************
 * Module:  Peripherique.java
 * Author:  ayoub
 * Purpose: Defines the Class Peripherique
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid a7a654b2-b90e-42e0-a21d-1a62b1eb053b */
public class Peripherique {
   /** @pdOid e7998843-0171-4d9b-aecd-1162a7b9db29 */
   private int id;
   /** @pdOid 525babaa-f759-4c8a-a931-ddc5930d667b */
   private String nom;
   /** @pdOid 9f2cd018-9d01-4d79-93e4-65735d19cf86 */
   private String statut;
   /** @pdOid 757b0dfa-8632-418a-9cbc-d6a59693e74f */
   private String criticite;
   /** @pdOid 4df65b40-29fa-4c06-80c9-f0915bde9c1f */
   private String numeroDeSerie;
   /** @pdOid dbedc7e4-7449-4f89-a80d-b36e8a1e3f0f */
   private String numeroAsset;
   /** @pdOid 50204c1f-a79c-491c-88fc-3e89d227a9b7 */
   private Date dateDeMiseEnProduction;
   /** @pdOid 92cb702d-3520-44d3-bcf6-4e1a048a5fd4 */
   private Date dateD_achat;
   /** @pdOid a0106e8a-8afa-4c50-9c19-da44eccd9e82 */
   private Date dateDeFinDeGarantie;
   /** @pdOid 987a5001-bee0-4a90-8111-a8f07f59b36c */
   private String decription;
   
   /** @pdRoleInfo migr=no name=Ordinateur assc=association39 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Ordinateur> ordinateur;
   
   
   

}