package ro.ase.cts.g1099.java.models;

import ro.ase.cts.g1099.java.exceptions.IllegalTransferException;

public abstract class Account {
	public abstract void deposit(double amount) throws IllegalTransferException;
	public abstract void withdraw(double amount) throws IllegalTransferException;
	public abstract void tranfer(Account destination, double amount) throws IllegalTransferException;
	public abstract double getBalance();
}
