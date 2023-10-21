package arrayproblems;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int [] array = new int[8];
        int num =1;

        for(int i=0;i<array.length;i++) {
            array[i] =num;
            num++;
        }
        System.out.println(Arrays.toString(array));
    }
}
