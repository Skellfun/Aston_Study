package lesson_4;

import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {

        HashSet<Person> persons = new HashSet<>();
        Person person1 = new Person("Nikita", 32);
        Person person2 = new Person("Gleb", 24);
        Person person3 = new Person("Vladimir", 29);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.forEach(System.out::println);
        System.out.println("----------");
        persons.remove(person1);
        persons.remove(person3);
        persons.forEach(System.out::println);
        System.out.println("----------");
        System.out.println(persons.contains(person2));

    }
}
