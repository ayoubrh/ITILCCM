/***********************************************************************
 * Module:  Sim.java
 * Author:  ayoub
 * Purpose: Defines the Class Sim
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 7af69902-5c15-475f-bcea-7abe1cb8fa81 */
public class Sim {
   /** @pdOid e73eae6a-ce8b-47d1-b08a-61baef79d8b9 */
   private int id;
   /** @pdOid 2b182295-8867-444e-89f8-2ed10dd60efa */
   private String numero;
   /** @pdOid 51f1db73-37b5-4b7d-b431-8df81ab7c35b */
   private int pin;
   /** @pdOid c48ad744-c103-4765-b5fb-788026e12e00 */
   private int puk;
   /** @pdOid 8db45cc9-429f-4eea-b676-cbd2b1c01803 */
   private String operateur;
   /** @pdOid d4b59f69-73aa-46f8-ac14-562448a10710 */
   private String limitation;
   
   /** @pdRoleInfo migr=no name=User assc=association35 mult=0..1 */
   private User user;

}