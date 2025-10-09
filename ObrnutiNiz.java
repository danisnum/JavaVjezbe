package vjezbe3;

public class ObrnutiNiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] niz = new int[10]; // niz od 10 cijelih brojeva

        // Popunjavanje niza brojevima od 1 do 10
        for (int i = 0; i < niz.length; i++) {
            niz[i] = i + 1;
        }

        // Ispis u obrnutom redoslijedu
        System.out.println("Niz u obrnutom redoslijedu:");
        for (int i = niz.length - 1; i >= 0; i--) {
            System.out.print(niz[i] + " ");
        }
		
		
	}

}
