package exercice_hello_universe;

public class VaisseauDeGuerre extends Vaisseau{
	
	VaisseauDeGuerre(TypeVaisseau type) {
		this.type=type;
		if(type==TypeVaisseau.CHASSEUR){
			this.tonnageMax=0;
		}else if(type==TypeVaisseau.FREGATE) {
			this.tonnageMax=50;
		}else if(type==TypeVaisseau.CROISEUR) {
			this.tonnageMax=100;
		}
	}

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
//		System.out.println(this.type);
//		if(this.type=="Chasseur") {
//			return tonnage;
//		} else if(nbPassagers>=12) {
//			if(nbPassagers*2>tonnageMax) {
//				tonnageActuel=tonnageActuel+(tonnage-tonnageMax<=0?tonnage:tonnageMax);
//				return (tonnage-tonnageMax<=0?0:tonnage-tonnageMax);
//			} else {
//				tonnageActuel+=tonnage;
//				return (nbPassagers*2)-tonnage;
//			}
//		} else {
//			return tonnage;
//		}
		
		// tonnageActuel = 0
		// nbPassager = 15
		//tonnageMax = 50
		int tonnagePassager = nbPassagers*2;
		int tonnageRestant = tonnageMax - tonnageActuel;
		int cargaisonAConsiderer = (tonnagePassager<tonnageRestant ? tonnagePassager : tonnageRestant);
		
		if(this.type==TypeVaisseau.CHASSEUR) {
			return tonnage;
		}else {
			if(tonnage > cargaisonAConsiderer) {
				tonnageActuel = tonnageMax;

				return tonnage - cargaisonAConsiderer;
			} else {
				tonnageActuel = tonnageActuel + tonnage;
				return 0;
				
			}
			
		}
	
		
	}
}
