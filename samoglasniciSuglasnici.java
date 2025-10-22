package vjezbe22_10;

public class samoglasniciSuglasnici {

    public static void main(String[] args) {
        String recenica = "Ja se zovem Danis";
        int brojSamoglasnika = 0;
		int brojSuglasnika = 0;
        String samoglasnici = "aeiouAEIOU";

        for (int i = 0; i < recenica.length(); i++) {
            char c = recenica.charAt(i);

            if (samoglasnici.indexOf(c) != -1) {
                brojSamoglasnika++;
            }
        }

        System.out.println("Broj samoglasnika u recenici je: " + brojSamoglasnika);
        System.out.println("Broj suglasnika u recenici je: " + brojSuglasnika);
    }
}
