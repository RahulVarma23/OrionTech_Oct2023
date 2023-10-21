package stringpractice;

public class Demo {

    //string constant pool
    //string is immutable

    //ascii - 65 -90 -> A-Z
    //ascii - 97 -122 -> a-z
    //ascii - 48 -57 -> 0-9

    // == -> memory ref
    // .equals -> content comparison
    public static void main(String[] args) {
        int b = 'A';
        int c = 'Z';
        int d = '9';
        int e = '&';
        int f = 'b';

        char x =33;
        char a =65;

        System.out.println(x);
        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);

        String s = "java";
        String s1 = "java";
        String s2 = new String("java");
        String s3 = new String("java");

        System.out.println(s==s1);  //true
        System.out.println(s.equals(s1)); //true
        System.out.println(s2==s3); //s-true a-false
        System.out.println(s2.equals(s3)); // true
        System.out.println(s1==s2); //s-true a-false
    }
}
