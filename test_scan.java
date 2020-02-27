package MesPremieresClasses;

import java.util.Scanner;

public class TestScan{
	public static void main(String[] a) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);

		int e1, e2;
		float f1, f2;
		System.out.println("Entrez deux entiers :");
		e1 = sc.nextInt();
		e2 = sc.nextInt();
		System.out.println("Entrez deux floatants :");
		f1 = sc.nextFloat();
		f2 = sc.nextFloat();
		int sommeInt = e1 / e2;
		float sommeFloat = f1 / f2;
		System.out.println("Resulat entier = "+sommeInt+" resultat floatant = "+sommeFloat);
	}
}