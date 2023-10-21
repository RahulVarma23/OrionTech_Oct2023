package arrayproblems;

public class FindFrequencyOfNum {

    public static void main(String[] args) {
        int [] arr = {1,3,4,6,7,8,0,9,3,3};
       int num =3;
        int count =0;

        for(int a : arr ) {
            if(a==num){
                count++;
            }
        }

        System.out.println(count);
        char [] chars = {'a' , 'b' , 'c'};
        for(char ch  : chars) {
            System.out.println(ch);
        }
    }
}
