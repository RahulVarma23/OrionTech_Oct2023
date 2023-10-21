package javablocks;

public class Parent {

    static{
        System.out.println("parent class static block");
    }

    {
        System.out.println("parent class non-static block");
    }

    public Parent() {
        System.out.println("parent class constructor");
    }
}
