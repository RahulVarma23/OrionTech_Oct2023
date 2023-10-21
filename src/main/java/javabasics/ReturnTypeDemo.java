package javabasics;

public class ReturnTypeDemo {

    //Return type -int/float/double/String/Array/Integer etc
    //void is a return type which returns nothing

     void m1(){

    }
    /*long add(){
         int num1=10;
         int num2=20;
         int sum=num1+num2;
        return sum;
    }*/
    //method which accepts parameter
    int add(int num1, int num2 , int num3){
        int sum=num1+num2+num3;
        return sum;
    }
   int multiply(int num1 , int num2){
      return num1*num2;
   }
    ReturnTypeDemo(){

    }
    public static void main(String[] args) {
        ReturnTypeDemo  r= new ReturnTypeDemo(); //object create
        //System.out.println(r.add(10,20,30));
        System.out.println(r.multiply(12,20));
    }
}
