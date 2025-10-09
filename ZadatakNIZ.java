package vjezbe3;
import java.util.Scanner;
public class ZadatakNIZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    
		        Scanner unos = new Scanner(System.in);

		        System.out.print("Unesite duzinu niza: ");
		        int n = unos.nextInt();

		        int[] bodovi = new int[n];
		        int suma = 0;

		       
		        for (int i = 0; i < n; i++) {
		            System.out.print("Unesite broj bodova za studenta " + (i + 1) + ": ");
		            bodovi[i] = unos.nextInt();
		            suma += bodovi[i];
		        }

		        
		        double prosjek = (double) suma / n;

		       
		        int min = bodovi[0];
		        int indeksMin = 0;
		        for (int i = 1; i < n; i++) {
		            if (bodovi[i] < min) {
		                min = bodovi[i];
		                indeksMin = i;
		            }
		        }

		        System.out.println("\nProsjecan broj bodova: " + prosjek);
		        System.out.println("Najmanji broj bodova: " + min + " (indeks: " + indeksMin + ")");
		    }
		

		
		
		
		
	}


