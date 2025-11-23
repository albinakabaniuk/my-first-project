package lesson_30_interfaces;

public class StackUnderflowException extends RuntimeException {
    public StackUnderflowException(String message) {
        super(message);
    }
}
