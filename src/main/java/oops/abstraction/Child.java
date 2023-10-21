package oops.abstraction;

public class Child extends Parent{

    public Child() {
        super(10);
        System.out.println("child constructor");
    }

    @Override
    void m1() {

    }

    @Override
    int m3(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Child c = new Child();
//       int sum= c.m3(10,20);
//        System.out.println(sum);


    }
}
