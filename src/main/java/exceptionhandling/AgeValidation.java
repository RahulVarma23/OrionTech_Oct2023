package exceptionhandling;

public class AgeValidation {

    private static void validateAge (int age) throws ArithmeticException {
        if(age<18) {
            throw new ArithmeticException("Not eligible for voting");
        }else{
            System.out.println("Eligible for voting");
        }
        System.out.println("rest of code");
    }

    public static void main(String[] args) {
        validateAge(16);
    }
}
