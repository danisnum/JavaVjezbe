package vjezbe3;
import java.util.Random;
import java.util.Scanner;
public class MijenjanjeElemenata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner unos = new Scanner(System.in);
		        Random rnd = new Random();

		        System.out.print("Unesite duzinu niza: ");
		        int n = unos.nextInt();

		        int[] original = new int[n];
		        for (int i = 0; i < n; i++) {
		            // nasumični cijeli brojevi iz opsega [-20, 20]
		            original[i] = rnd.nextInt(41) - 20;
		        }

		        System.out.println("\nPocetni niz (int):");
		        for (int x : original) System.out.print(x + " ");

		        double[] transformisani = new double[n];
		        for (int i = 0; i < n; i++) {
		            int vrijednost = original[i];

		            if (vrijednost % 2 == 0) {
		                // parni -> suprotna vrijednost (negacija)
		                transformisani[i] = -vrijednost; // napomena: -0 ostaje 0
		            } else {
		                // neparni -> inverzna vrijednost 1/n
		                transformisani[i] = 1.0 / vrijednost; // n nikad 0 jer je neparan
		            }
		        }

		        System.out.println("\n\nTransformisani niz (double):");
		        for (double y : transformisani) System.out.printf("%.4f ", y);

		        System.out.println();
		        unos.close();
		    }
		
	}


