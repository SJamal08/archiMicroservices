package resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import client.Ouvrier;

public class Projet {
	
	private static int id = 0;
	private HashMap<Metier, Integer> metiersRequis;
//	private HashMap<Ouvrier, Integer> ouvriersEmployes;
	private final ArrayList<Competence> competencesRequises;
	private final String zoneGeographique;
	private final double tauxJournalier;
	private Date dateDeDebut;
	private Date dateDeFin;
	
	public Projet (HashMap<Metier, Integer> metiers, ArrayList<Competence> competences, String zone, double taux, Date debut, Date fin) {
		this.id++;
		this.metiersRequis = metiers;
//		this.ouvriersEmployes = new HashMap<Ouvrier, Integer>();
		this.competencesRequises = competences;
		this.zoneGeographique = zone;
		this.tauxJournalier = taux;
		this.dateDeDebut = debut;
		this.dateDeFin = fin;
	}

	public HashMap<Metier, Integer> getMetiersRequis() {
		HashMap<Metier, Integer> metiersRequisCopie = this.metiersRequis;
		return metiersRequisCopie;
	}
	
	public void supprimerMetierRequis(Metier metier) {
		if(this.metiersRequis.containsKey(metier)) {
			if(this.metiersRequis.get(metier)<1) this.metiersRequis.remove(metier);
			int tmp = this.metiersRequis.get(metier);
			this.metiersRequis.put(metier, tmp--);
		}
	}
	
	public void ajouterMetierRequis(Metier metier) {
		if(this.metiersRequis.containsKey(metier)) {
			int tmp = this.metiersRequis.get(metier);
			this.metiersRequis.put(metier, tmp++);
		} else {
			this.metiersRequis.put(metier, 1);
		}
	}

}
