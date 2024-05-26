package lesson_3;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            strings.add(scanner.nextLine());
        }

        for (String string : strings){
            String[] words = string.split(" ");
            for(String word : words){
                Set<String> chars = new HashSet<>(Arrays.stream(word.split("")).toList());
                if(word.length() == chars.size()){
                    System.out.println(word);
                    return;
                }
            }
        }
    }
}
