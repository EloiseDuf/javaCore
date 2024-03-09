package exercice_hello_universe;

public abstract class Planet implements Comparable<Object>{
	String nom;
	long diametre;
	int totalVisiteurs=0;
	int passager=0;
	float distanceEtoile;
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
		return  nom + " est une planète qui a un diamètre de " + diametre + " kilomètres  \n";
	}

	public String revolution(int angleRotation) {
		int nbTourComplet = angleRotation/360;
		return  "Je suis la planète " + nom + " et je fais " + nbTourComplet + " de tours complets autour de mon étoile";
	}
	public String rotation(int angleRotation) {
		int nbTourComplet = angleRotation/360;
		return  "Je suis la planète " + nom + " et je fais " + nbTourComplet + " de tours complets sur moi-même";
	}
	
	public int compareTo (Object o) {
		Planet autrePlanet = (Planet) o;
		if(distanceEtoile==autrePlanet.distanceEtoile) return 0;
		if(distanceEtoile>autrePlanet.distanceEtoile) return 1;
		return -1;
	}
	
	
	

	
	
}
