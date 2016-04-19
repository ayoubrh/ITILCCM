package com.cosumar.itilccm.entities;

import java.util.*;

public class Serveur extends Infrastructure {
      private String familleOs;
      private String versionOs;
      private String cpu;
      private String ram;
   
   /** @pdRoleInfo migr=no name=SwitchSan assc=association11 mult=0..1 */
      private SwitchSan switchSan;
   /** @pdRoleInfo migr=no name=Nas assc=association10 mult=0..1 side=A */
      private Nas nas;
   /** @pdRoleInfo migr=no name=VolumeLogique assc=association19 mult=0..* side=A */
      private VolumeLogique[] volumelogique;
   /** @pdRoleInfo migr=no name=Hyperviseur assc=association26 mult=0..1 side=A */
      private Hyperviseur hyperviseur;
   /** @pdRoleInfo migr=no name=LicenseOs assc=association50 mult=0..* side=A */
      private LicenseOs[] licenseOs;
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association52 mult=0..* side=A */
      private LogicielEtApplication[] logicielEtApplication;
   
   
   

	public String getFamilleOs() {
		return familleOs;
	}
	
	public void setFamilleOs(String familleOs) {
		this.familleOs = familleOs;
	}
	
	public String getVersionOs() {
		return versionOs;
	}
	
	public void setVersionOs(String versionOs) {
		this.versionOs = versionOs;
	}
	
	public String getCpu() {
		return cpu;
	}
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public SwitchSan getSwitchSan() {
		return switchSan;
	}
	
	public void setSwitchSan(SwitchSan switchSan) {
		this.switchSan = switchSan;
	}
	
	public VolumeLogique[] getVolumelogique() {
		return volumelogique;
	}
	
	public void setVolumelogique(VolumeLogique[] volumelogique) {
		this.volumelogique = volumelogique;
	}
	
	public LicenseOs[] getLicenseOs() {
		return licenseOs;
	}
	
	public void setLicenseOs(LicenseOs[] licenseOs) {
		this.licenseOs = licenseOs;
	}
	
	public LogicielEtApplication[] getLogicielEtApplication() {
		return logicielEtApplication;
	}
	
	public void setLogicielEtApplication(LogicielEtApplication[] logicielEtApplication) {
		this.logicielEtApplication = logicielEtApplication;
	}

	public Nas getNas() {
		return nas;
	}

	public void setNas(Nas nas) {
		this.nas = nas;
	}

	public Hyperviseur getHyperviseur() {
		return hyperviseur;
	}

	public void setHyperviseur(Hyperviseur hyperviseur) {
		this.hyperviseur = hyperviseur;
	}
	
	
	
	   
   
   

}