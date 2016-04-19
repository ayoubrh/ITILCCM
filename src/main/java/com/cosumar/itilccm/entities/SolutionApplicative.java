/***********************************************************************
 * Module:  SolutionApplicative.java
 * Author:  ayoub
 * Purpose: Defines the Class SolutionApplicative
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid ea07be6f-972f-4db3-aadd-a3f038927b2c */
public class SolutionApplicative {
   /** @pdOid 0a2f4fd5-a585-42f5-b9a8-838299018cd2 */
   private int id;
   /** @pdOid 7e0fbb17-3857-4e1e-9d4d-5f4a1b6e8a33 */
   private String nom;
   /** @pdOid a48c60ef-b2a3-4f44-b180-10a77d61d871 */
   private String statut;
   /** @pdOid 30c66ceb-93da-458b-b671-facb391aecd2 */
   private String criticite;
   /** @pdOid 129c369d-feac-4670-9e36-93ce4bda6367 */
   private Date dateDeMiseEnProduction;
   /** @pdOid eaeed1b2-b809-4a03-9716-8ae71feb9942 */
   private String description;
   
   /** @pdRoleInfo migr=no name=Infrastructure assc=association22 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Infrastructure> infrastructure;
   /** @pdRoleInfo migr=no name=EquipementReseau assc=association24 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<EquipementReseau> equipementReseau;
   /** @pdRoleInfo migr=no name=ProessusMetier assc=association18 mult=0..* side=A */
   private ProessusMetier[] proessusMetier;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association31 mult=0..* side=A */
   private MachineVirtuelle[] machineVirtuelle;
   /** @pdRoleInfo migr=no name=Virtualisation assc=association32 mult=0..* side=A */
   private Virtualisation[] virtualisation;
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association49 mult=0..* side=A */
   private LogicielEtApplication[] logicielEtApplication;
   /** @pdRoleInfo migr=no name=InstanceDeBasseDeDonnes assc=association54 mult=0..* side=A */
   private InstanceDeBasseDeDonnes[] instanceDeBasseDeDonnes;
   /** @pdRoleInfo migr=no name=InstanceMiddleware assc=association55 mult=0..* side=A */
   private InstanceMiddleware[] instanceMiddleware;
   /** @pdRoleInfo migr=no name=ApplicationWeb assc=association56 mult=0..* side=A */
   private ApplicationWeb[] applicationWeb;
   
   
   

}