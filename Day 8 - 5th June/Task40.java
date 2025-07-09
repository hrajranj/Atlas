// Working of Abstraction in Java
abstract class Gadgets {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

class ACRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("AC is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

class FanRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

class CoolerRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("Cooler is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Cooler is turned OFF.");
    }
}

// Main class to demonstrate abstraction
public class Task40 {
    public static void main(String[] args) {
        Gadgets tv = new TVRemote();
        Gadgets ac = new ACRemote();
        Gadgets fan = new FanRemote();
        Gadgets cooler = new CoolerRemote();

        // TV
        tv.turnOn();
        tv.turnOff();

        // AC
        ac.turnOn();
        ac.turnOff();

        // Fan
        fan.turnOn();
        fan.turnOff();

        // Cooler
        cooler.turnOn();
        cooler.turnOff();
    }
}
