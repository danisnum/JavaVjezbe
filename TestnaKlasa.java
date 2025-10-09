package vjezbe3;
import java.util.Scanner;
public class TestnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);

        System.out.print("Unesite duzinu niza: ");
        int n = unos.nextInt();

        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite element " + (i + 1) + ": ");
            niz[i] = unos.nextInt();
        }

        double prosjek = AnalizaNiza.nadjiParniPozitivniProsjek(niz);

        if (prosjek != 0)
            System.out.println("Prosjecna vrijednost pozitivnih parnih brojeva u nizu je: " + prosjek);
		
		
		
	}

}
