package vjezbe30_10;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vozilo v1 = new Vozilo("Opel", 2005, 1600, "Plava");
        v1.starijeOd();     
        v1.kubikazaIznad();  
        v1.prikaziInfo();
        System.out.println("Cijena registracije: " + v1.getCijenaRegistracije() + "€");
        

        // Testiranje klase Automobil
        Automobil a1 = new Automobil("Audi", 2018, 2200, "Siva");
        a1.setTipMotora("dizel");
        a1.setBrojVrata(4);
        a1.kubikazaIznad();  
        a1.jeDizel();        
        a1.prikaziInfo();
        System.out.println("Cijena registracije: " + a1.getCijenaRegistracije() + "€");
        

        // Testiranje klase Kamion
        Kamion k1 = new Kamion("Mercedes", 2009, 5000, "Bijela", 12000, true);
        k1.starijeOd();       
        k1.kubikazaIznad();   
        k1.imaPrikolicu();    
        k1.prikaziInfo();
        System.out.println("Cijena registracije: " + k1.getCijenaRegistracije() + "€");
         

        // Testiranje klase Kombi
        Kombi kombi1 = new Kombi("Volkswagen", 2015, 2400, "Crvena", 9);
        kombi1.kubikazaIznad();  
        kombi1.brojPutnika();    
        kombi1.prikaziInfo();
        System.out.println("Cijena registracije: " + kombi1.getCijenaRegistracije() + "€");
		
		
	}

}
