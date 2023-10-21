package stringproblems;

public class ReverseString {

    public static void main(String[] args) {
        String original = "naman";

        char [] arr = original.toCharArray();

        String ans = "";

        if(original.length()<=1) {
            ans=original;
        }

        for(int i=original.length()-1;i>=0;i--) {
            ans += arr[i];
        }
        System.out.println(ans);

        if(original.equals(ans)) {
            System.out.println(original+ " is palindrome");
        }else{
            System.out.println(original+ " is NOT palindrome");
        }

    }
}
