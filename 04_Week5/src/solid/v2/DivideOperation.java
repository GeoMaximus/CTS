package solid.v2;

public class DivideOperation implements IOperationType {

	@Override
	public double calculate(double a, double b) {
		return a/b;
	}
	
}
