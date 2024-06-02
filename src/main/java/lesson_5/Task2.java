package lesson_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args) {
        List<Employee> employees = generateEmployeeList(20);
        employees.forEach(System.out::println);
        System.out.println(ageOver30AndSort(employees));
        System.out.println(countByDepartment(employees, "IT"));
        System.out.println(getMaxSalary(employees));
        System.out.println(employeesFromHR(employees));
        System.out.println(getAverageSalary(employees));
    }

    private static List<Employee> generateEmployeeList(int count){
        return Stream.generate(Employee::new).limit(count).toList();
    }

    private static List<Employee> ageOver30AndSort(List<Employee> employees){
        return employees.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparingInt(Employee::getAge)).toList();
    }

    private static Long countByDepartment(List<Employee> employees, String department){
        return employees.stream().filter(e -> department.equals(e.getDepartment())).count();
    }

    private static Employee getMaxSalary(List<Employee> employees){
        return employees.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
    }

    private static List<String> employeesFromHR(List<Employee> employees){
        return employees.stream().filter(e -> Objects.equals(e.getDepartment(), "HR")).map(Employee::getName).sorted().toList();
    }

    private static Double getAverageSalary(List<Employee> employees){
        return employees.stream().mapToInt(Employee::getSalary).average().getAsDouble();
    }
}
