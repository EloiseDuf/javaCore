package exercice_hello_universe;

public enum TypeVaisseau {
	CHASSEUR("Chasseur"),
	FREGATE("Fregate"),
	CROISEUR("Croiseur"),
	CARGO("Cargo"),
	VAISSEAUMONDE("Vaisseau Monde");
	
	String nom;
	
	TypeVaisseau (String nom){
		this.nom=nom;
	}
}
