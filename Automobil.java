package vjezbe30_10;

public class Automobil extends Vozilo {

	String tipMotora;
	int brojVrata;
	
	
	
	public Automobil(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.tipMotora = tipMotora;
		this.brojVrata = brojVrata;
		
	}



	public String getTipMotora() {
		return tipMotora;
	}



	public void setTipMotora(String tipMotora) {
		this.tipMotora = tipMotora;
	}



	public int getBrojVrata() {
		return brojVrata;
	}



	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}

	@Override
	public void prikaziInfo() {
		super.prikaziInfo();
		System.out.println("Tip motora: " + tipMotora);
		System.out.println("Broj vrata: " + brojVrata);
	}
	
	public boolean jeDizel() {
		if (tipMotora == "dizel") {
			cijenaRegistracije += 20.0;
			return true;
		} else {
			return false;
		}
	}
	
}
