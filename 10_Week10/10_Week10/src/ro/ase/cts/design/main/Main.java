package ro.ase.cts.design.main;

import ro.ase.cts.design.state.EState;
import ro.ase.cts.design.state.Employee;

public class Main {
    public static void main(String[] args) {
        //CHAIN OF RESPONSIBILITY

        //STATE
        Employee emp = new Employee();
        emp.setState(EState.AWAY);
        emp.processTask("server down");

        //TEMPLATE


    }
}
