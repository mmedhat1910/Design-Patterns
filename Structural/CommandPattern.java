package Structural;

// Client or Person
public class CommandPattern {

    public static void main(String[] args) {

        Bulb bedroomBulb = new Bulb("Bedroom");
        Bulb livingBulb = new Bulb("Living");

        TV bedroomTV = new TV("Bedroom", 32);
        TV livingTV = new TV("Living", 32);

        Command bedroomBulbOn = new LightsOn(bedroomBulb);
        Command bedroomBulbOff = new LightsOff(bedroomBulb);
        Command bedroomVolumeUp = new VolumeUp(bedroomTV);
        Command livingVolumeUp = new VolumeUp(livingTV);

        RemoteControl remote = new RemoteControl();

        remote.setButton1(bedroomBulbOn);
        remote.setButton2(bedroomBulbOff);
        remote.setButton3(bedroomVolumeUp);
        remote.setButton4(livingVolumeUp);

        remote.pressButton1();
        remote.pressButton2();
        remote.pressButton3();
        remote.pressButton4();
    }

}

interface Command {
    public void execute();
}

class RemoteControl {
    Command button1;
    Command button2;
    Command button3;
    Command button4;

    public void setButton1(Command button) {
        this.button1 = button;
    }

    public void setButton2(Command button) {
        this.button2 = button;
    }

    public void setButton3(Command button) {
        this.button3 = button;
    }

    public void setButton4(Command button) {
        this.button4 = button;
    }

    public void pressButton1() {
        button1.execute();
    }

    public void pressButton2() {
        button2.execute();
    }

    public void pressButton3() {
        button3.execute();
    }

    public void pressButton4() {
        button4.execute();
    }

}

class LightsOn implements Command {
    Bulb bulb;

    public LightsOn(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.lightsOn();
    }

}

class LightsOff implements Command {
    Bulb bulb;

    public LightsOff(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.lightsOff();
    }

}

class VolumeUp implements Command {
    TV tv;

    public VolumeUp(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        this.tv.volumeUp();
    }

}

class TV {

    String name;
    int size;
    int currentVolume;
    int currentChannel;

    public TV(String name, int size) {
        this.name = name;
        this.size = size;
        currentVolume = 0;
        currentChannel = 0;
    }

    public void turnOn() {
        System.out.println("TV " + this.name + " " + this.size + " inches is on!");
    }

    public void turnOff() {
        System.out.println("TV " + this.name + " " + this.size + " inches is off!");
    }

    public void volumeUp() {
        currentVolume++;
        System.out.println("Volume of TV " + this.name + " is up");
    }

    public void volumeDown() {
        currentVolume--;
        System.out.println("Volume of TV " + this.name + " is down");
    }

    public void channelUp() {
        currentChannel++;
        System.out.println("Channel of TV " + this.name + " is " + currentChannel);
    }

    public void channelDown() {
        currentChannel--;
        System.out.println("Channel of TV " + this.name + " is " + currentChannel);
    }
}

class Bulb {
    String name;

    public Bulb(String name) {
        this.name = name;
    }

    public void lightsOn() {
        System.out.println("light of bulb " + this.name + " is on!");
    }

    public void lightsOff() {
        System.out.println("light of bulb " + this.name + " is off!");
    }
}