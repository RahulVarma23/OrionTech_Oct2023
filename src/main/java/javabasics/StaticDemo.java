package javabasics;

public class StaticDemo {
    //static keyword used for variable/methods/blocks/nested class
    //static are directly associated with class.
    //static is memory efficient
    //static variables are stored as shared copy bcoz it gets memory allocated only once
    // static variables and methods-- direct calling
    int counter=1;
    void m(){
        System.out.println(counter);
        counter++;
    }
    StaticDemo (){
        System.out.println(counter);
        counter++;
    }
    public static void main(String[] args) {
        StaticDemo s= new StaticDemo();
        s.m(); //1
        StaticDemo s1= new StaticDemo();
        s1.m(); //1
        StaticDemo s2= new StaticDemo(); //1
        s2.m();
        StaticDemo s3= new StaticDemo(); //1
        s3.m();
    }
}
