package com.expacex.decouverte.objetsastro;

import com.expacex.decouverte.enginsspaciaux.Vaisseau;
import com.expacex.decouverte.enginsspaciaux.VaisseauDeGuerre;

public class PlaneteTellurique extends Planet implements habitable{

	Vaisseau[][] baieAccostage;
	//baieAccostage[1][VaisseauMonde]
	//				[1][Cargo]
	//				[0][chasseur]
	public PlaneteTellurique(String nom, int nbPlaces) {
		super(nom);
		this.baieAccostage = new Vaisseau[nbPlaces][nbPlaces];
		
	}
	
	public void accueillirVaisseaux(Vaisseau... vaisseaux) {
		for(int i=0;i<vaisseaux.length;i++) {
			
			int indexZone=0;
			
			switch(vaisseaux[i].type) {
				case CARGO :
				case VAISSEAUMONDE:
					indexZone=1;
			}
			
			if( vaisseaux[i] instanceof VaisseauDeGuerre) {
				((VaisseauDeGuerre) vaisseaux[i]).desactiverArmes();
			}
			if(restePlaceDisponible(vaisseaux[i])) {
				for(int index=0;index<this.baieAccostage[indexZone].length;index++) {
					if(this.baieAccostage[indexZone][index] == null) {
						baieAccostage[indexZone][index]=vaisseaux[i];
						break;
					}
				}
			}else {
				System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
			}
			totalVisiteurs+=vaisseaux[i].nbPassagers;
		}
		System.out.println("La planète " + this.nom + " a accueilli " + vaisseaux.length + " vaisseau(x)");
	}
	

	public boolean restePlaceDisponible (Vaisseau vaisseau) {
		
		int indexZone=0;
		
		switch(vaisseau.type) {
			case CARGO :
			case VAISSEAUMONDE:
				indexZone=1;
		}
		
		for(int i=0;i<this.baieAccostage[indexZone].length;i++) {
			if(this.baieAccostage[indexZone][i] == null) {
				return true;
			}
		}
		return false;
	}

}
