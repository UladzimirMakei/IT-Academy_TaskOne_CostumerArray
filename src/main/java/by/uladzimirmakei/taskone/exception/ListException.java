package by.uladzimirmakei.taskone.exception;

public class ListException extends Exception{
    public ListException() {
    }

    public ListException(String message) {
        super(message);
    }

    public ListException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListException(Throwable cause) {
        super(cause);
    }
}
