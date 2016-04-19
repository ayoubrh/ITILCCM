/***********************************************************************
 * Module:  IntefaceReseau.java
 * Author:  ayoub
 * Purpose: Defines the Class IntefaceReseau
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid 83dcbbba-e427-49c8-9414-521a120ce6ab */
public class IntefaceReseau {
   /** @pdOid 67da9e38-17b3-47ed-8ab2-97ae65a85d01 */
   private int id;
   
   /** @pdRoleInfo migr=no name=Infrastructure assc=association21 mult=0..1 */
   private Infrastructure infrastructure;
   /** @pdRoleInfo migr=no name=EquipementReseau assc=association23 mult=1..1 */
   private EquipementReseau equipementReseau;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association29 mult=1..1 side=A */
   private MachineVirtuelle machineVirtuelle;
   /** @pdRoleInfo migr=no name=Ordinateur assc=association41 mult=0..1 side=A */
   private Ordinateur ordinateur;

}