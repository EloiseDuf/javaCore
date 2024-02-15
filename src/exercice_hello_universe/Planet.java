package exercice_hello_universe;

public class Planet {
	String nom;
	String matiere;
	long diametre;
	int totalVisiteurs=0;
	int passager=0;
	Vaisseau vaisseauStock;
	static String forme = "spherique";
	Atmosphere atmosphere;
	static int nbPlanetesDecouvertes=0;
	
	
	Planet(String nom){
		this.nom=nom;
		nbPlanetesDecouvertes++;
	}
	
	
	static void expension(double distance) {
		if(distance<14) {
			System.out.println("Oh la la mais c'est super rapide !");
		} else {
			System.out.println("Je rêve ou c'est plus rapide que la lumière ?");
		}
	}
	
	public String toString() {
		return  nom + " est une planète " + matiere + " et a un diamètre de " + diametre + " kilomètres";
	}

	void accueillirVaisseau(Vaisseau vaisseaux) {

		if(vaisseauStock != null) {
			System.out.println("Un vaisseau de type " + vaisseauStock.type + " doit s'en aller.");
			vaisseauStock=vaisseaux;
		}else {
			vaisseauStock=vaisseaux;
			System.out.println("Aucun vaisseau ne s'en va.");
		}
		totalVisiteurs+=vaisseaux.nbPassagers;
	}
	
	
	public String revolution(int angleRotation) {
		int nbTourComplet = angleRotation/360;
		return  "Je suis la planète " + nom + " et je fais " + nbTourComplet + " de tours complets autour de mon étoile";
	}
	public String rotation(int angleRotation) {
		int nbTourComplet = angleRotation/360;
		return  "Je suis la planète " + nom + " et je fais " + nbTourComplet + " de tours complets sur moi-même";
	}
	
	
	
	
	

	
	
}
