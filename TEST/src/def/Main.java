package def;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import def.Interface.InterfCzyRowne;
import def.Interface.InterfGen;
import def.Interface.InterfMax;
import def.Interface.InterfSuma;
import def.Interface.InterfWypisz;
import def.Interface.InterfWypiszArg;

public class Main {

	public static void main(String[] args) {
		InterfWypisz ref1= ()->System.out.println("Test");
		ref1.wypiszMetoda();
		InterfCzyRowne ref2 = (a,b)->a==b;
		System.out.println(ref2.czyRowneMetoda(3, 4));
		InterfWypiszArg ref3 = tekst->System.out.println(tekst);
		ref3.wypiszMetoda("Czyœ");
		InterfSuma ref4 = (a,b)->a+b;
		System.out.println(ref4.sumaMetoda(2, 3));
		InterfMax ref5 = tab->{
			int tmp=tab[0];
		for (int i=0;i<tab.length;i++) {
			if(tmp<tab[i]) {
				tmp=tab[i];
			}
		}
		return tmp;
		};
		int[] tab1 = {0,5,7,2,3,5,10};
		System.out.println(ref5.maxMetoda(tab1));
		
		InterfGen<Boolean,Double> ref6 = (a,b)->a==b;
		InterfGen<Double,Double> ref7 = (a,b)->a+b;
		System.out.println(ref6.metoda(2.0, 2.0));
		System.out.println(ref7.metoda(6.0, 5.0));
		
		Test test = new Test();
		test.metoda((t1, t2)->t1+" "+t2, "To","Ja");
		
		UnaryOperator<String> up1 = tekst-> tekst;
		System.out.println(up1.apply("Hej to ja"));
		
		BinaryOperator<Integer> bu1 = (a,b)->b-a;
		System.out.println(bu1.apply(2, 5));
		
		Consumer<Integer> con = t->System.out.println(t*t);
		con.accept(2);
		
		Supplier<Boolean> sup = ()->{return true;};
		System.out.println(sup.get());
		
		Function<Double,Double> fun = d1->(d1*d1*d1)-(d1+d1);
		System.out.println(fun.apply(5.0));
		
		Predicate<Integer> pre = int1->int1%3==0;
		System.out.println(pre.test(7));
		
	}

}
