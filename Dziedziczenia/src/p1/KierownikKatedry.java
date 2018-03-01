package p1;

import java.util.GregorianCalendar;

public class KierownikKatedry extends PracNaukowy {

	public KierownikKatedry(String imie, String nazwisko, GregorianCalendar DataZatr, int id, GregorianCalendar zatrDo,
			int pensum) {
		super(imie, nazwisko, DataZatr, id, zatrDo, pensum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getOpis() {
		String opis = "Kierownik Katedry";
		return opis;
	}

}
