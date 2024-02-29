package exercice_hello_universe;

public class PlaneteTellurique extends Planet implements habitable{

	Vaisseau[] nbVaisseauAccoste;
	PlaneteTellurique(String nom, int nbPlaces) {
		super(nom);
		nbVaisseauAccoste = new Vaisseau[nbPlaces];
		
	}
	
	public void accueillirVaisseau(Vaisseau vaisseau) {
		if( vaisseau instanceof VaisseauDeGuerre) {
			((VaisseauDeGuerre) vaisseau).desactiverArmes();
		}
		if(restePlaceDisponible()) {
			for(int i=0;i<this.nbVaisseauAccoste.length;i++) {
				if(this.nbVaisseauAccoste[i] == null) {
					nbVaisseauAccoste[i]=vaisseau;
					break;
				}
			}
		}else {
			System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
		}
		totalVisiteurs+=vaisseau.nbPassagers;
	}
	
	public boolean restePlaceDisponible () {
		for(int i=0;i<this.nbVaisseauAccoste.length;i++) {
			if(this.nbVaisseauAccoste[i] == null) {
				return true;
			}
		}
		return false;
	}
}
