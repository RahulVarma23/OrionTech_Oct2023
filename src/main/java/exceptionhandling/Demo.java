package exceptionhandling;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {

      void print() throws FileNotFoundException {
          File file = new File("fiklle");
          FileInputStream fileInputStream = new FileInputStream(file);
    }

}
