package p1;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		GregorianCalendar dataZatr1 = new GregorianCalendar(2000,10,10);
		GregorianCalendar dataKon1 = new GregorianCalendar(2015,10,10);
//		PracKatedry pracus1 = new PracKatedry("Tomasz","Hamerski",dataZatr1,1,dataKon1,1500);
//		PracKatedry pracus2 = new PracKatedry("Jan","Nowak",dataZatr1,1,dataKon1,1500);
//		PracKatedry pracus3 = new PracKatedry("Krzysztof","Kowalski",dataZatr1,1,dataKon1,1500);
		
		ArrayList<PracKatedry> pracownicyKatedry = new ArrayList<>();
		pracownicyKatedry.add(new PracKatedry("Tomasz","Hamerski",dataZatr1,1,dataKon1,1500));
		pracownicyKatedry.add(new PracKatedry("Jan","Nowak",dataZatr1,1,dataKon1,1500));
		pracownicyKatedry.add(new PracKatedry("Krzysztof","Kowalski",dataZatr1,1,dataKon1,1500));
		
		System.out.print(pracownicyKatedry.get(0).getImie()+ " " + pracownicyKatedry.get(0).getOpis() + "\n");
		
		System.out.print(pracownicyKatedry.get(1).getImie()+ " " + pracownicyKatedry.get(1).getOpis()+ "\n");
		
		System.out.print(pracownicyKatedry.get(2).getImie()+ " " + pracownicyKatedry.get(2).getOpis()+ "\n");

	}

}
