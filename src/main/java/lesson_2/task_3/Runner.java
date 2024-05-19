package lesson_2.task_3;

public class Runner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.RAM ram = computer.new RAM(1024);
        Computer.Processor processor = new Computer.Processor("Intel");
        System.out.println( "Processor model: " + processor.getDetails() + System.lineSeparator() +
                            "RAM size: " + ram.getDetails());
    }
}
