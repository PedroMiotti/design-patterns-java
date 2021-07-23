package structural.bridge;

public class MovieRemoteControl extends RemoteControl{

    public MovieRemoteControl(Device device) {
        super(device);
    }

    public void play(){
        device.play();
    }

    public void pause(){
        device.pause();
    }

    public void rewind(){
        device.rewind();
    }
}
