package javablocks;

public class Child extends Parent{

    static{
        System.out.println("child class static block");
    }

    {
        System.out.println("child class non-static block");
    }

    public Child() {
        System.out.println("child class constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
        Child c1 = new Child();
        Child c2 = new Child();
    }
}
