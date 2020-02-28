package etude;

import java.util.*;

public class Etudiant{
	private String nom;
	private int dateDeNaissance;
	private CodeInscription codeIns;
	private CodePays codePays;
	private Resultat notes[] = new Resultat[3];

	public Etudiant(String nom, int dateDeNaissance, CodeInscription codeIns, CodePays codePays){
		this.nom = nom;
		this.dateDeNaissance = dateDeNaissance;
		this.codeIns = codeIns;
		this.codePays = codePays;
	}

	public String getNom(){
		return nom;
	}

	public void setNom(String nom){
		this.nom = nom;
	}

	public CodeInscription getCodeIns(){
		return codeIns;
	}

	public void setCodeIns(CodeInscription codeIns){
		this.codeIns = codeIns;
	}

	public CodePays getCodePays(){
		return codePays;
	}

	public void setCodePays(CodePays codePays){
		this.codePays = codePays;
	}

	public void setNotes(int l, float note, String x){
			notes[l] = new Resultat(x, note);

		//Scanner sc = new Scanner(System.in);

		//System.out.println("Entrez les notes :");

		//notes[0].setNote(sc.nextFloat());
		//notes[1].setNote(sc.nextFloat());
		//notes[2].setNote(sc.nextFloat());
	}

	public int getDateDeNaissance(){
		return dateDeNaissance;
	}
	
	public void getEtudiant() {
		System.out.println(nom);
		System.out.println(dateDeNaissance);
	}

	private int Age(){
		Calendar c = Calendar.getInstance();
		int x = c.get(Calendar.YEAR);
		return x - dateDeNaissance;
	}


	public float Moyenne(){
		float resultats = 0;
		for (int j = 0; j < 3; j++) {
			if (notes[j].getNote() < 0) {
				System.out.println("Vous n'avez pas enregistrer toutes les notes");
				break;
			}
			else{
				resultats = notes[j].getNote();
			}
		}
		return resultats/3;
	}

	public Mention Mention(){
		float moyenne = Moyenne();
		if (moyenne < 10){
			return Mention.Aucune;
		}
		if (moyenne < 12){
			return Mention.Passable;
		}
		if (moyenne < 14){
			return Mention.Assez_Bien;
		}
		if (moyenne < 16){
			return Mention.Bien;
		}
		else {
			return Mention.Tres_Bien;
		}
	}

	public String ligneResultat(){
		String ligne = nom+" "+Moyenne()+" "+Mention();
		return ligne;
	}
}