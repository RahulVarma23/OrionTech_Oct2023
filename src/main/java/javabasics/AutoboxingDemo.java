package javabasics;

public class AutoboxingDemo extends Object {
    public static void main(String[] args) {
       /* int num=10;
       Integer ii=num;
        Integer i2= 20;
        int num1=i2;

        Integer i= num;
        Integer i1 = Integer.valueOf(num);
        System.out.print(i);
        System.out.print(i1); System.out.print(num);
        */
        char c1='a';
        Character c2='b';
        //Autoboxing
        Character c3= c1;
        Object obj= new Object();

        //Unboxing
        char c4=c2;
        System.out.println(c1 + " "+c2+ " "+c3+" "+c4);

    }

    //Autoboxing
}
