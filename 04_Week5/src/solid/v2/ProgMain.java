package solid.v2;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		AddOperation add = new AddOperation();
		DivideOperation divide = new DivideOperation();
		c.calculate(10, 2, add);
		System.out.println(c.calculate(2, 3, add));
		System.out.println(c.calculate(10, 5, divide));
	}

}
