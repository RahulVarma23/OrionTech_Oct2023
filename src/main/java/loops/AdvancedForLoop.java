package loops;

import java.util.List;

public class AdvancedForLoop {

    public static void main(String[] args) {
        int arr [] = {1,2,3,5,6,7,2,-1};

//        for(int i=arr.length-1;i>=0;i--) {
//            System.out.println(arr[i]);
//        }

//        for(int num :arr) {
//            if(num%2 !=0) {
//                System.out.println(num);
//            }
//        }

        List<Integer> list = List.of(1,3,55,3,4);
        for(int a: list) {
            if(a%2!=0){
                System.out.println(a);
            }
        }

    }
}
