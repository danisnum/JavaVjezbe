package vjezbe3;

public class AnalizaNiza {
	
		   
		    public static double nadjiParniPozitivniProsjek(int[] niz) {
		        int suma = 0;
		        int broj = 0;

		        for (int element : niz) {
		            if (element > 0 && element % 2 == 0) {
		                suma += element;
		                broj++;
		            }
		        }

		        if (broj == 0) {
		            System.out.println("Nema pozitivnih parnih brojeva u nizu.");
		            return 0;
		        }

		        return (double) suma / broj;
		    		
	}

}
