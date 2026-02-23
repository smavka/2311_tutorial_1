package Model;

public class MathUtils {

	public double subtract(double n1, double n2) {
		return n1-n2;
	}
	public double add(double n1,double n2) {
		return n1+n2;
	}
	public double multiply(double n1,double n2)
	{
		return n1*n2;
	}
	public double divide(double n1,double n2)
	{	
		if(Math.abs(n2-0)<10e-6)
			throw new ArithmeticException("Division by zero");
		return n1/n2;
	}

}
