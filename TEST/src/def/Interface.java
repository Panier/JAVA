package def;

public class Interface {
	interface InterfWypisz{
		void wypiszMetoda();
	}
	
	interface InterfCzyRowne{
		boolean czyRowneMetoda(double a, double b);
	}
	
	interface InterfWypiszArg{
		void wypiszMetoda(String tekst);
	}
	
	interface InterfSuma{
		int sumaMetoda(int a,int b);
	}
	
	interface InterfMax{
		int maxMetoda(int tab[]);
	}
	
	interface InterfGen<R,P>{
		R metoda(P param1,P param2);
	}

}
