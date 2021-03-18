package exception;

public class NullFacultiesInUniversityException extends Exception{
    private String message;

    public NullFacultiesInUniversityException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
