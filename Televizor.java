package vjezbe2;


public class Televizor {
	    private int brojKanala;
	    private String nazivKanala;
	    private int jacinaTona;

	    public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
	        setBrojKanala(brojKanala);
	        setNazivKanala(nazivKanala);
	        setJacinaTona(jacinaTona);
	    }

	    public int getBrojKanala() {
	        return brojKanala;
	    }

	    public void setBrojKanala(int brojKanala) {
	        if (brojKanala >= 1) {
	            this.brojKanala = brojKanala;
	        } else {
	            throw new IllegalArgumentException("Broj kanala mora biti >= 1");
	        }
	    }

	    public String getNazivKanala() {
	        return nazivKanala;
	    }

	    public void setNazivKanala(String nazivKanala) {
	        this.nazivKanala = nazivKanala;
	    }

	    public int getJacinaTona() {
	        return jacinaTona;
	    }

	    public void setJacinaTona(int jacinaTona) {
	        if (jacinaTona >= 0 && jacinaTona <= 10) {
	            this.jacinaTona = jacinaTona;
	        } else {
	            throw new IllegalArgumentException("Jacina tona mora biti izmedju 0 i 10");
	        }
	    }

	    public void pojacajTon() {
	        if (jacinaTona < 10) {
	            jacinaTona++;
	        }
	    }

	    public void ispisi() {
	        System.out.println("Broj kanala: " + brojKanala);
	        System.out.println("Naziv kanala: " + nazivKanala);
	        System.out.println("Jacina tona: " + jacinaTona);
	    }
	}

