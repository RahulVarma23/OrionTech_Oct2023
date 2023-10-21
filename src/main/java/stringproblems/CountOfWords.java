package stringproblems;

public class CountOfWords {

    public static void main(String[] args) {
        String s = "ILoveMyIndia"; // find count of word where each word starts will Uppercase
       //o/p: 4
        int count  = 0;
        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
