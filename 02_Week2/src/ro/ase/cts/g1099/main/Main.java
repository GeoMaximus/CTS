package ro.ase.cts.g1099.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.g1099.java.exceptions.IllegalTransferException;
import ro.ase.cts.g1099.java.models.AccountType;
import ro.ase.cts.g1099.java.models.BankAccount;
import ro.ase.cts.g1099.java.models.Banker;

public class Main {

	public static void main(String[] args) throws IllegalTransferException {
		System.out.println("Hello");
		
		List<BankAccount> accounts = new ArrayList<>();
		
		Banker abc = new Banker("ABC");
		
		BankAccount myDebit = abc.openAccount(AccountType.SAVINGS);
		BankAccount myCredit = abc.openAccount(AccountType.CURRENT);
		
		accounts.add(myCredit);
		accounts.add(myDebit);
		
		myCredit.tranfer(myDebit, 1000);

	}

}
