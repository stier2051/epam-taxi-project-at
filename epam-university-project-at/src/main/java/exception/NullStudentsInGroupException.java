package exception;

public class NullStudentsInGroupException extends Exception{
    private String message;

    public NullStudentsInGroupException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
