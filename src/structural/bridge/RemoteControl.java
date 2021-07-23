package structural.bridge;

// Example = Global remote control

// Variations of remotes
// Basic remote ( turnOn, turnOff);
// Advanced remote (setChannel);
// Movie remote (play, pause, rewind);

/*
*Solution without the bridge pattern - Object hierarchy (For each brand we
* have a different implementation, so for every brand we have to create two
* more classes
 */
// RemoteControl
    // SonyRemoteControl
    // SamsungRemoteControl
    // AdvancedRemoteControl
        // SonyAdvancedRemoteControl
        // SamsungAdvancedRemoteControl

public class RemoteControl {
    /*
     * This field is the bridge between this two separate hierarchy. In this class we are
     * talking to the device interface, we don't care which brand the device is.
     */
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }
}
