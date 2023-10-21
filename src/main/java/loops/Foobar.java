package loops;

public class Foobar {
    //if no is divisible by 3 then print Foo
    //if no is divisible by 5 then print Bar
    //if no is divisible by both 3 and 5 then print FooBar

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Foo");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Bar");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Foobar");
            } else {
                System.out.println(i);
            }
        }
    }
}
