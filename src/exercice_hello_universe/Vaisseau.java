package exercice_hello_universe;

public class Vaisseau {
	int nbPassagers;
	int blindage;
	int resistanceDuBouclier;
	String type;
	
	
	void activerBouclier(Vaisseau vaisseau) {
		System.out.println("Activation du bouclier d'un vaisseau de type " + vaisseau.type);
	}
	
	void desactiverBouclier(Vaisseau vaisseau) {
		System.out.println("Désactivation du bouclier d'un vaisseau de type " + vaisseau.type);
	}
}
