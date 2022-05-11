package ro.ase.cts.design.main;

import ro.ase.cts.design.command.Chef;
import ro.ase.cts.design.command.PastaOrder;
import ro.ase.cts.design.command.PizzaOrder;
import ro.ase.cts.design.command.Waiter;
import ro.ase.cts.design.state.EState;
import ro.ase.cts.design.state.Employee;
import ro.ase.cts.design.template.InsuranceProcedure;

public class Main {
    public static void main(String[] args) {
        //CHAIN OF RESPONSIBILITY

        //STATE
        Employee emp = new Employee();
        emp.setState(EState.AWAY);
        emp.processTask("server down");

        //TEMPLATE
        InsuranceProcedure insurance = new InsuranceProcedure();
        insurance.getInsurance();

        //COMMAND
        Chef chef1 = new Chef("John");
        Chef chef2 = new Chef("Mike");
        Waiter waiter = new Waiter();
        waiter.noteCommand(new PizzaOrder(chef1, "Pizza1"));
        waiter.noteCommand(new PastaOrder(chef2, "Pasta1"));
        waiter.noteCommand(new PizzaOrder(chef1, "Pizza2"));

        waiter.sendCommands();


    }
}
