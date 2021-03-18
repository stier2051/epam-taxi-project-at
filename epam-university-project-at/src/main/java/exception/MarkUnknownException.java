package exception;

public class MarkUnknownException extends Exception{
    private String message;

    public MarkUnknownException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
