package domain;

public class Credit {

	private double kwotaKredytu; 
	private int iloscRat; 
	private double oproc;
	private double oplataStala;
	private String rodzaj;
	
	
	public Credit(double kwotaKredytu, int iloscRat, double oproc, double oplataStala, String rodzaj) {
		super();
		this.kwotaKredytu = kwotaKredytu;
		this.iloscRat = iloscRat;
		this.oproc = oproc;
		this.oplataStala = oplataStala;
		this.rodzaj = rodzaj;
	}
	
	public double getKwotaKredytu() {
		return kwotaKredytu;
	}
	public void setKwotaKredytu(double kwotaKredytu) {
		this.kwotaKredytu = kwotaKredytu;
	}
	public int getIloscRat() {
		return iloscRat;
	}
	public void setIloscRat(int iloscRat) {
		this.iloscRat = iloscRat;
	}
	public double getOproc() {
		return oproc;
	}
	public void setOproc(double oproc) {
		this.oproc = oproc;
	}
	public double getOplataStala() {
		return oplataStala;
	}
	public void setOplataStala(double oplataStala) {
		this.oplataStala = oplataStala;
	}
	public String getRodzaj() {
		return rodzaj;
	}
	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	} 
	
	
}
