package ro.ase.cts.design.command;

public class PizzaOrder implements ICommand{
    private Chef chef;
    private String name;

    public PizzaOrder(Chef chef, String name) {
        this.chef = chef;
        this.name = name;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void process() {
        this.chef.cookPizza(name);
    }
}
