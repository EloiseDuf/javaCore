package exercice_hello_universe;

public class PlaneteTellurique extends Planet implements habitable{

	PlaneteTellurique(String nom) {
		super(nom);
	}
	
	public void accueillirVaisseau(Vaisseau vaisseaux) {
		if(vaisseauStock != null) {
			System.out.println("Un vaisseau de type " + vaisseauStock.type + " doit s'en aller.");
			vaisseauStock=vaisseaux;
		}else {
			vaisseauStock=vaisseaux;
			System.out.println("Aucun vaisseau ne s'en va.");
		}
		totalVisiteurs+=vaisseaux.nbPassagers;
	}
}
