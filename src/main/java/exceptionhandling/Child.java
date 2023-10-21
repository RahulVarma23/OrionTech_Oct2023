package exceptionhandling;

import java.io.FileNotFoundException;

public class Child extends Parent{

    @Override
     void print() throws FileNotFoundException {
        System.out.println("child print");
    }
}
