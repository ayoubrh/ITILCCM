/***********************************************************************
 * Module:  ProessusMetier.java
 * Author:  ayoub
 * Purpose: Defines the Class ProessusMetier
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid ee8f67b5-d9d6-4580-a01d-a6bfb33b7033 */
public class ProessusMetier {
   /** @pdOid b0a79b97-0e27-4617-9481-517b316561f3 */
   private int id;
   /** @pdOid 6843e93d-db25-4e5f-9eea-6f174dffeb08 */
   private String nom;
   /** @pdOid d44147de-6855-46c2-a94b-9eba4ed74f11 */
   private String statut;
   /** @pdOid 74660cbc-9cd7-4ac0-aa36-f57333bc8fb1 */
   private String criticite;
   /** @pdOid 9da40ab2-1f8e-45fb-a3c7-c44a8a194042 */
   private Date dateDeMiseDeProduction;
   /** @pdOid 5602fdee-e4f4-46a9-a298-7869346592ac */
   private String description;
   
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association18 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<SolutionApplicative> solutionApplicative;
   
   
   

}