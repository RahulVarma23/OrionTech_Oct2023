package javabasics;

import java.util.Scanner;

public class ScannerClassDemo {


    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=sc.next();
        System.out.println("Please enter your mobile number");
        long num=sc.nextLong();
        System.out.println("Please enter your height");
        float height=sc.nextFloat();
        System.out.println("Please enter your age");
        long age=sc.nextInt();
        System.out.println(name +" "+num+" "+age+" "+height);

    }
}
