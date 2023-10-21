package loops;

public class Factorial {

    static int len1;
    public static void main(String[] args) {
        int num = 5; //120 5*4*3*2*1

        int ans =1;
        for(int i=5 ;i>=1; i--) {
            ans = ans*i;
        }
        System.out.println(ans);

        int i=5;
        int ans1 = 1;
        while(i>=1){
            ans1= ans1*i;
            i--;
        }
        System.out.println(ans1);

        String s = "electrical";
        int count =0;
        int len = s.length();
        len1= s.replace("e" ,"").length();
        System.out.println(len-len1);


    }
}
