package lamb;

import java.util.function.BinaryOperator;

public class Kalkulator {
	
	public double wykonaj(double a, double b, BinaryOperator<Double> oper) {
		return (double) oper.apply(a, b);
	}
}
