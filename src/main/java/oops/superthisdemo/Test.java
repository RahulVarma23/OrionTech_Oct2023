package oops.superthisdemo;

import oops.abstraction.Bank;

public class Test {

    int a=10;

    public Test() {
        System.out.println("non parametermized");
    }

    public Test(int a ,  int b) {
        System.out.println("non parametermized");
    }

    public Test(int a) {
        this(10,20);
        this.m1();
        System.out.println("parametermized");
    }
    
    public void m1() {
        System.out.println("m1");
    }
    
    public static void main(String[] args) {

        Test t = new Test(10);

    }


}
