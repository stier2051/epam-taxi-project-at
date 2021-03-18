package exception;

public class NullSubjectByStudentException extends Exception{
    private String message;

    public NullSubjectByStudentException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
