package loops;

public class NestedLoopDemo {

    public static void main(String[] args) {
        int age =20;
        int weight = 49;

        if(age>=20){
            if(weight>=50){
                System.out.println("I am eligible for blood donation");
            }else {
                System.out.println("I am not eligible for blood donation");
            }
        }

        for(int i = 1;i<=10;i++) {
            for(int j =2;j<=5;j++) {
                System.out.println(i+ " " + j);
            }
        }

    }
}
