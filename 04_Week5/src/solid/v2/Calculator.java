package solid.v2;

public class Calculator {
	
	/*
	 * private enum Operations{ADD, SUBSTRACT,MULTIPLY, DIVIDE};
	 */

	
	/*public double calculate(double a, double b, int i) {
		switch(i) {
		case 1:
			return a+b;
		case 2:
			return a-b;
		case 3:
			return a*b;
		case 4:
			return a/b;
		default:
			return 0;
		}*/
		
	public double calculate(double a, double b, IOperationType op) {
		
		return op.calculate(a,b);
	
	}
}

