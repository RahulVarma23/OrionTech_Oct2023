package oops.abstraction;

public abstract class Parent {

    public Parent() {
        System.out.println("parent constructor");
    }

    public Parent(int a) {
        System.out.println(a);
    }

    int a = 10;

    abstract void m1();

    abstract int m3(int a , int b);

    public void m2() {
        System.out.println(a);
        System.out.println("m2");
        m4();
    }

    private void m4() {

    }


}
