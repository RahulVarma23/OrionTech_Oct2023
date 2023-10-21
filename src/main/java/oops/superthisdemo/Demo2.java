package oops.superthisdemo;

public class Demo2 extends Demo1 {

    @Override
    public void print() {
        System.out.println("Demo2 - print");
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.print();
    }
}
