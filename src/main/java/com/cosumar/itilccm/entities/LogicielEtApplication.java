/***********************************************************************
 * Module:  LogicielEtApplication.java
 * Author:  ayoub
 * Purpose: Defines the Class LogicielEtApplication
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 96ef1fb4-54bc-4ac1-b009-3b298f93a813 */
public class LogicielEtApplication {
   /** @pdOid 0d241d60-9721-4e42-aebb-2d9368fe451c */
   private int id;
   /** @pdOid 74256399-8422-4ecd-ae35-4445633a9c05 */
   private String nom;
   /** @pdOid 91a88f61-3c7e-4222-9e1b-87abb9f10d6f */
   private String statut;
   /** @pdOid e66a5312-bbc2-4bdd-8428-b29914fb8e43 */
   private String criticite;
   /** @pdOid 3c60525e-7f6f-41f2-ab24-eb73a8cf9c41 */
   private String cheminD_installation;
   /** @pdOid 48add73d-2839-46ce-a500-b74b3f0b0ea0 */
   private Date dateDeMiseEnProduction;
   /** @pdOid 6ad7c801-a65b-4026-a420-3c2b29195da9 */
   private String description;
   
   /** @pdRoleInfo migr=no name=Ordinateur assc=association48 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Ordinateur> ordinateur;
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association49 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<SolutionApplicative> solutionApplicative;
   /** @pdRoleInfo migr=no name=Serveur assc=association52 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Serveur> serveur;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association53 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<MachineVirtuelle> machineVirtuelle;
   /** @pdRoleInfo migr=no name=LicenseLogiciel assc=association45 mult=1..1 side=A */
   private LicenseLogiciel licenseLogiciel;
   
   
   

}