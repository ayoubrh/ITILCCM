package com.cosumar.itilccm.entities;

import java.util.*;

public class SystemeDeStockage extends Infrastructure {
   /** @pdRoleInfo migr=no name=SwitchSan assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<SwitchSan> switchSan;
   /** @pdRoleInfo migr=no name=Nas assc=association13 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<Nas> nas;
   /** @pdRoleInfo migr=no name=VolumeLogique assc=association20 mult=1..1 side=A */
	private VolumeLogique volumelogique;
public java.util.Collection<SwitchSan> getSwitchSan() {
	return switchSan;
}
public void setSwitchSan(java.util.Collection<SwitchSan> switchSan) {
	this.switchSan = switchSan;
}
public java.util.Collection<Nas> getNas() {
	return nas;
}
public void setNas(java.util.Collection<Nas> nas) {
	this.nas = nas;
}
public VolumeLogique getVolumelogique() {
	return volumelogique;
}
public void setVolumelogique(VolumeLogique volumelogique) {
	this.volumelogique = volumelogique;
}
   
   
   
   
   

}