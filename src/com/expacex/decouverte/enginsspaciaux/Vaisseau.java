package com.expacex.decouverte.enginsspaciaux;

public abstract class Vaisseau {
	public int nbPassagers;
	public int blindage;
	public int resistanceDuBouclier;
	public int tonnage;
	public int tonnageMax;
	protected int tonnageActuel;
	public final TypeVaisseau type;
	
	
	
	public void activerBouclier(Vaisseau vaisseau) {
		System.out.println("Activation du bouclier d'un vaisseau de type " + vaisseau.type);
	}
	
	public void desactiverBouclier(Vaisseau vaisseau) {
		System.out.println("Désactivation du bouclier d'un vaisseau de type " + vaisseau.type);
	}
	
	public abstract int emporterCargaison(int tonnage);
	
	public Vaisseau (TypeVaisseau type) {
		this.type=type;
	}
}
