package com.cosumar.itilccm.entities;

import java.util.*;

public class Dvr extends Infrastructure {
   private int nbrCaneaux;
   
   /** @pdRoleInfo migr=no name=Camera assc=association15 mult=1..1 */
   private Camera camera;

	public int getNbrCaneaux() {
		return nbrCaneaux;
	}
	
	public void setNbrCaneaux(int nbrCaneaux) {
		this.nbrCaneaux = nbrCaneaux;
	}
	
	public Camera getCamera() {
		return camera;
	}
	
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	   
   

}