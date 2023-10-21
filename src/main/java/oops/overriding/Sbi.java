package oops.overriding;

public class Sbi extends Bank{

    @Override
    public int getInterestRate() {
        return 8;
    }

    public static void main(String[] args) {
        Sbi sbi = new Sbi();
        System.out.println(sbi.getInterestRate());

        Hdfc h = new Hdfc();
        System.out.println(h.getInterestRate());

    }
}
