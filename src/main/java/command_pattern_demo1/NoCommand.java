package command_pattern_demo1;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println( "No Command is assigned to this slot");
    }

    @Override
    public void undo() {
        System.out.println( "No reversal order.");

    }
}
