package customexception;

public class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
