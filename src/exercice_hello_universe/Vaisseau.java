package exercice_hello_universe;

public abstract class Vaisseau {
	int nbPassagers;
	int blindage;
	int resistanceDuBouclier;
	int tonnage;
	int tonnageMax;
	int tonnageActuel;
	TypeVaisseau type;
	
	
	void activerBouclier(Vaisseau vaisseau) {
		System.out.println("Activation du bouclier d'un vaisseau de type " + vaisseau.type);
	}
	
	void desactiverBouclier(Vaisseau vaisseau) {
		System.out.println("Désactivation du bouclier d'un vaisseau de type " + vaisseau.type);
	}
	
	public abstract int emporterCargaison(int tonnage);
}
