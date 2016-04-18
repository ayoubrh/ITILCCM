package com.cosumar.itilccm.entities;

import java.util.*;

public class ArriveeElectrique extends ConnexionElectrique {
   /** @pdRoleInfo migr=no name=PduElectrique assc=association6 mult=0..1 side=A */
	private PduElectrique pduElectrique;
   
   
   /** @pdGenerated default parent getter */
   public PduElectrique getPduElectrique() {
      return pduElectrique;
   }
   
   /** @pdGenerated default parent setter
     * @param newPduElectrique */
   public void setPduElectrique(PduElectrique newPduElectrique) {
      if (this.pduElectrique == null || !this.pduElectrique.equals(newPduElectrique))
      {
         if (this.pduElectrique != null)
         {
            PduElectrique oldPduElectrique = this.pduElectrique;
            this.pduElectrique = null;
            oldPduElectrique.removeArriveeElectrique(this);
         }
         if (newPduElectrique != null)
         {
            this.pduElectrique = newPduElectrique;
            this.pduElectrique.addArriveeElectrique(this);
         }
      }
   }
   
   

}