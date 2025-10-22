package vjezbe22_10;
import java.util.Scanner;
public class unosenjeRecenice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unosenjeRecenice();
	}
	public static void unosenjeRecenice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		String recenica = sc.nextLine().trim().replaceAll("\\s+", " ");
		
		int count = 0;
		for(int i = 0; i < recenica.length(); i++) {
			if(recenica.charAt(i) == ' ') {
				count++;
			}
		}
		if (count == 0 && recenica.isEmpty()) {
			System.out.println("Broj rijeci u recenici je: 0");
			return;
		}else {
			System.out.println("Broj rijeci u recenici je: " + (count + 1));
		}
	}

}
