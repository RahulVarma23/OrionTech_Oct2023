package stringproblems;

public class AppendUnderscore {

    public static void main(String[] args) {
        String s = "ILoveMyIndia"; //o:p => I_L_oveM_yI_ndia
        String output="";

        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90) {
                output = output + ch + "0";
            }else{
                output = output +ch;
            }
        }
        System.out.println(output);
    }
}
