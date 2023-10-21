package javablocks;

public class Demo {

    int speed ;

    public Demo() {
        System.out.println("speed is :"+speed);
    }

    {
        System.out.println("non static block");
        speed =20;
    }

    void m1() {
        System.out.println("m1");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();
    }
}
