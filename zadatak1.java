package vjezbe2;
import java.util.Scanner;
public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long D = sc.nextLong();
		long HD = sc.nextLong();
		long KA = sc.nextLong();
		int broj_prijetnji = 0;
		
		
		for (int i=0; i<N; i++) {
			
			long x =sc.nextLong();
			long y = sc.nextLong();
			
			long Menheten = Math.abs(x) + Math.abs(y);
			
			if(Menheten <= D) {
				broj_prijetnji++;
			}
			
		long totalDamage = broj_prijetnji * KA;
		System.out.println(broj_prijetnji);
		System.out.println(totalDamage);
		
	
		}
		
		
		
	}

}
