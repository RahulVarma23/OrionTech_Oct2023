package oops.overriding;

public class Car extends Vehicle {


     public static void run() {
        System.out.println("Car is running..");
     }

    public static void main(String[] args) {
         Vehicle v = new Vehicle(); //A a = new A();
         v.run(); //vehicle ..
        Car c = new Car(); //B b = new B();
        c.run(); //car is running
        Vehicle c1 = new Car(); //A a = new B();
        c1.run(); //car is running
    }
}
