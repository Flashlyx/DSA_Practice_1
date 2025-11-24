package Exception_Handling.User_Exceptions;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {

      super(message);
    }
}
