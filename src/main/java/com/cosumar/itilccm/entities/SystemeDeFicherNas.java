/***********************************************************************
 * Module:  SystemeDeFicherNas.java
 * Author:  ayoub
 * Purpose: Defines the Class SystemeDeFicherNas
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 773fdab2-9a1a-444c-b95a-2af44c18df5c */
public class SystemeDeFicherNas {
   /** @pdOid 88b180c7-fa17-49b7-97e7-8544dd8fd042 */
   private int id;
   /** @pdOid 8c41f7bb-2ea1-4bf1-9b1a-d7b8ecc4d447 */
   private String niveauRaid;
   /** @pdOid 31c3b611-adaa-4c45-af03-ddcfd481b111 */
   private String taille;
   /** @pdOid 9214286f-30f9-4af3-9521-853232f42ec0 */
   private String description;
   
   /** @pdRoleInfo migr=no name=Nas assc=association4 mult=0..* side=A */
   private Nas[] nas;

}