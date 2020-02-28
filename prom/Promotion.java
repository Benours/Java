package prom;

import java.util.ArrayList;

import etude.Etudiant;

public class Promotion {
	private ArrayList<Etudiant> col = new ArrayList<Etudiant>();
	private int annee;
	
	public Promotion() {}

	public Promotion(int an) {
		annee = an;
	}
	
	public void add(Etudiant e) {
		col.add(e);
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public ArrayList<Etudiant> getCol() {
		return col;
	}

	public void setCol(ArrayList<Etudiant> col) {
		this.col = col;
	}
	
	public int tailleCol(ArrayList<Etudiant> col) {
		return col.size();
	}
	
	public Etudiant etuNum(int numeroEtu) {
		return col.get(numeroEtu);
	}
}
