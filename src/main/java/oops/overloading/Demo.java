package oops.overloading;


//overloading happens in a same class
//doesn't require parent child relationship
//method name should be same and parameters should be diff(no of params or type of param)
//return type can be anything
//access modifiers and non-access modifiers can be anything
public class Demo {

    public int sum(int a , int b) {
        int c = a+b;
        return c;
    }

    public void sum(int a , int b, int c) {
        System.out.println(a+b+c);
    }

    public void sum(double a, double b) {
        System.out.println(a+b);
    }

     void sum(double a, int  b) {
        System.out.println(a+b);
    }

    private void sum(double a, long  b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
       int ans= d.sum(10,20);
        d.sum(10,20, 30);
        d.sum(2.0,3.0);
    }
}
