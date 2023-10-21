package javabasics;

public class VariableDemo {
   public int b =20; //variable declared within class is called as instance variable

   public static int c = 30;

    public void m1() {
        int a = 10; //variable declared within method is called local variable
        System.out.println(a);
        System.out.println(b);
    }

    public void m2() {
        System.out.println(b);
    }

    public static void main(String[] args) {
       VariableDemo variableDemo = new VariableDemo();
       variableDemo.m1();
       System.out.println(variableDemo.b);

        VariableDemo variableDemo1 = new VariableDemo();
        variableDemo1.b = 30;
    }

}
