package lesson_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = Stream.generate(() ->random.nextInt(20)).limit(40).toList();
        System.out.println(list.stream().distinct().filter(i -> i % 2 == 0).count());
    }
}
