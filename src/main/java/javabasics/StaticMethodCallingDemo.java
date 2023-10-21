package javabasics;

public class StaticMethodCallingDemo {
    int num=10;
    static int num1=20;
    static void m1(){
        System.out.println("Rahul");
    }
    void m2(){
        System.out.println("Sid");
        m1();
    }
    void m3(){
        m2();
    }

    public static void main(String[] args) {
        StaticMethodCallingDemo s= new StaticMethodCallingDemo();
        m1();  // static methods are bound with class
        System.out.println(num1);
        System.out.println(s.num);
        s.m2(); // non-static methods are bound to class object
    }
}
