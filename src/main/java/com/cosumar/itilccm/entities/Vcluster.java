/***********************************************************************
 * Module:  Vcluster.java
 * Author:  ayoub
 * Purpose: Defines the Class Vcluster
 ***********************************************************************/
package com.cosumar.itilccm.entities;

import java.util.*;

/** @pdOid dfa47647-924c-4cec-aa56-bff06ce4a491 */
public class Vcluster extends Virtualisation {
   /** @pdRoleInfo migr=no name=Hyperviseur assc=association25 mult=0..* */
	private Hyperviseur[] hyperviseur;

}