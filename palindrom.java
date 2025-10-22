package vjezbe22_10;
import java.util.Scanner;
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrom();
	}
	public static void Palindrom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite rijec ili recenicu: ");
		String recenica = sc.nextLine().trim().replaceAll("\\s+", "").toLowerCase();
		StringBuilder obrnutaRecenica = new StringBuilder(recenica);
		String obrnuta = obrnutaRecenica.reverse().toString().trim().replaceAll("\\s+", "").toLowerCase();
		
		
		
		if(recenica.equals(obrnuta)) {
			System.out.println("Unesena rijec ili recenica je palindrom.");
		}else {
			System.out.println("Unesena recenica nije palindrom.");
		}
	}
}
