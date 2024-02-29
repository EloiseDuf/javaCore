package exercice_hello_universe;

public class VaisseauCivil extends Vaisseau {
	VaisseauCivil(TypeVaisseau type) {
		this.type=type;
			if(type==TypeVaisseau.CARGO){
				this.tonnageMax=500;
			}else if(type==TypeVaisseau.VAISSEAUMONDE) {
				this.tonnageMax=2000;
			}
	}

	public int emporterCargaison(int tonnage) {
		int tonnageRestant = tonnageMax - tonnageActuel;
		
		
		if(tonnage > tonnageRestant ) {
			int cargaisonAconsiderer = tonnageActuel;
			tonnageActuel=tonnageMax;
			return (cargaisonAconsiderer + tonnage - tonnageMax);
		} else {
			tonnageActuel += tonnage;
			return 0;
		}
		
	}
}
