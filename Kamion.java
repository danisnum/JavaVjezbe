package vjezbe30_10;

public class Kamion extends Vozilo {

	
	int kapacitetTovara;
	boolean imaPrikolicu;
	
	public Kamion(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja, int kapacitetTovara,
			boolean imaPrikolicu) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.kapacitetTovara = kapacitetTovara;
		this.imaPrikolicu = imaPrikolicu;
	}

	public int getKapacitetTovara() {
		return kapacitetTovara;
	}

	public void setKapacitetTovara(int kapacitetTovara) {
		this.kapacitetTovara = kapacitetTovara;
	}

	public boolean isImaPrikolicu() {
		return imaPrikolicu;
	}

	public void setImaPrikolicu(boolean imaPrikolicu) {
		this.imaPrikolicu = imaPrikolicu;
	}
	
	@Override
	public void prikaziInfo() {
		super.prikaziInfo();
		System.out.println("Kapacitet tovara: " + kapacitetTovara + " kg");
		System.out.println("Ima prikolicu: " + (imaPrikolicu ? "Da" : "Ne"));
	}
	
	public boolean imaPrikolicu() {
		if (imaPrikolicu) {
			cijenaRegistracije += 50.0;
			return true;
		} else {
			return false;
		}
	}
}


