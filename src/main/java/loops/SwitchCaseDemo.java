package loops;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        String b = sc.next();

        switch (b) {
            case "a" : System.out.println("a");
            break;
            case "b": System.out.println("b");
            break;
            default: System.out.println("not in a or b");
        }
    }
}
