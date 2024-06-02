package lesson_6;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
        super("Wrong login! Pleas repeat.");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
