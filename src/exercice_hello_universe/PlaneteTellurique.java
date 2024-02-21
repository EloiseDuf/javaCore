package exercice_hello_universe;

public class PlaneteTellurique extends Planet implements habitable{

	PlaneteTellurique(String nom) {
		super(nom);
	}
	
	public void accueillirVaisseau(Vaisseau vaisseau) {
		if( vaisseau instanceof VaisseauDeGuerre) {
			((VaisseauDeGuerre) vaisseau).desactiverArmes();
		}
		if(vaisseauStock != null) {
			System.out.println("Un vaisseau de type " + vaisseauStock.type + " doit s'en aller.");
			vaisseauStock=vaisseau;
		}else {
			vaisseauStock=vaisseau;
			System.out.println("Aucun vaisseau ne s'en va.");
		}
		totalVisiteurs+=vaisseau.nbPassagers;
	}
}
