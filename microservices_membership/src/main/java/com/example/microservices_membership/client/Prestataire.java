package client;

import java.util.ArrayList;

import resource.Projet;

public class Prestataire {
	
	private ArrayList<Projet> listeProjets;
	
	public Prestataire() {
		this.listeProjets = new ArrayList<Projet>();
	}
	
	public void ajouterNouveauProjet(Projet projet) {
		this.listeProjets.add(projet);
	}
	
	public void employer(Projet projet, Ouvrier ouvrier) {
		projet.ajouterMetierRequis(ouvrier.getSpecialisation());
	}
	
	public void finDeContrat(Projet projet, Ouvrier ouvrier) {
		projet.supprimerMetierRequis(ouvrier.getSpecialisation());
	}

}
