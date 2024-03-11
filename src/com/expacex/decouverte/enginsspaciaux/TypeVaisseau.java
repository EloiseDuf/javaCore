package com.expacex.decouverte.enginsspaciaux;

public enum TypeVaisseau {
	CHASSEUR("Chasseur"),
	FREGATE("Fregate"),
	CROISEUR("Croiseur"),
	CARGO("Cargo"),
	VAISSEAUMONDE("Vaisseau Monde");
	
	String nom;
	
	TypeVaisseau (String nom){
		this.nom=nom;
	}
}
