/***********************************************************************
 * Module:  VersionOs.java
 * Author:  ayoub
 * Purpose: Defines the Class VersionOs
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 1bef5d85-13ec-48d5-8c7e-b445b600aa98 */
public class VersionOs {
   /** @pdOid 4f19295a-62e5-4c7f-9a1f-fcc67a87f864 */
   private int id;
   /** @pdOid 4439b750-7cb1-40b1-a90a-42991dc4c969 */
   private String nom;
   /** @pdOid e76ebd13-975c-4664-abac-dcdc8a01ca82 */
   private String familleOs;
   
   /** @pdRoleInfo migr=no name=LicenseOs assc=association46 mult=1..1 side=A */
   private LicenseOs licenseOs;

}