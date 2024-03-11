package com.expacex.decouverte;

import java.util.Map;
import java.util.Scanner;

import com.expacex.decouverte.enginsspaciaux.TypeVaisseau;
import static com.expacex.decouverte.enginsspaciaux.TypeVaisseau.CARGO;
import static com.expacex.decouverte.enginsspaciaux.TypeVaisseau.FREGATE;
import static com.expacex.decouverte.enginsspaciaux.TypeVaisseau.VAISSEAUMONDE;
import static com.expacex.decouverte.enginsspaciaux.TypeVaisseau.CROISEUR;
import static com.expacex.decouverte.enginsspaciaux.TypeVaisseau.CHASSEUR;
import com.expacex.decouverte.enginsspaciaux.Vaisseau;
import com.expacex.decouverte.enginsspaciaux.VaisseauCivil;
import com.expacex.decouverte.enginsspaciaux.VaisseauDeGuerre;
import com.expacex.decouverte.objetsastro.Atmosphere;
import com.expacex.decouverte.objetsastro.Galaxie;
import com.expacex.decouverte.objetsastro.Planet;
import com.expacex.decouverte.objetsastro.PlaneteGazeuse;
import com.expacex.decouverte.objetsastro.PlaneteTellurique;


public class Hello_Universe {
	public static void main(String... args){

		PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
		jupiter.diametre=142984;
		jupiter.distanceEtoile=778.3f;
		
		//System.out.println(jupiter.toString());
		
		PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
		saturne.diametre=120536;
		saturne.distanceEtoile=1427.0f;
		
		//System.out.println(saturne.toString());
		
		PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
		neptune.diametre=49532;
		neptune.distanceEtoile=4497.07f;
		
		PlaneteTellurique venus= new PlaneteTellurique("Venus",0);
		venus.distanceEtoile = 108.2f; 
//		System.out.println(neptune.toString());
//		System.out.println(neptune.revolution(-3542));
		
		PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
		uranus.diametre=51118;
		uranus.distanceEtoile=2877.38f;
		Atmosphere atmosphereUranus=new Atmosphere();
		atmosphereUranus.constituants.put("Hydrogène",0.93f);
		atmosphereUranus.constituants.put("Hélium",0.15f);
		atmosphereUranus.constituants.put("Méthane",0.025f);
		uranus.atmosphere=atmosphereUranus;
		
		System.out.println("L'atmosphère d'Uranus est composé de :");
		
		for(Map.Entry<String,Float> entry: atmosphereUranus.constituants.entrySet()) {
			String key = entry.getKey();
			Float value = entry.getValue();
			System.out.println(Math.round(value*100) + " % de " + key );
		}
		
		PlaneteTellurique terre = new PlaneteTellurique("Terre",30);
		terre.diametre=12756;
		terre.distanceEtoile=149.6f;
		
		PlaneteTellurique mercure = new PlaneteTellurique("Mercure",1);
		mercure.diametre=4880;
		mercure.distanceEtoile=57.9f;
				
		PlaneteTellurique mars = new PlaneteTellurique("Mars",3);
		mars.diametre=6792;
		mars.distanceEtoile=227.9f;
		Planet.expension(14.2);
		
//		System.out.println("Mars est " + mars.forme);
//		System.out.println("Les planètes sont " + Planet.forme);
		
		Galaxie systemeSolaire = new Galaxie();
		systemeSolaire.nom="Système solaire";
		systemeSolaire.listPlanetes.add(saturne);
		systemeSolaire.listPlanetes.add(venus);
		systemeSolaire.listPlanetes.add(terre);
		systemeSolaire.listPlanetes.add(uranus);
		systemeSolaire.listPlanetes.add(mars);
		systemeSolaire.listPlanetes.add(mercure);
		systemeSolaire.listPlanetes.add(jupiter);
		systemeSolaire.listPlanetes.add(neptune);
		
		System.out.println("------------------------------------------");
		
		System.out.println("Le " + systemeSolaire.nom + " est composée de : ");
				
		for(Planet planet : systemeSolaire.listPlanetes) {
			System.out.println(planet.nom);
		}
		System.out.println("------------------------------------------");
		
		//System.out.println("Le " + systemeSolaire.nom + " est composé des planètes suivantes (de la plus proche à la plus éloignée du soleil) : ");
		
		//for (Planet planete : setPlanete)
		
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
		
		Vaisseau fregate = new VaisseauDeGuerre(FREGATE);
		fregate.nbPassagers=100;
//		System.out.println(fregate.type);
		
		
		mars.accueillirVaisseaux(fregate);
		
		Vaisseau chasseur = new VaisseauDeGuerre(CHASSEUR);
		chasseur.nbPassagers=3;
		chasseur.nbPassagers=100;
		chasseur.blindage = 156;
		chasseur.resistanceDuBouclier=2;
		mars.accueillirVaisseaux(chasseur);
		
		Vaisseau croiseur = new VaisseauDeGuerre(CROISEUR);
		croiseur.nbPassagers= 42;
		mars.accueillirVaisseaux(croiseur);
		
		Vaisseau cargo = new VaisseauCivil(CARGO);
		cargo.nbPassagers=30;
			
//		System.out.println(mars.toString());
//		System.out.println(mars.rotation(-684));
//		System.out.println("total visiteur " + mars.totalVisiteurs);
	
		
		
		Vaisseau chasseur1 = new VaisseauDeGuerre(CHASSEUR);
		chasseur1.nbPassagers=100;
		chasseur1.blindage = 156;
		chasseur1.resistanceDuBouclier=2;
		Vaisseau chasseur2 = new VaisseauDeGuerre(CHASSEUR);
		chasseur2.nbPassagers=120;
		chasseur2.blindage = 100;
		chasseur2.resistanceDuBouclier=5;
		Vaisseau cargo1 = new VaisseauCivil(CARGO);
		cargo1.nbPassagers=500;
		cargo1.blindage = 200;
		cargo1.resistanceDuBouclier=10;
		terre.accueillirVaisseaux(chasseur1,chasseur2,cargo1);
	
	
		
		Vaisseau vaisseauMonde = new VaisseauCivil(VAISSEAUMONDE);
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

