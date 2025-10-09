package vjezbe3;

import java.util.Scanner;

public class SortiraniNiz {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesite duzinu niza: ");
        int n = unos.nextInt();

        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite element " + (i + 1) + ": ");
            niz[i] = unos.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (niz[j] < niz[minIdx]) minIdx = j;
            }
            int tmp = niz[i];
            niz[i] = niz[minIdx];
            niz[minIdx] = tmp;
        }

        System.out.println("\nSortiran niz:");
        for (int x : niz) System.out.print(x + " ");

        System.out.print("\n\nUnesite broj koji zelite da provjerite: ");
        int trazeni = unos.nextInt();

        boolean postoji = false;
        for (int broj : niz) {
            if (broj == trazeni) { postoji = true; break; }
        }

        System.out.println(postoji
            ? "Broj " + trazeni + " postoji u nizu."
            : "Broj " + trazeni + " ne postoji u nizu.");

        unos.close();
    }
}