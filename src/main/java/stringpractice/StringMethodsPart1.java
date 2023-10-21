package stringpractice;

public class StringMethodsPart1 {

    public static void main(String[] args) {
        String s = "Java-Java";

        //to find length of string
        int len = s.length();
//        System.out.println(len);
//
//        //find first char
//        System.out.println(s.charAt(0));
//
//        //uppercase
//        System.out.println(s.toUpperCase());
//
//        //lowercase
//        System.out.println(s.toLowerCase());
//
//        //concat
//        System.out.println(s.concat( "python"));
//
//        //comparison
//        System.out.println(s.equals("java"));
//
//        //comparison ignoring case
//        System.out.println(s.equalsIgnoreCase("JAVA"));
//
//        System.out.println(s.isEmpty());

        //index of char
//        System.out.println(s.indexOf('j'));
//        System.out.println(s.indexOf('J'));
//
//        for(int i=0;i<s.length();i++) {
//            System.out.print(s.charAt(i));
//        }
//
//        System.out.println();
//        //last index of
//        System.out.println(s.lastIndexOf('a'));
//        System.out.println(s.indexOf('a'));

//        System.out.println(s.startsWith("J")); // true
//        System.out.println(s.startsWith("a")); //false
//        System.out.println(s.contains("a")); //true
//        System.out.println(s.contains("e")); // false

        String s1 = "java";
        System.out.println(s1.replace('a', 'o'));

        String s2 = "java is a simple lan";
        System.out.println(s2.replace("java", "javascript"));

        String s3 = "JavA is a simple lAn";

       String ans= s3.replaceAll("^[A-Z]", "1");

        System.out.println(ans);

        String s4 = "JavA is a simple lAn";
        System.out.println(s4.replaceAll("\\s" , ""));

    }
}
