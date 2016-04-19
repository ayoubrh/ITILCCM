/***********************************************************************
 * Module:  Virtualisation.java
 * Author:  ayoub
 * Purpose: Defines the Class Virtualisation
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid eb52bdaf-ab9c-4d81-b738-5541722a982f */
public class Virtualisation {
   /** @pdOid 91ee4501-2333-4a45-abf1-0f7177afbdff */
   private int id;
   /** @pdOid 42d81974-c512-4e00-8e86-1b4ba2a5fbc6 */
   private String nom;
   /** @pdOid 8eba8cd6-37fc-4f1e-8fa6-19c9d5aeaa1a */
   private String statut;
   /** @pdOid 1364964f-374c-4fa1-91d3-cf88f0bd907a */
   private String criticite;
   /** @pdOid 46835e72-fddd-407c-a262-f0b67283e2bc */
   private Date dateDeMiseEnProduction;
   /** @pdOid 2c289ac7-293a-43df-b4af-98b7698030b6 */
   private String description;
   
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association27 mult=0..* */
   private MachineVirtuelle[] machineVirtuelle;
   /** @pdRoleInfo migr=no name=VolumeLogique assc=association30 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<VolumeLogique> volumelogique;
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association32 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<SolutionApplicative> solutionApplicative;
   
   
   

}