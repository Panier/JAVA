package p1;

import java.util.GregorianCalendar;

public class PracAdmin extends Pracownik{
	private String etat;

	public PracAdmin(String imie, String nazwisko, GregorianCalendar DataZatr, int id, String etat) {
		super(imie, nazwisko, DataZatr, id);
		this.setEtat(etat);
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@Override
	public String getOpis() {
		// TODO Auto-generated method stub
		return null;
	}

}
