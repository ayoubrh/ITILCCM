package com.cosumar.itilccm.entities;

import java.util.*;

public class SystemeDeStockage extends Infrastructure {
   /** @pdRoleInfo migr=no name=SwitchSan assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<SwitchSan> switchSan;
   /** @pdRoleInfo migr=no name=Nas assc=association13 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	private java.util.Collection<Nas> nas;
   /** @pdRoleInfo migr=no name=VolumeLogique assc=association20 mult=1..1 side=A */
	private VolumeLogique volumelogique;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<SwitchSan> getSwitchSan() {
      if (switchSan == null)
         switchSan = new java.util.HashSet<SwitchSan>();
      return switchSan;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSwitchSan() {
      if (switchSan == null)
         switchSan = new java.util.HashSet<SwitchSan>();
      return switchSan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSwitchSan */
   public void setSwitchSan(java.util.Collection<SwitchSan> newSwitchSan) {
      removeAllSwitchSan();
      for (java.util.Iterator iter = newSwitchSan.iterator(); iter.hasNext();)
         addSwitchSan((SwitchSan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSwitchSan */
   public void addSwitchSan(SwitchSan newSwitchSan) {
      if (newSwitchSan == null)
         return;
      if (this.switchSan == null)
         this.switchSan = new java.util.HashSet<SwitchSan>();
      if (!this.switchSan.contains(newSwitchSan))
         this.switchSan.add(newSwitchSan);
   }
   
   /** @pdGenerated default remove
     * @param oldSwitchSan */
   public void removeSwitchSan(SwitchSan oldSwitchSan) {
      if (oldSwitchSan == null)
         return;
      if (this.switchSan != null)
         if (this.switchSan.contains(oldSwitchSan))
            this.switchSan.remove(oldSwitchSan);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSwitchSan() {
      if (switchSan != null)
         switchSan.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Nas> getNas() {
      if (nas == null)
         nas = new java.util.HashSet<Nas>();
      return nas;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorNas() {
      if (nas == null)
         nas = new java.util.HashSet<Nas>();
      return nas.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newNas */
   public void setNas(java.util.Collection<Nas> newNas) {
      removeAllNas();
      for (java.util.Iterator iter = newNas.iterator(); iter.hasNext();)
         addNas((Nas)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNas */
   public void addNas(Nas newNas) {
      if (newNas == null)
         return;
      if (this.nas == null)
         this.nas = new java.util.HashSet<Nas>();
      if (!this.nas.contains(newNas))
         this.nas.add(newNas);
   }
   
   /** @pdGenerated default remove
     * @param oldNas */
   public void removeNas(Nas oldNas) {
      if (oldNas == null)
         return;
      if (this.nas != null)
         if (this.nas.contains(oldNas))
            this.nas.remove(oldNas);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllNas() {
      if (nas != null)
         nas.clear();
   }
   /** @pdGenerated default parent getter */
   public VolumeLogique getVolumelogique() {
      return volumelogique;
   }
   
   /** @pdGenerated default parent setter
     * @param newVolumeLogique */
   public void setVolumelogique(VolumeLogique newVolumeLogique) {
      if (this.volumelogique == null || !this.volumelogique.equals(newVolumeLogique))
      {
         if (this.volumelogique != null)
         {
            VolumeLogique oldVolumeLogique = this.volumelogique;
            this.volumelogique = null;
            oldVolumeLogique.removeSystemedestockage(this);
         }
         if (newVolumeLogique != null)
         {
            this.volumelogique = newVolumeLogique;
            this.volumelogique.addSystemedestockage(this);
         }
      }
   }
   
   

}