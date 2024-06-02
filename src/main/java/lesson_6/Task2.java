package lesson_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();
        try {
            FileOutputStream fos = new FileOutputStream("src/main/resources/tms.txt");
            FileInputStream fis = new FileInputStream("src/main/resources/tms.txt");
            fos.write(string.getBytes(StandardCharsets.UTF_8));
            System.out.println(new String(fis.readAllBytes()).replace(" ", "_"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
