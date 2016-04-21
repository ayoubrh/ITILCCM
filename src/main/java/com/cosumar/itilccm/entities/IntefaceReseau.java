package com.cosumar.itilccm.entities;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class IntefaceReseau {
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
		    private int id;
		    private Infrastructure infrastructure;
		    private EquipementReseau equipementReseau;
		    
		   
		    @ManyToOne
		    @JoinColumn(name="id_machineVirtuelle")
		    private MachineVirtuelle machineVirtuelle;
		   
		    private Ordinateur ordinateur;

}