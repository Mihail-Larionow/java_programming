import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Engineer("Олег", 23, "Программист в беспилотных системах"));
        employees.add(new Manager("Виктория", 21, "Высокая"));
        employees.add(new Secretary("Оксана", 25, "Бухгалтерия"));
        employees.add(new Director("Снежанна", 42, 4));

        System.out.print("\nПерсонал:\n\n");

        for (Employee employee : employees) {
            System.out.println(employee.getClass());
            System.out.print(employee.getPersonalInfo());
            System.out.print(employee.getJobInfo() + "\n");
        }
    }
}