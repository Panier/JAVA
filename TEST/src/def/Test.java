package def;

import def.Interface.InterfGen;

public class Test {

	public void wypisz() {
		System.out.print("Test");
	}
	
	//wypisz
	//()->System.out.print("Test"); Jedno polecenie, nie potrzebuje klamerek
	
	public boolean czyRowne(int a, int b) {
		return a==b;
	}
	
	//czyRowne (lambda)
	//(int a,int b)->{return a==b;} return zawsze potrzebuje klamaerek
	//(a,b)->a==b;
	
	public void wypisz(String tekst) {
		System.out.print(tekst);
	}
	
	//wypisz z parametrem
	//(String tekst)->System.out.println(tekst);
	//tekst->System.out.println(tekst);
	
	public double suma(double a, double b) {
		return a+b;
	}
	
	//suma
	//(a,b)->a+b;
	
	public int maks(int[] tab) {
		int tmp=tab[0];
		for (int i=0;i<tab.length;i++) {
			if(tmp<tab[i]) {
				tmp=tab[i];
			}
		}
		return tmp;
	}
	
	/*
	 * tab->{int tmp=tab[0];
	for (int i=0;i<tab.length;i++) {
		if(tmp<tab[i]) {
			tmp=tab[i];
		}
	}
	return tmp;
	}
*/
	
	public String nowaNazwa(String text1, String text2) {
		return text1+text2;
	}
	
	//(text1,text2)->text1+text2;
	
	public void metoda(InterfGen<String,String>ref,String teskt1,String tekst2) {
		System.out.println(ref.metoda(teskt1, tekst2));
	}
}
