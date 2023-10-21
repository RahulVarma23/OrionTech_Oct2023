package Package1;

public class Two extends One{

    static void  print() {
        System.out.println("Two");
    }


    public static void main(String[] args) {
        One one = new Two(); //A a = new B();
        one.print();
    }

}
