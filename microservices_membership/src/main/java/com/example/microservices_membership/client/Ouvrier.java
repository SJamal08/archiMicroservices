package client;

import java.util.ArrayList;
import java.util.HashMap;

import resource.Competence;
import resource.Metier;

public class Ouvrier {

	private static int id = 0;
	private Metier specialisation;
	private String zoneGeographique;
	private ArrayList<String> competences;
	private HashMap<Competence, Boolean> certificatsDAptitudes;
	
	public Ouvrier (Metier spe, String zone, ArrayList<String> competences, HashMap<Competence, Boolean> certificats) {
		this.id++;
		this.specialisation = spe;
		this.zoneGeographique = zone;
		this.competences = competences;
		this.certificatsDAptitudes = certificats;
	}
	
	public Metier getSpecialisation() {
		Metier speCopie = this.specialisation;
		return speCopie;
	}
	
	
	
}
