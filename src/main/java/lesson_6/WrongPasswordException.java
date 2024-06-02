package lesson_6;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        super("Wrong password! Please repeat.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
