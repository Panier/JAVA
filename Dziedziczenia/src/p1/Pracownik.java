package p1;

import java.util.GregorianCalendar;

public abstract class Pracownik {

	private String imie;
	private String nazwisko;
	private GregorianCalendar dataZatr;
	private final int nextId = 1;
	private int id;
	private double pensja;
	
	public Pracownik(String imie, String nazwisko, GregorianCalendar DataZatr, int id) {
		this.nazwisko = nazwisko;
		this.imie = imie;
		this.dataZatr = DataZatr;
		this.id = id;
		
	}
	
	
	public abstract String getOpis();
	public String getImie() {
		return imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public GregorianCalendar getDataZatr() {
		return dataZatr;
	}
	public void setDataZatr(GregorianCalendar dataZatr) {
		this.dataZatr = dataZatr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPensja() {
		return pensja;
	}
	public void setPensja(double pensja) {
		this.pensja = pensja;
	}
	
}
