/***********************************************************************
 * Module:  Tablette.java
 * Author:  ayoub
 * Purpose: Defines the Class Tablette
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 0e854841-4b67-456f-8903-bba3cc317f52 */
public class Tablette {
   /** @pdOid 656b036d-5c16-46c5-ac09-096e67fc6854 */
   private int id;
   /** @pdOid fd6db622-9024-4cbd-a2d1-5a7f156af6a0 */
   private String nom;
   /** @pdOid dea85a2f-40d6-4d5c-aabc-a3f8a83bbd48 */
   private String statut;
   /** @pdOid d7969548-4a11-4ff7-85f4-5d0af20101c7 */
   private String criticite;
   /** @pdOid 444a94c8-e360-4392-8918-67876fff94f2 */
   private String numeroDeSerie;
   /** @pdOid 50b794d9-f553-45e2-b8fd-e93a402b5ecd */
   private String numeroAsset;
   /** @pdOid 7ac6cfeb-f386-482c-adeb-7ba4a006a313 */
   private Date dateDeMiseEnProduction;
   /** @pdOid a588eb16-1d72-49cd-aa5f-7c9c0e2966ca */
   private Date dateD_achat;
   /** @pdOid 9abb8326-66ac-43b5-b240-4ac5f056a9bf */
   private Date dateDeFinDeGarantie;
   /** @pdOid 86199a18-633f-4a82-8599-f338c3a2d696 */
   private String description;
   
   /** @pdRoleInfo migr=no name=User assc=association36 mult=0..1 */
   private User user;

}