package command_pattern_demo1;

//Command for turning off the Radio
public class RadioOffCommand implements Command {

    private Radio radio;

    public RadioOffCommand (Radio radio){
        this.radio = radio;
    }
    @Override
    public void execute() {
        radio.off();

    }

    @Override
    public void undo() {
        radio.on();

    }
}
