package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(List.of("USA", "Canada", "Japan"));
        countries.add("Russia");
        countries.add("China");
        countries.add("Egypt");
        System.out.println(String.join(", ", countries));
        countries.set(1, "Peru");
        System.out.println(String.join(", ", countries));
        countries.remove(1);
        System.out.println(String.join(", ", countries));
        countries.remove("Canada");
        System.out.println(String.join(", ", countries));
        System.out.println(countries.contains("Japan"));
        System.out.println(countries.contains("Mexico"));
    }
}
