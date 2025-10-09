package vjezbe3;
public class MaksimumNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int[] posjete = {1500, 2300, 1800, 2500, 3000, 2800, 3200, 4000, 3500, 4500};
        int maxPosjeta = posjete[0];
        int indeksMax = 0;

        // Pronalaženje najveće posjete i njenog indeksa
        for (int i = 1; i < posjete.length; i++) {
            if (posjete[i] > maxPosjeta) {
                maxPosjeta = posjete[i];
                indeksMax = i;
            }
        }

        System.out.println("Najviše posjeta u jednoj utakmici: " + maxPosjeta);
        System.out.println("To je bila utakmica broj: " + (indeksMax + 1));
		
		
		
		
	}

}
