package oops.abstraction;

public interface Bank {


      int a = 10;

     void getMinBalance();

     void getInterestRate() ;

     void getInterestRateWithFd();

      void m1();

      private void m2() {
          System.out.println("m2");
      }

      default void m3() {
          m2();
          System.out.println("m3");
      }
}
