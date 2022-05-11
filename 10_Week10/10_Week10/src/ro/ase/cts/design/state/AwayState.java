package ro.ase.cts.design.state;

public class AwayState implements IState{
    @Override
    public void act(String task) {
        System.out.println("The employee will prioritize this " + task);
    }
}
