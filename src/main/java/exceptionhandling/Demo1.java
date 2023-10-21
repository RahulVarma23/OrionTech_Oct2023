package exceptionhandling;

import java.io.FileNotFoundException;

public class Demo1 {

    void display() throws ArithmeticException, NullPointerException, FileNotFoundException {
        Demo demo = new Demo();
        demo.print();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Demo1 demo = new Demo1();
        demo.display();

        int a =20;
        System.out.println(20);
    }
}
