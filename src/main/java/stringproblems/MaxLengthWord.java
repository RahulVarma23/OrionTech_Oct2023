package stringproblems;

public class MaxLengthWord {

    public static void main(String[] args) {
        String s = "Java is a simple lan";
        String [] arr = s.split(" ");

        int maxLength = 0;
        String ans ="";

        for(String word :arr) {
            if(word.length()>maxLength) {
                maxLength = word.length();
                ans=word;
            }
        }
        System.out.println(maxLength);
    }
}
