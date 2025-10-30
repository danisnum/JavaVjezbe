package vjezbe30_10;

public class Kombi extends Vozilo {

	
	int kapacitetPutnika;
	
	public Kombi(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja, int kapacitetPutnika) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.kapacitetPutnika = kapacitetPutnika;
	}

	public int getKapacitetPutnika() {
		return kapacitetPutnika;
	}

	public void setKapacitetPutnika(int kapacitetPutnika) {
		this.kapacitetPutnika = kapacitetPutnika;
	}
	
	
	@Override
	public void prikaziInfo() {
		super.prikaziInfo();
		System.out.println("Kapacitet putnika: " + kapacitetPutnika + " osoba");
	}
	
	public boolean brojPutnika() {
		if (kapacitetPutnika >= 8) {
			cijenaRegistracije += 30.0;
			return true;
		} else {
			return false;
		}
	}
}
