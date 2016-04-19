/***********************************************************************
 * Module:  InstanceMiddleware.java
 * Author:  ayoub
 * Purpose: Defines the Class InstanceMiddleware
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 3b4909e7-2166-427f-9ca4-c20290cc55e1 */
public class InstanceMiddleware {
   /** @pdOid 70bacb5e-f601-44d9-98f7-8f99f6e22fa4 */
   private int id;
   /** @pdOid 3d02fa50-a07b-45a5-b1a2-73b5051a2e47 */
   private String nom;
   /** @pdOid 2d7b9655-34ba-488c-a263-12d88e62b42a */
   private String criticite;
   /** @pdOid 450afcb2-afd8-4024-9d63-399678e5af0a */
   private Date dateDeMiseEnProduction;
   /** @pdOid 386de997-c0bd-4024-a867-de317b296c73 */
   private String description;
   
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association55 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<SolutionApplicative> solutionApplicative;
   /** @pdRoleInfo migr=no name=Middleware assc=association43 mult=1..1 side=A */
   private Middleware middleware;
   
   
   

}