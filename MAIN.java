package vjezbe2;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Televizor tv = new Televizor(5, "National Geographic", 7);

        tv.ispisi();

        tv.pojacajTon();
        System.out.println("\nNakon pojacavanja tona:");
        tv.ispisi();

        tv.setNazivKanala("Discovery");
        tv.setBrojKanala(35);
        tv.setJacinaTona(9);

        System.out.println("\nNakon promjene kanala i jacine tona:");
        tv.ispisi();

	}

}
