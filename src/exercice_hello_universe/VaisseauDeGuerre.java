package exercice_hello_universe;

public class VaisseauDeGuerre extends Vaisseau{

	void attaquer(Vaisseau vaisseau, String arme, int dureeAttaque) {
		System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s pendant %d minutes \n",
				this.type, vaisseau.type, arme, dureeAttaque);
		vaisseau.resistanceDuBouclier=0;
		vaisseau.blindage=vaisseau.blindage/2;
	}
}
