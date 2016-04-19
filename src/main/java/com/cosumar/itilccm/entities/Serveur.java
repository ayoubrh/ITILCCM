/***********************************************************************
 * Module:  Serveur.java
 * Author:  ayoub
 * Purpose: Defines the Class Serveur
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid c6644c74-a854-45ba-93c7-9d008bb81a33 */
public class Serveur extends Infrastructure {
   /** @pdOid e8143e86-6b3b-4f65-a4df-d53ab4ae6a36 */
   private String familleOs;
   /** @pdOid 33534537-6a5c-44ba-beb4-d02e4ce25ace */
   private String versionOs;
   /** @pdOid 09ea50d0-c6eb-4097-b0a4-cc549b7d63e6 */
   private String cpu;
   /** @pdOid b681a10f-9d5a-4375-992c-864b0d0b4b34 */
   private String ram;
   
   /** @pdRoleInfo migr=no name=SwitchSan assc=association11 mult=0..1 */
   private SwitchSan switchSan;
   /** @pdRoleInfo migr=no name=Nas assc=association10 mult=0..* side=A */
   private Nas[] nas;
   /** @pdRoleInfo migr=no name=VolumeLogique assc=association19 mult=0..* side=A */
   private VolumeLogique[] volumelogique;
   /** @pdRoleInfo migr=no name=Hyperviseur assc=association26 mult=0..* side=A */
   private Hyperviseur[] hyperviseur;
   /** @pdRoleInfo migr=no name=LicenseOs assc=association50 mult=0..1 side=A */
   private LicenseOs licenseOs;
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association52 mult=0..* side=A */
   private LogicielEtApplication[] logicielEtApplication;

}