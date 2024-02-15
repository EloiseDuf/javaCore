package exercice_hello_universe;
public class Hello_Universe {
	public static void main(String... args){
		Planet jupiter = new Planet("Jupiter");
		jupiter.matiere="gazeuse";
		jupiter.diametre=142984;
		
		System.out.println(jupiter.toString());
		
		Planet saturne = new Planet("Saturne");
		saturne.matiere="gazeuse";
		saturne.diametre=120536;
		
		System.out.println(saturne.toString());
		
		Planet neptune = new Planet("Neptune");
		neptune.matiere="gazeuse";
		neptune.diametre=49532;
		
		System.out.println(neptune.toString());
		System.out.println(neptune.revolution(-3542));
		
		Planet uranus = new Planet("Uranus");
		uranus.matiere="gazeuse";
		uranus.diametre=51118;
		uranus.atmosphere = new Atmosphere();
		uranus.atmosphere.txHydro=0.83f;
		uranus.atmosphere.txHelium=0.15f;
		uranus.atmosphere.txMethane=0.025f;
		
		System.out.println("L'atmosphère de " + uranus.nom + " est composée de " + (int)(uranus.atmosphere.txHydro*100) + " %");
		
		System.out.println(uranus.toString());
		
		
		Planet mercure = new Planet("Mercure");
		mercure.matiere="tellurique";
		mercure.diametre=4880;
		
		System.out.println(mercure.toString());
		
		Planet mars = new Planet("Mars");
		System.out.println("Le nombre de planètes découvertes est " + Planet.nbPlanetesDecouvertes);
		mars.matiere="tellurique";
		mars.diametre=6792;
		Planet.expension(14.2);
		
		System.out.println("Mars est " + mars.forme);
		System.out.println("Les planètes sont " + Planet.forme);
		Vaisseau fregate = new Vaisseau();
		fregate.nbPassagers=5;
		fregate.type="Fregate";
		mars.accueillirVaisseau(fregate);
		
		Vaisseau chasseur = new Vaisseau();
		chasseur.nbPassagers=3;
		chasseur.type="Chasseur";
		mars.accueillirVaisseau(chasseur);
		
		Vaisseau croiseur = new Vaisseau();
		croiseur.nbPassagers= 42;
		croiseur.type="Croiseur";
		mars.accueillirVaisseau(croiseur);
		
		Vaisseau EDM = new Vaisseau();
		EDM.nbPassagers= 5000;
		EDM.type="Etoile de la Mort";
		mars.accueillirVaisseau(EDM);
		
	
		System.out.println(mars.toString());
		System.out.println(mars.rotation(-684));
		System.out.println("total visiteur " + mars.totalVisiteurs);
	
		Planet terre = new Planet("Terre");
		terre.matiere="tellurique";
		terre.diametre=12756;
		System.out.println("Le nombre de planètes découvertes est " + Planet.nbPlanetesDecouvertes);
		
		System.out.println(terre.toString());
		
		Planet X = new Planet("X");
		
		System.out.println(X.toString());
	}
}

