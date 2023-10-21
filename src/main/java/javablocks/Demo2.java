package javablocks;

public class Demo2 {

    final static int  a ;

    public Demo2() {
        System.out.println("constructor");
        System.out.println("a is: "+a);
    }

    static {
        System.out.println("static block1");
        a=20;
    }

    static {
        System.out.println("static block2");
    }

     {
         System.out.println("non static block1");
    }

    {
        System.out.println("non static block2");
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();

    }
}
