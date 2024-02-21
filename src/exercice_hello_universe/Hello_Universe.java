package exercice_hello_universe;
public class Hello_Universe {
	public static void main(String... args){
		PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
		jupiter.diametre=142984;
		
		System.out.println(jupiter.toString());
		
		PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
		saturne.diametre=120536;
		
		System.out.println(saturne.toString());
		
		PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
		neptune.diametre=49532;
		
		System.out.println(neptune.toString());
		System.out.println(neptune.revolution(-3542));
		
		PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
		uranus.diametre=51118;
		uranus.atmosphere = new Atmosphere();
		uranus.atmosphere.txHydro=0.83f;
		uranus.atmosphere.txHelium=0.15f;
		uranus.atmosphere.txMethane=0.025f;
		
		System.out.println("L'atmosphère de " + uranus.nom + " est composée de " + (int)(uranus.atmosphere.txHydro*100) + " %");
		
		System.out.println(uranus.toString());
		
		
		PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
		mercure.diametre=4880;
		
		System.out.println(mercure.toString());
		
		PlaneteTellurique mars = new PlaneteTellurique("Mars");
		System.out.println("Le nombre de planètes découvertes est " + Planet.nbPlanetesDecouvertes);
		mars.diametre=6792;
		Planet.expension(14.2);
		
		System.out.println("Mars est " + mars.forme);
		System.out.println("Les planètes sont " + Planet.forme);
		Vaisseau fregate = new VaisseauDeGuerre();
		fregate.nbPassagers=5;
		fregate.type="Fregate";
		mars.accueillirVaisseau(fregate);
		
		Vaisseau chasseur = new VaisseauDeGuerre();
		chasseur.nbPassagers=3;
		chasseur.type="Chasseur";
		mars.accueillirVaisseau(chasseur);
		
		Vaisseau croiseur = new VaisseauDeGuerre();
		croiseur.nbPassagers= 42;
		croiseur.type="Croiseur";
		mars.accueillirVaisseau(croiseur);
		
		Vaisseau EDM = new VaisseauDeGuerre();
		EDM.nbPassagers= 5000;
		EDM.type="Etoile de la Mort";
		mars.accueillirVaisseau(EDM);		
	
		System.out.println(mars.toString());
		System.out.println(mars.rotation(-684));
		System.out.println("total visiteur " + mars.totalVisiteurs);
	
		PlaneteTellurique terre = new PlaneteTellurique("Terre");
		terre.diametre=12756;
		System.out.println("Le nombre de planètes découvertes est " + Planet.nbPlanetesDecouvertes);
		
		System.out.println(terre.toString());
	
		
		Vaisseau chasseurGuerre = new VaisseauDeGuerre();
		chasseurGuerre.nbPassagers=100;
		chasseurGuerre.type = "chasseur";
		chasseurGuerre.blindage = 156;
		chasseurGuerre.resistanceDuBouclier=2;
		
		Vaisseau vaisseauMonde = new VaisseauCivil();
		vaisseauMonde.nbPassagers=300;
		vaisseauMonde.type = "Vaisseau Monde";
		vaisseauMonde.blindage = 4784;
		vaisseauMonde.resistanceDuBouclier =30;
		
		vaisseauMonde.activerBouclier(vaisseauMonde);
		chasseurGuerre.activerBouclier(chasseurGuerre);
		((VaisseauDeGuerre)chasseurGuerre).attaquer(vaisseauMonde, "laser phonique", 3);
		vaisseauMonde.desactiverBouclier(vaisseauMonde);
		System.out.println("Le bouclier du " + vaisseauMonde.type + " est à " + vaisseauMonde.resistanceDuBouclier);
		System.out.println("Le blindage du " + vaisseauMonde.type + " est à " + vaisseauMonde.blindage);
		
		mars.accueillirVaisseau(vaisseauMonde);
		mars.accueillirVaisseau(chasseurGuerre);
		
		System.out.println("total visiteur " + mars.totalVisiteurs);
	}
}

