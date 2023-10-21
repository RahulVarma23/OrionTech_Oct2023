package exceptionhandling;

//InvalidAgeException
public class AgeValidator {

    private static void validateAge (int age) {
        if(age<18) {
            throw new InvalidAgeException("Not eligible for voting");
        }else{
            System.out.println("Eligible for voting");
        }
        System.out.println("rest of code");
    }

    public static void main(String[] args) {
        validateAge(19);
    }
}
