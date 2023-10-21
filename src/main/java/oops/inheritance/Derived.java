package oops.inheritance;

public class Derived extends Base{
    int a =20;

    void print() {
        System.out.println("Derived");
    }

    public static void main(String[] args) {
        //A a = new B();
        Base a = new Base(); // A a = new A();
        Base b= new Derived(); // A a = new B();
        Derived c = new Derived(); // B b = new B();
        a.print(); //Base
        b.print(); //Derived
        c.print(); //Derived
    }


}
