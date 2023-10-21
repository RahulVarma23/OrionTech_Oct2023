package oops.abstraction;

public class Hdfc implements  Bank{


    @Override
    public void getMinBalance() {

    }

    @Override
    public void getInterestRate() {

    }

    @Override
    public void getInterestRateWithFd() {

    }

    @Override
    public void m1() {

    }

    public static void main(String[] args) {
        Bank hdfc = new Hdfc(); // A a = new B();
        hdfc.m3();
    }


}
