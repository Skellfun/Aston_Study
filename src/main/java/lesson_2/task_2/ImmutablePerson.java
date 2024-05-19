package lesson_2.task_2;

import java.util.Collections;
import java.util.List;

public class ImmutablePerson {
    private final String Name;
    private final int age;
    private final List<String> hobbies;

    public ImmutablePerson(String name, int age, List<String> hobbies) {
        Name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", age: " + this.getAge() + ", hobbies: " + String.join(", ", this.getHobbies());
    }
}
