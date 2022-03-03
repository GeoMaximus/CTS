package ro.ase.cts.g1099.java.models;

import ro.ase.cts.g1099.java.exceptions.IllegalTransferException;
import ro.ase.cts.g1099.java.exceptions.InsufficientFundsException;

public abstract class BankAccount extends Account{
	
	protected double balance;
	protected String iban;
	
	public BankAccount(String iban) {
		this.iban = iban;
	}
	
	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void deposit(double amount) throws IllegalTransferException {
		if(amount <= 0) {
			throw new IllegalTransferException();
		}
		this.balance += amount;
		
	}

	@Override
	public void withdraw(double amount) throws IllegalTransferException {
		if(amount <= 0) {
			throw new IllegalTransferException();
		}
		if(amount> this.balance) {
			throw new InsufficientFundsException();
		}
		
		this.balance -= amount;
		
	}

	@Override
	public void tranfer(Account destination, double amount) throws IllegalTransferException {
		destination.deposit(amount);
		this.withdraw(amount);
		
	}
	
	
	
}
