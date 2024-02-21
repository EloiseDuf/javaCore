package exercice_hello_universe;

public class VaisseauDeGuerre extends Vaisseau{
	
	boolean armesDesactivees;

	void attaquer(Vaisseau vaisseau, String arme, int dureeAttaque) {
		if(armesDesactivees==true) {
			System.out.println("Attaque impossible, l'armement est désactivé");
		} else {
		System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s pendant %d minutes \n",
				this.type, vaisseau.type, arme, dureeAttaque);
		vaisseau.resistanceDuBouclier=0;
		vaisseau.blindage=vaisseau.blindage/2;
		}
	}
	
	void desactiverArmes(){
		System.out.println("Désactivation des armes d'un vaisseau de type " + this.type);
		armesDesactivees = true ;
	}
	
	void activerBouclier(Vaisseau vaisseau) {
		System.out.println("Activation du bouclier d'un vaisseau de type " + vaisseau.type);
		this.desactiverArmes();
	}
	
	public int emporterCargaison(int tonnage) {
		if(this.type=="Chasseur") {
			return tonnage;
		} else if(nbPassagers>=12) {
			if(nbPassagers*2>tonnageMax) {
				return tonnage-tonnageMax;
			} else {
				return tonnage-(nbPassagers*2);
			}
		} else {
			return tonnage;
		}
	}
}
