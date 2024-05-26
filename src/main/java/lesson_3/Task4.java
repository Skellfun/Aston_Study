package lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        Arrays.stream(string.split("")).toList().forEach(s->{
            System.out.print(s);
            System.out.print(s);
        });
    }
}
