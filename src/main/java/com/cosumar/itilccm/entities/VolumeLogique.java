/***********************************************************************
 * Module:  VolumeLogique.java
 * Author:  ayoub
 * Purpose: Defines the Class VolumeLogique
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 6bef1e4a-cdc9-4f03-b4b7-bea2eb0b3110 */
public class VolumeLogique {
   /** @pdOid f6703dc5-4e5e-4099-a77f-4d6712f94393 */
   private int id;
   /** @pdOid c317dfb1-71be-45b0-af81-a9d16f0dedf9 */
   private String nom;
   /** @pdOid 5073046a-f330-48bb-90d6-cf8ebc695bb3 */
   private String lunId;
   /** @pdOid b6f8c1e3-4dea-4d26-bfe7-4b944a3ac354 */
   private String description;
   /** @pdOid 0afecfa2-c255-4379-a305-16bbdd88071f */
   private String systemeDeStockage;
   /** @pdOid da58ef0c-7f19-4761-94d6-b8cc7f72a629 */
   private String niveauRaid;
   /** @pdOid 37ecb16b-77d1-46a7-b41f-1af9dde4d551 */
   private String taille;
   
   /** @pdRoleInfo migr=no name=Serveur assc=association19 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Serveur> serveur;
   /** @pdRoleInfo migr=no name=SystemeDeStockage assc=association20 mult=1..1 */
   private SystemeDeStockage systemedestockage;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association28 mult=0..* side=A */
   private MachineVirtuelle[] machinevertuelle;
   /** @pdRoleInfo migr=no name=Virtualisation assc=association30 mult=0..* side=A */
   private Virtualisation[] virtualisation;
   
   

}