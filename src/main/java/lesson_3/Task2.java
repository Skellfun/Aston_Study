package lesson_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumLength = 0;
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String string = scanner.nextLine();
            strings.add(string);
            sumLength += string.length();
        }

        int averageLength = sumLength / strings.size();
        for (String s : strings){
            if(s.length() < averageLength){
                System.out.println(s);
            }
        }
    }
}
