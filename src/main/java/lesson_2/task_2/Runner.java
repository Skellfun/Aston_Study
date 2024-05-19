package lesson_2.task_2;

import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> hobbies = Arrays.asList("Painting", "Sculpting", "Table Games");
        ImmutablePerson person = new ImmutablePerson("John", 32, hobbies);

        System.out.println(person);
        person.getHobbies().add("Football");
    }
}
