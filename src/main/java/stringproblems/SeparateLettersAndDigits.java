package stringproblems;

public class SeparateLettersAndDigits {

    // s = n12a%45m&#6a7n , o/p = naman124567%&#

    public static void main(String[] args) {
        String s ="n12A%45m&#6a7n" ;
        String num = "";
        String letters = "";
        String specialChars = "";

//        for(int i=0;i<s.length();i++) {
//            char ch = s.charAt(i);
//            if(Character.isLetter(ch)) {
//                letters=letters+ch;
//            }else if(Character.isDigit(ch)){
//                num=num+ch;
//            }else {
//                specialChars = specialChars+ch;
//            }
//        }

        //A-Z 65 -90 ,a-z 97 -122 , num 48-57

        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
                letters=letters+ch;
            }else if(ch>=48 && ch<=57){
                num=num+ch;
            }else {
               specialChars = specialChars+ch;
           }
        }

        System.out.println(letters+num+specialChars);

    }
}
