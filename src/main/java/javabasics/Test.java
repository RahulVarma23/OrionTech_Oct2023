package javabasics;

public class Test {
    int a = 10;
    static int b;
    void m2() {
        int a =30;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a = 30;
        Test t = new Test();
        t.m2();  // 30 , 0
        System.out.println(t.a); //10
        System.out.println(a); //30
    }

}
