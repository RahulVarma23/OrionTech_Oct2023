package loops;

import com.sun.security.jgss.GSSUtil;

public class PrintEvenNumbers {

    public static void main(String[] args) {
        for(int i=1; i<50; i++) {  //2
            if(i%2 !=0) {
                System.out.println("odd no " +i);
            }else{
                System.out.println("even no "+i);
            }
        }
    }
}
