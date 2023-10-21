package arrayproblems;

public class CheckIfNoIsPresent {

    public static void main(String[] args) {
        int [] arr = {1,3,4,6,7,8,0,9,3,3};
        int input = 9;
        //9 -> true , 5 -> false
        boolean flag = false;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==input){
                flag=true;
                break;
            }
        }
        System.out.println(flag);
    }
}
