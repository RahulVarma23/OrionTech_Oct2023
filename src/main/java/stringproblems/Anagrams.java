package stringproblems;

import java.util.Arrays;

public class Anagrams {

    //String s1 = tea  , s2 = eat
    //check whether both string are anagrams of each other

    public static void main(String[] args) {
        String s1 = "tea";
        String s2 = "ebt";

        if(s1.length() ==s2.length()) {
            char [] arr1 = s1.toLowerCase().toCharArray();
            char [] arr2 = s2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)) {
                System.out.println("both string are anagrams");
            }else{
                System.out.println("both string are NOT anagrams");
            }
         } else {
            System.out.println("both string are NOT anagrams");
         }
    }
}
