package exception;

public class NullGroupsInFacultyException extends Exception{
    private String message;

    public NullGroupsInFacultyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
