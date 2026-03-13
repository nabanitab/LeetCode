package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmployeeManagementUsingStream {

    public static void main(String[] args) {

        List<Employee>list = new ArrayList<>();

        list.add(new Employee("nabanita",25,450000));
        list.add(new Employee("moumili",26,460000));
        list.add(new Employee("asif",26,430000));

      //  list.stream().sorted((e1,e2).filter())

        // Example 1: Sorting employees by name
        System.out.println("Employees sorted by name:");
        list.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(System.out::println);
        System.out.println();

        // Example 2: Filtering employees by age
        System.out.println("Employees older than 30:");
        list.stream()
                .filter(e -> e.getAge() > 30)
                .forEach(System.out::println);
        System.out.println();

        // Example 3: Calculating the average salary of all employees
        double averageSalary = list.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println("Average salary of all employees: " + averageSalary);

        //optional class

        // Using Stream + filter + findFirst
        Optional<Employee> employeeOptional = list.stream()
                .filter(e -> e.getName().equals("shreyans"))
                .findFirst();

    // Check if present
        if (employeeOptional.isPresent()) {
            System.out.println("Employee found: " + employeeOptional.get());
        } else {
            System.out.println("Employee not found");
        }

    }
    }
