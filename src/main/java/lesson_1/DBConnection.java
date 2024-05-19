package lesson_1;

public class DBConnection {
    static {
        System.out.println("Connecting to DB");
    }

    private static String connection = "connected";

    public static String getConnection(long userId) {
        return connection;
    }
}
