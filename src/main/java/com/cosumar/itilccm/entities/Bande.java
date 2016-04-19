/***********************************************************************
 * Module:  Bande.java
 * Author:  ayoub
 * Purpose: Defines the Class Bande
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 776c4119-f0bb-44a6-832c-59398009bda5 */
public class Bande {
   /** @pdOid ae0c3774-65af-49f9-863b-b3b00f9e568a */
   private int id;
   /** @pdOid efbeea83-6486-4069-a02e-a7ccd99e3c87 */
   private String nom;
   /** @pdOid 5a46c849-9cf3-43ec-896d-cc4f5b4ee6c6 */
   private String taille;
   /** @pdOid 53060c55-4ed1-453b-85e6-85e6380beb96 */
   private String description;
   
   /** @pdRoleInfo migr=no name=Bandotheque assc=association5 mult=0..* side=A */
   private Bandotheque[] bandotheque;

}