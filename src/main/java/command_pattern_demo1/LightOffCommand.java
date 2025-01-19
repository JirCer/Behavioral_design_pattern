package command_pattern_demo1;



//Command for turning off the light
public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();

    }

    @Override
    public void undo() {
        light.on();

    }
}
