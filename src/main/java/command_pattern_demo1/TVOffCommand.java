package command_pattern_demo1;




//Command for turning off the TV
public class TVOffCommand implements Command {
    private TV tv;
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();

    }

    @Override
    public void undo() {
        tv.on();

    }
}
