package lamb;

import java.util.function.BinaryOperator;

import lamb.Interface.InterfWypiszString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfWypiszString wypisz = tekst->tekst + "!";
		System.out.println(wypisz.wypiszNapisMetodaPlusWykrzyknik("Hej"));
		Kalkulator licz = new Kalkulator();
//		KalkulatorLicz wykonaj=(a,b,opcja)->{
//			if(opcja == "suma") {
//				return a+b;
//			}else if(opcja == "odejmij") {
//				return a-b;
//			}else if(opcja == "pomnoz") {
//				return  a*b;
//			}else if(opcja == "podziel") {
//				return a/b;
//			}else {
//				return 0;
//			}
//		};
		System.out.println("");
		BinaryOperator<Double> dodaj = (a,b)->a+b;
		BinaryOperator<Double> odejmij = (a,b)->a-b;
		BinaryOperator<Double> pomnoz = (a,b)->a*b;
		BinaryOperator<Double> podziel = (a,b)->a/b;
		
		System.out.println("2 + 3 = " + licz.wykonaj(2, 3, dodaj));
	}
}
