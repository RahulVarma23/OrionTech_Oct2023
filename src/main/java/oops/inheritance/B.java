package oops.inheritance;

public class B extends A {

    int y = 30;
    int z=40;

    void m2() {
        System.out.println("Bm2");
    }

    void m3() {
        System.out.println("Bm3");
    }

    public static void main(String[] args) {
        A a= new B();
        System.out.println(a.x);
        System.out.println(a.y);
        a.m1();
        a.m2();
    }
}
