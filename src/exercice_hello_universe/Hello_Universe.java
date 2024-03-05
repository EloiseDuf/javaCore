package exercice_hello_universe;

import java.util.Scanner;
import java.util.Set;

public class Hello_Universe {
	public static void main(String... args){

		PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
		jupiter.diametre=142984;
		
		//System.out.println(jupiter.toString());
		
		PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
		saturne.diametre=120536;
		
		//System.out.println(saturne.toString());
		
		PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
		neptune.diametre=49532;
		
		PlaneteTellurique venus= new PlaneteTellurique("Venus",0);
		
//		System.out.println(neptune.toString());
//		System.out.println(neptune.revolution(-3542));
		
		PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
		uranus.diametre=51118;
		Atmosphere atmosphereUranus=new Atmosphere();
		atmosphereUranus.txHydro=new Float(0.83);
		atmosphereUranus.txHelium=new Float(0.15);
		atmosphereUranus.txMethane=new Float(0.025);
		atmosphereUranus.txAzote=new Float(0.0);
		uranus.atmosphere=atmosphereUranus;
		
		PlaneteTellurique terre = new PlaneteTellurique("Terre",30);
		terre.diametre=12756;
//		System.out.println("Le nombre de planètes découvertes est " + Planet.nbPlanetesDecouvertes);
		
//		System.out.println(terre.toString());
		
		
		PlaneteTellurique mercure = new PlaneteTellurique("Mercure",1);
		mercure.diametre=4880;
		
		//System.out.println(mercure.toString());
		
		PlaneteTellurique mars = new PlaneteTellurique("Mars",3);
//		System.out.println("Le nombre de planètes découvertes est " + Planet.nbPlanetesDecouvertes);
		mars.diametre=6792;
		Planet.expension(14.2);
		
//		System.out.println("Mars est " + mars.forme);
//		System.out.println("Les planètes sont " + Planet.forme);
		
		Galaxie systemeSolaire = new Galaxie();
		systemeSolaire.nom="Système solaire";
		systemeSolaire.listPlanetes.add(mercure);
		systemeSolaire.listPlanetes.add(venus);
		systemeSolaire.listPlanetes.add(terre);
		systemeSolaire.listPlanetes.add(mars);
		systemeSolaire.listPlanetes.add(jupiter);
		systemeSolaire.listPlanetes.add(saturne);
		systemeSolaire.listPlanetes.add(uranus);
		systemeSolaire.listPlanetes.add(neptune);
		
		
		//System.out.println("L'atmosphère de " + uranus.nom + " est composée de : ");
		
//		if(uranus.atmosphere.txHydro!=null) {
//			System.out.println((int)(atmosphereUranus.txHydro*100) + " % d'hydrogène");
//		}
//		
//		if(uranus.atmosphere.txHelium!=null) {
//			System.out.println((int)(atmosphereUranus.txHelium*100) + " % d'hélium");
//		}
//		
//		if(uranus.atmosphere.txMethane!=null) {
//			System.out.println((int)(atmosphereUranus.txMethane*100) + " % de Métane");
//		}
//		
//		if(uranus.atmosphere.txAzote!=null) {
//			System.out.println((int)(atmosphereUranus.txAzote*100) + " % d'Azote");
//		}
//		
//		System.out.println(uranus.toString());
		
		Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
		fregate.nbPassagers=100;
//		System.out.println(fregate.type);
		
		
		mars.accueillirVaisseaux(fregate);
		
		Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
		chasseur.nbPassagers=3;
		chasseur.nbPassagers=100;
		chasseur.blindage = 156;
		chasseur.resistanceDuBouclier=2;
		mars.accueillirVaisseaux(chasseur);
		
		Vaisseau croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
		croiseur.nbPassagers= 42;
		mars.accueillirVaisseaux(croiseur);
		
		Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
		cargo.nbPassagers=30;
			
//		System.out.println(mars.toString());
//		System.out.println(mars.rotation(-684));
//		System.out.println("total visiteur " + mars.totalVisiteurs);
	
		
		
		Vaisseau chasseur1 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
		chasseur1.nbPassagers=100;
		chasseur1.blindage = 156;
		chasseur1.resistanceDuBouclier=2;
		Vaisseau chasseur2 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
		chasseur2.nbPassagers=120;
		chasseur2.blindage = 100;
		chasseur2.resistanceDuBouclier=5;
		Vaisseau cargo1 = new VaisseauCivil(TypeVaisseau.CARGO);
		cargo1.nbPassagers=500;
		cargo1.blindage = 200;
		cargo1.resistanceDuBouclier=10;
		terre.accueillirVaisseaux(chasseur1,chasseur2,cargo1);
	
	
		
		Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
		vaisseauMonde.nbPassagers=300;
		vaisseauMonde.blindage = 4784;
		vaisseauMonde.resistanceDuBouclier =30;
		
		vaisseauMonde.activerBouclier(vaisseauMonde);
		chasseur.activerBouclier(chasseur);
		((VaisseauDeGuerre)chasseur).attaquer(vaisseauMonde, "laser phonique", 3);
		vaisseauMonde.desactiverBouclier(vaisseauMonde);
		System.out.println("Le bouclier du " + vaisseauMonde.type + " est à " + vaisseauMonde.resistanceDuBouclier);
		System.out.println("Le blindage du " + vaisseauMonde.type + " est à " + vaisseauMonde.blindage);
		
		mars.accueillirVaisseaux(vaisseauMonde);
		mars.accueillirVaisseaux(chasseur);
		
		System.out.println("total visiteur " + mars.totalVisiteurs);
		
		System.out.println(chasseur.emporterCargaison(20));
//		System.out.println(fregate.emporterCargaison(45));
//		System.out.println(fregate.emporterCargaison(20));
		System.out.println(vaisseauMonde.emporterCargaison(1560));
		System.out.println(vaisseauMonde.emporterCargaison(600));

		String choixReplay="oui";
		
		do {
		
			System.out.println("Quel type de vaisseau souhaites tu prendre entre Chasseur, Fregate, Croiseur, Cargo et Vaisseau Monde ?");
			Scanner sc = new Scanner(System.in);
			String choixVaisseau = sc.nextLine();
			System.out.println("Sur quelle planète souhaites tu poser le vaisseau, merci d'indiquer le nombre de la position par rapport au soleil (de 0 à 8) " + choixVaisseau + " ?");
			String choixPlanete = sc.nextLine();
			
			System.out.println("Tu as un chargement à prendre avec ton vaisseau " + choixVaisseau + " en direction de " + choixPlanete + ", quel est son poids (en tonnes) ?");
			int choixTonnage = sc.nextInt();
			sc.nextLine();			
			TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(choixVaisseau.toUpperCase());
			
			Vaisseau vaisseau=null;
			switch (typeVaisseau) {
				case CHASSEUR: 
					vaisseau = chasseur;
					break;
				case FREGATE:
					vaisseau = fregate;
					break;
				case CROISEUR:
					vaisseau = croiseur;
					break;
				case CARGO:
					vaisseau = cargo;
					break;
				case VAISSEAUMONDE:
					vaisseau = vaisseauMonde;
					break;
			}
			
			for (Planet planete : systemeSolaire.listPlanetes) {
				
				if(planete.nom.equalsIgnoreCase(choixPlanete)) {
					
					if(planete instanceof PlaneteGazeuse) {
						System.out.println("Il n'est pas possible de se poser sur une planète gazeuse");
						continue;
					}
					
					PlaneteTellurique planeteT = (PlaneteTellurique)planete;
					
					planeteT.accueillirVaisseaux(vaisseau);
					break;			
				}
			}
			
			int rejet =vaisseau.emporterCargaison(choixTonnage);
			
			System.out.println(rejet + " tonnes de cargaison ont été rejetées");
			System.out.println("Voulez vous poser de nouveau un vaisseau ? (oui/non)");
			choixReplay = sc.nextLine();
			
			
			
		} while(choixReplay.equalsIgnoreCase("oui"));
		
	}
	


	
}

