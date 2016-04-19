/***********************************************************************
 * Module:  MachineVirtuelle.java
 * Author:  ayoub
 * Purpose: Defines the Class MachineVirtuelle
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid f47512ce-091b-4af2-8084-4d47586b2bc6 */
public class MachineVirtuelle {
   /** @pdOid cac7b881-7a77-49a2-8f4b-6cb9cc31419d */
   private int id;
   /** @pdOid 6ddef30e-08a7-4d6a-a0fd-19a9b304158b */
   private String nom;
   /** @pdOid 3d938ae7-2c06-40d7-b28e-f61f105f59ed */
   private String statut;
   /** @pdOid b2cd01b7-a97e-4160-9047-27f2c0591b2c */
   private String criticite;
   /** @pdOid 25e53ead-ec9e-4b7f-9737-7d7400c3e12a */
   private String ip;
   /** @pdOid bf6c624a-678b-4891-a07b-1b58107b5f3f */
   private String cpu;
   /** @pdOid aad2fdea-a455-4373-9971-a27a92dc7755 */
   private String ram;
   /** @pdOid 8789f640-6c82-4eae-8e42-42196c65c866 */
   private Date dateDeMiseEnProduction;
   /** @pdOid c5987010-be4e-4de9-9882-a2f8cdc7f601 */
   private String description;
   
   /** @pdRoleInfo migr=no name=VolumeLogique assc=association28 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<VolumeLogique> volumelogique;
   /** @pdRoleInfo migr=no name=IntefaceReseau assc=association29 mult=0..* */
   private IntefaceReseau[] intefaceReseau;
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association31 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<SolutionApplicative> solutionApplicative;
   /** @pdRoleInfo migr=no name=Virtualisation assc=association27 mult=0..1 side=A */
   private Virtualisation virtualisation;
   /** @pdRoleInfo migr=no name=LicenseOs assc=association51 mult=0..1 side=A */
   private LicenseOs licenseOs;
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association53 mult=0..* side=A */
   private LogicielEtApplication[] logicielEtApplication;
   
   
   

}