package lesson_6;

import org.w3c.dom.ls.LSOutput;

public class Task1 {

    public static void main(String[] args) {
        try{
            System.out.println(auth("asdasd", "asd3aSdas", "asd"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static boolean auth(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(login == null || password == null || confirmPassword == null) {
            throw new WrongLoginException("Login or password can't be empty!");
        }
        if(!login.matches("^(?!.* ).{1,19}$")) {
            throw new WrongLoginException();
        }
        if(!password.matches("^(?!.* )(?=.*\\d).{1,19}$") || !password.equals(confirmPassword)){
            throw new WrongPasswordException();
        }

        return true;
    }
}
