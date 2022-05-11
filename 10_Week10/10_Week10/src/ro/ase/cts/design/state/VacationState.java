package ro.ase.cts.design.state;

public class VacationState implements IState{
    @Override
    public void act(String task) {
        System.out.println("The employee can not handle this");
    }
}
