/***********************************************************************
 * Module:  InstanceDeBasseDeDonnes.java
 * Author:  ayoub
 * Purpose: Defines the Class InstanceDeBasseDeDonnes
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 79bc3349-af87-4d8d-991b-8b037e9cffcf */
public class InstanceDeBasseDeDonnes {
   /** @pdOid 78c71145-4766-4f35-a951-9ab1e14c0fc7 */
   private int id;
   /** @pdOid c863b17c-0619-4f70-9db0-bab05be3f40a */
   private String nom;
   /** @pdOid 998c8902-f1a7-451c-bff2-bdd913281b24 */
   private String critiicite;
   /** @pdOid d60492be-d090-49e3-acdd-6242b0c41b29 */
   private Date dateDeMiseEnnProduction;
   /** @pdOid 0a701157-5d27-4144-81f7-58cbbe5373ae */
   private String description;
   
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association54 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<SolutionApplicative> solutionApplicative;
   /** @pdRoleInfo migr=no name=ServeurDeBasseDeDonnees assc=association42 mult=1..1 side=A */
   private ServeurDeBasseDeDonnees serveurDeBasseDeDonnees;
   
   
   

}