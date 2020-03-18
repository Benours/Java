package prom;

import java.util.ArrayList;

import etude.CodeInscription;
import etude.CodePays;
import etude.Etudiant;

public class TestPromotion {

	private static CodeInscription PREMIERE_INSCRIPTION;
	private static CodePays FRANCAIS;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Promotion prom = new Promotion(2012);
		Etudiant a = new Etudiant("a", 1997, PREMIERE_INSCRIPTION, FRANCAIS);
		Etudiant b = new Etudiant("b", 1998, PREMIERE_INSCRIPTION, FRANCAIS);
		Etudiant c = new Etudiant("c", 1999, PREMIERE_INSCRIPTION, FRANCAIS);
		a.Moyenne();
		b.Moyenne();
		c.Moyenne();
		prom.Inscrire(a);
		prom.Inscrire(b);
		prom.Inscrire(c);
		ArrayList<Etudiant> l = prom.getCol();
		for (int i = 0; i < l.size(); i++) {
			l.get(i).getEtudiant();
		}
		System.out.println(prom.MoyGen(l));
	}
}
