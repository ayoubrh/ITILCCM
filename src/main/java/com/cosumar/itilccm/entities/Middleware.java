package com.cosumar.itilccm.entities;

import java.util.*;

public class Middleware extends LogicielEtApplication {
   /** @pdRoleInfo migr=no name=InstanceMiddleware assc=association43 mult=1..1 */
	private InstanceMiddleware instanceMiddleware;

	public InstanceMiddleware getInstanceMiddleware() {
		return instanceMiddleware;
	}
	
	public void setInstanceMiddleware(InstanceMiddleware instanceMiddleware) {
		this.instanceMiddleware = instanceMiddleware;
	}
   
   

}