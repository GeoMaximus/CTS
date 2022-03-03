package ro.ase.cts.g1099.java.exceptions;

public class InsufficientFundsException extends RuntimeException {

	public InsufficientFundsException(String msg) {
		super(msg);
	}
	
	public InsufficientFundsException() {
		super();
	}
	
}
