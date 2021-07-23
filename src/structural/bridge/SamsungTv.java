package structural.bridge;

public class SamsungTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("Samsung: turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: turn off");

    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Samsung: set channel");

    }

    @Override
    public void play() {
        System.out.println("Samsung: play");

    }

    @Override
    public void pause() {
        System.out.println("Samsung: pause");

    }

    @Override
    public void rewind() {
        System.out.println("Samsung: rewind");

    }
}
