package lesson_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 1, 1, new HashMap<>(Map.of("Math", 4, "English", 5, "Programming", 5, "Philosophy", 4)));
        Student student2 = new Student("German", 1, 2, new HashMap<>(Map.of("Math", 3, "English", 3, "Programming", 2, "Philosophy", 3)));
        Student student3 = new Student("Artur", 2, 1, new HashMap<>(Map.of("Math", 5, "English", 5, "Programming", 5, "Philosophy", 5)));
        Student student4 = new Student("Michal", 1, 3, new HashMap<>(Map.of("Math", 2, "English", 3, "Programming", 3, "Philosophy", 5)));
        Student student5 = new Student("Roman", 1, 1, new HashMap<>());
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println(students);
        removeBadStudents(students);
        System.out.println(students);
        printStudents(students, 2);

    }

    private static void removeBadStudents(List<Student> students){
        for (int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            double averageMark = student.getMarks().values()
                    .stream().mapToInt(Integer::intValue)
                    .average().orElse(2);
            if(averageMark < 3) {
                students.remove(i--);
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    private static void printStudents(List<Student> students, int course){
        students.stream().filter(student -> student.getCourse() == course).forEach(student -> System.out.println(student.getName()));
    }
}
