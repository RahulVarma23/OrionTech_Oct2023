package oops.overriding;

public class Bike extends Vehicle{

    public static void run() {
        System.out.println("Bike is running..");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
