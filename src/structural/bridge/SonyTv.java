package structural.bridge;

public class SonyTv implements Device{

    @Override
    public void turnOn() {
        System.out.println("Sony: turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turn off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sony: set channel");
    }

    @Override
    public void play() {
        System.out.println("Sony: play");
    }

    @Override
    public void pause() {
        System.out.println("Sony: pause");

    }

    @Override
    public void rewind() {
        System.out.println("Sony: rewind");
    }
}
