package com.cosumar.itilccm.entities;

import java.util.*;

public class ServeurWeb extends LogicielEtApplication {
   /** @pdRoleInfo migr=no name=InstanceDeBasseDeDonnes assc=association44 mult=1..1 */
	private InstanceDeBasseDeDonnes instanceDeBasseDeDonnes;

	public InstanceDeBasseDeDonnes getInstanceDeBasseDeDonnes() {
		return instanceDeBasseDeDonnes;
	}
	
	public void setInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes instanceDeBasseDeDonnes) {
		this.instanceDeBasseDeDonnes = instanceDeBasseDeDonnes;
	}
	   
   

}