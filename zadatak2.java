package vjezbe2;
import java.util.Scanner;
public class zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        // --- Unos osnovnih podataka o stazi ---
        System.out.println("Unesite koordinate centra staze (cx cy):");
        double cx = scanner.nextDouble();
        double cy = scanner.nextDouble();

        System.out.println("Unesite poluprecnike prstena R1 i R2:");
        double r1 = scanner.nextDouble();
        double r2 = scanner.nextDouble();
        
        // Osiguravamo da je r1 uvek manji od r2 radi lakšeg računanja
        if (r1 > r2) {
            double temp = r1;
            r1 = r2;
            r2 = temp;
            System.out.println("Poluprečnici su zamenjeni kako bi R1 bio manji.");
        }

        System.out.println("Unesite ukupan broj trkaca (N):");
        int n = scanner.nextInt();

        // --- Inicijalizacija promenljivih ---
        int brojTrkacaNaStazi = 0;
        double maxUdaljenostKvadrirana = -1.0; // Početna vrednost; -1 jer kvadrat razdaljine ne može biti negativan
        double najudaljenijiX = 0;
        double najudaljenijiY = 0;

        // --- Petlja za obradu svakog trkača ---
        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite koordinate za trkaca " + i + " (xi yi):");
            double xi = scanner.nextDouble();
            double yi = scanner.nextDouble();

            // Računanje kvadrata udaljenosti tačke (xi, yi) od centra (cx, cy)
            // Koristimo kvadrat da bismo izbegli računanje korena u svakom koraku (optimizacija)
            double udaljenostKvadrirana = Math.pow(xi - cx, 2) + Math.pow(yi - cy, 2);

            // 1. Provera za najudaljenijeg trkača (od svih unetih)
            if (udaljenostKvadrirana > maxUdaljenostKvadrirana) {
                maxUdaljenostKvadrirana = udaljenostKvadrirana;
                najudaljenijiX = xi;
                najudaljenijiY = yi;
            }

            // 2. Provera da li je trkač na stazi u gornjoj poluravni
            double r1Kvadriran = r1 * r1;
            double r2Kvadriran = r2 * r2;

            // Uslov 1: Udaljenost mora biti između R1 i R2 (uključujući granice)
            boolean jeUnutarPrstena = (udaljenostKvadrirana >= r1Kvadriran) && (udaljenostKvadrirana <= r2Kvadriran);
            
            // Uslov 2: y koordinata trkača mora biti veća ili jednaka y koordinati centra
            boolean jeUGornjojPoluravni = (yi >= cy);

            // Ako su oba uslova ispunjena, uvećaj brojač
            if (jeUnutarPrstena && jeUGornjojPoluravni) {
                brojTrkacaNaStazi++;
            }
        }

        // Zatvaramo scanner jer nam više nije potreban
        scanner.close();
		
		
		
		
		
	}

}
