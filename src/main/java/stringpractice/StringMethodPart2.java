package stringpractice;

public class StringMethodPart2 {

    public static void main(String[] args) {
        String s = "  JavA is a simple lAn    ";
        String s1 = s.trim();

        String [] arr =s1.split(" ");

//        for(String str:  arr) {
//            System.out.println(str);
//        }
//
//        for(int i=0;i<arr.length;i++) {
//            System.out.println(arr[i]);
//        }
//
//        String s2 ="java";
//
//        char [] charArr = s2.toCharArray();
//        System.out.println(charArr[0]);
//        System.out.println(s2.charAt(0));

        String s3  = "java is my fav lan";
//        char[]  array = s3.toCharArray();
//        System.out.println(array[array.length-1]);

        System.out.println(s3.contains("java"));

       String [] arr1= s3.split(" ");
        System.out.println(arr1[0].toUpperCase());
        System.out.println(s3.split(" ")[0].toLowerCase());

//        String s4  = "java is my fav lan";
//
//        //find index of java in s4
//        System.out.println(s4.indexOf("lan1"));

        String s5 = "java1234  javascript";
        System.out.println( s5.substring(1));

        System.out.println(s5.substring(0,s5.length()));


    }
}
