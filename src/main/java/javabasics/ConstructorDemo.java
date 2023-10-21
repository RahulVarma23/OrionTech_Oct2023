package javabasics;

public class ConstructorDemo {

    //default contructor or non parametrized
     ConstructorDemo(){
        System.out.println("Inside constructor");
    }
    ConstructorDemo(int num1)
    {

        System.out.println(num1);
    }
    ConstructorDemo(int num1, int num2)
    {
        System.out.println(num1+num2);
    }
    public static void main(String[] args) {
        ConstructorDemo c= new ConstructorDemo(); //object create
        System.out.println(c);
        ConstructorDemo c1= new ConstructorDemo(10); //10
        ConstructorDemo c2= new ConstructorDemo(10,20); //30
    }

}
