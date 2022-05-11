package ro.ase.cts.design.state;

public class Employee {
    String name;
    double currentState;
    IState state;

    public Employee() {
        this.state = new WorkingState();
    }

    public Employee(String name, double salary, IState state) {
        this.name = name;
        this.currentState = salary;
        this.state = state;
    }

    public void setState(EState state) {
        switch(state) {
            case WORKING:
                this.state = new WorkingState();
                break;
            case AWAY:
                this.state = new AwayState();
                break;
            case VACATION:
                this.state = new VacationState();
                break;
            default:
                this.state = new WorkingState();
        }
    }

    public void processTask(String task) {
        this.state.act(task);
    }
}
