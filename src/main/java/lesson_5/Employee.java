package lesson_5;

import java.util.Random;

public class Employee {
    private final static String[] NAMES = {"John", "Bob", "Alex", "Jim", "Sonya", "Mary", "Kate", "Liza"};
    private final static String[] DEPARTMENTS = {"IT", "HR", "Accounting", "Sales"};
    private String name;
    private int age;
    private String department;
    private int salary;

    public Employee() {
        Random random = new Random();
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.department = DEPARTMENTS[random.nextInt(DEPARTMENTS.length)];
        this.age = random.nextInt(40) + 20;
        this.salary = random.nextInt(100000) + 20000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
