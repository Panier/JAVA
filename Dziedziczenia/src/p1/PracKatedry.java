package p1;

import java.util.GregorianCalendar;

public class PracKatedry extends PracNaukowy{

	public PracKatedry(String imie, String nazwisko, GregorianCalendar DataZatr, int id, GregorianCalendar zatrDo,
			int pensum) {
		super(imie, nazwisko, DataZatr, id, zatrDo, pensum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getOpis() {
		String opis = "Pracownik Katedry";
		return opis;
	}
	
}
