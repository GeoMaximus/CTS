package ro.ase.cts.design.command;

import java.util.ArrayList;

public class Waiter {
    private ArrayList<ICommand> commands = new ArrayList<>();

    public void noteCommand(ICommand command) {
        commands.add(command);
    }

    public void sendCommands() {
        for(ICommand c : commands) {
            c.process();
        }
        commands.clear();
    }
}
