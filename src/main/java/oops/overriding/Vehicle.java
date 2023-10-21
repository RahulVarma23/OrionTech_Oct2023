package oops.overriding;

//Overriding happens when two classes are parent child relationship
//method name should be same
//no of params or type of params should be same
//return type should be same
//access modifiers of child class method should be same or wider than parent class method
//parent class final method cannot be overridden
//parent class static method cannot be overridden because they are bound to class
//(parent class static method will suppress child class static method)
public class Vehicle {

    public static void run() {
        System.out.println("Vehicle is running..");
    }

}
