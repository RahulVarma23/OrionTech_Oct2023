package oops.superthisdemo;

//this - used to refer current class instance var , method and constructor
//super - used to refer parent class instance var , method and constructor
public class ThisDemo extends Parent {

     int a;
     int b;

     public ThisDemo() {
         super();
         System.out.println("child constructor");
     }

     public void m1() {
         System.out.println("Cm1");
     }

     public void display() {
         super.m1();
         System.out.println(a +"->" +b );
     }

     public ThisDemo(int a , int b) {
        this.a=a;
        this.b=b;
     }

    public static void main(String[] args) {
        ThisDemo d = new ThisDemo(30, 40);
        ThisDemo d1 = new ThisDemo();
    }
}
