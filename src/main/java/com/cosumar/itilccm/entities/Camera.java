/***********************************************************************
 * Module:  Camera.java
 * Author:  ayoub
 * Purpose: Defines the Class Camera
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 273bcfa2-d3db-4999-a7cf-39428531a81a */
public class Camera {
   /** @pdOid 05b2d2a8-0140-40a1-9e2c-d561482139ca */
   private int id;
   /** @pdOid fb842aaf-a05d-4f27-a8ac-4265d6ca17f5 */
   private String nom;
   /** @pdOid 13842e45-cf58-4e8d-b935-e428f8de9410 */
   private String status;
   /** @pdOid 8e08fdd8-78d9-4054-9cbb-a4eee7d234de */
   private String critcite;
   /** @pdOid 56dd8b5d-a29e-456b-a9a8-b418c2175c08 */
   private String marque;
   /** @pdOid 5232c594-26f2-479b-9f5c-481408ea41aa */
   private String modele;
   /** @pdOid 5cfadaff-e2b9-4c70-a1e1-f7c3dc1e4d17 */
   private String position;
   /** @pdOid be70eec5-e6d1-4b44-b1da-a14111e2e199 */
   private String numeroDeSerie;
   /** @pdOid 557ee230-a2ff-454a-9c61-ed9c4d00b00d */
   private String numeroDeAsset;
   /** @pdOid 66bcd068-5c57-4279-908b-34390fe8a9ed */
   private Date dateDeMiseEnProduction;
   /** @pdOid de0d82c3-3255-444f-bf51-493c3431262d */
   private Date dateD_Achat;
   /** @pdOid b3c12a3f-655c-4120-8aae-ebc4630474a8 */
   private Date dateDeFinDeGarantie;
   
   /** @pdRoleInfo migr=no name=Dvr assc=association15 mult=1..1 side=A */
   private Dvr dvr;

}