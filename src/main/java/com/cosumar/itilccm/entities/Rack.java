/***********************************************************************
 * Module:  Rack.java
 * Author:  ayoub
 * Purpose: Defines the Class Rack
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid f260751b-f465-4ffe-bd05-989da0b6a7a2 */
public class Rack {
   /** @pdOid 975be7b3-adf5-4c2a-8ee8-040265e623ee */
   private int id;
   /** @pdOid 856b62f0-cfcd-4955-9b77-9edf415727f2 */
   private String nom;
   /** @pdOid 101c2fcc-c5ae-4520-b8a3-57125e5678f5 */
   private String staut;
   /** @pdOid a6f62cf5-2b9d-47a0-9e89-75f6e67ba668 */
   private String criticite;
   /** @pdOid 22c2a9b3-ca23-4b0a-ba2d-ee80127e06c9 */
   private String marque;
   /** @pdOid e9437154-8d8c-467b-9796-897cb155b5d1 */
   private String modele;
   /** @pdOid 39adbd1b-df9e-4ebc-9e34-28c56d1db076 */
   private String nbUnite;
   /** @pdOid 9c31fbe8-66de-4a93-90dd-236c3a8cc88a */
   private String numeroDeSerie;
   /** @pdOid d090a67c-3aa9-4e46-8b41-74a657239db6 */
   private String numeroAsset;
   /** @pdOid f9253881-5fea-4584-8020-0de7c6315b4c */
   private Date dateDeMiseEnProduction;
   /** @pdOid a432037b-9027-4d47-8cab-20cb70c45ea0 */
   private Date dateD_achat;
   /** @pdOid 28d79110-8112-4643-87f6-2d4db27f0ba8 */
   private Date dateDeFinDeGarantie;
   /** @pdOid f360eb92-5504-4c01-a167-d62300969818 */
   private String description;
   
   /** @pdRoleInfo migr=no name=Chassis assc=association1 mult=0..* */
   private Chassis[] chassis;
   /** @pdRoleInfo migr=no name=PduElectrique assc=association7 mult=0..* */
   private PduElectrique[] pduElectrique;
   /** @pdRoleInfo migr=no name=Infrastructure assc=association2 mult=0..* side=A */
   private Infrastructure[] infrastructure;

}