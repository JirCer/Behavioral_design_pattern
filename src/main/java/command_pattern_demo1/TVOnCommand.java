package command_pattern_demo1;




//Command for turning on the TV
public class TVOnCommand implements Command {
    private TV tv;
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();

    }

    @Override
    public void undo() {
        tv.off();

    }
}
