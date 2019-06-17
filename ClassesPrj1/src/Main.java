// class is a template to create an object
// object is a physical instance of a class
class Bike {
    // Data or Attributes
    boolean power;
    int speed;

    // each object maintains its own state


    // Operations or Methods or Behavior
    void start() {
        this.power = true;
        this.speed = 0;
    }

    void stop() {
        this.power = false;
        this.speed = 0;
    }

    void acclerate(int newSpeed) {
        this.speed = newSpeed;
    }

    void printState() {
        System.out.println("Current state");
        System.out.println("Power: " + power);
        System.out.println("Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Bike b1, b2;

        // created an object of type Bike to reference b1
        // each reference has their own copy of attributes
        b1 = new Bike();
        b2 = new Bike();

        b1.start();
        b2.start();

        b1.acclerate(50);
        b1.printState();

        b2.printState();

    }
}