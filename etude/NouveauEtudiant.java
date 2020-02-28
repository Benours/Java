package etude;

public class NouveauEtudiant{
	public static void main(String[] a) throws java.io.IOException {
		Etudiant e1 = new Etudiant("Benjamin", 1997, CodeInscription.PREMIERE_INSCRIPTION, CodePays.FRANCAIS);
		
		System.out.println(e1.getNom());
		System.out.println(e1.getCodeIns());
		System.out.println(e1.getCodePays());
		e1.setNotes(0, 10f, "a");
		e1.setNotes(1, 16f, "b");
		e1.setNotes(2, 12f, "c");
		System.out.println(e1.ligneResultat());
	}
}