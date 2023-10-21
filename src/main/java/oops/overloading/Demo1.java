package oops.overloading;

public class Demo1 {

    public void print(int a) {
        System.out.println("print int");
    }

    public void print(double a) {
        System.out.println("print double");
    }

    public void print(long a) {
        System.out.println("print long");
    }

    public void print(float a) {
        System.out.println("print float");
    }

    public void print(String a) {
        System.out.println("print string");
    }

    public void print(boolean a) {
        System.out.println("print boolean");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.print(20);
        d.print("Rahul");
        d.print(3.14f);
        d.print(3.14);
        d.print(30000000L);
        d.print(false);
    }
}
