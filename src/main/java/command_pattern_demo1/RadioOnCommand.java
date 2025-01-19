package command_pattern_demo1;

//Command for turning on the Radio
public class RadioOnCommand implements Command {
    private Radio radio;
    public RadioOnCommand(Radio radio){
        this.radio = radio;

    }

    @Override
    public void execute() {
        radio.on();

    }

    @Override
    public void undo() {
        radio.off();

    }
}
