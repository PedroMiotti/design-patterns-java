package structural.bridge;

public interface Device {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
    void play();
    void pause();
    void rewind();
}
