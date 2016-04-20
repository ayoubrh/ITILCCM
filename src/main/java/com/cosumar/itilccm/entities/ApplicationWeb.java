package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 83f8bba1-9145-4ab4-9509-05b0cf594875 */
public class ApplicationWeb {
   /** @pdOid 613bbffc-c283-4f3c-864e-721b0496016e */
   private int id;
   /** @pdOid c3060ff0-8d57-46dd-a981-0706ac862872 */
   private String nom;
   /** @pdOid d134e785-93a8-4252-9cfa-383b56cc6ab7 */
   private String url;
   /** @pdOid 4d63d7af-b808-40b4-9adb-23680cee22e2 */
   private String criticite;
   /** @pdOid 7fbe7510-32d3-4214-b18e-f5dc542b568d */
   private Date dateDeMiseEnProduction;
   /** @pdOid 33f61e3e-58e9-4acf-b001-708c24629e0d */
   private String decription;
   
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association56 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<SolutionApplicative> solutionApplicative;
   /** @pdRoleInfo migr=no name=ServeurWeb assc=association44 mult=1..1 side=A */
   private ServeurWeb serveurWeb;
   
   
   
}