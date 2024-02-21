package exercice_hello_universe;

public abstract class Vaisseau {
	int nbPassagers;
	int blindage;
	int resistanceDuBouclier;
	int tonnage;
	int tonnageMax;
	int tonnageActuel;
	String type;
	
	Vaisseau(){
		
		switch(this.type) {
		case "Chasseur":
			this.tonnageMax=0;
			break;
		case "Fregate":
			this.tonnageMax=50;
			break;
		case "Croiseur":
			this.tonnageMax=100;
			break;
		case "Cargo":
			this.tonnageMax=500;
			break;
		case "Vaisseau Monde":
			this.tonnageMax=2000;
			break;
		}
	}
	
	
	void activerBouclier(Vaisseau vaisseau) {
		System.out.println("Activation du bouclier d'un vaisseau de type " + vaisseau.type);
	}
	
	void desactiverBouclier(Vaisseau vaisseau) {
		System.out.println("Désactivation du bouclier d'un vaisseau de type " + vaisseau.type);
	}
	
	public abstract int emporterCargaison(int tonnage);
}
