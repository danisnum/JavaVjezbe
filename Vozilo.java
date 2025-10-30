package vjezbe30_10;

public class Vozilo {

	String Proizvodjac;
	int godinaProizvodnje;
	double kubikaza;
	String boja;
	double cijenaRegistracije;
	
	public Vozilo(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja) {
		super();
		this.Proizvodjac = proizvodjac;
		this.godinaProizvodnje = godinaProizvodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;
		this.cijenaRegistracije = 100.0;
	}


	public String getProizvodjac() {
		return Proizvodjac;
	}


	public double getCijenaRegistracije() {
		return cijenaRegistracije;
	}


	public void setCijenaRegistracije(double cijenaRegistracije) {
		this.cijenaRegistracije = cijenaRegistracije;
	}


	public void setProizvodjac(String proizvodjac) {
		this.Proizvodjac = proizvodjac;
	}


	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}


	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}


	public double getKubikaza() {
		return kubikaza;
	}


	public void setKubikaza(double kubikaza) {
		this.kubikaza = kubikaza;
	}


	public String getBoja() {
		return boja;
	}


	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	public void prikaziInfo() {
		System.out.println("Proizvodjac: " + Proizvodjac);
		System.out.println("Godina proizvodnje: " + godinaProizvodnje);
		System.out.println("Kubikaza: " + kubikaza);
		System.out.println("Boja: " + boja);
	}
	
	public boolean starijeOd() {
		if (godinaProizvodnje < 2010) {
			this.cijenaRegistracije += 30.0;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean kubikazaIznad() {
		if (kubikaza > 2000) {
			this.cijenaRegistracije += 50.0;
			return true;
		} else {
			return false;
		}
	}
}
