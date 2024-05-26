package lesson_4;

import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>(List.of("USA", "Canada", "Japan"));
        System.out.println(String.join(", ", countries));
        countries.addFirst("Japan");
        countries.addFirst("Peru");
        countries.addLast("China");
        countries.addLast("Mexico");
        System.out.println(String.join(", ", countries));
        countries.removeFirst();
        countries.removeLast();
        System.out.println(String.join(", ", countries));
        System.out.println(countries.getFirst());
        System.out.println(countries.getLast());
    }
}
