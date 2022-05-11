package ro.ase.cts.design.state;

public class WorkingState implements IState{
    @Override
    public void act(String task) {
        System.out.println("The employee works on this: " + task);
    }
}
