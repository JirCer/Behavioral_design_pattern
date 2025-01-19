package command_pattern_demo1;

import java.util.Arrays;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 3; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButton(int slot) {
        onCommands[slot].execute();
    }
    public void offButton(int slot) {
        offCommands[slot].execute();
    }
    public void undoButton() {
        for (int i = 0; i < 3; i++) {
            onCommands[i].undo();
            offCommands[i].undo();
        }
    }

}
