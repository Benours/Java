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
	
	public void Inscrire(Etudiant e) {
		col.add(e);
	}
	
	public float MoyGen(ArrayList<Etudiant> col) {
		float moyGen = 0;
		for (int i = 0; i < col.size(); i++) {
			moyGen = moyGen + col.get(i).Moyenne();
		}
		return moyGen / col.size();
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
