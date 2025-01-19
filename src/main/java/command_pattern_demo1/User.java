package command_pattern_demo1;

public class User {
    public static void main(String[] args){
        RemoteControl remoteControl = getRemoteControl();

        System.out.printf("Pressing Button onButton %d: ", 0);
        remoteControl.onButton(0);
        System.out.printf("Pressing Button offButton %d: ", 0);
        remoteControl.offButton(0);

        System.out.printf("Pressing Button onButton %d: ", 1);
        remoteControl.onButton(1);
        System.out.printf("Pressing Button offButton %d: ", 1);
        remoteControl.offButton(1);

        System.out.printf("Pressing Button onButton %d: ", 2);
        remoteControl.onButton(2);
        System.out.printf("Pressing Button offButton %d: ", 2);
        remoteControl.offButton(2);

    }

    public static RemoteControl getRemoteControl() {
        RemoteControl remoteControl = new RemoteControl();
        Light classLight = new Light();
        TV classTV = new TV();
        Radio classRadio = new Radio();

        LightOnCommand classLightOnCommand = new LightOnCommand(classLight);
        LightOffCommand classLightOffCommand = new LightOffCommand(classLight);

        TVOnCommand classTVOnCommand = new TVOnCommand(classTV);
        TVOffCommand classTVOffCommand = new TVOffCommand(classTV);

        RadioOnCommand classRadioOnCommand = new RadioOnCommand(classRadio);
        RadioOffCommand classRadioOffCommand = new RadioOffCommand(classRadio);

        remoteControl.setCommand(0, classLightOnCommand, classLightOffCommand);
        remoteControl.setCommand(1, classTVOnCommand, classTVOffCommand);
        remoteControl.setCommand(2, classRadioOnCommand, classRadioOffCommand);
        return remoteControl;
    }


}
