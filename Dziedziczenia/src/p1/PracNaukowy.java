package p1;

import java.util.GregorianCalendar;

public abstract class PracNaukowy extends Pracownik {

	private GregorianCalendar zatrDo;
	private int pensum;
	
	public PracNaukowy(String imie, String nazwisko, GregorianCalendar DataZatr, int id, GregorianCalendar zatrDo, int pensum) {
		super(imie, nazwisko, DataZatr, id);
		this.zatrDo = zatrDo;
		this.pensum = pensum;
	}
	
	
}
