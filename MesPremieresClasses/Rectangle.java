package MesPremieresClasses;

public class Rectangle{
	private int longueur;
	private int largeur;

	private Couleur couleur;

	private static final int nbCote = 4;
	private static final float angle = 90;

	private Point positionPointSuperieurGauche;

	private static Rectangle plusGrandRectangleConstruit;

	private int aire(){
		int a = longueur * largeur;
		return a;
	}

	private int perimetre(){
		int p = 2 * longueur + 2 * largeur;
		return p;
	}
}