package by.uladzimirmakei.taskone.exception;

public class ArrayReaderException extends Exception{
    public ArrayReaderException() {
    }

    public ArrayReaderException(String message) {
        super(message);
    }

    public ArrayReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayReaderException(Throwable cause) {
        super(cause);
    }
}
