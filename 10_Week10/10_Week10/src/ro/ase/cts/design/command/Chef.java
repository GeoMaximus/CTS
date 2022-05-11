package ro.ase.cts.design.command;

public class Chef {
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public void cookPizza(String type) {
        System.out.println("Chef " + name + " is cooking " + type);
    }

    public void cookPasta(String type) {
        System.out.println("Chef " + name + " is cooking " + type);
    }
}
