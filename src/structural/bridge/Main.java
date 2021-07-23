package structural.bridge;

public class Main {
    public static void main(String[] args){
        MovieRemoteControl movieRemoteControl = new MovieRemoteControl(new SamsungTv());
        movieRemoteControl.turnOn();
        movieRemoteControl.play();

        RemoteControl simpleRemoteControl = new RemoteControl(new SonyTv());
        simpleRemoteControl.turnOff();

        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(new SonyTv());
        advancedRemoteControl.turnOn();
        advancedRemoteControl.setChannel(5);
    }

}
