package lesson_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String shortestString = "";
        String longestString = "";

        for (int i = 0; i < 3; i++) {
            String string = scanner.nextLine();
            shortestString = string.length() > shortestString.length() && !shortestString.isEmpty() ? shortestString : string;
            longestString = string.length() > longestString.length() ? string : longestString;
        }
        System.out.println("Самая длинная строка: " + longestString + ", её длина : " + longestString.length());
        System.out.println("Самая короткая строка: " + shortestString + ", её длина : " + shortestString.length());
    }
}
