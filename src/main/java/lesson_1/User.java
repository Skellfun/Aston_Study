package lesson_1;

import java.util.HashMap;
import java.util.List;

public class User {

    {
        userCount++;
    }
    private static long userCount = 0;
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return "*******";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashMap<String, String> getInfo(){
        System.out.println(DBConnection.getConnection(12));
        return new HashMap<>();
    }

    public static long getUserCount() {
        return userCount;
    }
}
