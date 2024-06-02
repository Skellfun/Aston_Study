package lesson_6;

import org.w3c.dom.ls.LSOutput;

public class Task1 {

    public static void main(String[] args) {
        try{
            auth("asdasd", "asd1asdas", "asd");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static boolean auth(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(login.length() >= 20) {
            throw new WrongLoginException();
        }
        if(password.length() >= 20 || !password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,20}$") || !password.equals(confirmPassword)){
            throw new WrongPasswordException();
        }

        return true;
    }
}
