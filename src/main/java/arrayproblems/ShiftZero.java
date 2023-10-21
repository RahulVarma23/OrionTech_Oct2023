package arrayproblems;

import java.util.Arrays;

public class ShiftZero {

    public static void main(String[] args) {
        int [] arr = {2,0,1,0,0,3,2};

        //shift all zeros to right[2,1,3,2,0,0,0]

        int [] ans = new int[arr.length];
        int j = 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] !=0) {
                ans[j] =arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
