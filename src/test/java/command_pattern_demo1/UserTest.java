package command_pattern_demo1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testing the Command pattern example")
public class UserTest {

    private Light classLight;
    private TV classTV;
    private Radio classRadio;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); // output capture
    private final PrintStream originalOut = System.out; // Original console output

    // method settings - SetUp
    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));              //  Redirection System.out
        RemoteControl remoteControl = User.getRemoteControl();   // Initialization RemoteControl
        classLight = new Light();                  // Initialization object Light
        classTV = new TV();                        // Initialization object TV
        classRadio = new Radio();                  // Initialization object Radio
    }

    // method setting -TearDown
    @AfterEach
    void tearDown() {
        System.setOut(originalOut); // Restoring the original output
        outContent.reset();         // Clearing the contents of captured output
    }

    @Test
    void testLightOnCommand() {
        //testing Light on command
        RemoteControl remoteControl = User.getRemoteControl();
        classLight.on();
        assertTrue(outContent.toString().contains("Light on"));

        //testing slot 0
        remoteControl.onButton(0);
        assertTrue(outContent.toString().contains("Light on"));

    }

    @Test
    void testLightOffCommand() {
        RemoteControl remoteControl = User.getRemoteControl();
        // testing Light off command
        classLight.off();
        assertTrue(outContent.toString().contains("Light off"));

        //testing slot 0
        remoteControl.offButton(0);
        assertTrue(outContent.toString().contains("Light off"));
    }

    @Test
    void testTVOnCommand() {
        RemoteControl remoteControl = User.getRemoteControl();
        // testing TV on command
        classTV.on();
        assertTrue(outContent.toString().contains("TV on"));

        // testing slot 1
        remoteControl.onButton(1);
        assertTrue(outContent.toString().contains("TV on"));
    }

    @Test
    void testTVOffCommand() {
        RemoteControl remoteControl = User.getRemoteControl();
        // testing TV off command
        classTV.off();
        assertTrue(outContent.toString().contains("TV off"));

        //testing slot 1
        remoteControl.offButton(1);
        assertTrue(outContent.toString().contains("TV off"));

    }

    @Test
    void testRadioOnCommand() {
        RemoteControl remoteControl = User.getRemoteControl();
        // testing Radio on command
        classRadio.on();
        assertTrue(outContent.toString().contains("Radio on"));

        //testing slot 2
        remoteControl.onButton(2);
        assertTrue(outContent.toString().contains("Radio on"));
    }
    @Test
    void testRadioOffCommand() {
        RemoteControl remoteControl = User.getRemoteControl();
        //testing Radio off command
        classRadio.off();
        assertTrue(outContent.toString().contains("Radio off"));

        // testing slot 2
        remoteControl.offButton(2);
        assertTrue(outContent.toString().contains("Radio off"));
    }

}