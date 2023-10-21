package exceptionhandling;

public class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(String s) {
        super(s);
    }
}
