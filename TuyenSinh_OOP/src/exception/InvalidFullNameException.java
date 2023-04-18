package exception;

public class InvalidFullNameException extends IllegalArgumentException{
    public InvalidFullNameException(String msg) {
        super(msg);
    }
}
