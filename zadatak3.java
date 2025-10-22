package vjezbe22_10;

public class zadatak3 {

    public static void main(String[] args) {
        provjera();
    }

    public static void provjera() {
        String recenica = "Semir je majmun";
        boolean found = false; 

        for (int i = 0; i < recenica.length() - 1; i++) {
            if (recenica.charAt(i) == recenica.charAt(i + 1)) {
                System.out.println("Slovo koje se dva put za redom ponavlja je: " + recenica.charAt(i));
                found = true;
            }
        }

        if (!found) {
            System.out.println("U ovoj recenici nema slova koja se ponavljaju za redom.");
        }
    }
}
