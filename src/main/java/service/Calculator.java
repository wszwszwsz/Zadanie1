package service;


import java.util.ArrayList;
import java.util.List;

import domain.Credit;

public class Calculator {

	Credit credit;
	List<Instalment> raport = new ArrayList<Instalment>();
	private double pay = 0;
	
	
	
	public List<Instalment> getRaport() {
		return raport;
	}

	public void setRaport(List<Instalment> raport) {
		this.raport = raport;
	}

	public Calculator(Credit credit) {
		super();
		this.credit = credit;
	}
	
	public void calculate(){
		for (int i = 0; i < credit.getIloscRat(); i++){
			if (credit.getRodzaj().equals("Stala")){
				obliczStalaRateKredytu(i);
			} else{
			obliczMalejacaRateKredytu(i);
			}
		}
	}
	private void obliczMalejacaRateKredytu(int i) {
		
		Instalment instalment = new Instalment();
		instalment.setId(i+1);
		instalment.setOplataStala(roundToDecimal(obliczCzescOplatyStalej ()));
		double finalPartCapital = credit.getKwotaKredytu() / credit.getIloscRat();
	    double finalPartInterest = finalPartCapital * (credit.getOproc() / 100);
	    double finalInstalment = finalPartCapital + finalPartInterest + instalment.getOplataStala();
	    instalment.setKwotaKapitalu(roundToDecimal(finalPartCapital));
	    instalment.setKwotaOdsetek(roundToDecimal(finalPartInterest));
	    instalment.setCalkowitaKwotaRaty(roundToDecimal(finalInstalment));
	    raport.add(instalment);
		
	}
	private void obliczStalaRateKredytu(int i) {
		
		Instalment instalment = new Instalment();
		instalment.setId(i+1);
		instalment.setOplataStala(roundToDecimal(obliczCzescOplatyStalej ()));
	    double obliczCzescKapitalowa = credit.getKwotaKredytu()/credit.getIloscRat();
        pay  = pay + obliczCzescKapitalowa;
        double obliczCzescOdsetkowa = (credit.getKwotaKredytu()-pay) *((credit.getOproc()/100)/12);
        double calkowitaCzescOplaty = obliczCzescKapitalowa + obliczCzescOdsetkowa + instalment.getOplataStala();
        instalment.setKwotaKapitalu(roundToDecimal(obliczCzescKapitalowa));
        instalment.setKwotaOdsetek(roundToDecimal(obliczCzescOdsetkowa));
        instalment.setCalkowitaKwotaRaty(roundToDecimal(calkowitaCzescOplaty));
        raport.add(instalment);
		
	}
	 private double obliczCzescOplatyStalej() {
	        double constantFeeFinal = credit.getKwotaKredytu()*(credit.getOplataStala()/100);
	        return constantFeeFinal/credit.getIloscRat();
	        
	}
	 private Double roundToDecimal (Double value){
	         return (double) Math.round(value * 100) / 100;
    }
}
