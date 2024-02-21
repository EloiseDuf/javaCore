package exercice_hello_universe;

public class VaisseauCivil extends Vaisseau {
	public int emporterCargaison(int tonnage) {
		if(tonnage>tonnageMax) {
			return tonnage-tonnageMax;
		} else {
			return 0;
		}
	}
}
